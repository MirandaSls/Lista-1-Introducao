public class Ex01 {

        public static void main(String[] args) {

            int salario, aumento, newsalario;

            MyIO.println("Digite o seu salário: ");
            salario = MyIO.readInt();

            if(salario <= 1200) {
                aumento = (salario * 10) / 100;
                newsalario = aumento + salario;
            }else {
                aumento = (salario * 5) / 100;
                newsalario = aumento + salario;
            }

            MyIO.println("-Valor do aumento: "+aumento);
            MyIO.println("-Novo salário: "+newsalario);
        }

}
