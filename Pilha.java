import java.util.Scanner;

public class Pilha {
    private int capacidade;
    private int topo;
    private char[] dados;

    public Pilha(int capacidade){
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new char[capacidade];
    }

    public void Inserir(char valor){
        if (Cheia()){
            System.out.println("Pilha cheia");
            return;
        }
        topo++;
        dados[topo] = valor;
    }

    public boolean Cheia(){
        return topo == capacidade -1;
    }

    public boolean Vazia(){
        return topo == -1;
    }

    public char Remover(){
        if (Vazia()){
            System.out.println("Pilha está vazia!");
            return '\0';
        }
        char valor = dados[topo];
        topo--;
        return valor;

    }

    public void Imprimir(){
        for (int i = 0; i <= topo; i++) {
            System.out.println(i + " - " + dados[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pilha p = new Pilha(10);
        while (true){
            System.out.println("[1] Inserir\n[2] Remover");
            p.Imprimir();
            int op = sc.nextInt();
            sc.nextLine();
            if (op == 1){
                System.out.println("Valor a inserir: ");
                char valor = sc.nextLine().charAt(0);
                p.Inserir(valor);
            }
            else if (op == 2){
                p.Remover();
            }
        }
    }
}

