 package com.tnt.lintcode.base.sort;

import java.util.Arrays;

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
     * 冒泡排序算法时间复杂度分析：
     * 
     * 时间复杂度（最小）：O(n)
     * + 已知：数组本身已经排好序，数组长度为n
     * + 已知：内循环体中执行代码行数为a
     * + 则：执行了a(n-1)步代码(因为最后一个元素无需比对，所以n-1)
     * + 则：最小时间复杂度为O(n)
     * 
     * 时间复杂度（最大）：O(n^2)
     * + 已知：数组完全倒序，数组长度为n
     * + 已知：内循环体中执行代码行数为a, 外循环体执行的代码行数为b
     * + 则：执行了bn + an(n-1)步代码，取最高次幂n^2
     * + 则：最大时间复杂度为O(n^2)
     * 
     * 平均时间复杂度：O(n^2)
     * + 已知：每种排序情况发生的概率都是1/n
     * + 则：平均发生的代码步数是(忽略a,b，常数影响忽略), 1n/n + 2n/n + 3n/n + ... + n^2/n = n(1 + n)/2
     * + 则：平均时间复杂度为O(n^2)
     * 
     * 冒泡排序算法的运作如下：
     * + 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * + 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
     * + 针对所有的元素重复以上的步骤，除了最后一个。
     * + 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
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
