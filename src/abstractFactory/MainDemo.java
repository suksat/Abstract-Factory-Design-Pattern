package abstractFactory;

public class MainDemo {
    public static void main(String[] args) {
        AbstractFactoryClass selectedFactory1 = FactorySelectorClass.selectFactory("factoryclassone");

        Interface1 interfaceObject1 = selectedFactory1.getInterface1("classone");
        interfaceObject1.method1();

        Interface1 interfaceObject2 = selectedFactory1.getInterface1("classtwo");
        interfaceObject2.method1();

        Interface1 interfaceObject3 = selectedFactory1.getInterface1("classthree");
        interfaceObject3.method1();

        System.out.println(" *** *** ***  *** *** *** ");

        AbstractFactoryClass selectedFactory2 = FactorySelectorClass.selectFactory("factoryclasstwo");

        Interface2 interfaceObject4 = selectedFactory2.getInterface2("classfour");
        interfaceObject4.method2();

        Interface2 interfaceObject5 = selectedFactory2.getInterface2("classfive");
        interfaceObject5.method2();

        Interface2 interfaceObject6 = selectedFactory2.getInterface2("classsix");
        interfaceObject6.method2();
    }
}
