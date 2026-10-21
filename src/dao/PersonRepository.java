package dao;

import connection.Person_Connection;
import dto.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    Connection connection=null;
    Person_Connection person_connection=new Person_Connection();

    public void insertPerson(Person person){
        connection=  person_connection.getPersonConnection();
        String query="insert into Person(id,name,age,address,email,phone) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps=connection.prepareStatement(query);
            ps.setInt(1,person.getId());
            ps.setString(2,person.getName());
            ps.setInt(3,person.getAge());
            ps.setString(4,person.getAddress());
            ps.setString(5,person.getEmail());
            ps.setLong(6,person.getPhone());
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updatePerson(int id,String name,int age){
        connection=person_connection.getPersonConnection();
        String query="update Person set name=?, age=? where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(3,id);
            ps.setString(1,name);
            ps.setInt(2,age);
            ps.execute();
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }

    }


    public void deletePerson(int id){
        connection=person_connection.getPersonConnection();
        String query="delete from Person where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,id);
            ps.execute();
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public List<Person> getPersons(){
        connection=person_connection.getPersonConnection();
        String query="select * from Person";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet resultSet=ps.executeQuery();
            List<Person> list=new ArrayList<>();
            while(resultSet.next()){
                Person person =new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setAddress(resultSet.getString("address"));
                person.setEmail(resultSet.getString("email"));
                person.setPhone(resultSet.getLong("phone"));
                list.add(person);
            }
            return list;
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    public void updatePerson(Person person) {
    }

    public Person getById(int id) {
        return null;
    }
}


