package main.pageObjects;

public interface LoginPageElements {
    String signTitle = "//h1[contains(text(),'Sign-In')]";
    String username = "#ap_email";
    String btnContinue = "#continue";
    String btnRegister = "//a[@id='createAccountSubmit']";
}
