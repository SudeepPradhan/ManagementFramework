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
public final class ChainBuilder {

    private CORExceptionHandler handler;

    private void buildChain() {
        CORExceptionHandler fileNotFound = new FileNotFoundExceptionHandle();
        CORExceptionHandler noDirectory = new NotDirectoryException();
        CORExceptionHandler corruptFile = new StreamCorruptedException();
        CORExceptionHandler ioException = new IOExceptionHandle();
        CORExceptionHandler invalidClass = new InvalidClassException();
        CORExceptionHandler classNotFound = new ClassNotFoundException();
        fileNotFound.nextHandler = noDirectory;
        noDirectory.nextHandler = corruptFile;
        corruptFile.nextHandler = ioException;
        ioException.nextHandler = invalidClass;
        invalidClass.nextHandler = classNotFound;
        handler = fileNotFound;
    }

    public CORExceptionHandler getHandler() {
        buildChain();
        return handler;
    }

    public void setHandler(CORExceptionHandler handler) {
        this.handler = handler;
    }
}
