import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        int r=(a>b)?a:b;
        System.out.println(r);
    }
}