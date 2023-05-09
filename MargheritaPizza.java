
public class MargheritaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "\n Margherita Pizza at $6.99 topped with: \n";
    }

    @Override
    public double getCost() {
        return 6.99;
    }
}