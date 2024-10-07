package ch05.sec12;

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array= {
			{95,86},
			{83,92,96},
			{78,83,93,87,88}
		};
		// array[0]
		// array[0][0], array[0][1]
		// array[1]
		// array[1][0], array[1][1], array[1][2]
        // array[2]
		int sum = 0; int count = 0;
		for(int idx = 0; idx < array.length; idx++) {
			for(int ndx = 0; ndx < array[idx].length; ndx++) {
				sum += array[idx][ndx];
				count++;
			}
		}
		
		double avg = (double)sum/count;
		System.out.println("합계:"+sum+"평균:"+avg);

	}

}
