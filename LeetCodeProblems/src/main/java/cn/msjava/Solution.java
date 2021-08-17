package cn.msjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 微信公众号：码上Java
 * @Description: todo
 */
public class Solution {

    /**
     * 217. 存在重复元素
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return false;
        }
        // 方法一：利用set不重复的特点
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        // 方法二：先对数组排序，排序后的数据，如果存在重复元素，则重复元素肯定是相邻的
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length-1;i++){
//            if(nums[i]==nums[i+1]){
//                return true;
//            }
//        }
        return false;
    }


    /**
     * 53. 最大子序和
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int pre = 0;
        int maxAns = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }


    /**
     * 704. 二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        int center, left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            center = left + (right - left) / 2;
            if (nums[center] == target) {
                return center;
            }
            if (nums[center] < target) {
                left = center + 1;
            } else {
                right = center - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {


    }
}
