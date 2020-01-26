package Helpers;

import Models.Product;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONHelper {
    private JSONObject jsonObject;
    private JSONArray jsonArray;

    public JSONObject createObject(String key, Product product) {
        JSONObject object = new JSONObject();
        jsonObject = new JSONObject();
        jsonObject.put("quantity", String.valueOf(product.getQuantity()));
        jsonObject.put("price", String.valueOf(product.getPrice()));
        jsonObject.put("volume", String.valueOf(product.getVolume()));
        object.put(key, jsonObject);
        return object;
    }

    public JSONArray createArray(String key)  {
        jsonArray = new JSONArray();
        jsonArray.put(key);
        return jsonArray;
    }

    public JSONArray putElementIntoArray(JSONArray jsonArray, JSONObject object) {
        jsonArray.put(object);
        return jsonArray;
    }
}
