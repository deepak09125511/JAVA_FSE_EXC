public class Main1{
    public static void main(String[] args){
        Logger lg1 = Logger.getInstance();
        Logger lg2 = Logger.getInstance();

        lg1.log("iam in ");
        lg2.log("iam not in");
        System.out.println(lg1==lg2);
    }
}

class Logger{
    private static Logger logger;

    private Logger(){
        System.out.println("The logger object is implemented");
    }
    
    public static Logger getInstance(){
        if(logger==null){
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message){
        System.out.println("you are logged in: " +message);
    }
}