

public class Main {
    public static void main(final String[] args) throws Exception {

        Pizza pizza = new MargheritaPizza();

        pizza = new MushroomDecorator(pizza);

        pizza = new PepperoniDecorator(pizza);

        System.out.println(pizza.getDescription());

        System.out.println(pizza.getCost());
    }    
}


