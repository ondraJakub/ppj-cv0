package ppj.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jarda on 3/6/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("c");
        names.add("b");
        names.add("a");

        Collections.sort(names, String::compareTo);
        System.out.println(names);
    }
}
