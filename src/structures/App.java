import java.util.List;
import models.Person;
import node.Node;
import trees.BinaryTree;
import trees.InsertBSTTest;
import trees.Ejercicio2;
import trees.Ejercicio3;
import trees.Ejercicio4;
import trees.InsertBSTTest;
import trees.IntTree;

public class App {

    public static void main(String[] args) throws Exception {
        runIntTree();
        System.out.println("\n=== PRUEBAS CON OBJETOS PERSON ===");
        runPersonTest();
    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree();

        // Inserción de datos para pruebas generales
        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8);
        arbolNumeros.insert(20);
        arbolNumeros.insert(15);

        System.out.println("--- RECORRIDO PRE-ORDER ---");
        arbolNumeros.preOrder();

        System.out.println("\n--- RECORRIDO POST-ORDER ---");
        arbolNumeros.posOrder();

        System.out.println("\n--- RECORRIDO IN-ORDER ---");
        arbolNumeros.inOrder();

        System.out.println("\n--- RECORRIDO POR NIVELES ---");
        arbolNumeros.imprimirPorNiveles();

        System.out.println("\n--- ALTURA DEL ÁRBOL ---");
        System.out.println("Altura: " + arbolNumeros.getAltura());

        // --- EJERCICIOS ESPECÍFICOS ---
        System.out.println("\n--- BASE PARA EJERCICIOS CON ARRAY ---");
        int[] numeros = {5, 3, 7, 2, 4, 6, 8};
        InsertBSTTest ejercicioInsert = new InsertBSTTest();
        Node<Integer> root = ejercicioInsert.insert(numeros);

        System.out.println("\n--- EJERCICIO 01: INSERT BST ---");
        InsertBSTTest impresor = new InsertBSTTest();
        impresor.printTree(root);

        System.out.println("\n--- EJERCICIO 02: INVERTIR ÁRBOL ---");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.invert(root);
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

        System.out.println("\n--- EJERCICIO 04: PROFUNDIDAD MÁXIMA ---");
        Ejercicio4 ejercicio4 = new Ejercicio4();
        System.out.println("Profundidad: " + ejercicio4.maxDepth(root));
    }

    private static void runPersonTest() {
        BinaryTree<Person> personTree = new BinaryTree<>();
        personTree.insert(new Person("Juan", 30));
        personTree.insert(new Person("Ana", 20));
        personTree.insert(new Person("Pedro", 40));

        System.out.println("--- ÁRBOL DE PERSONAS IN-ORDER ---");
        personTree.inOrder();

        // Prueba manual de nodos
        Node<Person> nodo1 = new Node<>(new Person("Alice", 30));
        Node<Person> nodo2 = new Node<>(new Person("Bob", 25));
        nodo1.setLeft(nodo2);
        System.out.println("\nNodo Principal: " + nodo1.getValue().getName());
        System.out.println("Hijo Izquierdo: " + nodo1.getLeft().getValue().getName());
    }
    public void runSetTest() {
       Sets set = new Sets();
        
       System.out.println("HashSet:");
       Set<String> hashSet = set.construirHashSet();
       System.out.println(hashSet);
       System.out.println("tamaño: " + hashSet.size());
       System.out.println(hashSet.contains("F"));
           
       System.out.println("\nLinkedHashSet:");
       Set<String> linkedHashSet = set.construirLinkedHashSet();
       System.out.println(linkedHashSet);
       System.out.println("tamaño: " + linkedHashSet.size());
       System.out.println(linkedHashSet.contains("F"));

       System.out.println("\nTreeSet:");
       Set<String> treeSet = set.construirTreeSet();
       System.out.println(treeSet);
       System.out.println("tamaño: " + treeSet.size());
       System.out.println(treeSet.contains("F"));
    }   
    public Set<Contacto> construirHashSetContactos() {
        Set<Contacto> cSet = new HashSet<>();
        cSet.add(new Contacto("Juan", "Perez", "123456789"));
        cSet.add(new Contacto("Ana", "Gomez", "987654321"));
        cSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        cSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        cSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado
        return cSet;
    }
    public Set<Contacto> construirLinkedHashSetContactos() {
        Set<Contacto> cSet = new LinkedHashSet<>();
        cSet.add(new Contacto("Juan", "Perez", "123456789"));
        cSet.add(new Contacto("Ana", "Gomez", "987654321"));
        cSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        cSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        cSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado
        return cSet;
    }
    public Set<Contacto> construirTreeSetContactos() {
        Set<Contacto> cSet = new TreeSet<>(new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                return c1.getNombre().compareTo(c2.getNombre());
            }
        });
        cSet.add(new Contacto("Juan", "Perez", "123456789"));
        cSet.add(new Contacto("Ana", "Gomez", "987654321"));
        cSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        cSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        cSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado
        return cSet;
    }
    public Set<Contacto>construirTreeSetComparador() {
        Set<Contacto> cSet = new TreeSet<>(new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                return c1.getNombre().compareTo(c2.getNombre());
            }
        });
        cSet.add(new Contacto("Juan", "Perez", "123456789"));
        cSet.add(new Contacto("Ana", "Gomez", "987654321"));
        cSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        cSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        cSet.add(new Contacto("Juan", "Perez", "123456789")); 
        cSet.add(new Contacto("Pedro", "Lopez", "456789123"));       
        return cSet;
    }
}