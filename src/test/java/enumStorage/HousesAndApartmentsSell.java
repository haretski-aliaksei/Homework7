package enumStorage;

public enum HousesAndApartmentsSell {
    HOUSES_AND_APARTMENTS("Дома и квартиры"),
    RENT("Аренда"),
    MINSK("Минск"),
    BREST("Брест"),
    VITEBSK("Витебск"),
    HOMEL("Гомель"),
    HRODNO("Гродно"),
    MAHILEV("Могилев"),
    ONE_ROOM("1-комнатные"),
    TWO_ROOM("2-комнатные"),
    THREE_ROOM("3-комнатные"),
    FOUR_PLUS_ROOM("4+-комнатные"),
    UP_TO_30_000("До 30 000 $"),
    FROM_30_000_TO_80_000("30 000–80 000 $"),
    FROM_80_000("От 80 000 $");

    String nameHousesAndApartmentsSale;

    HousesAndApartmentsSell(String nameHousesAndApartmentsSale) {
        this.nameHousesAndApartmentsSale = nameHousesAndApartmentsSale;
    }

    public String getName() {
        return nameHousesAndApartmentsSale;
    }
}
