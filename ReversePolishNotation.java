package jan3;

import java.awt.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class ReversePolishNotation {
	public Double RPN (String [] a){

		double r;
		Stack <Double> rpn= new Stack <Double>();
		String OP ="+-/*";
		int cc=0;	
		double x,y;
		while(cc<a.length)
			{
				if (!OP.contains(a[cc]))
				{
					rpn.push(Double.valueOf(a[cc]));
					cc++;
				}
				else
				{
					String o =a[cc];
					switch (a[cc]){
						case "+":
							x=rpn.pop();
							y=rpn.pop();
							rpn.push(x+y);
							break;
						case "-":
							rpn.push(rpn.pop()-rpn.pop());
							break;
						case "*":
							rpn.push(rpn.pop()*rpn.pop());
							break;
						case "/":
							rpn.push(rpn.pop()/rpn.pop());
							break;

					}
					cc++;
				}
				
			}
		
		System.out.println(rpn);
		return r=rpn.pop();
	}
	public Double RPN_Arr (String [] a){

		double r;
		double []rpn= new double[a.length];
		String OP ="+-/*";
		int cc=0;
		int a_count=0;
		double x=0,y=0;
		System.out.println(x +"  "+ y);
		while(cc<a.length&&a_count<=0)
			{
				if (!OP.contains(a[cc]))
				{
					rpn[a_count++]=(Double.valueOf(a[cc]));
					cc++;
				}
				else
				{
					String o =a[cc];
					switch (a[cc]){
						case "+":
							x=rpn[a_count++];
							y=rpn[a_count++];
							rpn[a_count++]=x+y;
							System.out.println(x +"  "+ y);
							break;
						case "-":
							x=rpn[a_count++];
							y=rpn[a_count++];
							rpn[a_count++]=x-y;
							System.out.println(x +"  "+ y);
							break;
						case "*":
							x=rpn[a_count++];
							y=rpn[a_count++];
							rpn[a_count++]=x*y;
							System.out.println(x +"  "+ y);
							break;
						case "/":
							x=rpn[a_count++];
							y=rpn[a_count++];
							rpn[a_count++]=x/y;
							System.out.println(x +"  "+ y);
							break;

					}
					cc++;
				}
				
			}
		
		System.out.println(rpn[a_count]);
		return r=rpn[a_count];
	}
	
	public Double RPN_List(String [] a){
		double r;
		LinkedList <Double> rpn= new LinkedList <Double>();
		String OP ="+-/*";
		int cc=0;	
		double x,y;
		while(cc<a.length)
			{
				if (!OP.contains(a[cc]))
				{
					rpn.add(Double.valueOf(a[cc]));
					cc++;
				}
				else
				{
					String o =a[cc];
					switch (a[cc]){
						case "+":
							x=rpn.removeLast();
							y=rpn.removeLast();
							rpn.add(x+y);
							break;
						case "-":
							rpn.add(rpn.removeLast()-rpn.removeLast());
							break;
						case "*":
							rpn.add(rpn.removeLast()*rpn.removeLast());
							break;
						case "/":
							rpn.add(rpn.removeLast()/rpn.removeLast());
							break;

					}
					cc++;
				}
				
			}
		
		System.out.println(rpn);
		return r=rpn.removeLast();
	}
	public static void main(String []args){
	String []a ={"12","13","+","5","*"};
	ReversePolishNotation R= new ReversePolishNotation();
	System.out.println(R.RPN(a));
	System.out.println(R.RPN_List(a));
	System.out.println(R.RPN_Arr(a));
	}
	

}
