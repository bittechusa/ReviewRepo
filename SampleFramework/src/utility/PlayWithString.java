package utility;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public final class PlayWithString {
	
	public void test1(WebDriver driver) {
		int msize=driver.findElements(By.xpath("//ul[@class='global-navigation__horizontal-nav']/li")).size();
		for(int i=1;i<=msize;i++) {
			WebElement ele=driver.findElement(By.xpath("//ul[@class='global-navigation__horizontal-nav']"
					+ "/li["+i+"]"));
			int ssize=driver.findElements(By.xpath("//ul[@class='global-navigation__horizontal-nav']/li["+i+"]"
					+ "/div/div/div[1]/div/ul/li")).size();
			for(int j=1;j<=ssize;j++)
			{
				Actions a=new Actions(driver);
				a.moveToElement(ele).build().perform();
				if(driver.findElement(By.xpath("//ul[@class='global-navigation__horizontal-nav']/li["+i+"]"
						+ "/div/div/div[1]/div/ul/li["+j+"]")).getText()!=null)
				{
				driver.findElement(By.xpath("//ul[@class='global-navigation__horizontal-nav']/li["+i+"]"
						+ "/div/div/div[1]/div/ul/li["+j+"]")).click();
				driver.navigate().back();
				}
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	String s="How are you";
	String s1=new String();
	StringBuffer s2=new StringBuffer("How are you");
	@Test
	public void play() {
//		String s3=s.concat(" doing");
//		System.out.println(s);
//		System.out.println(s3);
//		StringBuffer s4=s2.append(" doing");
//		System.out.println(s2);
//		System.out.println(s4);
//		
//		char c=s.charAt(5);
//		int x="dog".compareTo("dow");
//		System.out.println(x);
//		//System.out.println("cow".hashCode());
//		//System.out.println("Cow".hashCode());
//		"cow".compareToIgnoreCase("Cow");
//		s.concat(" doing");
//		s.contains("how");
//		s.endsWith("you");
//		Integer i=new Integer(7);
//		Integer i1=new Integer(17);
//		i.equals(i1);
//		if(i==i1)
//		{
//			System.out.println();
//		}
//		s.equalsIgnoreCase("how are you");
//		s.hashCode();
//		int c1=s.indexOf('o');
//		int c2=s.indexOf('o', c1+1);
//		int c3=s.lastIndexOf('o');
//		int c4=s.lastIndexOf('o', c3-1);
//		
//		s.isEmpty();
//		s.length();
//		s.replace("you", "u");
//		String []s5=s.split(" ");
//		System.out.println(s5);
//		for(int i=0;i<s5.length;i++)
//		{
//			System.out.println(s5[i]);
//		}
//		
//		for(int i=s5.length-1;i>=0;i--)
//		{
//			System.out.println(s5[i]);
//		}
//		
//		char [] c2=s.toCharArray();
//		for(int i=c2.length-1;i>=0;i--)
//		{
//			System.out.print(c2[i]);
//		}
//		
//		for(int j=s.length()-1;j>=0;j--)
//		{
//			s.charAt(j);
//		}
//		
//		s.toLowerCase();
//		s.toUpperCase();
//		s.trim();
//		String sd=s.valueOf(8);
//		s2.toString().concat("");
//		s.substring(4);
//		s.substring(4, 6);
//		s.startsWith("how");
		
		//how to find duplicate character
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.println(s.charAt(i)+ " duplicate character");
				}
			}
		}
		
		int i=Integer.parseInt("8");
		
		
		//let say 
		String d="12abc32";
		
		String d1=d.replace("abc", ",");//12,32
		String d2[]=d1.split(",");//d2[0]=12 d2[1]=32
		int n=Integer.parseInt(d2[0]);
		int n1=Integer.parseInt(d2[1]);
		System.out.println(n+n1);
		
		//find vowel character
		char [] v=s.toCharArray();
		for( char x:v)
		{
			if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
			{
				System.out.println(x+" is vowel character");
			}
		}
		
		//is given string polindrom
			
		
		
	}
	
	@Test
	public void test2() {
		System.out.println(ispolindrom("mom"));
	}
	
	
	public boolean ispolindrom(String s)
	{
	
		char[] ch=s.toCharArray();
		int rin=ch.length-1;
		for(int k=0;k<ch.length;k++,rin--)
		{

			if(s==" ")
			{
				System.out.println("null is not polindrom");
				return false;
			}
			if(ch[k]!=ch[rin])
			{
				System.out.println(s +" is not polindrom");
				return false;
	
			}
			
			
		}
		return true;
		
	}
	//how to reverse a sentence by word
	//how are you---> you are how
	public void reverseByWord() {
		
		
		
		Integer.parseInt("8");
		Double.parseDouble("5.6");
		int a=1234;//how to rever int value
		//how to convert numeric to binary
		//how to convert binary to decimal
		
		String sentence="how are you";
		String ar[]=sentence.split(" ");
		StringBuffer bf=new StringBuffer();
		StringBuilder bf1=new StringBuilder();
		for(int i=ar.length-1;i>=0;i--)
		{
			
			bf.append(ar[i]).append(" ");
			//System.out.println(ar[i]);
		}
		System.out.println(bf.toString().trim());
	}
	
	//is given strin is anagram?
	//cat--->act
	
	//
	public void clcick(List<WebElement> elements,String exp) {
		for(WebElement e:elements)
		{
			if(e.getText().equals(exp))
			{
				e.click();
				break;
			}
		}
		
	}
	

}
