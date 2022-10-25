package other;

import java.util.Arrays;

public class Flower {
    private String name;
    private String color;
    private String country;
    private double cost;
    private int lifeSpan;

    Flower(String name, String color, String country, double cost, int lifeSpan) {
        this.name = name;
        if (color != null) {
            this.color = color;
        } else {
            this.color = "Белый";
        }
        if (country != null) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        String chars = String.valueOf(cost);
        char[] some = chars.toCharArray();
        if (some[some.length - 3] == '.' && cost != 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }


    public void setColor(String color) {
        if (!color.isBlank()) {
            this.color = color;
        } else {
            this.color = "Белый";
        }
    }

    public void setCountry(String country) {
        if (country != null) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public void setCost(double cost) {
        String chars = String.valueOf(cost);
        char[] some = chars.toCharArray();
        if (some[some.length - 3] == '.' && cost != 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return this.name;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void getInformation() {
        System.out.printf("Название: %s   Страна: %s   Стоимость: %.2f   Срок стояния: %d Цвет: %s\n", this.name, this.country, this.cost, this.lifeSpan, this.color);
    }

    @Override
    public String toString() {
        return "Название: " + this.name + " Страна: " + this.country +  " Стоимость: " + this.cost + " Срок стония: " + this.lifeSpan + " Цвет: " + this.color;
    }

}
