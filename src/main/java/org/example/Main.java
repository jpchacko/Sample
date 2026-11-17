package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.computeIfAbsent(8, k->new ArrayList<>()).add(3);
        map.computeIfAbsent(8, k->new ArrayList<>()).add(4);
        map.computeIfAbsent(9, k->new ArrayList<>()).add(6);
        map.computeIfAbsent(5, k->new ArrayList<>()).add(2);

        System.out.println(map.values());
    }

    private int[] processNums(int[] nums){
        Map<Integer, List<Integer>> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numsMap.computeIfAbsent(nums[i], k-> new ArrayList<>()).add(i);
        }

        return null;
        //Now iterate over the map and get the
    }
}
