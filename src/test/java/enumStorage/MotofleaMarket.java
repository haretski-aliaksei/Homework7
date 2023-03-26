package enumStorage;

public enum MotofleaMarket {
    MOTOFLEA_MARKET("Мотобарахолка"),
    APRILIA("Aprilia"),
    BMW("BMW"),
    HARLEY_DAVIDSON("Harley-Davidson"),
    HONDA("Honda"),
    HORS("HORS"),
    JAWA("Jawa"),
    KAWASAKI("Kawasaki"),
    SUZUKI("Suzuki"),
    VIPER("Viper"),
    YAMAHA("Yamaha"),
    DNEPR("Днепр"),
    MINSK("Минск");

    String nameMotofleaMarket;

    MotofleaMarket(String nameMotofleaMarket) {
        this.nameMotofleaMarket = nameMotofleaMarket;
    }

    public String getName() {
        return nameMotofleaMarket;
    }
}
