package enumStorage;

public enum HousesAndApartmentsRent {
    RENT("Аренда"),
    MINSK("Минск"),
    BREST("Брест"),
    VITEBSK("Витебск"),
    HOMEL("Гомель"),
    HRODNA("Гродно"),
    MAHILEV("Могилев"),
    ONE_ROOM("1-комнатные"),
    TWO_ROOM("2-комнатные"),
    THREE_ROOM("3-комнатные"),
    FOUR_PLUS_ROOM("4+-комнатные"),
    ROOMS("Комнаты"),
    FROM_OWNER("От собственника"),
    UP_TO_250("До 250 $"),
    FROM_250_TO_500("250-500 $"),
    FROM_500("От 500 $");

    String nameHousesAndApartmentsRent;

    HousesAndApartmentsRent(String nameHousesAndApartmentsRent) {
        this.nameHousesAndApartmentsRent = nameHousesAndApartmentsRent;
    }

    public String getName() {
        return nameHousesAndApartmentsRent;
    }
}
