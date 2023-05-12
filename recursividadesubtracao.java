class recursividadedesubtracao {

    // Faça uma função recursiva que calcula a divisão usando subtrações sucessivas:
    // int divisao (int numerador, int denominador)
    // Faça um programa que leia dois números, acione a função e exiba o resultado
    // gerado.

    public static void main(String[] args) {
        System.out.println(divisao(10, 5));
    }

    static int divisao(int numerador, int denominador) {

        if (numerador == 0) {
            return 0;
        }

        return divisao((numerador - denominador), denominador) + 1;

    }

}