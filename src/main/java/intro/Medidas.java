// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e funções
    public static void main(String[] args){
        System.out.println("Bom dia!!!");
        System.out.println("Calculo de Areas");
        // Cálculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e comprimento de "
                + comprimento + "m a largura de " + largura * comprimento + "m2");
    }

    public void  calcularAreaModoExtenso(){
        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;

        largura = 5;
        comprimento = 6;
        int resultado;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a area é de " + resultado + " m2");

    }

    public void calculoAreaModoCompacto(){
        // Cálculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e comprimento de "
                            + comprimento + "m a largura de " + largura * comprimento + "m2");
    }
}
