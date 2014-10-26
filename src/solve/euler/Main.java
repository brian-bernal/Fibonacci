package solve.euler;

public class Main {
    //this is a test why can't i commit?
    public static void main(String[] args) {
        int sum = 0;
        int temp = 0, first = 1, second = 2;

        while (second < 4000000) {
            if (second % 2 == 0)
                sum += second;
            temp = second;
            second += first;
            first = temp;
        }
        System.out.println("Sum: " + sum);
    }
}
//THIS IS A CHANGE OMG CANT YOU SEEEE