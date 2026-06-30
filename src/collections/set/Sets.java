package collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import models.contacto;

public class Sets {
    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;
    }
    public Set<String> construLinkedHashSet() {
        Set<String> linkedHashSet = new java.util.LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("F");
        linkedHashSet.add("1Ggggggeegeg");
        linkedHashSet.add("2G2gggggeegeg");
        linkedHashSet.add("3Gggggeegeg");
        linkedHashSet.add("4Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("6Ggggggeegeg");
        linkedHashSet.add("G7gggggeegeg");
        return linkedHashSet;
    }
    public Set<String> construirTreeSet() { 
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("1Ggggggeegeg");
        treeSet.add("2G2gggggeegeg");
        treeSet.add("3Gggggeegeg");
        treeSet.add("4Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("5Ggggggeegegg");
        treeSet.add("6Ggggggeegeg");
        treeSet.add("G7gggggeegeg");
        return treeSet;
    }
    public Set<contacto> construirTreeSetConComparador(
    ) { 
        Set<contacto> treeSet = new TreeSet<>();
         //return c1.getNombre().compareTo(c2.getNombre());
        treeSet.add(new contacto("Juan", "Perez", "123456789"));
        treeSet.add(new contacto("Ana", "Gomez", "987654321"));
        treeSet.add(new contacto("Pedro", "Lopez", "456789123"));
        treeSet.add(new contacto("Maria", "Rodriguez", "789123456"));
        treeSet.add(new contacto("Juan", "Perez", "123456789")); // Duplicado no se agregará al TreeSet debido al comparador
        treeSet.add(new contacto("Juan", "Lopez", "123456789")); // Duplicado en el nombre
        return treeSet;
        //Inrden
    }
    public Set<contacto> construirHashSetContacto() { 
        
        Set<contacto> hashSet = new HashSet<>();
        contacto c1 = new contacto("Juan", "Perez", "123456789");
        hashSet.add(c1);
        contacto c2 = new contacto("Ana", "Gomez", "987654321");
        hashSet.add(c2);
        contacto c3 = new contacto("Pedro", "Lopez", "456789123");
        hashSet.add(c3);
        contacto c4 = new contacto("Maria", "Rodriguez", "789123456");
        hashSet.add(c4);
        contacto c5 = new contacto("Juan", "Perez", "123456789");
        hashSet.add(c5);
        contacto c6 = new contacto("Juan", "Lopez", "123456789");
        hashSet.add(c6);
        return hashSet;
       
    }

}