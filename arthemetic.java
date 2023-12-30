import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        int a,b,r;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the two numbers");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("1.add\n2.sub\n3.mul\n4.div");
        System.out.println("enter your choice");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
                r=a+b;
                System.out.println(r);
                break;
                case 2:
                    r=a-b;
                    System.out.println(r);
                    break;
                    case 3:
                        r=a*b;
                        System.out.println(r);
                        break;
                        case 4:
                            r=a/b;
                            System.out.println(r);
                            break;
                            default:
                            System.out.println("invalid choice");
        }
    }
}
        