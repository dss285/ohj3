/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava3;
/**
 * @author Tommi
 * @date Feb 13, 2020
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class FileUtils {

    // Variables

    // Constructors

    // Methods
    public static void WriteToFile(String nimi, String syote) {
        Thread t1 = new Thread(() -> {
            try(FileWriter fw = new FileWriter(nimi)) {
                fw.write(syote);
            } catch(Exception ex) {
                
            }
        });
        t1.start();
        
    }
    public static String ReadFromFile(String nimi) {
        StringBuilder sb = new StringBuilder();
        try(FileReader fr = new FileReader(new File(nimi))) {
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while((line= br.readLine()) != null) {
                sb.append(line);
            }
        } catch(Exception ex) {
            
        }
        return sb.toString();
    }

}
