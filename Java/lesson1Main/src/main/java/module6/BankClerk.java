package module6;

public class BankClerk extends BankManager {
    double salary;

    public BankClerk(String name, int id, String title, String dateOfBirth, double salary, String address) {
        super(name, id, title, dateOfBirth, salary, address);
    }

    @Override
    public void employeeDetail() {
        super.employeeDetail();
    }
    public void rolesOfEmployee () {
        System.out.println(title + " can call to the customer and answer incoming calls");
    }
    public void callCustomer(){
        System.out.println(name + " will call customers");
    }
    public void answerCustomerCalls(){
        System.out.println(name + " will answer customers");
    }
}
