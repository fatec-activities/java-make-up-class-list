public class Patient {
    private final int age;
    private final int systolicPressure;

    private String classification;

    public Patient(int age, int systolicPressure) {
        this.age = age;
        this.systolicPressure = systolicPressure;
    }

    public void classify() {
        if (systolicPressure < 120) {
            classification = "Normal";
        } else if (systolicPressure <= 129) {
            classification = "Elevada";
        } else if (systolicPressure <= 139) {
            classification = "Hipertensão Estágio 1";
        } else {
            classification = "Hipertensão Estágio 2";
        }
    }

    public void showReport() {
        Utils.consoleClear();

        System.out.println("Idade: " + age + " anos");
        System.out.println("Pressão Sistólica: " + systolicPressure + " mmHg");
        System.out.println("Classificação: " + classification);
    }
}