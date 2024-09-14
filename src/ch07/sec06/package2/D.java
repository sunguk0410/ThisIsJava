package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
    public D() {
        super();
    }

    public void method1() {
        this.field = "value";
        this.method();
    }

    public void method2() {
        // A a  = new A();
        // a.field = "value";
        // a.method();
    }

    // method1 은 상속을 통해 값을 가져온 반면
    // method2 은 객체 생성해서 값을 가져올려 함.
    // 그러나 직접 객체 생성하는 것은 불가능하다.
}
