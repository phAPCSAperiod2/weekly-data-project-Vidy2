/**
 * The WeeklyData class stores and analyzes a week’s worth of numeric data.
 */
public class WeeklyData {

    // -------------------------------------------------------------
    // Instance Variables
    // -------------------------------------------------------------
    private double[] data;

    // -------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------
    public WeeklyData(double[] input) {
        if (input == null) {
            data = new double[0];
            return;
        }

        data = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            data[i] = input[i];
        }
    }

    // -------------------------------------------------------------
    // getTotal
    // -------------------------------------------------------------
    public double getTotal() {
        double total = 0;
        for (double value : data) {
            total += value;
        }
        return total;
    }

    // -------------------------------------------------------------
    // getAverage
    // -------------------------------------------------------------
    public double getAverage() {
        if (data.length == 0) {
            return 0.0;
        }
        return getTotal() / data.length;
    }

    // -------------------------------------------------------------
    // getMax
    // -------------------------------------------------------------
    public double getMax() {
        if (data.length == 0) {
            return 0.0;
        }

        double max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    // -------------------------------------------------------------
    // getMin
    // -------------------------------------------------------------
    public double getMin() {
        if (data.length == 0) {
            return 0.0;
        }

        double min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    // -------------------------------------------------------------
    // toString
    // -------------------------------------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            sb.append("Day ")
              .append(i + 1)
              .append(": ")
              .append(data[i])
              .append("\n");
        }

        return sb.toString();
    }
}
