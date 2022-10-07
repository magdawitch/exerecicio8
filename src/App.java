import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        //1: Quanto ganha por hora e quantas horas trabalhadas

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o seu valor/hora ");
        int valor_hora = sc.nextInt();
        System.out.println("");
        System.out.print("Entre com a quantidade de horas trabalhadas no mês ");
        int horas_mês = sc.nextInt();
        sc.close();

        //2: Calcule e mostre o salário no mês

        int salário_mês = valor_hora * horas_mês;
        System.out.println("");
        System.out.println("O valor do salário mês é: " + salário_mês);

    }
}
