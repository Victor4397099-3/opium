//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//int a = 1;
//while(a<=10){
//    if(a%2==0){
//        ;System.out.println("ЧЁТНОЕ")
//    }
//    a++;
//}
//        int a =1;
//        while(a<=50){
//            if(a == 35){
//                System.out.println(a);
//                break;
//            }
//            System.out.println(a);
//            a++;
//        }
//        for(
//                int a= 1;
//                a<=50;
//                a= a+2){
//            System.out.println(" нечётные число"+a);
        //}
        double a = 10;
        double b= 7;
        double c = -17;
        double d = Math.pow(b,2)-4*a*c;
        if(d<0){
            System.out.println("pohel naki");
            
        } else if (d==0) {
            double x = -1*b/(2*a);
            System.out.println(x);
        }
else{
    double x1 =(-1*b+Math.sqrt(d))/(2*a);
            double x2 =(-1*b-Math.sqrt(d))/(2*a);
            System.out.println(x1+":"+ x2);


        }
    }
}