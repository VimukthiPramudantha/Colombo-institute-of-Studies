/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author Vimukthi Pramudantha
 */
public class DesignationClass {
     
     private String Designation1;
     FileSystem Designation2 = new FileSystem("Designation.txt");
     
    public DesignationClass(String Designation1) {
        this.Designation1 = Designation1;
    }

    public String getDesignation1() {
        return Designation1;
    }

    public void setDesignation1(String Designation1) {
        this.Designation1 = Designation1;
    }

    public DesignationClass() {
    }
     
     
     public boolean AddDesignation() {
        if (Designation2.createANewFile()) {
            String record = Designation1;
            System.out.println(record);
            return Designation2.writeDataToFile(record);
        }
        return false;
    }
}
