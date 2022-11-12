package transport;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class Shop {

    public static ArrayDeque<String> queue1 = new ArrayDeque<>(5);
    public static ArrayDeque<String> queue2 = new ArrayDeque<>(5);
    public static ArrayDeque<String> queue3 = new ArrayDeque<>(5);

    public static void chooseAQueue(String buyer) {
        Queue<String> i = queue1.size() < queue2.size() ? queue1 : queue2;
        i = i.size() > queue3.size() ? queue3 : i;
        if (i.size() != 5) {
            i.offer(buyer);
            System.out.println(buyer + " встал в очередь");
            System.out.println(queue1.size() + " " + queue2.size() + " " + queue3.size());
        } else {
            System.out.println("ХАЛЯ ОТКРОЙ КАССУ И ПРОБЕЙ ПЕЧЕНЬ!!! " + buyer);
            new ArrayDeque<>(5).offer(buyer);
        }
    }

    public static void removeBuyer() {
        int num = 1 + (int) (Math.random() * 3);
        switch (num) {
            case 1:
                queue1.pollFirst();
                break;
            case 2:
                queue2.pollFirst();
                break;
            case 3:
                queue3.pollFirst();
                break;
        }
        System.out.println("Человек из очереди обслужен " + queue1.size() + " " + queue2.size() + " " + queue3.size());
    }


}





