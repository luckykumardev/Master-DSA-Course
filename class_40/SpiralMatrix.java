package class_40;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/spiral-matrix/
*/
public class SpiralMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<>();
		if (matrix == null || matrix.length == 0)
			return ans;
		int rs = 0;
		int re = matrix.length - 1;
		int cs = 0;
		int ce = matrix[0].length - 1;
		while (true) {
			for (int i = cs; i <= ce; i++) {
				ans.add(matrix[rs][i]);
			}
			rs++;
			if (rs > re || cs > ce)
				break;

			for (int i = rs; i <= re; i++) {
				ans.add(matrix[i][ce]);
			}
			ce--;
			if (rs > re || cs > ce)
				break;

			for (int i = ce; i >= cs; i--) {
				ans.add(matrix[re][i]);
			}
			re--;
			if (rs > re || cs > ce)
				break;
			
			for (int i = re; i >= rs; i--) {
				ans.add(matrix[i][cs]);
			}
			cs++;
			if (rs > re || cs > ce)
				break;
		}

		return ans;
	}
}
