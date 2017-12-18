import link.*;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1024);
	    for (int i = 0; i <= 8; i++) {
	    	int random = (int)(Math.random() * 20);
	    	ListNode node = new ListNode(random);
	    	node.next = head.next;
	    	head.next = node;
	    }
	    LinkedUtil.show(head);
	    ListNode newHead = LinkedUtil.reverse(head);
	    LinkedUtil.show(newHead);
	    System.out.println(ShowListFormTailToHead.getListFormTailToHead(newHead));
	}

}
