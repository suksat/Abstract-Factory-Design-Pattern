package abstractFactory;

public class FactoryClass2 extends AbstractFactoryClass{
    @Override
    public Interface1 getInterface1(String variable1) {
        return null;
    }

    @Override
    public Interface2 getInterface2(String variable2) {
        if(variable2 == null) return null;
        if(variable2.equalsIgnoreCase("classfour")) {
            return new Class4();
        }
        if(variable2.equalsIgnoreCase("classfive")) {
            return new Class5();
        }
        if(variable2.equalsIgnoreCase("classsix")) {
            return new Class6();
        }
        return null;
    }
}
