package br.edu.uniopet.clissificacaoknn.Util;

import br.edu.uniopet.clissificacaoknn.model.Iris;

public class MapperIris {

    public static Iris convertToIris(String caracteristicas){
        Iris iris = new Iris();

        if (caracteristicas != null && caracteristicas.length() > 0){
            String[] sepallength = caracteristicas.split(",");
            System.out.println(sepallength);
            iris.setSepallength(Double.parseDouble(sepallength[0]));
            iris.setSepalwidth(Double.parseDouble(sepallength[1]));
            iris.setPetallength(Double.parseDouble(sepallength[2]));
            iris.setPetalwidth(Double.parseDouble(sepallength[3]));
            iris.setIrisType(sepallength[4]);
        }
        return iris;
    }
}
