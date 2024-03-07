import java.util.*;


    class Solution {
       static boolean isValid(String s) {
           Stack<Character>stack = new Stack<>();
           if(s.length()%2 != 0){return false;}
           for(char v : s.toCharArray()){
                if(v == '(' ||v == '{' || v == '['){
                    stack.push(v);
                }
                else if(v==')' && !stack.isEmpty() && stack.peek()=='(' ){
                    stack.pop();
                }else if(v=='}' && !stack.isEmpty() && stack.peek()=='{' ){
                    stack.pop();
                }else if(v==']' && !stack.isEmpty() && stack.peek()=='[' ){
                    stack.pop();
                }
                else{
                    return false;
                }
           }

           return stack.isEmpty();

        }


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();

            System.out.println(Solution.isValid(userInput));
        }
    }





