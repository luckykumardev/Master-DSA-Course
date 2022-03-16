package class_49;

import java.util.Arrays;

/*
 https://leetcode.com/problems/meeting-rooms/
*/
public class MeetingRooms {
	public boolean canAttendMeetings(int[][] intervals) {
		if (intervals.length == 1)
			return true;

		Arrays.sort(intervals, (a, b) -> {
			return a[0] - b[0];
		});

		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] < intervals[i - 1][1])
				return false;
		}

		return true;
	}
}
