package baitap.Bai1;

public class Main {
    public static void main(String[] args) {
        Account account1 = Account.getInstance();
        Account account2 = Account.getInstance();
        Account account3 = Account.getInstance();
        account1.setId(1);
        account1.setName("Nguyễn Văn A");
        account1.setAge(21);

        System.out.println("Account 1: " + account1.getId() + " - " + account1.getName() + " - " + account1.getAge());
        System.out.println("Account 2: " + account2.getId() + " - " + account2.getName() + " - " + account2.getAge());
        System.out.println("Account 3: " + account3.getId() + " - " + account3.getName() + " - " + account3.getAge());
    }
}
