public class sample_001_cal {
	public static void main (String[] args){
		int x = 1;
		int count = 1;
		
		while(count < 25) {
			count = count + 1;
			x = (x + 1) * x;
		}
		
		System.out.println("計算結果を出力");
		System.out.println(x);
		
		System.out.println("繰り返し回数を出力");
		System.out.println(count);
		
	}
	
}

// pythonで作ったサンプルをJAVAで書き換えた