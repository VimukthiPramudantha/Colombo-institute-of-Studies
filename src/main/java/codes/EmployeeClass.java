/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Vimukthi Pramudantha
 */
public class EmployeeClass {
   private String employeeName;
   private String employeeId;
   private String employeeAge;
   private String employeeAdress;
   private String employeeDesignation;
   private String employeeDepartment;

   
   FileSystem employeeFile = new FileSystem("Employee.txt");


    public EmployeeClass(String employeeName, String employeeId, String employeeAge, String employeeAdress, String employeeDesignation, String employeeDepartment) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeAge = employeeAge;
        this.employeeAdress = employeeAdress;
        this.employeeDesignation = employeeDesignation;
        this.employeeDepartment = employeeDepartment;
    }

    public EmployeeClass(String employeeId, String employeeDepartment) {
        this.employeeId = employeeId;
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeAdress() {
        return employeeAdress;
    }

    public void setEmployeeAdress(String employeeAdress) {
        this.employeeAdress = employeeAdress;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }


   public boolean addNewEmployee() {
        if (employeeFile.createANewFile()) {
            String record = employeeName+ " " + employeeId + " " + employeeAge+ " " + employeeAdress + " "+ employeeDesignation + " "+employeeDepartment;
            return employeeFile.writeDataToFile(record);
        }
        return false;
    }
   
   public ArrayList<EmployeeClass> searchEmployees(String departmentId,String employeeId){
            ArrayList<EmployeeClass> employees = new ArrayList<>();
       
        try
        {
            String[]words = null;
            FileSystem file = new FileSystem("Employee.txt");
           
            
            BufferedReader bufferedReader = file.readAFile();
            String user;
            
            while ((user =bufferedReader.readLine())!=null)
            {
                words = user.split(" ");
//                System.out.println(words[1] + " " + words[4]);
//                System.out.println(employeeId+ " " + departmentId );
                if(words[5].equals(employeeDepartment) || words[1].equals(employeeId))
                {
                    EmployeeClass foundEmployee = new EmployeeClass(words[0],words[1],words[2],words[3],words[4],words[5]);
                    employees.add(foundEmployee);
                }
            }
            
        }catch (IOException ex)
        {
            System.err.println(" Error validating Login" +ex);
        }
        return employees;
        
    }
   }

