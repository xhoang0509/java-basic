import java.util.LinkedList;
import java.util.Random;

class songuyen {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            Random rd = new Random();
            list.add(rd.nextInt(100));
        }

        for (Integer item : list) {
            System.out.println(item);
        }

    }
}