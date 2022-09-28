public class CountVowelConsonant1
{
    public static void main(String[] args)
    {
        int cCount=0;
        int vCount=0;
        String str = "This is a really simple sentence";
        str = str.toLowerCase();

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
               vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i)<='z')
            {
              cCount++;
            }
        }

        System.out.println("Count Vowel : "+ vCount);
        System.out.println("Count Constant : "+ cCount);
    }
}
