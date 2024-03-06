package grouptest2;
import  java.util.*;
public class GroupTest2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Answerable as = new Answerable();
         System.out.print("What is 30 + 30? = ");
         System.out.println("A. 60");
System.out.println("B. 40");
System.out.println("C. 50");
        String ans1 = sc.nextLine();
        System.out.print("What is the smallest particle?: ");
        System.out.println("A. Chromosome");
System.out.println("B. Atom");
System.out.println("C. cell");
        String ans2 = sc.nextLine();
        System.out.println("When was pearl harbor attacked?: ");
        System.out.println("A. Dec 7");
System.out.println("B. Dec 9");
System.out.println("C. Dec 10");
        String ans3 = sc.nextLine();
        as.MathQ(ans1);
        as.ScienceQ(ans2);
        as.HistoryQ(ans3);
       
}
}
interface Exam{
 void MathQ();
 void ScienceQ();
 void HistoryQ();
}
class Answerable implements Exam {
public void MathQ(){


}
public void ScienceQ(){

}
public void HistoryQ(){

}
}
