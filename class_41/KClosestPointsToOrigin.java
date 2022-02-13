package class_41;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
	class Point {
		int x;
		int y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	class CustomComparator implements Comparator<Point> {

		@Override
		public int compare(Point p1, Point p2) {

			int dtSquar1 = p1.x * p1.x + p1.y * p1.y;
			int dtSquar2 = p2.x * p2.x + p2.y * p2.y;

			if (dtSquar1 > dtSquar2)
				return 1;
			else
				return -1;
		}
	}

	public int[][] kClosest(int[][] points, int k) {

		PriorityQueue<Point> pq = new PriorityQueue<>(new CustomComparator());
		for (int i = 0; i < points.length; i++) {
			pq.add(new Point(points[i][0], points[i][1]));
		}

		int ans[][] = new int[k][2];
		int i = 0;
		while (k-- > 0) {
			Point p = pq.poll();
			ans[i][0] = p.x;
			ans[i][1] = p.y;

			i++;
		}

		return ans;
	}

}
