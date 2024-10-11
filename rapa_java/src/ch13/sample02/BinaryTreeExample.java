package ch13.sample02;

public class BinaryTreeExample {

	public static void main(String[] args) {

        BinaryTree<Integer> tree = new BinaryTree<>();

        // 데이터 추가
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        // 중위 순회 결과 출력
        System.out.println("중위 순회 결과:");
        tree.inOrder();  // 출력: 2 3 4 5 6 7 8

	}

}
