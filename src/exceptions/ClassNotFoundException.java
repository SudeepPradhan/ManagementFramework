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
public class ClassNotFoundException extends CORExceptionHandler {

    @Override
    public void handleRequest(Exception e) {
         if ("ClassNotFoundException".equals(e.getClass().getSimpleName())) {
            System.out.println("Class not found error :" + e.getMessage());
        }
    }
}
