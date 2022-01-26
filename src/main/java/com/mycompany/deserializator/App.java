/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deserializator;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author maccasa
 */
public class App {
    public void whenJavaGotFromXmlFile_thenCorrect() throws IOException {
    File file = new File("classe.xml");
    XmlMapper xmlMapper = new XmlMapper();
    String xml = inputStreamToString(new FileInputStream(file));
    Classe value = xmlMapper.readValue(xml, SimpleBean.class);
    assertTrue(value.getX() == 1 && value.getY() == 2);
    value.stampa();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    }
    
}
