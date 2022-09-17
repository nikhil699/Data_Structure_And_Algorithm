//link ->    https://docs.google.com/document/d/1peL53emFZL4Av7uanO3tiq9eWSjGvmONolHHQhuZbKw/edit
//Time Complexity -> 0(n2)
//Space Complexity -> 0(n)

package com.hashmap;
import java.util.HashMap;
import java.util.Scanner;

class mapping
{
	public HashMap<Character,Integer> stringOne(String one)
	{
		HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
		for(int j=0;j<one.length();j++)
		{
			if(hm2.containsKey(one.charAt(j)))
			{
				hm2.put(one.charAt(j),hm2.get(one.charAt(j))+1);
			}
			else
			{
				hm2.put(one.charAt(j),1);
			}
		}
		return hm2;
	}
    public String stringMapping(String str,String[] words)
    {
    	int i;
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
			}
			else
			{
				hm.put(str.charAt(i),1);
			}
		}
    	int a = 0;
		for(int j=0;j<words.length;j++)
		{
			HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
			hm2 = stringOne(words[j]);
			a = hm2.size();
			int m = 0;
			for(Character ch : hm.keySet())
			{
			    if(hm2.containsKey(ch) && hm.get(ch) >= hm2.get(ch))
			    {
			    	m = m + 1;
			    }
			}
			if(m == a)
			{
				return words[j];
			}
		}
		return "-";
    }
}

public class hashMapping 
{
     public static void main(String[] args) 
     {
    	 mapping m = new mapping();
    	 String str = "breadmaking";
    	 String[] words = new String[] {"baby", "referee", "cat", "dada", "dog", "bird", "ax"}; 
         System.out.println(m.stringMapping(str,words));
	 }
}
