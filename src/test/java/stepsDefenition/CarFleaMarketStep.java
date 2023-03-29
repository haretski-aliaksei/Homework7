package stepsDefenition;

import enumStorage.CarFleaMarket;
import enumStorage.MotofleaMarket;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static helpers.OnlinerCatalogHelper.*;

public class CarFleaMarketStep {
    @When("Наводим на пункт автобарахолка")
    public void hoverOverCarFleaMarketSection() {
        hoverOver(getElement(CarFleaMarket.CAR_FLEA_MARKET.getName()));
    }

    @Then("Проверяем что в подменю автобарахолки есть все пункты")
    public void checkForSubmenuCarFleaMarketItems() {
        List<String> CarFleaMarketItems = new ArrayList<>();
        CarFleaMarketItems.add(CarFleaMarket.CAR_REVIEWS.getName());
        CarFleaMarketItems.add(CarFleaMarket.NEW_CARS.getName());
        CarFleaMarketItems.add(CarFleaMarket.USED_CARS.getName());
        CarFleaMarketItems.add(CarFleaMarket.PRICE_WITH_VAT.getName());
        CarFleaMarketItems.add(CarFleaMarket.AUTO_UP_TO_4000.getName());
        CarFleaMarketItems.add(CarFleaMarket.AUTO_UP_TO_10_000.getName());
        CarFleaMarketItems.add(CarFleaMarket.MINSK.getName());
        CarFleaMarketItems.add(CarFleaMarket.HOMEL.getName());
        CarFleaMarketItems.add(CarFleaMarket.MAHILEV.getName());
        CarFleaMarketItems.add(CarFleaMarket.VITEBSK.getName());
        CarFleaMarketItems.add(CarFleaMarket.HRODNA.getName());
        CarFleaMarketItems.add(CarFleaMarket.BREST.getName());
        CarFleaMarketItems.add(CarFleaMarket.AUDI.getName());
        CarFleaMarketItems.add(CarFleaMarket.BMW.getName());
        CarFleaMarketItems.add(CarFleaMarket.CITROEN.getName());
        CarFleaMarketItems.add(CarFleaMarket.FORD.getName());
        CarFleaMarketItems.add(CarFleaMarket.MAZDA.getName());
        CarFleaMarketItems.add(CarFleaMarket.MERCEDES_BENZ.getName());
        CarFleaMarketItems.add(CarFleaMarket.NISSAN.getName());
        CarFleaMarketItems.add(CarFleaMarket.OPEL.getName());
        CarFleaMarketItems.add(CarFleaMarket.PEUGEOT.getName());
        CarFleaMarketItems.add(CarFleaMarket.RENAULT.getName());
        CarFleaMarketItems.add(CarFleaMarket.TOYOTA.getName());
        CarFleaMarketItems.add(CarFleaMarket.VOLKSWAGEN.getName());

        List<String> MotofleaMarketItems = new ArrayList<>();
        MotofleaMarketItems.add(MotofleaMarket.APRILIA.getName());
        MotofleaMarketItems.add(MotofleaMarket.BMW.getName());
        MotofleaMarketItems.add(MotofleaMarket.HARLEY_DAVIDSON.getName());
        MotofleaMarketItems.add(MotofleaMarket.HONDA.getName());
        MotofleaMarketItems.add(MotofleaMarket.HORS.getName());
        MotofleaMarketItems.add(MotofleaMarket.JAWA.getName());
        MotofleaMarketItems.add(MotofleaMarket.KAWASAKI.getName());
        MotofleaMarketItems.add(MotofleaMarket.SUZUKI.getName());
        MotofleaMarketItems.add(MotofleaMarket.VIPER.getName());
        MotofleaMarketItems.add(MotofleaMarket.YAMAHA.getName());
        MotofleaMarketItems.add(MotofleaMarket.DNEPR.getName());
        MotofleaMarketItems.add(MotofleaMarket.MINSK.getName());

        Assertions.assertThat(getItems(CarFleaMarket.CAR_FLEA_MARKET.getName()).containsAll(CarFleaMarketItems)).isTrue();
        Assertions.assertThat(getItems(MotofleaMarket.MOTOFLEA_MARKET.getName()).containsAll(MotofleaMarketItems)).isTrue();
    }
}
