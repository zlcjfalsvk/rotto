import java.util.*;
public class UserCreat {
	int[] a = new int [6];//사용자 로또 번호
	Scanner scan = new Scanner(System.in);
	public void user(){
	
		System.out.println("입력할 로또 번호 6개를 입력 하시오 0~45");
		for(int k=0; k<a.length;k++){
			System.out.println((k+1)+"번째 : ");
			a[k]=scan.nextInt();
			if(a[k]>45){
				System.out.println("45이상의 수를 눌렀군요 다시 입력 : ");	
				a[k]=scan.nextInt();
			}
			for (int i = 0; i < k; i++) {
				if(a[k]==a[i] || a[k]>45){
					System.out.println("앞의 수나 45이상의 수를 눌렀군요 다시 입력 : ");	
					System.out.println((k+1)+"번째 : ");
					a[k]=scan.nextInt();
					i--;
				}
			}
			
		}
	}



}
