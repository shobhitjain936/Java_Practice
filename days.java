import java.util.Scanner;
public class days {
    public static void main(String[] args){
            int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");
        day=sc.nextInt();
        switch(day){
      case 1: System.out.println("MONDAY");
      break;
       case 2: System.out.println("TUESDAY");break;
        case 3: System.out.println("WEDNESDAY");break;
         case 4: System.out.println("THRUSDAY");break;
          case 5: System.out.println("FRIDAY");break;
           case 6: System.out.println("SATURDAY");break;
            case 7: System.out.println("SUNDAY");
            default: System.out.println("wrong choice");
        }

    }

}
