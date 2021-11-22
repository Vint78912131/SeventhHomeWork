public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int food) {
        this.setFood(this.getFood() + food);
    }

    public Plate(int food) {
        this.setFood(food);
    }
    public void decreaseFood(int n) {
        this.setFood(this.getFood() - n);
    }
    public void info() {
        System.out.println("plate: " + food);
    }


}
