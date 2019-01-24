import java.math.BigDecimal;

class Solution {

    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * 示例:
     *
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0;i<nums.length;i++) {
            int i1 = nums[i];
            for (int j = 1; j < nums.length;j++){
                int i2 = nums[j];
                if (i1 + i2 == target && i!=j){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }


    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     * 示例：
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb = new StringBuilder();
        while (l1!= null){
            int val = l1.val;
            sb.append(val);
            l1 = l1.next;
        }
        String s = sb.reverse().toString();
        BigDecimal i = new BigDecimal(s);
        StringBuilder stringBuilder = new StringBuilder();
        while (l2!= null){
            int val = l2.val;
            stringBuilder.append(val);
            l2 = l2.next;
        }
        BigDecimal l = new BigDecimal(stringBuilder.reverse().toString());
        BigDecimal i1 = i.add(l) ;
        StringBuilder sb2 = new StringBuilder();
        String s1 = sb2.append(i1.toString()).reverse().toString();
        String[] split = s1.split("");
        int nums[] = new int[split.length];
        for (int jj = 0; jj < split.length; jj++) {
            nums[jj] = Integer.parseInt(split[jj]);
        }
        ListNode listNode = listNode(nums);
        return listNode;
    }

    /**
     * 数组转链表
     * @param nums
     * @return
     */
    public ListNode listNode(int[] nums){
        ListNode listNode = new ListNode(nums[0]);
        ListNode listNode2 = listNode;
        for (int i = 1;i<nums.length; i++){
            ListNode listNode1 = new ListNode(nums[i]);
            listNode2.next = listNode1;
            listNode2 = listNode1;
        }
        return listNode;
    }



    public int lengthOfLongestSubstring(String s) {
        return 1;
    }

    public static void main(String[] args) {

    }
}

