package utils;

import java.util.Random;

public class StringOperations {
	
 public static String randomStringGenerate(int size) {
	 String charList="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz";
	 Random rnd =new Random();
	 StringBuffer sb=new StringBuffer(size);
	 for(int i=1;i<=size;i++)
	 {
		 sb.append(charList.charAt(rnd.nextInt(charList.length())));
	 }
	 System.out.println(sb.toString());
	 return sb.toString();	 
 }
	
	 public static String randomIntegerGenertae(int size)
	 {
		 Random rnd =new Random();
		 StringBuffer sb=new StringBuffer(size);
		 for(int i=1;i<=size;i++)
		 {
			 sb.append(rnd.nextInt(10));
		 }
		 System.out.println(sb.toString());
		 return sb.toString();
		 
	 }
}
