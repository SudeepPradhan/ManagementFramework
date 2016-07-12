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
public class NoSuchFileException extends CORExceptionHandler{
    @Override
    public void handleRequest(Exception e) {
         if ("NoSuchFileException".equals(e.getClass().getSimpleName())) {
            System.out.println("No such file:" + e.getMessage());
        } else {
            System.out.println("No error in file");
            this.nextHandler.handleRequest(e);
        }
    }
}
