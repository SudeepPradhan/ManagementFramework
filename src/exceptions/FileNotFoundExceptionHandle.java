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
public class FileNotFoundExceptionHandle extends CORExceptionHandler {

    @Override
    public void handleRequest(Exception e) {
        if ("FileNotFoundException".equals(e.getClass().getSimpleName())) {
            ExceptionFileWriter.fileWrite(new Date()+" : File not found error :" + e.getMessage());
        } else {
            ExceptionFileWriter.fileWrite(new Date()+" : No error in File");
            this.nextHandler.handleRequest(e);
        }
    }
}
