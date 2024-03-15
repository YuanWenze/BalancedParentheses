import java.util.Scanner;
public class Main {
public static void main(String[] args) throws Exception{
System.out.println("Please enter an expression using only parentheses:");
Scanner reader = new Scanner(System.in); 
String expressions = reader.nextLine();
Balance balance = new Balance();
balance.balance(expressions);
reader.close();
    } 
}

    
