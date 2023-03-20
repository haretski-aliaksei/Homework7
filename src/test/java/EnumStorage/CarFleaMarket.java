package EnumStorage;

public enum CarFleaMarket {
    CAR_FLEA_MARKET("Автобарахолка"),
    CAR_REVIEWS("Отзывы об авто"),
    NEW_CARS("Новые авто"),
    USED("С пробегом"),
    PRICE_WITH_VAT("Цена с НДС"),
    AUTO_UP_TO_4000("Авто до 4000 р."),
    AUTO_UP_TO_10_000("Авто до 10 000 р."),
    MINSK("Минск"),
    HOMEL("Гомель"),
    MAHILEV("Могилев"),
    VITEBSK("Витебск"),
    HRODNA("Гродно"),
    BREST("Брест"),
    AUDI("Audi"),
    BMW("BMW"),
    CITROEN("Citroen"),
    FORD("Ford"),
    MAZDA("Mazda"),
    MERCEDES_BENZ("Mercedes-Benz"),
    NISSAN("Nissan"),
    OPEL("Opel"),
    PEUGEOT("Peugeot"),
    RENAULT("Renault"),
    TOYOTA("Toyota"),
    VOLKSWAGEN("Volkswagen");

    String nameCarFleaMarket;

    CarFleaMarket(String CarFleaMarket) {
        this.nameCarFleaMarket = CarFleaMarket;
    }
}
