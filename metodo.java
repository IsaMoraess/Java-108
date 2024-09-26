/*Observações:
- Os tipos de informações a serem passadas na chamada do método, deve ser coerente com os
tipos especificados na declaração do referido método;
- É um erro não passar um parâmetro para o método, quando o mesmo é exigido;
- A cada parâmetro você especificar o tipo e um identificador (nome da variável);
- Um método pode especificar mais de um parâmetro, separando cada um deles do próximo
com uma vírgula. */

public class metodo{
    public static void main(String args[]){
        mostrar m = new mostrar(); //instancia da classe mostrar
        m.mensagem("Isabelly");//chama o metodo de instancia m, passsando "Isabelly" como argumento
        System.out.println("O nome completo dela é " + m.retornaNome());
    }
}