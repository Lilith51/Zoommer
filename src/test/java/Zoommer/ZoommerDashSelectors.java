package Zoommer;

import Utils.ChromeRunner;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ZoommerDashSelectors extends ChromeRunner {
    SelenideElement pickMobile = $(byXpath("//*[contains(@class,'main-navigation-body')]/ul/li[contains(.,'მობილურები')]"));
    SelenideElement mobilePicked = $(byText("მობილურები"));
    SelenideElement sortingDropdown = $(byXpath("(//button[@data-toggle='dropdown'])[2]"));
    SelenideElement sortByIncreasingPrice = $(byXpath("//li[contains(.,'ფასი: ზრდადობით')]"));
    WebElement dash = $(".popular_products_inside");

}
