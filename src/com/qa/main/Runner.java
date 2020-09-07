package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> sandwiches = new ArrayList<>();
        sandwiches.add("hot dog");
        sandwiches.add("blt");
        sandwiches.add("club");
        sandwiches.add("bread sandwich");

//        sandwiches.remove(1);
        sandwiches.remove("blt");

        System.out.println(sandwiches);
        System.out.println(sandwiches.size());

        for (int i = 0; i < sandwiches.size(); i++) {
            System.out.println(sandwiches.get(i));
        }
        // what's at pos. 0? oh it's hot dog, cool, print that
        // what's at pos. 1? oh it's blt, cool, print that

        for (String sandwich : sandwiches) {
            System.out.println(sandwich);
        }
        // what's the first string? oh it's "hot dog"

//        System.out.println(sandwiches.get(3));

        Collections.sort(sandwiches);

        System.out.println("sorted:");
        System.out.println(sandwiches);

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1355417);
        nums.add(-999);
        nums.add(63);

        for (int i : nums) {
            System.out.println(i);
        }

        System.out.println(nums);

        Collections.sort(nums);
        Collections.reverse(nums);
        Collections.swap(nums, 1, 2);

        List<Integer> newNums = new ArrayList<>();
        Collections.copy(newNums, nums);
        // won't work - new list size must >= old list size
    }

}
