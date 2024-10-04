package ch02.sec04;

public class Sample3 {

	public static void printByte(byte a) {
	    // a를 이진수로 출력
        String binaryString = Integer.toBinaryString(a & 0xFF); // a를 비트 마스크를 사용해 이진수로 변환
        System.out.print("이진수: " + String.format("%8s", binaryString).replace(' ', '0')); // 8자리로 출력
        System.out.println(",십진수: "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = -5;   // 0101
		printByte(a);
		byte b = -5 >> 1; 
		printByte(b);
		byte c = -5 >> 2;
		printByte(c);
//
//		byte d = a << 3;
//		printByte(d);
//		1000 0011 2
		byte e = 5 >>> 2;
		printByte(e);

	}

}
