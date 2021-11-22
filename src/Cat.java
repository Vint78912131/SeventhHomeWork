public class Cat {
    private String name;
    private int appetite;
    private boolean fed;

    public Cat(String name, int appetite) {
        this.setName(name);
        this.setAppetite(appetite);
        fed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFed() {
        return fed;
    }

    public void setFed(boolean fed) {
        this.fed = fed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.getName() + '\'' +
                ", appetite=" + this.getAppetite() +
                ", fed=" + this.isFed() +
                '}';
    }

    public void eat(Plate p) {
        if (p.getFood() - this.getAppetite() < 0)
            System.out.println("No! You're too greedy!");
        else {
            p.decreaseFood(this.getAppetite());
            this.setFed(true);
        }
    }


}
