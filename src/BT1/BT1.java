package BT1;

public class BT1 {
    public static void main(String[] args) {
        Account acc1 = Account.getInstance();
        acc1.setId(1);
        acc1.setName("John Doe");
        acc1.setAge(30);

        Account acc2 = Account.getInstance();
        acc2.setId(2);
        acc2.setName("Jane Doe");
        acc2.setAge(25);

        acc1.displayInfo();
        acc2.displayInfo();

        System.out.println("acc1 == acc2: " + (acc1 == acc2));
    }
}
