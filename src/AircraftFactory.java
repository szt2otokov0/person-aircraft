public class AircraftFactory {

    public static Aircraft makeF16(){
        return new Aircraft("F16",8,30,false);
    }

    public static Aircraft makeF35(){
        return new Aircraft("F35",12,50,true);
    }
}
