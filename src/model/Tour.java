package model;
import java.lang.*;

/**
 * <h1>Welcome to TA!</h1>
 * <p>This class allows us to create object of available Tour.<br>
 * If You want to <b>Get</b> information from <b>Fields</b><br>
 * Then You should use Getters functions.<br>
 * You can read more about them bellow.
 * </p>
 *
 * @version <b>0.0.1</b>, <i><b>in dev</b></i>
 * @author <a href="https://github.com/Kadzup"><b><u>Kadzup</u></b></a>
 * @since <b>15.09.2019</b>
 * */
public class Tour {
    /**
     * Information about Company name
     * */
    private static String companyName;
    /**
     * Information about Tour price
     * */
    private static float price;
    /**
     * Information about Company Taxes
     * */
    private static float taxes;
    /**
     * Information about Tour Owner
     * */
    private static Worker owner;
    /**
     * Id of connected Service
     * */
    private static Service service;
    /**
     * Id of connected Location
     * */
    private static Location location;
    /**
     * Information about transport
     * */
    private static String transport;
    /**
     * Information about Visa Services accessibility
     * */
    private static Boolean visa_service;
    /**
     * Information about Accommodation accessibility
     * */
    private static Boolean accommodation;
    /**
     * Information about Accommodation type
     * */
    private static String accommodation_type;
    /**
     *  Information about Food accessibility
     * */
    private static Boolean food;
    /**
     *  Information about Food type
     * */
    private static String food_type;
    /**
     * Information about Excursion accessibility
     * */
    private static Boolean excursion;



    /**
     * Basic Constructor of Tour object
     * */
    Tour(){
        companyName = "Test CO";

        price = 0.0f;
        taxes = 0.0f;
        owner = new Worker();

        service = new Service();
        location = new Location();

        transport = "New Transport";
        visa_service = false;

        accommodation = false;
        accommodation_type = "Basic";

        food = false;
        food_type = "Basic";

        excursion = false;
    }

    /**
     * @return Name of Company that sale the tour
     * */
    public String getCompanyName(){
        return this.companyName;
    }
    /**
     * @return Price of tour
     * */
    public float getPrice(){
        return this.price;
    }
    /**
     * @return Company taxes for tour
     * */
    public float getTaxes(){
        return this.taxes;
    }
    /**
     * @return Id of service that gives that tour
     * */
    public Service getService(){
        return service;
    }
    /**
     * @return Id of location where tour located
     * */
    public Location getLocation(){
        return location;
    }
    /**
     * @return Information about transport
     * */
    public String getTransport(){
        return this.transport;
    }
    /**
     * @return Is visa service allowed?
     * */
    public Boolean getVisa_service(){
        return this.visa_service;
    }
    /**
     * @return Is accommodation allowed?
     * */
    public Boolean getAccommodation(){
        return this.accommodation;
    }
    /**
     * @return Information about accommodation
     * */
    public String getAccommodation_type(){
        return this.accommodation_type;
    }
    /**
     * @return Is food allowed?
     * */
    public Boolean getFood(){
        return this.food;
    }
    /**
     * @return Information about food
     * */
    public String getFood_type(){
        return this.food_type;
    }
    /**
     * @return Is excursion allowed?
     * */
    public Boolean getExcursion(){
        return this.excursion;
    }
    /**
     * @return Object of Worker, which contain owner information
     * */
    public Worker getOwner(){
        return this.owner;
    }


    public void setCompanyName(String Company){
        companyName = Company;
    }
    public void setPrice(float _price){
        price = _price;
    }
    public void setTaxes(float _taxes){
        taxes = _taxes;
    }
    public void setOwner(Worker _owner){
        owner = _owner;
    }
    public void setService(Service _service){
        service = _service;
    }
    public void setLocation(Location _location){
        location = _location;
    }
    public void setTransport(String _transport){
        transport = _transport;
    }
    public void setVisa_service(Boolean _visa_service){
        visa_service = _visa_service;
    }
    public void setAccommodation(Boolean _accommodation){
        accommodation = _accommodation;
    }
    public void setAccommodation_type(String _accommodation_type){
        accommodation_type = _accommodation_type;
    }
    public void setFood(Boolean _food){
        food = _food;
    }
    public void setFood_type(String _food_type){
        food_type = _food_type;
    }
    public void setExcursion(Boolean _excursion){
        excursion = _excursion;
    }


    public float calcPrice(){
        if(price+service.getPrice()-taxes > 0) {
            price += service.getPrice() - taxes;
            return price;
        }
        else{
            return -1;
        }
    }

    public  String getContact(){
        return (
                "Contact name: " + getOwner().getFullName() +
                "\nAddress: " + getLocation().getFullAddress() +
                "\nContact phone: " + getOwner().getPhone() + ", " + getLocation().getPhone()
                );
    }

    public String getInfo(Client client){
        String result = "";
        result =    "Company: " + getCompanyName() +
                    "\nPerson: "+ client.getFullName() +
                    "\n\nLocation: " + getLocation().getName() +
                    "\nAddress: " + getLocation().getFullAddress() +
                    "\nTransport: " + getTransport() +
                    "\nFood: ";
        if(getFood()){
            result += "Yes, " + getFood_type();
        }
        else{
            result += "No";
        }
        result += "\nAccommodation: ";
        if(getAccommodation()){
            result+= "Yes, "+ getAccommodation_type();
        }
        else{
            result += "No";
        }
        result += "\nExcursion: ";
        if(getExcursion()){
            result += "Yes";
        }
        else {
            result += "No";
        }
        result+="\n\nAdditional service: " + getService().name+
                "\n\nVisa services: ";
        if(getVisa_service()){
            result+="Yes";
        }
        else{
            result+="No";
        }
        result+="\nPrice: " + getPrice() +" + " + getService().getPrice()+ "for service"+
                "\nTaxes: " + getTaxes()+
                "\nTotal: " + calcPrice();
        return result;
    }
}
