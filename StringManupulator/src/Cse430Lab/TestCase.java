package Cse430Lab;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestCase {
	 StringManupulator str=new StringManupulator();
	  
	 //Class 1
	 @Test
	 public void calculateStringLength(){
		 assertEquals(5,str.calculateStringLength("rifin"));
		 assertEquals(5,str.calculateStringLength("But what about LongString - how many "
		 		+ "characters can this data type hold? LongString is stored as NVARCHAR(MAX),"
		 		+ " which is 2GB maximum. Since each character"
		 		+ " is 2 bytes in length so you get ~ 1 Billion characters maximum."));
		}
	 @Test
	 public void reverseString(){
		 assertEquals("nifirA",str.reverseString("Arifin"));
		 assertEquals(" ",str.reverseString(" "));
	 }
	 @Test
	 public void toLowerCase(){
		 assertEquals("arifin",str.toLowerCase("ARIFIN"));
		 assertEquals(".6';",str.toLowerCase(".6';"));
	 }
	 @Test
	 public void countOccurrences(){
		 assertEquals(2,str.countOccurrences("ARIFIN",'I'));
		 assertEquals(0,str.countOccurrences("ARIFIN",'o'));
		 assertEquals(2,str.countOccurrences("+---+",'+'));
	 }
	//Class 2
	 StringManupulator2 str2=new StringManupulator2();
	 @Test
	 public void capitalizeWords()
	 {
		 assertEquals("Arifin",str2.capitalizeWords("ARIFIN"));
		 assertEquals("Dfdd",str2.capitalizeWords("dfdd"));
		 assertEquals("+---+",str2.capitalizeWords("+---+"));
	 }
	 @Test
	 public void removeNonAlphabetic()
	 {
		 assertEquals("A",str2.removeNonAlphabetic("A09++======================````"
		 		+ "`;767686868686868686868686867666666767676767676767676767"));
		 assertEquals("",str2.removeNonAlphabetic("       "));
		 assertEquals("bro",str2.removeNonAlphabetic("bro"));
	 }
	 @Test
	  public void containsSubstring()
	 {
		 assertEquals(true,str2.containsSubstring("ar io"," "));
			 assertEquals(true,str2.containsSubstring("Arifn","A"));
			 assertEquals(true,str2.containsSubstring("Arifn","Ar"));
	 }
	 @Test
	 public void MergeStrings()
	 {
		 assertEquals("ar io ",str2.MergeStrings("ar io"," "));
			 assertEquals("ArifnA",str2.MergeStrings("Arifn","A"));
			 assertEquals("ArifnAr",str2.MergeStrings("Arifn","Ar"));
	 }
	 @Test
	 public void reverseWords()
	 {
		 assertEquals("io ar",str2.reverseWords("ar io "));
			 assertEquals("ifn Ar",str2.reverseWords("Ar ifn"));
			 assertEquals("++ --",str2.reverseWords("-- ++"));
	 }
	 
	//Class 2
	 StringManupulator3 str3=new StringManupulator3();
	 @Test 
	 public void removeExtraSpaces()
	 {
		 assertEquals("ar io",str3.removeExtraSpaces("ar io "));
			 assertEquals("ar io",str3.removeExtraSpaces("    ar io     "));
			 assertEquals("- - ++",str3.removeExtraSpaces("- -     ++"));
	 }
}
