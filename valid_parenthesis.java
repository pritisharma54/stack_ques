//valide parenthesis
import java.util.Stack;
public class Solution {
    public static boolean isValidParenthesis(String exp) {
        if(exp==null) return true;
        // Write your code here.
        Stack<Character> st= new Stack<>();
        
        for(int i=0;i<exp.length();i++){
            
              char ch= exp.charAt(i);
            
                 if(ch=='('||ch=='{'||ch=='['){
                     st.push(ch);
                 }
      
               else  if(!st.isEmpty()&&(ch==')'&&st.peek()=='('))
                	st.pop();
                else  if(!st.isEmpty()&&(ch=='}'&&st.peek()=='{'))
                    st.pop();
                 else  if(!st.isEmpty()&&(ch==']'&&st.peek()=='['))
                    st.pop();
            	else 
                    return false;
            
        }
        
        return (st.isEmpty()) ? true:false;
    }
}
