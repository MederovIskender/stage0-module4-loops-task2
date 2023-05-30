package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        if (multiplyByAndToInclusive > 0) {
            while (count <= multiplyByAndToInclusive) {
                int result = count * multiplyByAndToInclusive;
                System.out.println(result);
                count++;
            }
        } else if (multiplyByAndToInclusive<0){
            while (count>=multiplyByAndToInclusive){
                int result = (Math.abs(count)) * multiplyByAndToInclusive;
                System.out.println(result);
                count--;
            }
        }
    }
}
