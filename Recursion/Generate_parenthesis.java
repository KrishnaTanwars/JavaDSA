
public class Generate_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		Parenthesis(n,0,0,"");
		

	}
	public static void Parenthesis(int n,int closed,int open,String ans) {
		if(open ==n &&closed==n) {
			System.out.println(ans);
			return;
		}
		if(open>n|| closed>open) {
			return;
		}
		Parenthesis(n,closed,open+1,ans+"(");
		Parenthesis(n,closed+1,open,ans+")");
		
		
	}

}