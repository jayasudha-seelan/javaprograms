public class StringFunctions {
    public static void main(String[] args) {
        //charAt(index) - Returns the character at the specified index within the string.
        String chstr="Hello World";
        System.out.println(chstr.charAt(1));
        //output: e

        //length() - Returns the length of the string
        String flen="Hello World";
        System.out.println("The length of the string is " + flen.length());
        //output: The length of the string is 11

        //substring(beginIndex) - Returns the substring starting from the specified index.
        String fsub="Hello World!";
        System.out.println(fsub.substring(6));
        //output: World!

        //substring(beginIndex,endIndex) - Returns the substring from the specified begin index till the end index
        String fesub="Hello World!";
        System.out.println(fesub.substring(0,5));
        //output: Hello

        //toLowerCase() - Converts a string to lower case
        String lows="HELLO WORLD!";
        System.out.println(lows.toLowerCase());
        //output: hello world!

        //toUpperCase() - Converts a string to upper case
        String ups="hello world!";
        System.out.println(ups.toUpperCase());
        //Output: HELLO WORLD!

        //trim() - Removes the leading and trailing whitespace characters from the string
        String str=" Hello World! ";
        System.out.println("The trimmed string is "+str.trim());
        //Output: The trimmed string is Hello World!

        //replace(char oldChar, char newChar) - Replaces all occurance of the specified character to new character
        String strr="Hello World!";
        System.out.println("The replaced string is "+strr.replace('l','z'));
        //output: The replaced string is Hezzo Worzd!

        //replace(String oldtext, String newtext) - Replaces the old text with the new text
        String strre="Hello World!";
        System.out.println("The replaced string is "+strre.replace("World","Java"));
        //output: The replaced string is Hezzo Java!

        //contains (substring) - Checks that the substring is present in the main string
        String sstr="Hello World";
        System.out.println("Is the substring present in the main string? " + sstr.contains("World"));
        //output: Is the substring present in the main string? true

        //startsWith(string prefix) - Checks that the whole string starts with the specified prefix
        String startstr="Hello World";
        System.out.println("Does the main string starts with the word 'Hello'? " + startstr.startsWith("Hello"));
        //output: Does the main string starts with the word 'Hello'? true

        //endsWith(String suffix) - Checks that the whole string ends with the specified suffix
        String endstr="Hello World";
        System.out.println("Does the main string ends with the word 'World'? " + endstr.endsWith("World"));
        //output: Does the main string ends with the word 'World'? true

        //indexOf(int ch) - Returns the index of the occurance of the first character in a string, -1 is returned if
        //the character is not found in the string
        String indstr="Hello World";
        System.out.println("The character 'o' is present in the " + indstr.indexOf('o') + "th position");
        //output: The character 'o' is present in the 4th position
        System.out.println("The string 's' is present in the " + indstr.indexOf('s') + " position");
        //output: The string 's' is present in the -1 position

        //indexOf(string str) - Returns the index of the occurance of the string
        String indstrr="Hello World";
        System.out.println("The character 'World' is present in the " + indstr.indexOf("World") + "th position");
        //output: The character 'World' is present in the 6th position

        /*lastIndex(int ch) - Returns the last occurance of the specified character in the string, returns -1 if the
        string is not found. Similarly we can do for lastIndex(string)*/
        String lstr1="Hello, World!";
        System.out.println("THe last occurance of the character r is " + lstr1.lastIndexOf('r'));
        //output: THe last occurance of the character r is 9

        //isEmpty() - Returns true if the string is empty, else returns false
        String estr="Hello World";
        System.out.println("Is the string is empty? " + estr.isEmpty());

       //matches (string regex) - Checks that the string matches the specified regular expression
        String smstr="Hello, World!";
        System.out.println("Does the string matches? " + smstr.matches("Hello.*"));
        //output: Does the string matches? true

        //compareTo(String anotherString) - Compares two strings and returns the negative character based on the unicode
        String str1="Hello";
        String str2="World!";
        System.out.println(str1.compareTo(str2));
        //Output: -15
        /* Explanation for the output
        1. The first differing characters are 'H' and 'W'.
            Their Unicode values are:
            H -> 72
            W -> 87
        2.  The difference between the unicode values are 72-87= -15
        So, the output is -15 */





























    }
}
