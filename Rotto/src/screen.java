import java.util.Scanner;

public class screen {
		compairtLotto comp = new compairtLotto();		
		Scanner scan = new Scanner(System.in);
		int start;
	public void scr(){

		do{
			System.out.println("�ٽ� ���� :1 ���� :2");
			start=scan.nextInt();
			if(start==1){
				comp.comfair();
				System.out.println("��� �ҷ�? 1. ��� 2. ����");
				int again=scan.nextInt();
				if(again ==1 ){
					continue;
				}else{
					System.out.println("����!");
					System.exit(0);
				}
				}
			else{
					System.out.println("����!");
					System.exit(0);
					}
		}while(start ==1 || start==2);
	}

}
