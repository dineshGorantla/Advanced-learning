package com;

public class Character {
	 static void printRotatedString(String str)
	    {
	        int len = str.length();
	        // Generate all rotations one by one and print
	        StringBuffer sb;
	        for (int i = 0; i < len; i++)
	        {
	            sb = new StringBuffer();
	            int j = i;  // Current index in string
	            int k = 0;  // Current index in temp variable
	      
	            // Copying the second part from the point
	            // of rotation.
	            for (int k2 = j; k2 < str.length(); k2++) {
	                sb.insert(k, str.charAt(j));
	                k++;
	                j++;
	            }
	      
	            // Copying the first part from the point
	            // of rotation.
	            j = 0;
	            while (j < i)
	            {
	                sb.insert(k, str.charAt(j));
	                j++;
	                k++;
	            }
	      
	            System.out.println(sb);
	        }
	    }
	    public static void main(String[] args)
	    {
	        String  str = new String("MPHASIS");
	        printRotatedString(str);
	    }

}
