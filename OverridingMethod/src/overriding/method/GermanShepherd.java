package overriding.method;

public class GermanShepherd extends Dog {
    @Override
    public void bark() {
        System.out.println("woof woof woof!");
    }
}
