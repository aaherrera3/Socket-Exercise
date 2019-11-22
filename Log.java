import java.io.*;
/**
/**
 * Anthony Herrera
 * Kirito
 * October 7, 2019
 * CS3331
 * Daniel Mejia
 * Lab 2
 * Creat a Simulated bank with abstracts classes and interface classes.
 * I confirm that the work of this assignment is completely my own.
 * By turning in this assignment, I declare that I did not receive unauthorized assistance. 
 * Moreover, all deliverables including, but not limited to the source code, lab report and output files where written and produced by me alone.
 */
public interface Log {
   /**
    * Writes to File when someone does an Inquiry
    * @param fw - File Writer 
    * @param name - First Name 
    * @param last - Last Name 
    * @param accountType - Account type 
    * @throws IOException - Maight trow IO Exception
    */
   public abstract void logInquiry(FileWriter fw, String name, String last, String accountType) throws IOException;
   /**
    * Writes to file when someone does a withreawal
    * @param fw - File Writer 
    * @param name - First Name 
    * @param last - Last Name 
    * @param accountType - Account Type 
    * @throws IOException - Maight trow IO Exception
    */
   public abstract void logWithdrawal(FileWriter fw, String name, String last, String accountType1, String accountType2, String ammout) throws IOException;
   /**
    * Writes to file when someone does a deposit.
    * @param fw - File Writer
    * @param name - First Name 
    * @param last - Last Name 
    * @param accountType - Account Type 
    * @throws IOException - Maight trow IO Exception
    */
   public abstract void logDeposit(FileWriter fw, String name, String last, String accountType1, String accountType2, String ammout) throws IOException;
   /**
    * Writes to file when someone does a transfer.
    * @param fw - File Writer 
    * @param name - First Name 
    * @param last - Last Name 
    * @param start - Account to transfer from 
    * @param end - Account to transfer to
    * @throws IOException - Maight trow IO Exception
    */
   public abstract void logTransfer(FileWriter fw, String name, String last, String start,String end, String ammout) throws IOException;
   /**
    * Writes to file when someone does a payment.
    * @param fw - File Writer 
    * @param name - First Name 
    * @param last - Last Name 
    * @param name2 - First name of second customer 
    * @param last2 - Last name of second customer.
    * @throws IOException - Maight trow IO Exception
    */
   public abstract void logPay(FileWriter fw, String name, String last, String name2, String last2, String start,String end, String ammout) throws IOException;

}