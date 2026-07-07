
---

# Práctica: Estructuras Dinámicas No Lineales

## Datos del Estudiante

* **Nombre:** Nicole Estefania Dominguez Muñoz
* **Curso:** grupo #3
* **Fecha:** 09/07/2026
* **Materia:** Estructuras de Datos

---

## 1. Implementación de estructuras no lineales

**Fecha:** 17/06/2026

**Descripción:**
En esta parte implementé los métodos necesarios para recorrer árboles binarios, aplicando las estrategias vistas en clase.
El trabajo se centró en dominar la recursividad para navegar por la estructura de forma eficiente y ordenada.

### Captura del código de implementación de IntTree

```java
public class IntTree {
    private Node<Integer> root;

    public IntTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> node) {
        root = node;
    }

    public void insert(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        root = insertRecursivo(root, node);
    }

    private Node<Integer> insertRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        if (actual.getValue() > nodeInsertar.getValue()) {
        actual.setLeft(insertRecursivo(actual.getLeft(),
        nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }
        return actual;
    }

    public void imprimirPorNiveles() {
        if (root == null) return;
        Queue<Node<Integer>> cola = new LinkedList<>();
        cola.add(root);
        while (!cola.isEmpty()) {
            Node<Integer> actual = cola.poll();
            System.out.print(actual.getValue() + " ");
            if (actual.getLeft() != null) cola.add(actual.getLeft());
            if (actual.getRight() != null) cola.add(actual.getRight());
        }
    }
}

```

## 2. Arboles con objetos

**Fecha:** 17/06/2026

**Descripción:**
Aquí adapté la lógica de árboles para trabajar con objetos genéricos comparables, manteniendo la jerarquía.
Este enfoque es muy útil porque permite que el árbol organice cualquier tipo de dato de forma automática.

### Método implementado

```java
public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T value) {
        Node<T> node = new Node<>(value);
        root = insertRecursivo(root, node);
    }

    private Node<T> insertRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) return nodeInsertar;

        if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }
        return actual;
    }

    public void inOrder() {
        inOrderRecursivo(root);
    }

    private void inOrderRecursivo(Node<T> actual) {
        if (actual == null) return;
        inOrderRecursivo(actual.getLeft());
        System.out.print(actual + " ");
        inOrderRecursivo(actual.getRight());
    }
}

```

## 3. Ejercicio 1 (Impresión visual)

**Fecha:** 22/06/2026

**Descripción:**
Este método imprime el árbol en consola con una orientación horizontal para que sea más fácil de entender.
Utiliza recursividad para añadir los espacios necesarios según el nivel, mostrando claramente cómo se ramifica el árbol.

```java
public class Ejercicio1 {
    public void printTree(Node<Integer> root) {
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {
        if (actual == null) return;
        printTreeRecursivo(actual.getRight(), nivel + 1);
        for (int i = 0; i < nivel; i++) System.out.print("    ");
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }
}

```

## 4. Ejercicio 2 (Inversión)

**Fecha:** 22/06/2026

**Descripción:**
Esta clase invierte el árbol intercambiando las referencias de los hijos izquierdo y derecho en cada nodo.
Es un proceso recursivo sencillo que deja el árbol original completamente espejado al terminar.

```java
public class Ejercicio2 {
    public Node<Integer> invert(Node<Integer> root) {
        invertRecursivo(root);
        return root;
    }

    private void invertRecursivo(Node<Integer> root) {
        if (root == null) return;
        Node<Integer> temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);
        invertRecursivo(root.getLeft());
        invertRecursivo(root.getRight());
    }
}

```

## 5. Ejercicio 3 (Listar niveles)

**Fecha:** 23/06/2026

**Descripción:**
Desarrollé este método usando una cola para recorrer el árbol nivel por nivel, guardando los nodos en listas.
El resultado final es una estructura ordenada por profundidad que facilita la gestión de datos por capas.

```java
public class Ejercicio3 {
    public List<List<Node<Integer>>> listLevels(Node<Integer> root) {
        List<List<Node<Integer>>> resultado = new ArrayList<>();
        if (root == null) return resultado;
        Queue<Node<Integer>> cola = new LinkedList<>();
        cola.add(root);
        while (!cola.isEmpty()) {
            int cantidadNodos = cola.size();
            List<Node<Integer>> nivel = new ArrayList<>();
            for (int i = 0; i < cantidadNodos; i++) {
                Node<Integer> actual = cola.poll();
                nivel.add(actual);
                if (actual.getLeft() != null) cola.add(actual.getLeft());
                if (actual.getRight() != null) cola.add(actual.getRight());
            }
            resultado.add(nivel);
        }
        return resultado;
    }
}

```

## 6. Ejercicio 4 (Profundidad máxima)

**Fecha:** 23/06/2026

**Descripción:**
Este método calcula la altura total del árbol explorando recursivamente las ramas hasta encontrar la profundidad máxima.
Al final, suma uno al resultado mayor para incluir la raíz y así obtener la altura exacta del árbol.

```java
public class Ejercicio4 {
    public int maxDepth(Node<Integer> root) {
        return maxDepthRecursivo(root);
    }

    private int maxDepthRecursivo(Node<Integer> actual) {
        if (actual == null) return 0;
        int izquierda = maxDepthRecursivo(actual.getLeft());
        int derecha = maxDepthRecursivo(actual.getRight());
        return Math.max(izquierda, derecha) + 1;
    }
}

```