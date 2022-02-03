package class_39;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	private static Map<Integer, Integer> memo = new HashMap<>();

	public static void main(String[] args) {
		int ans = fib(100);
		System.out.println(ans);
	}

	static int fibR(int n) {
		if (n == 0 || n == 1)
			return n;

		return fibR(n - 1) + fibR(n - 2);
	}

	static int fibT(int n) {
		int f[] = new int[n + 2];
		int i;
		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[n];
	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (memo.containsKey(n)) {
			return memo.get(n);
		}

		int result = fib(n - 1) + fib(n - 2);

		memo.put(n, result);
		return result;
	}
}
