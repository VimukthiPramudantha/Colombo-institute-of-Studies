/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Logger;

/**
 *
 * @author Vimukthi Pramudantha
 */
public class UserClass {
    FileSystem f1 = new FileSystem("Users.txt");
    FileSystem Deparmet2 = new FileSystem("Department.txt");
    private String DepartmentName;
    private String UserID;
    private String UserPassword;
    private String Type;
    private String UserName;
    private String Age;
    private String Adress;
    private String Designation;

    public UserClass(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }
    
    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }
    
    public UserClass(){}
    

    public UserClass(String UserID, String UserPassword, String Designation) {
        this.UserID = UserID;
        this.UserPassword = UserPassword;
        this.Designation = Designation;
    }

    public UserClass(String UserID, String UserPassword) {
        this.UserID = UserID;
        this.UserPassword = UserPassword;
    }
    
    
    
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    public UserClass(String UserID, String UserPassword, String Type, String UserName, String Age, String Adress, String Designation) {
        this.UserID = UserID;
        this.UserPassword = UserPassword;
        this.Type = Type;
        this.UserName = UserName;
        this.Age = Age;
        this.Adress = Adress;
        this.Designation = Designation;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public FileSystem getF1() {
        return f1;
    }

    public void setF1(FileSystem f1) {
        this.f1 = f1;
    }

    public boolean ValidateLogin(){
        try
        {
            String[]words = null;
            
            BufferedReader bufferedReader = f1.readAFile();
            String user;
            
            while ((user =bufferedReader.readLine())!=null)
            {
                words = user.split(" ");
                System.out.println(words[1] + " " + words[4] + " " + words[5]);
                System.out.println(UserID + " " + UserPassword + " " + Designation);
                if(words[1].equals(UserID)&& words[4].equals(UserPassword) && words[5].equals(Designation))
                {
                    this.setUserID(words[1]);
                    this.setUserPassword(words[4]);
                    this.setType(words[5]);
                    return true;
                }
            }
            
        }catch (IOException ex)
        {
            System.err.println(" Error validating Login" +ex);
        }
        return false;
        
    }
     public boolean addNewUser() {
        if (f1.createANewFile()) {
            String record = UserName+ " " + UserID + " " +Age+ " " + Adress + " " + UserPassword + " " + Designation;
            return f1.writeDataToFile(record);
        }
        return false;
    }
     public boolean AddDepartment() {
        if (Deparmet2.createANewFile()) {
            String record = DepartmentName;
            return Deparmet2.writeDataToFile(record);
        }
        return false;
    }
     
     
} 

