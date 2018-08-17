package pp.arithmetic;

import pp.arithmetic.linkedlist.easy.ReverseList206;
import pp.arithmetic.model.ListNode;

import java.util.Random;

/**
 * Created by wangpeng on 2018/7/9.
 */
public class Util {
    public static void printListNode(ListNode listNode) {
        if (listNode == null) {
            System.out.println("null");
            return;
        }
        ListNode head = listNode;
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
        System.out.println("--------------");
    }

    public static ListNode generateListNodeBySize(int maxSize) {
        ListNode tempNode = new ListNode(0);
        for (int i = 0; i < maxSize; i++) {
            ListNode node = new ListNode(new Random().nextInt(maxSize));
            node.next = tempNode.next;
            tempNode.next = node;
        }
        return tempNode.next;
    }

    public static ListNode generateListNodeBySort(int maxSize) {
        int startNum = new Random().nextInt(maxSize);
        ListNode tempNode = new ListNode(0);
        for (int i = 0; i < maxSize; i++) {
            ListNode node = new ListNode(startNum);
            node.next = tempNode.next;
            tempNode.next = node;
            startNum = startNum + new Random().nextInt(maxSize);
        }
        return ReverseList206.reverseList(tempNode.next);
    }

    public static ListNode getLastNode(ListNode node){
        ListNode lastNode = null;
        ListNode tempNode = node;
        while (tempNode != null){
            lastNode = tempNode;
            tempNode = tempNode.next;
        }
        return lastNode;
    }
}