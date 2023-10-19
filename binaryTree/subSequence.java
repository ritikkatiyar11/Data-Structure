class subSequence {
    public static void subsq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subsq(p + ch, up.substring(1));
        subsq(p, up.substring(1));

    }
    public static void main(String[] args) {
        subsq("", "abc");
    }


}
