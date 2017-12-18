package link;

public class LinkedUtil {
	//反转链表
    public static ListNode reverse(ListNode head) {
    	if (head == null) return null;
    	ListNode pre = null, next = null;
    	while (head != null) {  //head:1-2-3-4-5  pre-**
    		next = head.next;  //head:1  next:2-3-4-5 
    		head.next = pre;   //head:1-pre-**
    		pre = head;        //pre-head:1-**
    		head = next;       //head:2-3-4-5
    	}
    	return pre;
    }
    
    //遍历链表
    public static void show(ListNode head) {      
    	StringBuffer linkedList = new StringBuffer("The linked values:");
    	while (head != null) {
			linkedList.append(head.value + " ");
			head = head.next;    
    	}
    	System.out.println(linkedList.toString());
    }
}
