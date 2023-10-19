public class StringTransformationChecker {
    public static boolean canTransform(String source, String target, int maxEdits) {
        int[][] dp = new int[source.length() + 1][target.length() + 1];

        for (int i = 0; i <= source.length(); i++) {
            for (int j = 0; j <= target.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    int cost = (source.charAt(i - 1) == target.charAt(j - 1)) ? 0 : 1;
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + cost);
                }
            }
        }

        return dp[source.length()][target.length()] <= maxEdits;
    }

    public static void main(String[] args) {
        String source = "kitten";
        String target = "sitting";
        int maxEdits = 3;

        boolean canTransform = canTransform(source, target, maxEdits);
        if (canTransform) {
            System.out.println("Transformation is possible.");
        } else {
            System.out.println("Transformation is not possible within the specified edit limit.");
        }
    }
}
