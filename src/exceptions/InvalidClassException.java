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
public class InvalidClassException extends CORExceptionHandler {

    @Override
    public void handleRequest(Exception e) {
         if ("InvalidClassException".equals(e.getClass().getSimpleName())) {
            ExceptionFileWriter.fileWrite(new Date() + " : Error message invalid class:" + e.getMessage());
        } else {
            ExceptionFileWriter.fileWrite(new Date() + " : No error in invalid class");
            this.nextHandler.handleRequest(e);
        }
    }
}
