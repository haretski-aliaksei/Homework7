package testSuite;

import enumStorage.HousesAndApartmentsRent;
import enumStorage.HousesAndApartmentsSell;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static helpers.OnlinerCatalogHelper.*;

public class HousesAndApartmentsTest {

    @When("Наводим на пункт дома и квартиры")
    public void hoverOverHousesAndApartmentsSection() {
        hoverOver(getElement(HousesAndApartmentsSell.HOUSES_AND_APARTMENTS.getName()));
    }

    @Then("Проверяем что в подменю есть все пункты")
    public void checkForSubmenuHousesAndApartmentsItems() {
        List<String> housesAndApartmentsSellItems = new ArrayList<>();
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.MINSK.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.BREST.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.VITEBSK.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.HOMEL.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.HRODNA.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.MAHILEV.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.ONE_ROOM.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.TWO_ROOM.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.THREE_ROOM.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.FOUR_PLUS_ROOM.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.UP_TO_30_000.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.FROM_30_000_TO_80_000.getName());
        housesAndApartmentsSellItems.add(HousesAndApartmentsSell.FROM_80_000.getName());

        List<String> housesAndApartmentsRentItems = new ArrayList<>();
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.MINSK.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.BREST.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.VITEBSK.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.HOMEL.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.HRODNA.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.MAHILEV.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.ONE_ROOM.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.TWO_ROOM.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.THREE_ROOM.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.FOUR_PLUS_ROOM.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.ROOMS.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.FROM_OWNER.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.UP_TO_250.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.FROM_250_TO_500.getName());
        housesAndApartmentsRentItems.add(HousesAndApartmentsRent.FROM_500.getName());

        Assertions.assertThat(getItems(HousesAndApartmentsSell.SELL.getName()).containsAll(housesAndApartmentsSellItems)).isTrue();
        Assertions.assertThat(getItems(HousesAndApartmentsRent.RENT.getName()).containsAll(housesAndApartmentsRentItems)).isTrue();
    }
}
