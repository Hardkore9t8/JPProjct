/**Product will implement the basic functionality that all
 * items on a production line should have serialNumber
 * String manufacturer
 *Date manufacuredOn
 *String name*/
import java.util.Date;

public abstract class Product implements Item{

    int serialNo;
    String manufacturer;
    String name;
    Date manufacturedOn;

    public static int currentProductionNumber =1;

    public Product(String name){
        this.name = name;
        manufacturedOn = new Date(System.currentTimeMillis());
        setProductionNumber(currentProductionNumber);
        currentProductionNumber++;
        manufacturer = manufacturerOrigin;
    }

    @Override
    public void setProductionNumber(int productionNo) {
        currentProductionNumber = productionNo;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    @Override
    public int getSerialNumber() {
        return serialNo;
    }

    @Override
    public String toString() {

        String output =   "Manufacturer: " + manufacturer + "\n"
                        + "Serial Number: " + serialNo +"\n"
                        + "Date: " + manufacturedOn + "\n"
                        + "Name: " + name;
        return output;
    }
}
