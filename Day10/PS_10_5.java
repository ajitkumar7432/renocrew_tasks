
class BaseClass {
    public BaseClass() {
        System.out.println("Constructor of BaseClass");
    }
}

class DerivedClass1 extends BaseClass {
    public DerivedClass1() {
        System.out.println("Constructor of DerivedClass1");
    }
}

class DerivedClass2 extends DerivedClass1 {
    public DerivedClass2() {
        System.out.println("Constructor of DerivedClass2");
    }
}

public class PS_10_5 {
    public static void main(String[] args) {
        DerivedClass2 obj = new DerivedClass2();
    }
}

