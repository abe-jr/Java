package Helpers;

import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class FileHelper {
    private String fileName;
    private JSONObject jsonObject;

    public FileHelper(String fileName, JSONObject jsonObject) {
        this.fileName = fileName;
        this.jsonObject = jsonObject;
    }

    public void createFile() {
        try (FileWriter file = new FileWriter("./" + this.fileName + ".json")) {
            file.write(this.jsonObject.toString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + this.jsonObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
