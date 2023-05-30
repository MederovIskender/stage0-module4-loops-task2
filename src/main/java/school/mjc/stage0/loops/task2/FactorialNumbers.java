package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;

        while (number <= printToInclusive) {
            long factorial = calculateFactorial(number);
            System.out.println(factorial);
            number++;
        }
    }

    private long calculateFactorial(int num) {
        long factorial = 1;

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
