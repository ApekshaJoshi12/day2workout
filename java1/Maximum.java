public class Maximum {
    public static int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static void main(String[]args)
    {   
        int result=max(20,40);
        System.out.println("The Maximum value:"+result);
    }
}
