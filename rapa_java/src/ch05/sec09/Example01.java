package ch05.sec09;

public class Example01 {

	public static void main(String[] args) {
		String[] oldStrArray = {"자바","배열","복사"};
		
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}
		System.out.println();
		for(String item : newStrArray) {
			System.out.print(item + ",");
		}

	}

}
