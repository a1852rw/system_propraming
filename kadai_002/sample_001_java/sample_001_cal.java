public class sample_001_cal {
	public static void main (String[] args){
		long x = 1;
		long count = 1;
		
		while(count < 25) {
			count = count + 1;
			x = (x + 1) * x;
		}
		
		System.out.println("計算結果を出力");
		System.out.println(x);
		
<<<<<<< HEAD
		System.out.println("繰り返し回数を出力");
		System.out.println(count);
		
=======
                System.out.println("繰り返し回数を出力");
                System.out.println(count);		
>>>>>>> 7936a40d3c2e6c704b86e28c874f7aa9fde5ebcb
	}
	
}

// pythonで作ったサンプルをJAVAで書き換えた
// 整数型がintだったのに気づきlong型に変更した
// 桁数の制限が厳しくこのコードであっても桁丸めが発動する(Python3ではそういうことはない)
