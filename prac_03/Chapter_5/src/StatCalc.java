import java.util.Scanner;
public class StatCalc {
    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.
    private double max = Double.NEGATIVE_INFINITY;  // Largest item seen.
    private double min = Double.POSITIVE_INFINITY;  // Smallest item seen.

    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
        if (num > max)
            max = num;
        if (num < min)
            min = num;
    }
    public int getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getMean() {
        return sum / count;
    }

    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StatCalc calc; // Computes stats for numbers entered by user.
        calc = new StatCalc();

        double item; // One number entered by the user.

        System.out.println("Enter your numbers.  Enter 0 to end.");
        System.out.println();

        do {
            System.out.print("? ");
            item = in.nextDouble();
            if (item != 0)
                calc.enter(item);
        } while (item != 0);

        System.out.println("\nStatistics about your data:\n");
        System.out.println("   Count:              " + calc.getCount());
        System.out.println("   Sum:                " + calc.getSum());
        System.out.println("   Minimum:            " + calc.getMin());
        System.out.println("   Maximum:            " + calc.getMax());
        System.out.println("   Average:            " + calc.getMean());
        System.out.println("   Standard Deviation: "
                + calc.getStandardDeviation());

    } // end main()
}
