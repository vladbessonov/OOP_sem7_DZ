import Logger.PrintLogger;
import Logger.ServiceLogger;
import Number.NumberReader;
import Number.Number;

public class Controller {

    private static final String ADD = "+";
    private static final String SUBTRACT = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";
    private final PrintLogger prLog = new PrintLogger();
    
    private final ServiceLogger log = new ServiceLogger(prLog) ;
    
           
    

    public Number run() {

        Number c1 = NumberReader.read();
       
        Number c2 = NumberReader.read();
        Number result;

        String operation = OperationReader.getOperation();

        switch (operation) {
            case ADD:
            result = c1.add(c2);
            log.logAdd(c1,c2,result);
                return result;
            case SUBTRACT:
            result = (c1.subtract(c2));
            log.logSubt(c1,c2,result);
                return c1.subtract(c2); ////?????????
            case MULTIPLY:
            result =c1.multiply(c2);
            log.logMultiplication(c1, c2, result);
                return result;
            case DIVIDE:
            result =c1.divide(c2);
            log.logDivision(c1, c2, result);
                return result;
        }
        return null;
    }

    



    
}
