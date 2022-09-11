public class Ex03 {
    public static void main(String[] args) {

        int car, count = 0, multas = 0;

        for(int i = 0;i < 5; i++) {

            MyIO.println("Digite a velocidade do veiculo: ");
            car = MyIO.readInt();

            if(car > 60) {
                count++;
                multas = multas + 150;
            }
        }
        MyIO.println("-Número de carros acima da velocidade permitida");
        MyIO.println("- "+count);
        MyIO.println("-Valor arrecadado com multas");
        MyIO.println("-"+multas);
    }
}
