import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100000; i++) {
            Restaurant.list.add(i);
        }
        Collections.shuffle(Restaurant.list);
        ////////////////////////////////////////
        ////////////////////////////////////////

    }
}