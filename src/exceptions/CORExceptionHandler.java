/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.List;

/**
 *
 * @author Bishal
 */
public abstract class CORExceptionHandler {

    protected CORExceptionHandler nextHandler;

    abstract public void handleRequest(Exception e);
}
