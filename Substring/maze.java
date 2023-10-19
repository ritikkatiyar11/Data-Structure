public class maze {
    public static int path(int row,int col)
    {
        if(row==1 ||col==1){
            return 1;
        }
        int left=path(row-1, col);
        int right=path(row, col-1);
        return left+right;
    }

    public static void main(String[] args) {
        System.out.println(path(3,3));
    }
}
