public class Main {
    public static void main(String[] args) {
        Account testAccount = new Account(1122, 20000, 4.5);
        if (testAccount.withdraw(2500))
            System.out.println("withdraw successfull");
        else
            System.out.println("withdraw not successfull");
        testAccount.deposite(3000);
        System.out.println("id= "+testAccount.getId());
        System.out.println("annualInterestRate= "+testAccount.getAnnualInterestRate());
        System.out.println("balance= "+testAccount.getBalance());//test.balance
        System.out.println(testAccount.dateCreated.toLocaleString());
    }
}
