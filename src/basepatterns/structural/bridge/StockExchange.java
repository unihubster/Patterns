package basepatterns.structural.bridge;

class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Stock Exchange development is in progress...");
        developer.writeCode();
    }
}
