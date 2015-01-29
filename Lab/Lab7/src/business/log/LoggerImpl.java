/*
 * Class : LoggerImpl.java
 * Developer : Laksh Lumba
 * Reviewer :
 * Description : 
 * Created On : Oct 19, 2014, 4:50:36 PM
 * ---------------------------------------------------------------------------
 * Change History
 * Develper :
 * Reviwer :
 * Changed ON :
 * ---------------------------------------------------------------------------
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.log;

/**
 *
 * @author Laksh
 */
//public class LoggerImpl extends SecurityManager{
//    private static Logger logger;
//    private static FileHandler fileHandler;
//    public static Logger getLogger(){ 
//        String className = new LoggerImpl().getClassName();
//        System.out.println(className);
//        logger = Logger.getLogger(className);
//        try {
//            fileHandler = new FileHandler("C:/Users/Laksh/Desktop/upload/log/MyLogFile.log",100000,1,true);
//            logger.addHandler(fileHandler);
//            SimpleFormatter formatter = new SimpleFormatter();  
//            fileHandler.setFormatter(formatter);
//        } catch (IOException | SecurityException ex) {
//            Logger.getLogger(LoggerImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        return logger;
//    }
//    public String getClassName() {
//        return getClassContext()[3].getName();
//    }
//    public static void debug(String msg){
//        getLogger().log(Level.INFO, msg);
//    }
//    public static void debug(String message, Object[] params){
//        getLogger().log(Level.INFO, message, params);
//    }
//    public static void debug(String message, Object param1){
//        getLogger().log(Level.INFO, message, param1);
//    }
//    public static void error(String msg){
//        getLogger().log(Level.FINEST, msg);
//    }
//    public static void error(String message, Object param){
//        getLogger().log(Level.FINEST, message, param);
//    }
//    public static void error(String message, Object[] params){
//        getLogger().log(Level.FINEST, message, params);
//    }
//    
//   
//}
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Level;
import org.apache.log4j.Priority;

public class LoggerImpl extends SecurityManager {

    private static ConcurrentHashMap<String, org.apache.log4j.Logger> loggerMap = new ConcurrentHashMap<String, org.apache.log4j.Logger>();
    
    public static org.apache.log4j.Logger getLog() {        
        String className = new LoggerImpl().getClassName();
        if (!loggerMap.containsKey(className)) {
            loggerMap.put(className, org.apache.log4j.Logger.getLogger(className));
        }
        return loggerMap.get(className);
    }
    public String getClassName() {
        return getClassContext()[3].getName();
    }
    public static void trace(Object message) {
        getLog().trace(message);
    }
    public static void trace(Object message, Throwable t) {
        getLog().trace(message, t);
    }
    public static boolean isTraceEnabled() {
        return getLog().isTraceEnabled();
    }
    public static void debug(Object message) {
        getLog().debug(message);
    }
    public static void debug(Object message, Throwable t) {
        getLog().debug(message, t);
    }
    public static void error(Object message) {
        getLog().error(message);
    }
    public static void error(Object message, Throwable t) {
        getLog().error(message, t);
    }
    public static void fatal(Object message) {
        getLog().fatal(message);
    }
    public static void fatal(Object message, Throwable t) {
        getLog().fatal(message, t);
    }
    public static void info(Object message) {
        getLog().info(message);
    }
    public static void info(Object message, Throwable t) {
        getLog().info(message, t);
    }
    public static boolean isDebugEnabled() {
        return getLog().isDebugEnabled();
    }
    public static boolean isEnabledFor(Priority level) {
        return getLog().isEnabledFor(level);
    }
    public static boolean isInfoEnabled() {
        return getLog().isInfoEnabled();
    }
    public static void setLevel(Level level) {
        getLog().setLevel(level);
    }
    public static void warn(Object message) {
        getLog().warn(message);
    }
    public static void warn(Object message, Throwable t) {
        getLog().warn(message, t);
    }
    
    public static String getCallingMethod() {  
        StackTraceElement[] stack = new Throwable().getStackTrace();  
        StackTraceElement ste = null;  
        if (stack.length > 2)   
            ste = stack[2];  
        return ste == null ? "[Unavailable]" : ste.getMethodName(); 
    }
    
    public static void enterMethod(){
        String methodName = "Entering Method: " + getCallingMethod();
        getLog().info(methodName);
    }
    public static void exitMethod(){
        String methodName = "Exiting Method: " + getCallingMethod();
        getLog().info(methodName);
    }
}