package stepDefinition;

import PageObjectModel.loginPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class loginSteps {

    private WebDriver driver;
    loginPage loginPage = new loginPage();

    @Given("Go to Hepsiburada website")
    public void go_to_hepsiburada_website() {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("The website has been visited");
    }

    @Given("Click Giris Yap button")
    public void click_giris_yap_button() throws Throwable {

        loginPage.clickGirisYapButton();

        System.out.println("Button clicked");

        loginPage.clickGirisYapButton1();

        System.out.println("Giris Yap button clicked");

    }

    @Given("Type username")
    public void type_username() throws Throwable {

        loginPage.typeEmail();

        System.out.println("Username entered");

    }

    @Given("Type password")
    public void type_password() throws Throwable {

        loginPage.typePassword();

        System.out.println("Password entered");
    }

    @When("Click Giris button")
    public void click_giris_button() throws Throwable {

        loginPage.clickOnLoginButton();

        System.out.println("Button clicked");

    }

    @Then("Check the Cart for fee")
    public void check_the_cart_for_fee() throws Throwable {

        loginPage.clickCartButton();

        System.out.println("Login is successful");

        loginPage.assertTheMassage();

    }

    @And("Go Back to Main Page")
    public void go_back_to_main_page() throws Throwable {

        loginPage.mainPage();
    }

    @And("Select Random Category")
    public void select_random_category() {

        loginPage.selectACategory();

    }

    @And("Click Random Dropdown Category")
    public void click_random_dropdown_category() {

        loginPage.selectADropdown();
    }

    @And("Select Random Brand")
    public void select_random_brand() {

        loginPage.selectABrand();

    }

    @And("Put Value")
    public void put_value() {

        loginPage.putValue();
        loginPage.putAnotherValue();
        loginPage.clickTheButton();

    }

    @And("Select Random Product")
    public void select_random_product() {

        loginPage.selectTheProduct();
    }

    @And("Check The Price")
    public void check_the_price() {

        loginPage.assertMassageForPrice();

        System.out.println("Prices are the same");

    }

    @And("Add to Cart")
    public void add_to_cart() {

        loginPage.addToCartButton();

    }
    @And("Check The Count")
    public void check_the_count(){

        loginPage.closeThePopUp();
        loginPage.assertMessageForItem();
        System.out.println("Count numbers are the same");
        loginPage.goToTheCart();
    }

    @And("Add Two More Time")
    public void add_two_more_time(){
        loginPage.addOneMore();
        loginPage.addThatAgain();

    }
    @And("Check Last Price")
    public void check_last_price() throws InterruptedException{

        Thread.sleep(3000);
        loginPage.checkLastPrice();
    }
    @And("Finish Shopping")
    public void finish_shopping(){

        loginPage.clickTheFinishButton();
    }
    @And("Add New Address Button")
    public void add_new_address(){

        loginPage.newAddress();
    }
    @And("Add Address Info")
    public void add_address_info(){
        loginPage.enterName();
        loginPage.enterSurname();
        loginPage.enterPhoneNumber();
        loginPage.enterCity();
        loginPage.clickACity();
        loginPage.selectACity();
        loginPage.clickAIlce();
        loginPage.selectAIlce();
        loginPage.clickAMahalle();
        loginPage.selectAMahalle();
        loginPage.textTheAddress();
        loginPage.nicknameTheAddress();
        loginPage.clickSaveButton();
        loginPage.clickContinueButton();
    }
    @And("Add Credit Card Info")
    public void add_credit_card_info(){

        loginPage.clickCreditCard();
        loginPage.enterCreditCardInfo();
        loginPage.enterCreditCardName();
        loginPage.enterMonthYear();
        loginPage.enterCVV();
    }
    @And("Go to Basket")
    public void go_to_main_page(){

        loginPage.backToBasket();
    }
    @And("Delete Items")
    public void delete_items(){

        loginPage.deleteItems();
        loginPage.deleteItems();
        loginPage.deleteTheProducts();
        loginPage.confirmAgainThis();
    }
    @Then("Delete Address")
    public void delete_address() throws InterruptedException{

        loginPage.goToMainPage();
        driver.get("https://www.hepsiburada.com/hesabim");
        loginPage.updateMyInfo();
        loginPage.goToMyAddress();
        loginPage.deleteMyAddress();
        loginPage.confirmDeleteTheAddress();
        Thread.sleep(3000);
        driver.quit();
    }


}
