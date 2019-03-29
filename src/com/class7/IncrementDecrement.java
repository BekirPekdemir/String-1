package com.class7;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =1;
		x = x+1;
		System.out.println(x);
		
		int y =1;
		y+=1;
		System.out.println(y);
		
		int z =1;
		z++;
		System.out.println(z);
		
		int w =2;
		w++;
		System.out.println(w);
		
		int v =10;
		v--;
		System.out.println(v);
		
		int a =10;
		int b=++a; //preincrement = first increment --> assign
		
		int c = 10;
		int d=c++; //postincrement = first
		
		System.out.println(a);
		System.out.println(d);
		
		int p = 299;
		int l = p++;
		System.out.println(p);
		System.out.println(l);
		
		int m=10;
		int n=m--; //first assign -->decrement (int n=m; )
		System.out.println(m);
		System.out.println(n);
		
		
		
	}

}
