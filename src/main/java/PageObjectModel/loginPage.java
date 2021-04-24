package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class loginPage extends AbstractClass {

    WebDriver driver;

    public loginPage() {

        driver = Driver.getDriver();

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "myAccount")
    private WebElement girisYapButton;

    public void clickGirisYapButton() {

        clickFunction(girisYapButton);
    }

    @FindBy(id = "login")
    private WebElement girisYapButton1;

    public void clickGirisYapButton1() {

        clickFunction(girisYapButton1);
    }

    @FindBy(id = "txtUserName")
    private WebElement emailTextArea;

    public void typeEmail() {
        sendKeysFunction(emailTextArea, "testaccount123abc123@yahoo.com");
    }

    @FindBy(id = "txtPassword")
    private WebElement passwordTextArea;

    public void typePassword() {
        sendKeysFunction(passwordTextArea, "Testhesabi1");
    }

    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    public void clickOnLoginButton() {
        clickFunction(loginButton);
    }

    @FindBy(id = "shoppingCart")
    private WebElement cartButton;

    public void clickCartButton() {
        clickFunction(cartButton);
    }

    @FindBy(css = "div.content_Z9h8v>h1")
    private WebElement cartMessage;

    public void assertTheMassage() {

        Assertion(cartMessage, "Sepetin şu an boş");
    }

    @FindBy(className = "sf-header-kbFsTm")

    private WebElement goBackToMainPage;

    public void mainPage() {
        clickFunction(goBackToMainPage);
    }

    @FindBy(className = "sf-MenuItems-2xUK7")

    private WebElement selectCategory;

    public void selectACategory() {
        clickFunction(selectCategory);

    }

    @FindBy(className = "sf-ChildMenuItems-3R6bj")

    private WebElement selectDropdown;

    public void selectADropdown() {
        clickFunction(selectDropdown);
    }

    @FindBy(xpath = "//ol[@class='show-all-brands scrollable-filter-container scroll-lock']//li[@title='LEGO']")

    private WebElement selectBrand;

    public void selectABrand() {
        clickFunction(selectBrand);
    }

    @FindBy(xpath = "//div[@class='range-contain-row left']//input[@class='input free']")

    private WebElement putValueArea;

    public void putValue() {
        sendKeysFunction(putValueArea, "10");
    }

    @FindBy(xpath = "(//div[@class='range-contain']//div[@class='range-contain-row left']//input[@class='input free'])[2]")

    private WebElement putAnotherValueArea;

    public void putAnotherValue() {
        sendKeysFunction(putAnotherValueArea, "4000");
    }

    @FindBy(xpath = "//div[@class='range-contain-row right']")

    private WebElement clickButton;

    public void clickTheButton() {
        clickFunction(clickButton);
    }

    @FindBy(xpath = "(//div[@class='product-detail']//h3[@class='product-title title'])[3]")

    private WebElement selectProduct;

    public void selectTheProduct() {
        clickFunction(selectProduct);
    }

    @FindBy(xpath = "//div[@class='price-wrapper visible']//div//span[@content='239.91']")
    private WebElement productPrice;

    public void assertMassageForPrice() {

        Assertion(productPrice, "239,91 TL");
    }

    @FindBy(xpath = "//span[@class='addToCartButton']")
    private WebElement addToCart;

    public void addToCartButton() {
        clickFunction(addToCart);
    }

    @FindBy(xpath = "//a[@class='checkoutui-Modal-2iZXl']")
    private WebElement closePopUp;

    public void closeThePopUp() {
        clickFunction(closePopUp);
    }

    @FindBy(xpath = "//span[@id='cartItemCount']")
    private WebElement countItem;

    public void assertMessageForItem() {

        Assertion(countItem, "1");
    }

    @FindBy(xpath = "//span[@id='shoppingCart']")
    private WebElement goToCart;

    public void goToTheCart() {
        clickFunction(goToCart);
    }

    @FindBy(xpath = "//div[@class='container_HX1zs']//a[@class='product_increase_3SpEx']")
    private WebElement addOneMoreTime;

    public void addOneMore() {
        clickFunction(addOneMoreTime);

    }

    @FindBy(xpath = "//div[@class='container_HX1zs']//a[@class='product_increase_3SpEx']")
    private WebElement addAgain;

    public void addThatAgain() {
        clickFunction(addAgain);

    }

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[3]/div/div/div[1]/div[1]/span[2]/div/div")
    private WebElement lastPrice;

    public void checkLastPrice() throws InterruptedException {

        Assertion(lastPrice, "719,73");
    }

    @FindBy(xpath = "//div[@class='cta_3vBFp']")
    private WebElement clickFinishButton;

    public void clickTheFinishButton() {
        clickFunction(clickFinishButton);
    }

    @FindBy(xpath = "//div[@class='accordion_body_7laxZ active_body_r6jc_']//span")
    private WebElement addNewAddress;

    public void newAddress() {
        clickFunction(addNewAddress);
    }

    @FindBy(xpath = "//div[@class='input_outer_1QKx4']//input[@name='contact.firstName']")
    private WebElement addName;

    public void enterName() {
        sendKeysFunction(addName, "Eren");
    }

    @FindBy(xpath = "//div[@class='input_outer_1QKx4']//input[@name='contact.lastName']")
    private WebElement addSurname;

    public void enterSurname() {
        sendKeysFunction(addSurname, "Basibuyuk");
    }

    @FindBy(xpath = "//div[@class='input_outer_1QKx4']//div//div//input[@class=' form-control']")
    private WebElement addPhoneNumber;

    public void enterPhoneNumber() {
        sendKeysFunction(addPhoneNumber, "5355552211");
    }

    @FindBy(xpath = "//div[@class='input_wrapper_3oblK'][1]")
    private WebElement addCity;

    public void enterCity() {
        clickFunction(addCity);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[1]/div/div[1]/div/input")
    private WebElement clickCity;

    public void clickACity() {
        clickFunction(clickCity);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[1]/div/div[1]/div/div[2]/div/div[2]/div/div[1]")
    private WebElement selectCity;

    public void selectACity() {
        clickFunction(selectCity);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[1]/div/div[2]/div/input")
    private WebElement clickIlce;

    public void clickAIlce() {
        clickFunction(clickIlce);

    }

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/div[6]")
    private WebElement selectIlce;

    public void selectAIlce() {
        clickFunction(selectIlce);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[1]/div/div[3]/div/input")
    private WebElement clickMahalle;

    public void clickAMahalle() {
        clickFunction(clickMahalle);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[1]/div/div[3]/div/div[2]/div/div[2]/div/div[1]")
    private WebElement selectMahalle;

    public void selectAMahalle() {
        clickFunction(selectMahalle);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[2]/div/div[1]/div/textarea")
    private WebElement textAddress;

    public void textTheAddress() {
        sendKeysFunction(textAddress, "Bahcelievler Mahallesi Erde Sokak No:9");
    }

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[2]/div/div[2]/div/input")
    private WebElement nicknameAddress;

    public void nicknameTheAddress() {
        sendKeysFunction(nicknameAddress, "Evim");
    }

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[4]/div/div/div/button[1]")
    private WebElement saveButton;

    public void clickSaveButton() {
        clickFunction(saveButton);
    }

    @FindBy(xpath = "//div[@class='cta_3vBFp']")
    private WebElement clickContinue;

    public void clickContinueButton() {
        clickFunction(clickContinue);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div[1]/div[1]/div[2]/div")
    private WebElement typeOfPayment;

    public void clickCreditCard() {
        clickFunction(typeOfPayment);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div[1]/form/div[1]/div[1]/div/div/div/input")
    private WebElement creditCardInfo;

    public void enterCreditCardInfo() {
        sendKeysFunction(creditCardInfo, "1111222233334444");
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div[1]/form/div[1]/div[2]/div/div/div/input")
    private WebElement creditCardName;

    public void enterCreditCardName() {
        sendKeysFunction(creditCardName, "Eren Basibuyuk");
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div[1]/form/div[1]/div[3]/div/div[1]/div/input")
    private WebElement monthYear;

    public void enterMonthYear() {
        sendKeysFunction(monthYear, "1121");
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div/div[1]/form/div[1]/div[3]/div/div[2]/div/input")
    private WebElement cvv;

    public void enterCVV() {
        sendKeysFunction(cvv, "321");
    }

    @FindBy(xpath = "/html/body/div/div/div/header/div/div/div[1]")
    private WebElement basketPage;

    public void backToBasket() {
        clickFunction(basketPage);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/section/section/ul/li/div/div/div[2]/div[4]/div[2]/div/a[2]")
    private WebElement deleteProducts;

    public void deleteItems() {
        clickFunction(deleteProducts);
    }

    @FindBy(xpath = "//div[@class='container_HX1zs']//a[2]")
    private WebElement confirmDeleteProducts;

    public void deleteTheProducts(){
        clickFunction(confirmDeleteProducts);
    }
    @FindBy(xpath = "//div[@class='sflContainer_1aZ_z']//button[2]")
    private WebElement confirmAgain;

    public void confirmAgainThis(){
        clickFunction(confirmAgain);
    }

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div")
    private WebElement mainPage;

    public void goToMainPage() {
        clickFunction(mainPage);
    }

    @FindBy(id = "myAccount")
    private WebElement accountPage;

    public void goToAccount() {
        clickFunction(accountPage);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div/div/div/div[2]/div[3]/div[2]/div/div[2]/ul/li[3]/a")
    private WebElement hesabim;

    public void getIntoMyAccount() {
        clickFunction(hesabim);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div[4]/div/div[2]/div/div/div[5]/div/div[5]/ul/li[1]/a/span")
    private WebElement updateInfo;

    public void updateMyInfo() {
        clickFunction(updateInfo);
    }

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div/div/div/div/div/div/div[2]/div/div[6]/div/div/div[2]/a[6]")
    private WebElement myAddress;

    public void goToMyAddress() {
        clickFunction(myAddress);
    }

    @FindBy(xpath = "/html/body/div/div[4]/div/div/div/div[4]/div/div/div/div/ul/li[2]/div/div[1]/a[1]")
    private WebElement deleteAddress;

    public void deleteMyAddress() {
        clickFunction(deleteAddress);
    }
    @FindBy(xpath = "/html/body/div/div[4]/div/div/div/div[4]/div/div/div/div/ul/li[2]/div/div[2]/div/a[2]")
    private WebElement confirmDelete;

    public void confirmDeleteTheAddress(){
        clickFunction(confirmDelete);
    }
}

