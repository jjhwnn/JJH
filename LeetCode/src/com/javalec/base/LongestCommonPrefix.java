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
    	
    	String str = "";
    	String result = "";
    	
    	strs = new String[]{"flower","flow","flight"};
    	
    	for(int i = 0; i < strs.length-1; i++) {
    		
    		if(strs[i].length() < strs[i+1].length()) {
    			
    			for(int j = 0; j < strs[i].length(); j++) {
    				// str배열 인덱스 문자열의 길이가 다음 인덱스 문자열보다 긴 경우
    				// 길이가 짧은 인덱스의 문자열 길이만큼까지만 비교하기
    				
    				if(strs[0].charAt(j) == strs[i+1].charAt(j)) {
    					
    					str += strs[i].charAt(j);
    				}
    				
    			} 	
    		}else {
    			for(int j = 0; j < strs[i+1].length(); j++) {
    				
    				if(strs[0].charAt(j) == strs[i+1].charAt(j)) {
    					
    					str += strs[i].charAt(j);
    					
    				}
    				
    			}
    			
    		}
    		
    	}
    	

    	
    	return str;
    	
    }
	
}
