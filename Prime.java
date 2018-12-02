

import java.util.*;

import java.lang.*;

import java.io.*;


class Prime{

	public static void main (String[] args) {

	    int count = 0;

	    int flag;

	    int numb;

	    char c;

	    Scanner sc = new Scanner(System.in);

	    int t = sc.nextInt();

	    while(t-->0){

	        flag = 0;

	        int n = sc.nextInt();

	        String str = sc.next();

	        for(int i=0;i<n;i++){

	            numb = str.charAt(i);

	            count = count+numb;

	        }

	        for(int i=2;i<=count/2;i++){

	            if(count%i==0){

	                flag = 1;

	                break;

	            }

	        }

	        if(flag == 0){

	            System.out.println("YES");

	        }

	        else{

	            System.out.println("NO");

	        }

	        count = 0;

	    }

	}

}