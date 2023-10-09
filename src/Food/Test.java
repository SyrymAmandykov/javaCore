package Food;

public class Test {
    public static void main(String[] args) {
        //Chocolate chocolate = new Chocolate();
        //Burger burger = new Burger("burgerking",126,1);
        Coke coke = new Coke("fanta",2,false);


        //burger.getCalories();
        coke.getCalories();
        System.out.println("Sparkling: " + coke.getCalories());
    }
}
