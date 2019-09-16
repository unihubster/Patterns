package basepatterns.structural.bridge;

class BankSystem extends Program {

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Bank system development is in progress...");
        developer.writeCode();
    }
}
