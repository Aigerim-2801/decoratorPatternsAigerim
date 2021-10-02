public class Cheese extends ToppingDecorator{
    public Cheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public int cost() {
        return burger.cost() + 100;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", with cheese.";
    }
}
