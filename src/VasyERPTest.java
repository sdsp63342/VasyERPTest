import java.util.Scanner;
public class VasyERPTest {
	public static void main(String arg[]) {
		int skipcount;
		Scanner sc=new Scanner(System.in);
		String input="Here is the source code of the Java Program";
		System.out.println("How many first words/characters do you want to skip?: ");
		skipcount=sc.nextInt();
		String temp[]=input.split(" ");
		String output1="";
		for(int i=0;i<skipcount;i++) {
			output1+=temp[i];
			output1+=" ";
		}
		for(int i=temp.length-1;i>=skipcount;i--)
		{
			output1+=temp[i];
			output1+=" ";
		}
		System.out.println(output1);
		String temp1[]=output1.split(" ");
		for(int i=0;i<temp1.length;i++)
		{
			String t="";
			if(temp1[i].length()<skipcount)
				continue;
			for(int j=0;j<skipcount;j++)
			{
					t+=temp1[i].charAt(j);
								
				
			}
			if(temp1[i].length()<skipcount)
				continue;
			for(int k=((temp1[i]).length()-1);k>=skipcount;k--)
			{
				t+=temp1[i].charAt(k);
				
			}
			temp1[i]=t;
		
			
			
		}
		String output2="";
		for(int i=0;i<temp1.length;i++)
		{
			output2+=temp1[i];
			output2+=" ";
		}
		System.out.println(output2);
	}
}
	

