package Zoommer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ZoommerDashTest extends ZoommerDashSelectors {

    @Test
    public void sortingItems() {
        pickMobile.click();
        Assert.assertTrue(mobilePicked.isEnabled());
        sortingDropdown.click();
        sortByIncreasingPrice.click();
        List<WebElement> items = dash.findElements(By.cssSelector(".product_new_price "));
        System.out.println(Arrays.asList(items));

        for(int j = 0; j <  items.size(); j++){
            if(j >= items.size() - 1){
                break;
            }

            String priceWithCurrency = items.get(j).getText();
            String nextPriceWithCurrency = items.get(j+1).getText();
            String price = priceWithCurrency.replaceAll("₾", "").trim();
            String nextPrice = nextPriceWithCurrency.replaceAll("₾", "").trim();

            if(Integer.parseInt(price) <= Integer.parseInt(nextPrice)){
                System.out.println("step: " + j + "correct");
            }
        }

    }

    }

