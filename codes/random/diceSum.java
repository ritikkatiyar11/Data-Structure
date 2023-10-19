public class diceSum
{
    public static int possibilities(int sum)
    {
        int count=0;
        if(sum>12 || sum<2){
            return 0;
        }
        for (int i = 1; i <=6; i++) {

            if((sum-i) >=1&&( sum-i)<=6){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(possibilities(10));
    }
}
