package com.javalec.base;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		
		String[] strs = {"flower","flow","flight"};
		
		String str = prefix.longestCommonPrefix(strs);
		
		System.out.println(str);
		
	}
	
    public String longestCommonPrefix(String[] strs) {
        // 문자열 배열을 입력받아 문자열 간에
    	// 공통된 문자들을 출력해주는 문제
    	String strs1="";
    	strs = new String[]{"flower","flow","flight"};
    	
    	for(int i =0; i < strs.length; i++) {
    		for(int j = 0; j < strs[i].length(); j++) {
    			if(strs[i].charAt(j) == strs[i+1].charAt(j)) {
    				strs1 += strs[i].charAt(j);
    			}
    		}
    		
    	}
    	

    	
    	return strs1;
    	
    }
	
}
