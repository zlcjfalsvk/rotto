import java.util.Random;

public class ComCreate {
	
	int[] b = new int[6];//컴퓨터 로또 번호
	Random rand = new Random();
	
	public void com(){
		for(int i=0; i<b.length ; i++){
			b[i]=rand.nextInt(45)+1;
			for (int j = 0; j <i; j++) {
				if(b[i]==b[j]){
					b[i]=rand.nextInt(45)+1;
				}
			}
		}
	
	}

}
