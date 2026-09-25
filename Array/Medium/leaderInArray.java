public class leaderInArray {
    public static int[] superiorElements(int[] a) {
        int n = a.length;
        int maxi = Integer.MIN_VALUE;
        int count = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > maxi) {
                count++;
            }
            maxi = Math.max(maxi, a[i]);
        }
        
        int[] ans = new int[count];
        int index = 0;
        maxi = Integer.MIN_VALUE;
        
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > maxi) {
                ans[index++] = a[i];
            }
            maxi = Math.max(maxi, a[i]);
        }
        
        java.util.Arrays.sort(ans);
        return ans;
    }
}

