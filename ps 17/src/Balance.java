
import java.util.ArrayDeque;
import java.util.Deque;

public class Balance {
			static boolean areBracketsBalanced(String s)
			{
				Deque<Character> stack= new ArrayDeque<Character>();
				for (int i = 0; i < s.length(); i++)
				{
					char a = s.charAt(i);
					if (a == '(' || a == '[' || a == '{')
					{
						stack.push(a);
						continue;
					}
					
					if (stack.isEmpty())
						return false;
					char check;
					switch (a) {
					case ')':
						check = stack.pop();
						if (check == '{' || check == '[')
							return false;
						break;

					case '}':
						check = stack.pop();
						if (check == '(' || check == '[')
							return false;
						break;

					case ']':
						check = stack.pop();
						if (check == '(' || check == '{')
							return false;
						break;
					}
				}
				return (stack.isEmpty());
			}
			public static void main(String[] args)
			{
				String expr = "([{}])";
				if (areBracketsBalanced(expr))
					System.out.println("Balanced ");
				else
					System.out.println("Not Balanced ");
			}
}