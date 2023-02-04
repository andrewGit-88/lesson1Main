package module6;

public class BankAccountant extends BankManager {

    double salary;

    public BankAccountant(String name, int id, String title, String dateOfBirth, double salary, String address) {
        super(name, id, title, dateOfBirth, salary, address);
    }
    @Override
    public void employeeDetail() {
        super.employeeDetail();
    }
    public void rolesOfEmployee () {
        System.out.println(title + " can open a new account, close account and create reports");
    }
    public void openNewAccount(){
        System.out.println(name + " will open a new account");
    }
    public void closeAccount(){
        System.out.println(name + " will close an account");
    }
    public void createReport(){
        System.out.println(name + " will create a report");
    }
}
