public class multiplication {

    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
        int c[][]={{0,0,0},{0,0,2},{0,0,0}};
        for (int i = 0; i < a.length; i++) {
            {
                for (int j = 0; j < a[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        c[i][j]+=a[i][k]*b[k][j];

                    }

                }
            }

        }
        System.out.println(c[2][2]);

    }
}
