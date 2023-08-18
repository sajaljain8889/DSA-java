public class AvgSaleryExcMinMax {

    public static void main(String argu[]) {
        int salery[] = { 4000, 3000, 1000, 2000 };
        double ans = avgSaleryExcMinMax(salery);
        System.out.println(ans);
    }

    private static double avgSaleryExcMinMax(int[] arr) {
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            mx = Math.max(mx, arr[i]);
            mn = Math.min(mn, arr[i]);
            sum += arr[i];
        }
        sum = sum - mx - mn;
        double ans = sum / (arr.length - 2);
        return ans;
    }

}
