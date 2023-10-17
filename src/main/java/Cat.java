public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat() {
        satiety = true;
    }

    public int getAppetite() {
        return appetite;
    }

    public void info() {
        if (this.satiety){
            System.out.printf("Кот %s сытый\n", name);
        } else {
            System.out.printf("Кот %s голодный\n", name);
        }
    }
}
