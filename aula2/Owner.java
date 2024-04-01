package aula2;

public class Owner {
    private final String name;
    private final int age;

   public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getOwnerAge() {
        return this.age;
    }

    public String getOwnerName() {
        return  this.name;
    }
}
