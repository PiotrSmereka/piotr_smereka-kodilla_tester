import java.util.Random;

public class RandomNumbers {
    int number;

    public int getNumber() {
        return number;
    }

    public int getCountRandomNumbers() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    public int getMinValue() {
        Random random = new Random();
        int min = 30;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
    public int getMaxValue() {
        Random random = new Random();
        int max = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}


