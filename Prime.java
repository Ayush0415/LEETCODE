import java.util.Scanner;
class Prime{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
boolean isPrime=true;
   for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false; 
                break;             }
        }


        if (isPrime && num > 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        } 

}

}