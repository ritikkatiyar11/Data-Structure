public class digonal {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int sum=0;
        for (int i = 0; i <a.length ;i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(i==j){
                    sum+=a[i][j];
                }

            }

        }
        System.out.println(sum);

    }
}
