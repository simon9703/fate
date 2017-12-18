package link;

import java.util.ArrayList;
import java.util.List;

public class ShowListFormTailToHead {
	public static List<Integer> list = new ArrayList<>();
	
	public static List<Integer> getListFormTailToHead(ListNode node) {
		if (node != null) {
			getListFormTailToHead(node.next);  //list先加入上一个递归中的value
	    	list.add(node.value);
		}
		return list;  //只返回第一次return的
	}
}
