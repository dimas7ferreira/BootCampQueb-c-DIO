package ExemploMap;

import java.util.HashMap;
import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 14.3);
            put("mobi", 14.7);
            put("hb20", 14.9);
        }};
        System.out.println(carrosPopulares.toString());  

        System.out.println("Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);


        System.out.println("Confira se o modelo tucson está no dicionario" + carrosPopulares.containsKey("tucson"));
        
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        //System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println("Exiba os modelos");
        Set<String> modelos =  carrosPopulares.keySet();
        
        
        System.out.println("Exiba os consumo dos carros ");
        Collection<Double> consumos = carrosPopulares.values();
        
        //System.out.println("Exiba o modelo mais economico e seu consumo");
      //  Double consumoMaisEficiente = Collection.max(carrosPopulares.values());
        //Set<Map.Entry <String, Double>> enries = carrosPopulares.entrySet();
       // String modeloMaisEficiente = "";
      //  for(Map.Entry <String, Double> entry : enries){
      //      if(entry.getValue().equals(consumoMaisEficiente)) modeloMaisEficiente = entry.getKey();
      //  }
        

        System.out.println("Exiba o modelo menos economico e seu consumo");
        Double consumoMenosEFeciente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for(Map.Entry <String, Double> entry :carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEFeciente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("modelo menos eficiente" + modeloMenosEficiente + "- " +consumoMenosEFeciente);
            }
        }

        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma =  0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }


        System.out.println("Exiba a media dos consumos deste dicionario de carros" + (soma/carrosPopulares.size()));
        
        System.out.println("Remova os modelos com o consumo igual a 15,6km");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 14.3);
            put("mobi", 14.7);
            put("hb20", 14.9);
        }};
        

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1){{


        System.out.println("Apague o conjunto de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se a lista esta vazia:" + carrosPopulares.isEmpty());

    }   
};
    }
}
