package abstractFactory;

public class FactorySelectorClass {
    public static AbstractFactoryClass selectFactory(String selection) {
        if (selection.equalsIgnoreCase("factoryclassone")) {
            return new FactoryClass1();
        } else if (selection.equalsIgnoreCase("factoryclasstwo")) {
            return new FactoryClass2();
        }
        return null;
    }
}
