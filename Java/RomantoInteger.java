import java.util.*;
public class RomantoInteger
{
	public static void main(String[] args) {
		HashMap<Character,Integer> map=new HashMap<>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int op=0;
		for(int i=0;i<n;i++)
		{
		    if(i<n-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1)))
		    {
		        op+=map.get(s.charAt(i+1))-map.get(s.charAt(i));
		        i++;
		    }
		    else{
		        op+=map.get(s.charAt(i));
		    }
		}
		System.out.println(op);
	}
}