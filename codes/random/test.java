import  java.util.*;
class  test{

    public static String find(String input1 , String input2 , int input3 , int input4){
        String s = "";
        String l = "";
        if(input1.length()<input2.length()){
            s = input1;
            l = input2;
        }else if(input1.length()>input2.length()){
            s = input2;
            l = input1;
        }else {
            if(input1.compareTo(input2) < 0 ){
                s = input1;
                l = input2;
            }else{
                s = input2;
                l = input1;
            }
        }

        String res = "" + s.charAt(0);
        res += l;
        res = toggleStr(res);
        List<Integer> list = new ArrayList<>();
        while(input3 > 0){
            list.add(input3 % 10);
            input3 /= 10;
        }
        int size = list.size();
        res += list.get(size - (input4));
        res += list.get(input4-1);
        return res;
    }

    public static String toggleStr(String str){
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(Character.toLowerCase(ch));
            }

        }
        return sb.toString();
}

    public static void main(String[] args) {
        System.out.println(find("Rajiv","Roy",560037,6));
    }
}