public class Main{
    public static void main(String args[]){
        Pizza defaultLargePizza=new Pizza.Builder().setSize("Large").build();
        Pizza defaultSmallPizza=new Pizza.Builder().setSize("Small").build();
        Pizza ModifiedLargePizza=new Pizza.Builder().setSize("Large").addCheese(true).addPepperoni(true).addSauce(true).build();

        Pizza ModifiedSmallPizza=new Pizza.Builder()
                .setSize("Small")
                .addCheese(false)
                .addPepperoni(true)
                .build();

        System.out.println(defaultLargePizza);
        System.out.println(defaultSmallPizza);
        System.out.println(ModifiedLargePizza);
        System.out.println(ModifiedSmallPizza);
    }
}