package logging;

public class ConsoleLogging implements Logger {

    TraceLevel level = TraceLevel.Error;

    @Override
    public void setLevel(TraceLevel level) {
        this.level = level;
    }

    @Override
    public void info(String message) {
        if(this.level == TraceLevel.Info)
            System.out.println("[Info] " + message);
    }

    @Override
    public void warning(String message) {
        if(this.level == TraceLevel.Warning)
            System.out.println("[Warning] " + message);
    }
    
    @Override
    public void error(String message) {
        if(this.level == TraceLevel.Error)
            System.out.println("[Error] " + message);
    }
}
