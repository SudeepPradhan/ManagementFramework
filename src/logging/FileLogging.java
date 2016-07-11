package logging;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class FileLogging implements Logger {

    TraceLevel level = TraceLevel.Error;
    static String defaultFilePath = "logfile.txt";
    String filePath = defaultFilePath;

    public void setLogFilePath(String path) {
        this.filePath = path;
    }
        
    @Override
    public void setLevel(TraceLevel level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        if(this.level != TraceLevel.Info) return;
        
        try {
            fileWrite("[Info] " + message);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void warning(String message) {
        if(this.level != TraceLevel.Warning) return;
        
        try {
            fileWrite("[Warning] " + message);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @Override
    public void error(String message) {
        if(this.level != TraceLevel.Error) return;
        
        try {
            fileWrite("[Error] " + message);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void fileWrite(String message) throws FileNotFoundException, UnsupportedEncodingException
    {
        try{
            message += System.lineSeparator();

            File file =new File(defaultFilePath);

            if(!file.exists()){
                    file.createNewFile();
            }

            FileWriter fileWritter = new FileWriter(file.getName(),true);
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write(message);
            bufferWritter.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
