public class Calculos {

    @FunctionalInterface
    interface Operacao {
        int calcular(int a, int b);
    }

    public static void main(String[] args) {


        Operacao soma = (a, b) -> a + b;
        Operacao multiplicacao = (a, b) -> a * b;


    System.out.println("Soma: " + soma.calcular(5, 3));
    System.out.println("Multiplicação: " + multiplicacao.calcular(4, 4));

    }

}