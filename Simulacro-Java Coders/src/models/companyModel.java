package models;
import entities.company;
import persistence.JDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class companyModel {
    private final JDBC jdbc;

    public companyModel(JDBC jdbc) {
        this.jdbc = jdbc;
    }
    public company create(company company){
        var connection = jdbc.getConnection();
        var sql = "INSERT INTO companies (name, location, id_vacancies) VALUES (?,?,?)";
        try(var statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)){
            statement.setString(1, company.getName());
            statement.setString(2, company.getLocation());
            statement.setInt(3, company.getId_vacancies());

            statement.execute();

            var resultSet = statement.getGeneratedKeys();
            if(resultSet.next()){
                var row = resultSet.getInt(1);
                company.setId(row);
            }else throw new SQLException();

            resultSet.close();
        }catch(SQLException e) { e.printStackTrace();}
        jdbc.closeConnection();
        return company;
    }

    public company findAll(){
        var connection = jdbc.getConnection();
        var sql = "SELECT * FROM companies";
        var companiesList = new ArrayList<company>();
        try(var statement = connection.createStatement()){
            var resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                var id = resultSet.getInt("id");
                var name = resultSet.getString("name");
                var location = resultSet.getString("location");
                var id_vacancies = resultSet.getInt("id_vacancies");

                var company = new company(id, name, location, id_vacancies);
                companiesList.add(company);
            }
            resultSet.close();
        }catch(SQLException e) { e.printStackTrace();}

        jdbc.closeConnection();
        return (company) companiesList.stream().toList();
    }
}
