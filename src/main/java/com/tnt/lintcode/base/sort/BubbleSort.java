 package com.tnt.lintcode.base.sort;

import java.util.Arrays;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

/**
 * @author wenziheng
 * @date 2019/07/30
 * 
 */
public class BubbleSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] intArray = new int[] {777,3,7,3,4,1,2,9,0,10};
        System.out.println(Arrays.toString(intArray));
        bubbleSort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
    
    /**
     * 时间复杂度：O(n) ~ O(n2)
     * 平均时间复杂度：O(n2)
     * 
     * 冒泡排序算法的运作如下：
     * 1. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 2. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     * 3. 针对所有的元素重复以上的步骤，除了最后一个。
     * 4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     * 
     * @param intArray
     * @return
     */
    private static int[] bubbleSort(int[] intArray) {
        boolean changed;
        do {
            changed = false;
            for(int i = 0; i < intArray.length - 1; i++) {
                if(intArray[i] > intArray[i + 1]) {
                    int tmp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = tmp;
                    changed = true;
                }
            }
        } while(changed);
        return intArray;
    }

}
