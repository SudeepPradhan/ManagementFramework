/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Bishal
 */
public class ExceptionFileWriter {

    public static void fileWrite(String message){
        try {
            String filePath = "exceptionlog.txt";
            message += System.lineSeparator();

            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWritter = new FileWriter(file.getName(), true);
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write(message);
            bufferWritter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
