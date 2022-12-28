package test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@SuppressWarnings("unused")
public class GooglePlaceAPITest {
	public static final String GOOGLE_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?"
			+ "location=24.95375,121.22575&"
			+ "radius=500&"
			+ "types=food&"
			+ "name=炸物&"
			+ "language=zh-TW&"
			+ "key=AIzaSyBYlz_S7333slFX0Y5d5zMIXyI6Omk7mNs";
	
	public static void main(String[] args) throws IOException {
		URL url = new URL(GOOGLE_URL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setUseCaches(false);
		
		int code = con.getResponseCode();
		if (code == 200) {
			InputStream is = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String data;
			while ((data = br.readLine()) != null)
				System.out.println(data);
			
			br.close();
			isr.close();
			is.close();
			
		} else {
			System.out.println("Error!!");
		}
		
	}
}