/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;
import java.io.*;
/**
 *
 * @author Vimukthi Pramudantha
 */
public class FileSystem {
    private static final String FILEPATH = ("D:\\Files\\");
    File file;
    private String fileName;

    public boolean createANewFile() {
        try {
            file = new File(FILEPATH + fileName);
            if (file.createNewFile()) {
                System.out.println("FIle Created: " + file.getName());
                return true;
            }

            System.out.println("File Already Exist");
            return true;

        } catch (IOException e) {
            System.out.println("An unknown error occurred when creating a new file." + e.getMessage());
            return false;
        }
    }
    public boolean writeDataToFile(String record) {
        try {
            createANewFile();
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(record);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();

            return true;

        } catch (IOException e) {
            System.out.println("Somwthing went wrong with writing." + e.getMessage());
            return false;
        }
    }
    
    public BufferedReader readAFile(){
        if(createANewFile()){
            try {
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader);
                
                return bufferedReader;
            } catch (IOException e) {
                System.out.println("Something went wrong when reading the file" + e.getMessage());
                
            }
        }
        return null;
    }

    public FileSystem(String fileName) {
        this.fileName = fileName;
    }
}
