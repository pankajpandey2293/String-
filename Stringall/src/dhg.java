
public class dhg {

    public static void main(String[] args)
    {    
        int[] arrayOne = {2, 5, 1, 7, 4};
         
        int[] arrayTwo = {2, 5, 1, 7, 5};
         
        boolean equalOrNot = true;
         
        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        	
        	
        	
        	
        {
            equalOrNot = true;
        }
         
        if (equalOrNot)
        {
            System.out.println("Two Arrays Are Equal");
            System.out.println("Two Arrays Are Equal hai ");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
            System.out.println("Two Arrays Are Not equal");
            System.out.println("Two Arrays Are Not nahi equal");
        }
    }
}

