import java.util.Stack;
public class Balance
{
   public void balance(String expressions){
        int count=0;
        boolean flag=true;
        Stack<Character> stack = new Stack<>();
    for(char bracket: expressions.toCharArray())
    {
    if(bracket == '{' || bracket == '(' || bracket == '[')
    {
        stack.push(bracket);
        count+=1;
    }
    else if (bracket == '}' || bracket == ')' || bracket == ']')
    {
    if(stack.isEmpty())
        {
            if(stack.isEmpty()){
                flag = false;
            }
            else if(!(isItBalanced(stack.pop(),bracket)))
            {
                flag = false;
            }
        count-=1;
        }
    }
}
    if(count!=0)
    {
        flag = false;
    }
    if(flag){
        System.out.println("The expression is balanced");
    }
    else{
        System.out.println("The expression is not balanced");
    }
}



public boolean isItBalanced(char open, char close){
    
    if(open == '{' && close == '}'){ 
        return true;
    }else if(open == '(' && close == ')'){
        return true;
    }else if(open == '[' && close == ']'){
    return true;
    }
    return false;
}
}
 



