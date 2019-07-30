 package com.tnt.lintcode.base.sort;

import java.util.Arrays;
import java.util.List;

/**
 * @author wenziheng
 * @date 2019/07/30
 */
public class BubbleSort {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(3,7,3,4,1,2,9,0);
        System.out.println(l);
        bubbleSort(l);
        System.out.println(l);
    }

    /**
     * 时间复杂度：O(n) ~ O(n2)
     */
    private static List<Integer> bubbleSort(List<Integer> l){
        if(l == null || l.isEmpty()) {
            return l;
        }
        while(exchange(l)) {}
        return l;
    }

    private static boolean exchange(List<Integer> l){
        int previous = l.get(0);
        int changeTime = 0;
        for(int i = 1; i < l.size(); i++) {
            int current = l.get(i);
            if(current < previous) {
                changeTime++;
                l.set(i - 1, current);
                l.set(i, previous);
            }
            previous = l.get(i);
        }
        if(changeTime > 0) {
            return true;
        }
        return false;
    }

}
