package Logger;
import java.time.LocalDateTime;

import Number.Number;

public class ServiceLogger implements Logger {

    private Logger logger;

    public ServiceLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void logger(String text) {
        logger.logger(text);
    }

    private void logOperation(String operation, Number arg1, Number arg2, Number result) {

        String text = LocalDateTime.now() + " число (" + arg1 + ")" + " операция: " + operation + " число (" + arg2
                + ") = ";

        logger.logger(text);

    }

    public void logAdd(Number arg1, Number arg2, Number result) {
        logOperation("+", arg1, arg2, result);
    }

    public void logSubt(Number arg1, Number arg2, Number result) {
        logOperation("-", arg1, arg2, result);
    }

    public void logMultiplication(Number arg1, Number arg2, Number result) {
        logOperation("*", arg1, arg2, result);
    }

    public void logDivision(Number arg1, Number arg2, Number result) {
        logOperation("/", arg1, arg2, result);
    }

    public void logPrint(String message) {
        System.out.println(message); // для вывода на печать
    }

}
