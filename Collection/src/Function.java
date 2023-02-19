
import java.util.HashMap;
import java.util.Stack;

public class Function {
    public static boolean pakagic(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if (stack.isEmpty() && chars[i]==')' || stack.isEmpty() && chars[i]=='}' || stack.isEmpty() && chars[i]==']'){
                return false;
            }

            if (chars[i]=='(' || chars[i]=='{' || chars[i]=='['){
                stack.push(chars[i]);
            }

            if (!stack.isEmpty()) {
                switch (stack.peek()) {
                    case ('('):
                        if (chars[i] == ')') {
                            stack.pop();
                        } else if (chars[i]=='}' || chars[i]==']') {
                            return false;
                        }
                        break;
                    case ('{'):
                        if (chars[i] == '}') {
                            stack.pop();
                        } else if (chars[i] == ']' || chars[i] == ')') {
                            return false;
                        }
                        break;
                    case ('['):
                        if (chars[i] == ']') {
                            stack.pop();
                        } else if (chars[i] == '}' || chars[i] == ')') {
                            return false;
                        }
                        break;
                }
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
    public static void math(int x,int y){

        HashMap<Integer,Languages > hashMap=new HashMap<>();
        Languages languages=new Languages();
        for (int i = 0; i < languages.hay().size(); i++) {
            hashMap.put(i,languages);
        }

        System.out.println(hashMap.get(x).hay().get(x)+" + "+hashMap.get(y).hay().get(y)+" = "+hashMap.get(x+y).hay().get(x+y));
        System.out.println(hashMap.get(x).ang().get(x)+" + "+hashMap.get(y).ang().get(y)+" = "+hashMap.get(x+y).ang().get(x+y));
    }


}
