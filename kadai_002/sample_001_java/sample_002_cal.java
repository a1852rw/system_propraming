public class sample_002_cal {
	public static void main (String[] args){
		long x = 1;
		long count = 1;		
		
		while(x < 1000000000) {
			x = x + 1;
			count = count + 1;
		}
		
		System.out.println("計算結果を出力");
		System.out.println(x);

		System.out.println("繰り返し回数を出力");
                System.out.println(count);
		
                System.out.println("繰り返し回数を出力");
                System.out.println(count);
		
	}
	
}

//Pythonで書いたコードをJAVAに書き換えた
//整数型がintだったのに気づきlong型に変更した
