package other;

public class Bouquet {
    Flower[] flowers = new Flower[1000];


    public void addFlower(Flower flower) {
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] == null) {
                flowers[i] = flower;
                break;
            }

        }
    }

    public void bouquetInfo() {
        int roza = 0;
        int hrizantema = 0;
        int pion = 0;
        int gipsofila = 0;
        for (Flower one : flowers) {
            if (one != null) {
                if (one.getName().equals("Роза")) {
                    roza++;
                } else if (one.getName().equals("Хризантема")) {
                    hrizantema++;
                } else if (one.getName().equals("Пион")) {
                    pion++;
                } else if (one.getName().equals("Гипсофила")) {
                    gipsofila++;
                }
            }
        }
        if (roza != 0) {
            System.out.printf("Роз: %d шт   ", roza);
        }
        if (hrizantema != 0) {
            System.out.printf("Хризантем: %d шт   ", hrizantema);
        }
        if (pion != 0) {
            System.out.printf("Пионов: %d шт", pion);
        }
        if (gipsofila != 0) {
            System.out.printf("Гипсофил: %d шт", gipsofila);
        }
        System.out.println();

        int min = Integer.MAX_VALUE;
        double sum = 0;
        for (int i = 0; flowers[i] != null; i++) {
            sum += flowers[i].getCost();
            if (flowers[i].getLifeSpan() < min) {
                min = flowers[i].getLifeSpan();
            }
        }
        System.out.println("Срок стояния букета: " + min + " дней (дня)");
        System.out.printf("Стоимость букета: %.2f руб.", sum * 1.1);
        System.out.println();
        System.out.println();
    }

}