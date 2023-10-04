import java.util.Stack;

public class ExemploPilha {
        public static void main(String[] args)
        {
            // Criando uma pilha Vazia
            Stack<String> stack = new Stack<>();

            // Usando push() adicionar elementos na pilha
            stack.push("Bem vindo");
            stack.push("a");
            stack.push("Aula");
            stack.push("de");
            stack.push("Analise de Algoritmos");
            stack.push("e Estrutura de Dados");

            // Mostrando a pilha
            System.out.println("Pilha Inicial: " + stack);

            // Recuperando elemento do topo da pilha
            System.out.println("elemento do topo da pilha " + stack.peek());

            // Mostrando a pilha apos a operação peek
            System.out.println("Final Stack: " + stack);

            // Removendo elementos do topo da pilha
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());

            // Mostrando a pilha apos a operação pop
            System.out.println("Final Stack: " + stack);


            // verifica se um elemento está na pilha e retorna a sua posição na pilha
            System.out.println("A pilha contém 'Aula'? " + stack.search("Aula"));

            // verifica se um elemento está na pilha e retorna a sua posição na pilha
            System.out.println("A pilha contém 'Java'? " + stack.search("Java"));

            // Verifica se a pilha está vázia, se não estiver remove o elemento.
            while(!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        }
    }

