/*Explicação:
- Tipo pode ser um dos tipos primitivos (int, float, char, double,...) ou o nome de uma classe.
- Parâmetro é o nome da variável que irá receber uma cópia do valor.
Para chamar esse método deverá usar algo assim:
nomeDoMétodo(parâmetro)
- O parâmetro deverá ser do mesmo tipo e com a mesma quantidade de parâmetros definidos
na declaração do referido método.*/
public class mostrar{
// defini o metodo cm mensagem q recebe o parametro nome e Não retorna valo(tipo void) é imprime a saudação usando o nome passado
    public void mensagem(String nome){
        System.out.println("Bem Vinda "+nome);
    }
// define um metodo chamado retornaNome q retorna uma String dentro do metodo, uma string "Isabelly Moraes" é atribuida a nome, q e retornada.
    public String retornaNome(){
        String nome = "Isabelly Moraes";
        return nome; // NÃO TEM VOID, USA RETURN
    }
}