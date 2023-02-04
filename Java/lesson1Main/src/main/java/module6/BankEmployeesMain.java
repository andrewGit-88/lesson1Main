package module6;

public class BankEmployeesMain {
    public static void main(String[] args) {
        BankManager bankManager = new BankManager("John Smith",323,"Manager","09.09.1977",10000,"Jerusalem");
        bankManager.employeeDetail();
        bankManager.rolesOfEmployee();
        bankManager.hireEmployees();
        System.out.println("\n");
        BankClerk bankClerk = new BankClerk("Brian McKinnon",799,"Clerk","12.05.1984",3000,"Tokyo");
        bankClerk.employeeDetail();
        bankClerk.rolesOfEmployee();
        bankClerk.callCustomer();
        System.out.println("\n");
        BankClerk bankAccountant = new BankClerk("Aubrey Campbell",619,"Accountant","01.06.1981",5000,"Warsaw");
        bankAccountant.employeeDetail();
        bankAccountant.rolesOfEmployee();
        bankAccountant.callCustomer();
    }
}
