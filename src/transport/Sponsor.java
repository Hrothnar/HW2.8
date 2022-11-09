package transport;

public abstract class Sponsor {
    private String name;
    private int support;

    public Sponsor(String name, int support) {
        this.name = name;
        this.support = support;
    }

    public String getName() {
        return name;
    }

    public int getSupport() {
        return support;
    }

    public void sponsorStars() {
        System.out.println("На ваш счёт поступили средства от спонсора в размере " + this.support);
    }
}
