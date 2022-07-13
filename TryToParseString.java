
public class TryToParseString{

	public static void main(String[] args){

		try{

			String s = "77";

	       		 // Primitive int is returned
		        int str = Integer.parseInt(s);
		        System.out.println(str);

		        // Integer object is returned
		        int str1 = Integer.valueOf(s);
		        System.out.println(str1);

			int result = str + str1;
			System.out.println(result);

		}
		catch(Exception err){

			System.out.println(err.getMessage());

		}
	}

}
