/**
 * Created by MTimofeev on 7/25/2014.
 */
public class Service {
    private static Service ourInstance = new Service();

    public static Service getInstance() {
        return ourInstance;
    }

    private Service() {
    }

    public String getMsg(int i){
        return i+" Hello World!";
    }
}
