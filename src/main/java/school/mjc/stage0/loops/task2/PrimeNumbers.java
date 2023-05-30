package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;
        while (number <= printToInclusive) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;  // Numbers less than 2 are not prime
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // Number is divisible by a factor other than 1 and itself
            }
        }

        return true;  // Number is prime
    }
    }

