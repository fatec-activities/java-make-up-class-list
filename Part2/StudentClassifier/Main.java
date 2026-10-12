import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();
    
        Scanner input = new Scanner(System.in);

        double grade;
    
        do {
            System.out.print("Digite a nota (0-100): ");
        
            grade = input.nextDouble();
        
            if (grade < 0 || grade > 100) {
                System.out.println("Nota inválida! Tente novamente.");
            }
        } while (grade < 0 || grade > 100);

        double attendance;
     
        do {
            System.out.print("Digite a frequência (0-100%): ");
          
            attendance = input.nextDouble();
         
            if (attendance < 0 || attendance > 100) {
                System.out.println("Frequência inválida! Tente novamente.");
            }
        } while (attendance < 0 || attendance > 100);

        Student student = new Student(grade, attendance);
      
        student.classify();
        student.showReport();

        input.close();
    }
}