import java.io.IOException;
import java.net.InetAddress;

public class InternetConnectionCheck {

    public static void main(String[] args) {
        if (isInternetConnectionAvailable()) {
            System.out.println("Internet connection is available.");
        } else {
            System.out.println("No internet connection.");
        }
    }

    public static boolean isInternetConnectionAvailable() {
        try {
            InetAddress.getByName("www.google.com");
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}