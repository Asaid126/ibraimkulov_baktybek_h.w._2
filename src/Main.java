import java.util.Scanner;
public class Main {
    public static String walks(int age,int tC){
        String result;
        if((age>19 && age<46 && tC>=-20 && tC<31)||(age<20 && age>-1 && tC>-1 && tC<29)|| (age>45 && tC>=-10 && tC<26)) {
            result = "Можно идти гулятЬ";
        }
        else{
            result = "ОставайтесЬ дома";
        }
        return result;
    }
    public  static int generateRandom(){
        int a=(int)(Math.random()*120);//при типе Double можно испю без переменной и не указывая тип
        return a;
    }
    public static void main(String[] args) {
        String arguments1=walks(20,-20);
        String arguments2=walks(5,27);
        String arguments3=walks(44,-4);
        String arguments4=walks(0,34);
        String arguments5=walks(20,45);
        String random=walks(generateRandom(),10);
        System.out.println("При таких условиях: "+arguments1);
        System.out.println("При таких условиях: "+arguments2);
        System.out.println("При таких условиях: "+arguments3);
        System.out.println("При таких условиях: "+arguments4);
        System.out.println("При таких условиях: "+arguments5);
        System.out.println("Рандомный вариант="+generateRandom()+": " +random);
        System.out.println("Введите age затем tC для проверки:");//для проверки условия с консоли(не дз)
        Scanner sc=new Scanner(System.in);//для проверки условия(не дз)
        int ag= sc.nextInt();//для проверки условия(не дз)
        int tс= sc.nextInt();//для проверки условия(не дз)
        String cons=walks(ag,tс);//для проверки условия(не дз)
        System.out.print(cons);//для проверки условия(не дз)

    }
}