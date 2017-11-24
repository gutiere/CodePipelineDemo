
import com.amazonaws.services.lambda.runtime.Context;

import java.util.Map;

public class HelloWorld {

    private static final String TABLE_NAME = "Music";

    public String handleRequest(Map<String, Object> input, Context context) {

        return "Hello Moto";
    }
}