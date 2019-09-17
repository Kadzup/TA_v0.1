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
public class Tours {
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
    private static int service_id;
    /**
     * Id of connected Location
     * */
    private static int location_id;

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
    Tours(){
        companyName = "Test CO";

        price = 0.0f;
        taxes = 0.0f;
        owner = new Worker();

        service_id = 0;
        location_id = 0;

        transport = "none";
        visa_service = false;

        accommodation = false;
        accommodation_type = "none";

        food = false;
        food_type = "none";

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
    public int getService_id(){
        return this.service_id;
    }
    /**
     * @return Id of location where tour located
     * */
    public int getLocation_id(){
        return this.location_id;
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
}
