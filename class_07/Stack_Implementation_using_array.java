package class_07;

/*
  https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1
*/
public class Stack_Implementation_using_array {
	int top;
	int arr[] = new int[1000];

	Stack_Implementation_using_array() {
		top = -1;
	}

	void push(int a) {
		top++;
		arr[top] = a;
	}

	int pop() {
		if (top == -1)
			return -1;
		int ans = arr[top];
		top--;
		return ans;
	}

}
