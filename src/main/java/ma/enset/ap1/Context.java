package ma.enset.ap1;

public class Context {
    private Strategy strategy = new DefaultStrategyImpl();


    public void effectuerOperation() {
        System.out.println("*******");
        strategy.operation();
        System.out.println("*******");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
