class PrimeCheckSimple {

    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]); 
        boolean isPrime = true; 

        // Check if num is a prime number
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
