package transport;

import java.util.ArrayDeque;
import java.util.Deque;

public class ServiceStation {
    private static Deque<Transport> queue = new ArrayDeque<>();

    public static void addAutoToQueue(Transport transport) {
        if (!(transport instanceof Bus))
            queue.offer(transport);
    }

    public static void doService(Transport transport) {
        if (!(transport instanceof Bus)) {
            queue.remove(transport);
            System.out.println(transport.getBrand() + " " + transport.getModel() + " тех обслуживание пройдено");
        }
    }


}
