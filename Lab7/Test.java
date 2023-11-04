package Lab7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        MyPredicates.remove(set, new Even());
        System.out.println(set); // output: [1, 3]

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        MyPredicates.retain(list, new Even());
        System.out.println(list); // output: [2, 4]

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        Set<Integer> result = MyPredicates.collect(set2, new Even());
        System.out.println(result); // output: [2, 4]

        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(7);
        int index = MyPredicates.find(list2, new Even());
        System.out.println(index); // output: -1 (no even integers found)

    }

}
