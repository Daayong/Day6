package com.iu.s5;

import java.util.Scanner;

public class Day6_01 {
	//어제 하던 Array 이어서 수업
	
	public static void main(String[] args) {
		//1.정보 출력
		//2.정보 추가
		//3.정보 삭제
		//4.종료
		
		Scanner sc=new Scanner(System.in);
		boolean flag = true;
		int [] ar = new int[3];
		ar[0]=45;
		ar[1]=52;
		ar[2]=76;
		// 위에랑 같은식 
		// int [] ar = {45,52,76};
		
		while(flag) {
			System.out.println("1.정보출력");
			System.out.println("2.정보추가");
			System.out.println("3.정보삭제");
			System.out.println("4.정보삭제");
			System.out.println("5.종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 : 
				if(ar.length>0) {
					for(int i=0;i<ar.length;i++) {
						System.out.println(ar[i]);
					}
				}else {
					System.out.println("출력할 데이터가 없습니다");
				}
			 break;
				
			case 2 : 
				System.out.println("정보를 추가합니다");
				int [] ar2 = new int[ar.length+1];
				System.out.println("추가할 정보를 입력하세요.");
				int jb = sc.nextInt();
				
					for(int i=0 ; i<ar.length; i++) {
						ar2[i]=ar[i];
					}
				
				ar2[ar.length] = jb;
				ar = ar2;
				break;
			
			case 3 : 
				
				 if(ar.length==0) {
					 System.out.println("더이상 삭제할 데이터가 없습니다.");
					continue;
				}
				
				
				System.out.println("최근 입력 정보를 삭제합니다");
				System.out.println("1.완전 삭제 / 2.취소");
					int pick = sc.nextInt();
					int [] ar3 = new int [ar.length-1];
					
					if(pick==1) {
						for(int i=0; i<ar3.length; i++) {
							ar3[i]=ar[i];
						} 
						ar=ar3;
						System.out.println("완전 삭제되었습니다");
						break;
					}else{
						break;
					}
					
			case 4 :		
					if(ar.length==0) {
						System.out.println("삭제할 데이터가 없습니다");
						continue;
					}
				
					System.out.println("삭제할 인덱스 번호 입력");
					int del = sc.nextInt();
					if(del >= ar.length || del<0) {
						System.out.println("삭제할수있는 데이터가 아닙니다.");
						continue;
					}

					int [] ar4 = new int[ar.length-1];
					int index=0;
					for(int i=0; i<ar.length; i++) {
						
						if(del==i) {
							continue;
						}
						
						ar4[index] = ar[i];
						index++;
					}
					ar=ar4;
					break;
					
			default : 
				System.out.println("종료");
				flag=!flag;	
			}//switch문 종료
		}//while문 종료
		
	}

}
