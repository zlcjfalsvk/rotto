import java.util.Scanner;

public class screen {
		compairtLotto comp = new compairtLotto();		
		Scanner scan = new Scanner(System.in);
		int start;
	public void scr(){

		do{
			System.out.println("다시 시작 :1 종료 :2");
			start=scan.nextInt();
			if(start==1){
				comp.comfair();
				System.out.println("계속 할래? 1. 계속 2. 안해");
				int again=scan.nextInt();
				if(again ==1 ){
					continue;
				}else{
					System.out.println("종료!");
					System.exit(0);
				}
				}
			else{
					System.out.println("종료!");
					System.exit(0);
					}
		}while(start ==1 || start==2);
	}

}
