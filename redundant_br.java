// Write your code here.
		Stack<Character> st= new Stack<>();
		char ch;
		int cnt=0;
		for(int i=0;i<s.length();i++){
			ch=s.charAt(i);
			if(ch==')'){
				if (st.peek() == '(') 
                    return true;
				
				while(!st.isEmpty()&&st.peek()!='(')
					st.pop();
				
				st.pop();	
			}
			else if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') 
            {
               st.push(ch);
            }
				
	
		}
		return false;
