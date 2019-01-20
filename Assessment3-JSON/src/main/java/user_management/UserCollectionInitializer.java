package user_management;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class UserCollectionInitializer {

    public static UserCollection generate() throws IOException {
        ClassLoader classLoader = UserCollectionInitializer.class.getClassLoader();
        File file = new File(classLoader.getResource("users.json").getFile());

        Type listOfA = new TypeToken<List<User>>() {}.getType();
        Gson g = new Gson();
        ArrayList<User> result = g.fromJson(new FileReader(file), listOfA);

//        System.out.println(result.toString());

        return new UserCollection(result);
    }
}

