public class Student {
    private final double grade;
    private final double attendance;

    private String situation;

    public Student(double grade, double attendance) {
        this.grade = grade;
        this.attendance = attendance;
    }

    public void classify() {
        if (attendance < 75) {
            situation = "Reprovado por Frequência";
        } else if (grade >= 70) {
            situation = "Aprovado";
        } else if (grade >= 50) {
            situation = "Recuperação";
        } else {
            situation = "Reprovado por Nota";
        }
    }

    public void showReport() {
        Utils.consoleClear();

        System.out.printf("Média Final: %.1f%n", grade);
        System.out.printf("Frequência: %.1f%%%n", attendance);
        System.out.println("Situação: " + situation);
    }
}