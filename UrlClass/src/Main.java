import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.youtube.com/watch?v=6B1yoGK90W8&t=1988s");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String read;
        while ((read = bufferedReader.readLine()) != null) {
            System.out.println(read);

        }
        bufferedReader.close();
    }
}