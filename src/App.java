import java.util.List;
import java.util.Set;
import collections.set.Sets;
import models.Person;
import structures.node.Node;
import trees.BinaryTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.Ejercicio3;
import trees.Ejercicio4;
import trees.InsertBSTTest;
import structures.graphs.Graph;

public class App {
    public static void main(String[] args) throws Exception {
        runSets();
        runIntTree();
        runPersonTree();
        runGraph();
    }

    private static void runGraph() {
        Graph<String> graph = new Graph<>();

       
        graph.addedgeUni("A", "B");
        graph.addedgeUni("B", "C");
        graph.addedgeUni("B", "D");
        graph.addedgeUni("C", "A");
        graph.addedgeUni("C", "D");
        graph.addedgeUni("D", "C");
        graph.addedgeUni("D", "J");
        graph.addedgeUni("J", "D");

        System.out.println("\n--- LISTA DE ADYACENCIA (GRAFO) ---");
        graph.printGraph();
    }

    private static void runIntTree() {
        // --- EJERCICIO 01: INSERT BST ---
        // Usamos el array solicitado para que la estructura coincida con tu imagen
        int[] numeros = {5, 3, 7, 2, 4, 6, 8};
        InsertBSTTest ejercicioInsert = new InsertBSTTest();
        Node<Integer> root = ejercicioInsert.insert(numeros);
        Ejercicio1 impresor = new Ejercicio1();

        System.out.println("\n--- EJERCICIO 01: INSERT BSTTest ---");
        System.out.println("Imprimiendo el árbol:");
        impresor.printTree(root);

        // Ejercicios adicionales
        System.out.println("\n--- EJERCICIO 02: INVERTIR ARBOL ---");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.invert(root);
        impresor.printTree(root);
        System.out.println("\n--- EJERCICIO 02: ARBOL ORIGINAL ---");
        Ejercicio2 ejercicio21 = new Ejercicio2();
        ejercicio21.invert(root);
        impresor.printTree(root);
      

        System.out.println("\n--- EJERCICIO 03: LISTAR NIVELES ---");
        Ejercicio3 ejercicio3 = new Ejercicio3();
        List<List<Node<Integer>>> niveles = ejercicio3.listLevels(root);
        for (List<Node<Integer>> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) System.out.print(" -> ");
            }
            System.out.println();
        }

        System.out.println("\n--- EJERCICIO 04: PROFUNDIDAD MAXIMA ---");
        Ejercicio4 ejercicio4 = new Ejercicio4();
        System.out.println("ARBOL ORIGINAL:");
        impresor.printTree(root);
        System.out.println("Profundidad: " +  ejercicio4.maxDepth(root));
    }

    private static void runSets() {
        Sets sets = new Sets();
        // ... (resto de tu lógica de sets se mantiene igual)
        System.out.println("Primera implemetacion de Set");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
    }

    private static void runPersonTree() {
        BinaryTree <Person> persontree = new BinaryTree<>();
        persontree.insert(new Person("Alice", 30));
        persontree.insert(new Person("Bob", 25));   
        persontree.insert(new Person("Charlie", 35));
        persontree.inOrder();
        System.out.println();
    }
}