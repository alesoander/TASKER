/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoder;

/**
 *
 * @author Usuario
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class DECODER {
    
    
    public static void main (String []args){
        
        String InputDoc = "C:\\Users\\Usuario\\Desktop\\input.txt";
        String Output= decoderText(InputDoc);   
        System.out.print("Decoded Message: "+ Output);
    }
    
    public static String decoderText(String InputDoc ){
        Map<Integer, String> NumberConverter = new HashMap<>();
        
        try( BufferedReader BUFF= new BufferedReader(new FileReader(InputDoc))){
    
        String line;
        while (( line = BUFF.readLine()) != null) {
        
         String[] divideLine = line.split(" ");
                
            int num = Integer.parseInt(divideLine[0]);
            String word = divideLine[1];
            NumberConverter.put(num,word);
    }
    }catch (IOException e){
        e.printStackTrace();
    }
    
       StringBuilder  decoderText = new   StringBuilder();
       int ActualNum = 1;
       int count= 2; 
       
           while ( NumberConverter.containsKey(ActualNum)){
               decoderText.append(NumberConverter.get(ActualNum)).append(" ");
               ActualNum+= count;
               count ++;
           }     
              
           return decoderText.toString().trim();
    }}
    
