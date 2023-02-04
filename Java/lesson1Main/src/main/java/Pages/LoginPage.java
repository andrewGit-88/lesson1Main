package Pages;

// Inheritance EXAMPLE after "public class LoginPage" insert EXTENDS following other CLASS ex. Page
public class LoginPage extends Page implements PageInterface{

//    All the attributes above and then all the methods
    private String username;
    private String password;

    public void populateCredentials (){
        System.out.println(String.format("credentials are populated: %s , %s", username, password));
    }

//    All the GETTERS AND SETTERS TO follow after
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void getDeveloperName() {
        System.out.println("Antony Kimbell");
    }
}
