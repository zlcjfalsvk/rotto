import java.util.*;
public class UserCreat {
	int[] a = new int [6];//����� �ζ� ��ȣ
	Scanner scan = new Scanner(System.in);
	public void user(){
	
		System.out.println("�Է��� �ζ� ��ȣ 6���� �Է� �Ͻÿ� 0~45");
		for(int k=0; k<a.length;k++){
			System.out.println((k+1)+"��° : ");
			a[k]=scan.nextInt();
			if(a[k]>45){
				System.out.println("45�̻��� ���� �������� �ٽ� �Է� : ");	
				a[k]=scan.nextInt();
			}
			for (int i = 0; i < k; i++) {
				if(a[k]==a[i] || a[k]>45){
					System.out.println("���� ���� 45�̻��� ���� �������� �ٽ� �Է� : ");	
					System.out.println((k+1)+"��° : ");
					a[k]=scan.nextInt();
					i--;
				}
			}
			
		}
	}



}
