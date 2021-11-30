package guru.qa;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import java.util.Set;
import java.util.TreeSet;


public class ArraysExample {
    int[] intArray = new int[]{5, 6, 7, 8, 9};
    String[] stringArray = new String[]{"foo", "bar"};

    public static void main(String... args) {
        int[] intArray = new int[5];
        intArray[0] = 5;
        intArray[1] = 6;
        intArray[2] = 7;
        intArray[3] = 8;
        intArray[4] = 9;

        ElementsCollection selenideElements = Selenide.$$("");

        List<String> stringList = new ArrayList<>();
        stringList.add("foo");
        stringList.remove(0);
        stringList.remove("foo");

        List<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(1);
        intList.add(5);

        Collections.emptyList();

        List<String> strings = Arrays.asList("id");
        List<String> strings0 = Collections.singletonList("id");


        Set<String> stringSet = new HashSet<>();
        Set<String> linkedStringSet = new LinkedHashSet<>();
        Set<String> treeStringSet = new TreeSet<>();

        Map<Integer, String> aMap = new HashMap<>();
        aMap.put(1, "foo");
        aMap.put(2, "bar");

        Collection<String> values = aMap.values();
        Set<Map.Entry<Integer, String>> entries = aMap.entrySet();
        Set<Integer> keySet = aMap.keySet();


        for (int i = 2; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        for (int element : intArray) {
            System.out.println(element);
        }
    }

    static List<Integer> returnListIfArgumentGreaterThen0(int i) {
        if (i > 0) {
            return Arrays.asList(i);
        }
        return Collections.emptyList();
    }
}
