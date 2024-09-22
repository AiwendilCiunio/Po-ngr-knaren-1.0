import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while(run) {
            System.out.println("Enter value");
            int amount = scanner.nextInt();
            System.out.println("The new value is " + calculator.calculate(amount));
        }



        
        
        
        
        scanner.close();


    }
}
