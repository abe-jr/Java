package Stream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.io.InputStream;

public class InputStreamReader extends Thread {

    private String fileName;

    public InputStreamReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("InputStreamReader running");
        try {
            String resourceName = "./" + this.fileName  + ".json";
            FileReader fileReader = new FileReader(resourceName);
            JSONObject object = new JSONObject(new JSONTokener(fileReader));
            JSONArray products = object.getJSONArray("products");
            for (int i = 0; i < products.length(); i++) {
                System.out.println("  - " + products.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
