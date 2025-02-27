package main.java.com.VanessaNeves.desafio.services;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Desafio3 {
    public static void executar() {
        try {
            File arquivoXML = new File("src/main/java/com/VanessaNeves/desafio/services/faturamento.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(arquivoXML);
            document.getDocumentElement().normalize();

            NodeList listaDias = document.getElementsByTagName("dia");
            List<Double> valores = new ArrayList<>();

            for (int i = 0; i < listaDias.getLength(); i++) {
                Node node = listaDias.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    double valor = Double.parseDouble(element.getElementsByTagName("valor").item(0).getTextContent());
                    if (valor > 0) {
                        valores.add(valor);
                    }
                }
            }

            double menor = valores.stream().min(Double::compare).orElse(0.0);
            double maior = valores.stream().max(Double::compare).orElse(0.0);
            double media = valores.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            long acimaDaMedia = valores.stream().filter(v -> v > media).count();

            System.out.println("Menor faturamento: " + menor);
            System.out.println("Maior faturamento: " + maior);
            System.out.println("Dias com faturamento acima da média: " + acimaDaMedia);
        } catch (Exception e) {
            System.out.println("Erro ao processar o arquivo XML: " + e.getMessage());
        }
    }
    }

