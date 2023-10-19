public class validPassword {
    public static boolean validpass(String s){
      int  n=s.length();
      boolean capital=false;
//      boolean spaceOrslash=false;
      boolean containsDigit=true;

        if (n<4){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char fch=s.charAt(i);
            int val=(int)(fch);
            if(i==0){


                if((val>=48 && val<=57)){
                    return  false;

                }
            }
            if (val>=65 && val<=97 ){
                capital=true;

            }
            if (fch==' ' || fch=='/'){
                return  false;

            }
            if((val>=48 && val<=57)){
                containsDigit=true;

            }

            if (capital==false || containsDigit==false){
                return false ;
            }


        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(validpass("abc D123"));

    }
}
