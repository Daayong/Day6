package com.iu.s5;

import java.util.Scanner;

public class Day6_04 {

	public static void main(String[] args) {
		
		//1.로그인 (로그인 성공실패만 찍어주기)
		//2.회원가입 (아이디는 ids에 추가하고 비번은 pws에 추가하기 중복검사해야함. )
		//3.종료 
		Scanner sc = new Scanner(System.in);
		
		int [] ids = {1234, 4567, 4356, 1258};
		int [] pws = {6789, 5437, 1235, 9874};
		
		boolean login = true;
		
		//로그인 작업 및 종료 
		while(login) {
			//초기화면
			System.out.println("1.로그인 / 2.회원가입 / 3.종료");
			int pick = sc.nextInt();	
			
			switch(pick) {
			case 1 : //로그인
			
				//로그인 시도
				for(int i=0; i<ids.length; i++) {
					
					System.out.println("아이디를 입력하세요");
					int yId = sc.nextInt();
					System.out.println("패스워드를 입력하세요");
					int yPw = sc.nextInt();
					
					//로그인 성공 시도 여부 확인
					if(yId == ids[i] && yPw == pws[i]) {
						System.out.println("로그인 성공");
						break;
					}else {
						System.out.println("로그인 실패");
						break;
					}//로그인 성공 시도 여부 확인 if문 종료

				}//로그인 시도 for문 종료
				break;
			case 2 : //회원가입

				//ID 중복확인
			
				
				for(int i=0; i<ids.length; i++) {
					System.out.println("생성할 아이디를 입력하세요");
					int nId = sc.nextInt();
					int [] ijoin = new int[ids.length+1];
					int [] pjoin = new int[pws.length+1];
					
					if(nId == ids[i]) {
						System.out.println("사용할 수 없는 아이디 입니다");
					
					}else {
						System.out.println("사용할수 있는 아이디 입니다");
						
						for(int j=0; j<ids.length; j++) {
							ijoin[j] = ids[j];
						}
						ijoin[ids.length] =nId;
						ids = ijoin;
						
						System.out.println("패스워드를 입력하세요");
						int nPw = sc.nextInt();
						
						for(int j=0; j<pws.length; j++) {
							pjoin[j] = pws[j];
						}
						
						pjoin[pws.length] =nPw;
						pws = pjoin;
						
						System.out.println("회원가입이 완료되었습니다");
						break;
					}
				}//ID중복확인 for문 종료
				break;
			
			default ://종료
				login=!login;
			}//switch문 종료
		}//while문 종료
		
		
		
		
	}//메인 메소드 종료
}
