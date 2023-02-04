package Pages;

public class PagesMain {
    public static void main(String[] args) {

//        Creating CONSTRUCTOR METHOD below:
        Page loginScreen = new Page("Login", 1, "www.LegionIt.com/index1");

//        Page loginScreen = new Page();
//        loginScreen.pageId = 1;
//        loginScreen.pageName = "Login";
//        loginScreen.URL = "www.LegionIt.com/index1";

        loginScreen.openPage();
        loginScreen.clickBotton("Vector");
        loginScreen.closePage();

//        Creating EMPTY CONSTRUCTOR  below:
        Page aboutScreen = new Page();

//    #1    Page aboutScreen = new Page();
//        aboutScreen.pageId = 2;
//        aboutScreen.pageName = "About";
//        aboutScreen.URL = "www.LegionIt.com/about";
//    #2   Using Public Private void String and Int to Public void Get and Set
//        aboutScreen.setPageId(2);
//        aboutScreen.setPageName("About");
//        aboutScreen.setURL("www.LegionIt.com/about");
//    #3   You can get direct value say 54 if you set integer (but it can only print) (encapsulation)
//        System.out.println(aboutScreen.getPageId());

//    #2 trying direct call out;
//        aboutScreen.openPage();
//        aboutScreen.clickBotton("Exit");
//        aboutScreen.closePage();

//  Inheritance LoginPage example BELOW very GOOD Method - EASY TO USE
//        LoginPage loginPage = new LoginPage();
//        loginPage.setPageId(2);
//        loginPage.setURL("www.LegionIt.com/about");
//        loginPage.setPassword("12345");
//        loginPage.openPage();
//  You can create separate pages for Classes to be patched to main testing class through EXTENDS function
//  Also bring up multiple methods of testing to one main Testing Class

//    Polymorphism example below
    Page page = new Page();
    page.getDeveloperName();

    Page loginPage = new LoginPage();
    loginPage.getDeveloperName();

    Page aboutPage = new AboutPage();
    aboutPage.getDeveloperName();
    }
}
