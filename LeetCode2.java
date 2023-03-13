import java.util.LinkedList;

public class LeetCode2 {

    public static void main(String[] args) {
            LeetCode2 lc2 = new LeetCode2();
            ListNode l1=new ListNode(2);
             l1.next=new ListNode(4);
             l1.next.next=new ListNode(3);

            ListNode l2=new ListNode(5);
            l2.next=new ListNode(6);
            l2.next.next=new ListNode(4);
/*            l1.addLast(2);
            l1.addLast(4);
            l1.addLast(3);
            l2.addLast(5);
            l2.addLast(6);
            l2.addLast(4);*/



            lc2.display(lc2.addTwoNumbers(l1, l2));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cursor = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            sum %= 10;
            cursor.next = new ListNode(sum);
            cursor = cursor.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) cursor.next = new ListNode(carry);
        return pre.next;
    }
    public static void display(ListNode lt) {//遍历链表，显示链表中的每个结点的值
        while(lt != null){
            System.out.println(lt.val+"->");
            lt = lt.next;
        }
        System.out.println(lt);
    }
}

class ListNode  {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
