package Pages;

public class Page {


//    String pageName;
//    int pageId;
//    String URL;

//    public String getPageName() {
//        return pageName;
//    }
//    public void setPageName(String pageName) {
//        this.pageName = pageName;
//    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    //  Attributes__below (default state - public class)
//  to change class to private we encapsulate
    private String pageName;

//    private int pageId;

    //    Below if you need to print the number Method 3 in PageMain go direct to private int = but it will print only
    private int pageId = 54;

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    private String URL;

    //  then we need to write a method with GETTERS and SETTERS
    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }
//    After click GENERATE for sing Getter and Setter to return private


    //    Creating a CONSTRUCTOR method below with Assigned Values
    public Page(String pageName, int pageId, String URL) {
        this.pageName = pageName;
        this.pageId = pageId;
        this.URL = URL;
    }

    //    Creating an EMPTY CONSTRUCTOR method below
    public Page() {
    }

    public void openPage() {
        System.out.println(String.format("Page %s was opened", pageName));
    }

    public void closePage() {
        System.out.println(String.format("Page %s was closed", pageName));
    }

    public void clickBotton(String buttonName) {
        System.out.println(String.format("Page %s was clicked", buttonName));
    }

//    Polymorphism example below
    public void getDeveloperName(){
        System.out.println("John Smith");
    }
}
