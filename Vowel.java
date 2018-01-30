
class Vowel
	{
		public static void main(String arg[])
		{
			String s1= arg[0];
			char c=s1.charAt(0);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='U'||c=='O'||c=='I'||c=='E'||c=='A')
				System.out.println("Given character is a vowel");
			else
				System.out.println("Given character is not a vowel");
		}
	}