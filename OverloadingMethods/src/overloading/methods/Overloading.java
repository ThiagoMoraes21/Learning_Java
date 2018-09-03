package overloading.methods;

public class Overloading {
    public void dog(){
        System.out.println("WOOF!");
    }

    public void dog(int num) {
        for(int i = 0; i < num; i++)
            System.out.println("woof!");
    }
}
