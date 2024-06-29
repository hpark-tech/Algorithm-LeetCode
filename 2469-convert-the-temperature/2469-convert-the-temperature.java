class Solution {
    public double[] convertTemperature(double celsius) {
        double ans[] = new double[2];
        ans[0]= Double.parseDouble(String.format("%.5f", celsius + 273.15));
        ans[1]= Double.parseDouble(String.format("%.5f", celsius * 1.80 + 32.00));
        return ans;
    }
}