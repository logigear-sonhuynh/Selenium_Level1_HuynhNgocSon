package Comman;

import PageObjects.Railway.LoginPage;

public class Utilities {
    public static String getWorkingPath(){
        return System.getProperty("user.dir");
    }
    public static String MultipleTimes(){
        for (int i=1; i<=3; i++){
            LoginPage loginPage = new LoginPage();
            loginPage.login(Constant.USERNAME,Constant.PASSWORD1);
        }
        return null;
    }
}
