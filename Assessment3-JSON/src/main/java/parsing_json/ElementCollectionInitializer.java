package parsing_json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class ElementCollectionInitializer {

    public static ElementCollection generate() throws IOException {

        ClassLoader classLoader = ElementCollectionInitializer.class.getClassLoader();
        File file = new File(classLoader.getResource("periodic_table.json").getFile());
        Type listOfA = new TypeToken<List<Element>>() {}.getType();
        Gson g = new Gson();
        ArrayList<Element> result = g.fromJson(new FileReader(file), listOfA);

        return new ElementCollection(result);
    }
}