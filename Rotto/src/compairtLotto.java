import java.util.Arrays;

public class compairtLotto {
	
		UserCreat user =  new UserCreat();
		ComCreate com = new ComCreate();
		int cnt=0;
		
		public void comfair(){

		user.user();
		com.com();
		
		System.out.println("사용자가 입력한 번호는");
		System.out.println(Arrays.toString(user.a));
		
		System.out.println("컴퓨터가 입력한 번호는");
		System.out.println(Arrays.toString(com.b));
		
		System.out.println("결과 :");
		for (int i = 0; i < user.a.length; i++) {
			for (int j = 0; j < com.b.length; j++) {
				if(user.a[i]==com.b[j])
					cnt++;
			}		
		}
		System.out.println(cnt+"개가 겹치네요");
	}

	
}
