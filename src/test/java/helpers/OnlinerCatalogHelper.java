package helpers;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class OnlinerCatalogHelper {

    public static List<String> getItems(String nameItem) {
        ElementsCollection items = Selenide.$$x("//a[text()='" + nameItem + "']/../..//div[contains(@class, 'grid')]//span[contains(@class, 'sign')]");
        List<String> list = new ArrayList<>();
        items.forEach(x -> list.add(x.getOwnText()));
        return list;
    }

    public static void hoverOver(SelenideElement selenideElement) {
        actions().moveToElement(selenideElement).perform();
    }

    public static SelenideElement getElement(String nameElement) {
        return $x("//span[contains(@class,'main') and text()='" + nameElement + "']");
    }
}
