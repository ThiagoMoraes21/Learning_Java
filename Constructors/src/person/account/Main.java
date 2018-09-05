package person.account;

public class Main {

    public static void main(String[] args) {
	    Account person1 = new Account();
        System.out.println(person1.getName());

        Account person2 = new Account("Ronaldo", 500);
        System.out.println(person2.getName());

        Account person3 = new Account("Thiago", "thiago4x70@gmail.com", 50.00);
        System.out.println(person3.getName());
    }
}
