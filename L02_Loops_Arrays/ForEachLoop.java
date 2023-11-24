package L02_Loops_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        double[] profitPerQuarter = {3.45, 4.23, 3.88, 7.85};
        double totalProfit = 0.0;

        for (double profit : profitPerQuarter
        ) {
            totalProfit += profit;
        }

        totalProfit = (double) Math.round(totalProfit * 100) / 100;

        System.out.println("Total profit: " + totalProfit);
    }
}
