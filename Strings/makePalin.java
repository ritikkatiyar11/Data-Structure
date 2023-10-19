

public class makePalin {
    public static void main(String[] args) {



        String s = "aabb";
        int count =0;
        char []temp=s.toCharArray();
        int low=0;
        int high=temp.length-1;
        while(low<high){
            int left=low;
            int right=high;
            while(temp[left]!=temp[right]){
                right--;

            }
            if(left==right){
                swap(temp,right,right+1);
                count++;
                continue;

                //sending to middle//

            }
            else {
                while (right<high){
                    swap(temp,right,right+1);
                    right++;
                    count++;
                }
            }
            low++;
            high--;
        }
        System.out.println(count);




    }

    private static void swap(char[] temp, int i, int j) {
        char t=temp[i];
        temp[i]=temp[j];
        temp[j]=t;
    }
}
