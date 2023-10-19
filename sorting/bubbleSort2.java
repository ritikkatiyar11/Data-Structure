public class bubbleSort2 {

    public static void main(String[] args) {
        int[] list = {7, 8, 3, 1, 2};
        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j < list.length - 1 - i; j++) {

                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i <= 4; i++) {

            System.out.print(list[i] + " ");
        }

    }
}
