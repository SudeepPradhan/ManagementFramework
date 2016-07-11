package logging;

public class LoggerFactoryImpl implements LoggerFactory  
{
    //This factory should often times be a Singleton
    private static LoggerFactory factory = new LoggerFactoryImpl();
    private LoggerFactoryImpl(){}

    public static LoggerFactory getFactory()
    { 
        return factory;
    }
	
    @Override
    public Logger createLogger(LoggerType type) 
    {       
        switch (type) {
            case Console:
                return new ConsoleLogging();
            case File:
                return new FileLogging();
            default:
                break;
        }

        return null;
    }
}
