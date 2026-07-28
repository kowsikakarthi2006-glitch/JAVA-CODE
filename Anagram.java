public class Main{
    public static void main(String[]args){
        String str="SILENT";
        String str1="LISTEN";
        char[] arr =str.toCharArray();
        char[] arr1 =str1.toCharArray();
        if (arr.length!=arr1.length)
        {
            System.out.println("Not an anagram.");
            return;
        }
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr[i])
            {
                System.out.println("Not an anagram.");
                return;
            }
        }
        System.out.println("An anagram");
    }
}
