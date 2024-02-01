public class Prime {
    public static void main(String args[]) {

        int number = 13; // You can change this to take user input
        System.out.println("Enter the starting number:"+number);
        System.out.println("The next prime number is: " + next(number));
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int next(int number) {
        if (isPrime(number + 1)) {
            return number + 1;
        } else {
            return next(number + 1);
        }
    }
}
