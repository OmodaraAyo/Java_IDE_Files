package enumtasks;

public enum GeopoliticalZones {
    NORTHEAST("Adamawa \nBauchi \nBorno \nGombe \nTaraba \nYobe"),
    NORTHWEST("Zamfara \nSokoto \nKebbi \nKatsina \nKano \nKaduna, Jigawa"),
    NORTHCENTRAL("Plateau \nNiger \nNasarawa \nKwara \nKogi \nAbuja \nBenue"),
    SOUTHEAST("Imo \nEnugu \nEbonyi \nAnambra \nAbia"),
    SOUTHWEST("Ekiti \nLagos \nOgun \nOsun \nOyo"),
    SOUTHSOUTH("Rivers \nEdo \nDelta \nCross River \nBayelsa \nAkwa Ibom");

    private final String description;

    GeopoliticalZones(String description) {
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}

