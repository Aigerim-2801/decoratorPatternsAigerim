public class DoublePatty extends ToppingDecorator{
    public DoublePatty(Burger burger) {
        this.burger = burger;
    }

    @Override
    public int cost() {
        return burger.cost() + 250;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", with a second beef patty";
    }
}
