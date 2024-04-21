    public class prac1 {
        public static void main (String[] args)
        {
            String name = "Orange";
            String name1="orange";
            String name2=new String("orange");
            //name2="orange";
            if(name1==name2) {
                System.out.println("comparing using equals to operator match");
            }
            else {
                System.out.println("comparing using equals to operator not match");
            }
            if(name1.equals(name2))
            {
                System.out.println("comparing using equals keyword match");
            }
            else
            {
                System.out.println("comparing using equals keyword not match");
            }

        }
    }
