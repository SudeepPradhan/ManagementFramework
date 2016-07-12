/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Bishal
 */
public class FileNotFoundExceptionHandle extends CORExceptionHandler {

    @Override
    public void handleRequest(Exception e) {
        if ("FileNotFoundException".equals(e.getClass().getSimpleName())) {
            System.out.println("File not found error :" + e.getMessage());
        } else {
            System.out.println("No error in File not found");
            this.nextHandler.handleRequest(e);
        }
    }
}
