package class_49;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 https://leetcode.com/problems/meeting-rooms-ii/
*/
public class MeetingRoomsTwo {
	class Meeting {
		int startTime;
		int endTime;

		Meeting(int startTime, int endTime) {
			this.startTime = startTime;
			this.endTime = endTime;
		}
	}

	class CustomComparator implements Comparator<Meeting> {

		@Override
		public int compare(Meeting m1, Meeting m2) {
			if (m1.startTime > m2.startTime)
				return 1;
			else
				return -1;
		}
	}

	public int minMeetingRooms(int[][] intervals) {
		int n = intervals.length;
		Meeting meetings[] = new Meeting[n];
		for (int i = 0; i < n; i++) {
			Meeting m = new Meeting(intervals[i][0], intervals[i][1]);
			meetings[i] = m;
		}

		Arrays.sort(meetings, new CustomComparator());
		int ans = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			if (pq.isEmpty() == false && meetings[i].startTime >= pq.peek())
				pq.poll();

			pq.add(meetings[i].endTime);
			ans = Math.max(pq.size(), ans);
		}
		return ans;
	}
}
