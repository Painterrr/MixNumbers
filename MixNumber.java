import java.util.Arrays;

class MixNumber {
	public static void main(String[] args) {
		int numbers[] = new int[100];
		System.out.println(Arrays.toString(numbers));
		
			for(int i=0; i < numbers.length; i++) {
				numbers[i]= i; 
			}
			System.out.println(Arrays.toString(numbers));
			
			for(int i=0; i<numbers.length; i++) {
				int n= (int)(Math.random()*100); 
				int tmp= numbers[n];
				numbers[n]= numbers[0];
				numbers[0]= tmp;
			}
			System.out.println(Arrays.toString(numbers)); // 채워진 값 출력
	}
}