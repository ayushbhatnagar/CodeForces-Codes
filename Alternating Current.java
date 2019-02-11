/* CodeForces
	Java Solution for: /343/problem/B Alternating Current
	@author: Ayush Bhatnagar*/

import java.util.*;
class AltCur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		Stack <Character> stk = new Stack <>();
		for(int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if(stk.empty()) {
				stk.push(x);
			}
			else {
				if(stk.peek() == x)
					stk.pop();
				else
					stk.push(x);
			}
		}
		if(stk.empty())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
