import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Ping {

    // ping a URL and return its status
    public static String getStatus(String url) {

        String result = "";
        try {
            URL urlObj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
            con.setRequestMethod("GET");
            // Set connection timeout
            con.setConnectTimeout(3000);
            con.connect();

            int code = con.getResponseCode();
            if (code == 200) {
                result = "On";
            }
        } catch (Exception e) {
            result = "Off";
        }
        return result;
    }

    // add a time to queue, remove any outside of timeframe of 0.300 seconds, return number in timeframe
    public static int ping (Queue<Long> q, long t) {
        q.enqueue(t);
        while (q.peek() < t - 300000000) {
            q.dequeue();
        }
        return q.size();
    }

    public static void main(String[] args) {
        Queue<Long> q = new Queue<Long>();

        String status;

        for (int i = 0; i < 10; i++) {
            status = getStatus("https://www.google.com"); // ping Google
            System.out.println("Google.com is : " + status); // print status
            System.out.println(ping(q, System.nanoTime())); // print times in timeframe
        }

    }
}
