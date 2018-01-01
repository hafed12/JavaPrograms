/**
 * Created by SONY on 10/25/2017.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSslots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSslots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSslots = cardSslots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program "+ programName + " is now loading ...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSslots() {
        return cardSslots;
    }

    public String getBios() {
        return bios;
    }
}
