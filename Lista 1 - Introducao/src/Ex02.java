public class Ex02 {
    public static void main(String[] args) {

        int nota1,nota2,nota3, media;

        MyIO.println("Digite a primeira nota de 0 a 10: ");
        nota1 = MyIO.readInt();
        MyIO.println("Digite a segunda nota de 0 a 10: ");
        nota2 = MyIO.readInt();
        MyIO.println("Digite a terceira nota de 0 a 10: ");
        nota3 = MyIO.readInt();

        media = (nota1 + nota2 + nota3)/3;

        if(media >= 0 && media < 4) {
            MyIO.println("Reprovado");
            MyIO.println("Media: "+media);
        }else {
            if(media >= 4 && media < 6) {
                MyIO.println("Exame Especial");
                MyIO.println("Media: "+media);
            }else {
                if(media >= 6 && media < 10) {
                    MyIO.println("Aprovado");
                    MyIO.println("Media: "+media);
                }
            }
        }
    }
}
