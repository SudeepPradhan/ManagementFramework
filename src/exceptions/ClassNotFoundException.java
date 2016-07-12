/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Date;

/**
 *
 * @author Bishal
 */
public class ClassNotFoundException extends CORExceptionHandler {

    @Override
    public void handleRequest(Exception e) {
        if ("ClassNotFoundException".equals(e.getClass().getSimpleName())) {
            ExceptionFileWriter.fileWrite(new Date()+" : Class not found error :" + e.getMessage());
        }
    }
}
