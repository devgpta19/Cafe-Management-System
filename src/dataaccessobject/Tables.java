/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccessobject;

import javax.swing.JOptionPane;

/**
 *
 * @author Devansh Gupta
 */
public class Tables {

    public static void main(String[] args) {
        try {
            String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200), mobileNumber varchar(10), address varchar(200), password varchar(200), securityQuestion varchar(200), answer varchar (200), status varchar(10), UNIQUE(email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','What is your name ??','Admin','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
            String billTable = "create table bill(id int primary key, name varchar(200), mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))";

            DataBaseOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DataBaseOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully !!");
            DataBaseOperations.setDataOrDelete(categoryTable, "Category Table Create Successfully !!");
            DataBaseOperations.setDataOrDelete(productTable, "Product Table Create Successfully !!");
            DataBaseOperations.setDataOrDelete(billTable, "Bill Table Create Successfully !!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
