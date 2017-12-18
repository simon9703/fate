package practice;

public class Solution2 {
	/**
	 * 将字符串中的' '替换成'%20'
	 * @param str
	 * @return
	 */
    public static String replaceSpace(StringBuffer str) {
    	int spacenum = 0;
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) == ' ') spacenum++;
    	}
    	int indexOld = str.length() - 1;
    	int indexNew = str.length() + spacenum * 2 - 1;
    	str.setLength(indexNew + 1); //防止新下标越界
    	for (; indexOld >=0; indexOld--) {
    		if (str.charAt(indexOld) == ' ') {
				str.setCharAt(indexNew--, '0');
				str.setCharAt(indexNew--, '2');
				str.setCharAt(indexNew--, '%');
			}
    		else {
				str.setCharAt(indexNew--, str.charAt(indexOld));
			}
    	}
    	return str.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer str = new StringBuffer("We Are Wonderful!");
        System.out.println(replaceSpace(str));
	}

}
