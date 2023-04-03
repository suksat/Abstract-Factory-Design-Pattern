package abstractFactory;

public class FactoryClass1 extends AbstractFactoryClass {
    @Override
    public Interface1 getInterface1(String variable1) {
        if(variable1 == null) return null;
        if(variable1.equalsIgnoreCase("classone")) {
            return new Class1();
        }
        if(variable1.equalsIgnoreCase("classtwo")) {
            return new Class2();
        }
        if(variable1.equalsIgnoreCase("classthree")) {
            return new Class3();
        }
        return null;
    }

    @Override
    public Interface2 getInterface2(String variable2) {
        return null;
    }
}
