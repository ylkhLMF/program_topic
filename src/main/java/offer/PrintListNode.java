package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author liumf
 * @date 0:20 2020/4/15
 * @className PrintListNode
 * @description 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */

public class PrintListNode {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        System.out.println(listNode);

        // Stack桟类 后进先出
        Stack<Integer> stack = new Stack<Integer>();
        while (null != listNode) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<Integer>(16);
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }


    /**
     * 定义一个类保存链表节点， 类 ListNode
     */
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';

        }
    }


    private ListNode inputLinkVal() {
        //头节点
        ListNode headNode = new ListNode();
        //表尾节点
        ListNode tail;
        tail = headNode;
        System.out.println(tail);
        while (true) {
            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();
            //输入0退出输入循环
            if (0 == val) {
                break;
            }
            //新节点
            ListNode listNode = new ListNode(val);
            System.out.println(listNode);
            //尾插法添加节点
            tail.next = listNode;
            System.out.println(listNode);
            //重置尾节点
            tail = listNode;
            System.out.println(listNode);
            //尾节点的下一个置空
            tail.next = null;
            System.out.println(listNode);

        }
        //返回头节点
        System.out.println(headNode);
        return headNode;
    }

    public static void main(String[] args) {
        PrintListNode solution = new PrintListNode();
        //输入链表值
        ListNode headNode =  solution.inputLinkVal();
        //按链表值从尾到头的顺序返回一个ArrayList
        ArrayList<Integer> integers = solution.printListFromTailToHead(headNode);
        System.out.println(integers);

    }


}





