import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int numero2 = scanner.nextInt();

        try{
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro! ");
        }
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if (numero1 > numero2){
            throw new ParametrosInvalidosException();
        }

        int limite = numero2 - numero1;

        for (int i=0; i < limite; i++){
            System.out.println(i);
        }
    }
}
