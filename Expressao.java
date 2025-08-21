import java.util.Scanner;

public class Expressao {

    public int AnalisaExpressao(String exp){
        Pilha pilha = new Pilha(exp.length());

        for (int i = 0; i < exp.length(); i++){
            char caractere = exp.charAt(i);

            if (caractere == '(' || caractere == '{' || caractere == '['){
                pilha.Inserir(caractere);
            } else if (caractere == ')' || caractere == '}' || caractere == ']'){
                if (pilha.Vazia()){
                    return 0;
                }
                pilha.Remover();
            }
        }

        if (pilha.Vazia()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args){
        Expressao ex = new Expressao();
        Scanner sc = new Scanner(System.in);

        System.out.println("Expressao:");
        String exp = sc.nextLine();

        int resultado = ex.AnalisaExpressao(exp);
        if (resultado == 1){
            System.out.println("Esta expressão é válida!");
        }
        else if (resultado == 0){
            System.out.println("Esta expressão é inválida!");
        }
    }
}
