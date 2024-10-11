package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample{

	public static void main(String[] args) throws Exception  {
		List<Board> list = new LinkedList<>();
		list.add(new Board("제목1","내용1","작성자1"));
		list.add(new Board("제목2","내용2","작성자2"));
		list.add(new Board("제목3","내용3","작성자3"));
		list.add(new Board("제목4","내용4","작성자4"));
		list.add(new Board("제목5","내용5","작성자5"));
		
		System.out.println("총 보드 수:"+list.size());
		Board board = list.get(2);
		System.out.println("2번째 글:"+ board);
		
		System.out.println("전체목록-----------------");
		for(Board b: list) {
			System.out.println(b);
		}
		
		list.remove(4); //5
		list.remove(board); // 3

		System.out.println("전체목록-----------------");
		for(Board b: list) {
			System.out.println(b);
		}
	}

}
