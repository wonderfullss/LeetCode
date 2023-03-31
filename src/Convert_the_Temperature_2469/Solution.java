package Convert_the_Temperature_2469;

public class Solution {
    public double[] convertTemperature(double celsius) {
        double fahrenheit = celsius * 1.80 + 32.00;
        double kelvin = celsius + 273.15;
        return new double[]{kelvin,fahrenheit};
    }
}
