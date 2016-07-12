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
public class NoSuchFileException extends CORExceptionHandler {

    @Override
    public void handleRequest(Exception e) {
        if ("NoSuchFileException".equals(e.getClass().getSimpleName())) {
            ExceptionFileWriter.fileWrite(new Date()+" : No such file:" + e.getMessage());
        } else {
            ExceptionFileWriter.fileWrite(new Date()+" : No error in file");
            this.nextHandler.handleRequest(e);
        }
    }
}
