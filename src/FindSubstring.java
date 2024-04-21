public class FindSubstring {
    public static void main(String[] args) {
        String mainstring="Hello World";
        String substring="Hello";
        if (mainstring.contains(substring))
        {
            System.out.println("substring is found");
        }
        else
        {
            System.out.println("substring not found");
        }
    }
}
