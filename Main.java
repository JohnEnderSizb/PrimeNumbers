import java.util.Scanner;
import java.util.*;  


public class Main{
    public static void main(String[] args) {
        Main prog = new Main();
        int num = prog.getNumber();

        Thread t1 = new Thread(new Runnable() {
        public void run()
        {
            prog.generatePrimes(num);
        }});  
        t1.start();

        for(int i = 1; i <= 20; i++){
            System.out.println("Main Thread ");
        }
    }

    public int getNumber(){
        System.out.print("Enter int: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println();
        return n;
    }

    public boolean isPrime(int num) {
        boolean isPrime = true;
        for(int i = num - 1; i > 1; i--){
            if(num%i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }

    public void generatePrimes(int num){
        for(int i = num - 1; i > 1; i--){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        
    }
}