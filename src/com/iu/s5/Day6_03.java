package com.iu.s5;

public class Day6_03 {

	public static void main(String[] args) {
		//한 학생의 정보는 : 이름,번호,국어,영어,수학,총점,평균 으로 이루어져있는데
		//학생은 3명이다
	
		String [] names = new String [3];
		names[0]="iu";
		names[1]="choa";
		names[2]="suji";
		
		int [] nums = new int [3];
		nums[0] = 5;
		nums[1] = 29;
		nums[2] = 2;

		//이름하고 번호 들을 출력
		//번호 순서대로 출력
		
		//몇번 비교해야하니
		for(int idx=0; idx<nums.length-1; idx++) {
			for(int i = idx+1; i<nums.length; i++) {
				if(nums[idx]>nums[i]) {
					int tmp = nums[i];
					nums[i] = nums[idx];
					nums[idx]=tmp;
				
				//이름 자리 바꾸기
					String t = names[i];
					names[i]=names[idx];
					names[idx]=t;
					
				
				}
			}	
		}//정렬 for
		
		
		for(int i=0; i<nums.length; i++) {
			System.out.println("=============");
			System.out.println(nums[i]+"번 : "+names[i]);	
			System.out.println("=============");
		}
		
		
		
		
		
		 
		
	}

}
