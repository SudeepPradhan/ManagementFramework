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
public class NotDirectoryException extends CORExceptionHandler {

    @Override
    public void handleRequest(Exception e) {
        if ("NotDirectoryException".equals(e.getClass().getSimpleName())) {
            ExceptionFileWriter.fileWrite(new Date()+" : No Directory found:" + e.getMessage());
        } else {
            ExceptionFileWriter.fileWrite(new Date()+" : No error in Directory");
            this.nextHandler.handleRequest(e);
        }
    }
}
