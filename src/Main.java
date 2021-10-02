public class Main {

    public static void main(String[] args){
        Burger burger = new Hamburger();
        Burger doublePatty = new DoublePatty(burger);
        Burger withCheese = new Cheese(doublePatty) ;
        System.out.println(withCheese.getDescription() + " Total price will be " + withCheese.cost() +"tg!");
    }
}
