package aula3;

import aula2.Owner;

public class Test {
    static int x = 37;

    public static void main(String[] args) {
        SingletonClassTest singletonClassTest = SingletonClassTest.getInstance();
        SingletonClassTest singletonClassTest1 = SingletonClassTest.getInstance();
        SingletonClassTest singletonClassTest2 = SingletonClassTest.getInstance();

        Owner o1 = new Owner("s", 19);
        Owner o2 = new Owner("s", 19);
        Owner o3 = new Owner("s", 19);

        singletonClassTest.setName("helder");

        System.out.println(singletonClassTest.getName());
        System.out.println(singletonClassTest1.toString());

        singletonClassTest2.setName("hps");
        System.out.println(singletonClassTest.getName());
    }
}
