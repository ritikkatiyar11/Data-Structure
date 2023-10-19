class formatting {
    public static void main(String[] args) {
        float num = 453.127676f;
        // System.out.printf("formatted number is %.4f ritik ", num);
        // System.out.printf("formatted number is %.4f ritik ", Math.PI);


        System.out.printf("My name is %s %s","ritik","katiyar");

        StringBuilder sb=new StringBuilder("null");
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            sb.append(ch);
            
        }
        System.out.println(sb.toString());
    }
}
