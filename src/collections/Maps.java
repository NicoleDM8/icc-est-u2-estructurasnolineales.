package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.contacto;

public class Maps {
    
    public Map<String, Integer> construirHashMap(){
        //Instancia de Map tipo HashMap con clave String y valor Integer
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);       
        map.put("A", 50);
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.values().toArray());
        System.out.println(map.keySet().toArray());
        System.out.println(map.entrySet().toArray());
        
        for (int i = 0 ; i < map.size(); i++){
            //Valores Array Por Posicion
            System.out.println(map.values().toArray());
        }//50, 20, 30   

        for (String key : map.keySet()){
            //Valores Array Por Clave
            System.out.println(map.get(key));
        }// A, B, C

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            //Valores Array Por Clave y Valor
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }// A=50, B=20, C=30
        
        return map;
    }

        public LinkedHashMap<String, Integer> coLinkedHashMap(){
            //Instancia de Map tipo LinkedHashMap con clave String y valor Integer
            LinkedHashMap<String, Integer> lMap = new LinkedHashMap<>();
            lMap.put("A", 2);
            lMap.put("B", 3);
            lMap.put("A", 5);
            lMap.put("C", 50);
            lMap.put("D", 5);
            lMap.put("F", 3);
            lMap.put("G", 8);
            lMap.put("H", 85);
            lMap.put("I", 5);
            lMap.put("A", 10);
            lMap.put("B", 20);
            lMap.put("C", 30);       
            lMap.put("A", 50);
            System.out.println(lMap);
            System.out.println(lMap.entrySet());
            return lMap;
        }

        public Map<String, Integer> construirTreeMap(){
            //Instancia de Map tipo TreeMap con clave String y valor Integer
            Map<String, Integer> tMap = new HashMap<>();
            tMap.put("A", 2);
            tMap.put("B", 3);
            tMap.put("A", 5);
            tMap.put("C", 50);
            tMap.put("D", 5);
            tMap.put("F", 3);
            tMap.put("G", 8);
            tMap.put("H", 85);
            tMap.put("I", 5);
            tMap.put("A", 10);
            tMap.put("B", 20);
            tMap.put("C", 30);       
            tMap.put("A", 50);
            System.out.println(tMap);
            System.out.println(tMap.entrySet());
            return tMap;
        }
        public void eliminarDuplicadosandSort(List<contacto> contactos) {
            Set<contacto> tSet = new TreeSet<>(contactos);
            for (contacto contacto : contactos) {
                tSet.add(contacto);
            }
    }
}