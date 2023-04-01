package College;

class A {
    int a;

    A(int a) {
        this.a = a;
    }
}

class B extends A {
    int b;

    B(int a, int b) {
        super(a);
        this.b = b;
    }

    int add() {
        return a + b;
    }
}

class C extends A {
    int c;

    C(int a, int b) {
        super(a);
        c = b;
    }

    int mul() {
        return a * c;
    }
}

class superClassExample {
    public static void main(String[] args) {
        B objB = new B(10, 10);
        C objC = new C(10, 10);
        int add = objB.add();
        int mul = objC.mul();
        System.out.println(" Add: " + add);
        System.out.println(" Mul: " + mul);
    }
}