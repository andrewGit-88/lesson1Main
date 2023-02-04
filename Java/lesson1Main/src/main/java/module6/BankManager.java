package module6;

public class BankManager {
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    String name;
    int id;
    String title;
    String dateOfBirth;
    double salary;
    String address;


    public BankManager(String name, int id, String title, String dateOfBirth, double salary, String address){
        this.name = name;
        this.id = id;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;
    }
    public void employeeDetail(){
        System.out.println("Name: " + name + "\n" + "Id: " + id + "\n" + "Title: " + title + "\n" + "Address: " + address +"\n" + "Birth Date: " + dateOfBirth + "\n" + "Salary: " + salary + "$");
    }
    public void rolesOfEmployee () {
        System.out.println(title + " can hire and fire employees");
    }
    public void hireEmployees(){
        System.out.println(name + " will hire employees");
    }
    public void fireEmployees(){
        System.out.println(name + " will fire employees");
    }
}
