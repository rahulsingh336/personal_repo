/*
package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class HackerRank1 {

  public static void main(String[] args) {
  	List list = new ArrayList<>();
  	*/
/*list.add("YN");
  	list.add("NN");*//*

  	list.add("Y");
  	list.add("Y");
  	list.add("Y");
  	list.add("Y");
  	list.add("N");

    System.out.println(minMoves(9,4,4, 4,8));
  }

	public static void Visit(int row, int col, int n, Queue<Integer> queue,
							 boolean[] visited)
	{
		if (row < 0 || col < 0 || row >= n || col >= n)
			return;
		int position = row * n + col;
		if (visited[position])
			return;
		visited[position] = true;
		queue.add(position);
	}

	public static int CalculateStepsFromLeftTopToBottomRight(int n,
			)
	{
		boolean []  visited  = new boolean[n*n];
		int      steps    = 0;

		Queue<Integer> queue = new ArrayBlockingQueue<>(n);

		visited[0] = true;
		queue.add(0);

		while (queue.size() > 0)
		{
			int count = queue.size();

			for (int i = 0; i < count; i++)
			{
				Integer position = queue.poll();
				int row      = (position / n);
				int col      = (position % n);

				if (row == n-1 && col == n-1)
				{
					// Found solution.
					return steps;
				}

				Visit(row + dx, col + dy, n, queue, visited);
				Visit(row + dx, col - dy, n, queue, visited);
				Visit(row + dy, col + dx, n, queue, visited);
				Visit(row + dy, col - dx, n, queue, visited);
				Visit(row - dx, col + dy, n, queue, visited);
				Visit(row - dx, col - dy, n, queue, visited);
				Visit(row - dy, col + dx, n, queue, visited);
				Visit(row - dy, col - dx, n, queue, visited);
			}
			steps++;
		}

		return -1;
	}
}

	public static int minMoves(int n, int startRow, int startCol, int endRow, int endCol) {

		return 0;
	}
}

// YN, NN

*/
