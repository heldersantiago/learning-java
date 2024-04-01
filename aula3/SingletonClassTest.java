package aula3;

public class SingletonClassTest {
    private static SingletonClassTest instance;
    private String name;

    private SingletonClassTest() {
    }

    public static SingletonClassTest getInstance() {
        if (instance == null) instance = new SingletonClassTest();
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "SingletonClassTest{" +
                "name='" + name + "'}";
    }
}
