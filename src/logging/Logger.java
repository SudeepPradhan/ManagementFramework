/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logging;

public interface Logger {
    // turn on and off debugging
    public void setLevel(TraceLevel level);
    // write out a debug message
    public void info(String message);
    // write out a waring message
    public void warning(String message);
    // write out an error message
    public void error(String message);
}
