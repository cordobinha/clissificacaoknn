package br.edu.uniopet.clissificacaoknn;

import br.edu.uniopet.clissificacaoknn.Util.MapperIris;
import br.edu.uniopet.clissificacaoknn.model.Iris;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ClissificacaoKnnApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ClissificacaoKnnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("c:/iris.arff"));
        List<String> list = new ArrayList<>();
        while(br.ready()){
            String linha = br.readLine();
            list.add(linha);
        }
        br.close();
        List<Iris> irisList = new ArrayList<>();
        for (String s: list){
            Iris iris = new Iris();
            if (s.contains(",Iris-setosa") || s.contains(",Iris-versicolor") || s.contains(",Iris-virginica")){
                if (s.contains("@")){
                    s = null;
                } else {
                    irisList.add(iris = MapperIris.convertToIris(s));
                }
            }
        }


    }
}
