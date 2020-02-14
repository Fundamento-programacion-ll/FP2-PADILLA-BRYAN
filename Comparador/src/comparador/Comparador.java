/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparador;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class Comparador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom, apell,gen,area,cargo,turno;
        int edad, ci;
        double sueldos;
        String op;
        
        Sueldos su1 = new Sueldos("ADMINISTRATIVO",1000);
        Sueldos su2 = new Sueldos("DOCENTES",500);
        Sueldos su3 = new Sueldos("LIMPIE",100);
        
        Persona p =  new Persona ();
        Administratvo ad = new Administratvo();
        Docente doc = new Docente();
        Limpieza lim = new Limpieza();
        
        
        
        for (int i = 0; i < 3; i++) {
            
     
        op = JOptionPane.showInputDialog("BIENVENIDO \n -----ELIGA UNA OPCION----- \n"+ "1. ADMINISTRATIVO \n"
                + "3.DOCENTE \n"
                + "2.LIMPIEZA \n");
        
        if (op.equalsIgnoreCase("ADMINISTRATIVO")){
            nom = JOptionPane.showInputDialog("Ingrese el nombre: ");
            apell = JOptionPane.showInputDialog("Ingrese el apellido: ");
            gen = JOptionPane.showInputDialog("Ingrese el genero: ");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
            ci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la CI.: "));
            area = JOptionPane.showInputDialog("Ingrese el area: ");
            
            ad.setNombre(nom);
            ad.setApellido(apell);
            ad.setGenero(gen);
            ad.setEdad(edad);
            ad.setCi(ci);    
            ad.setArea(area);
        }else if(op.equalsIgnoreCase("DOCENTE")){
            nom = JOptionPane.showInputDialog("Ingrese el nombre: ");
            apell = JOptionPane.showInputDialog("Ingrese el apellido: ");
            gen = JOptionPane.showInputDialog("Ingrese el genero: ");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
            ci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la CI.: "));
            area = JOptionPane.showInputDialog("Ingrese el area: ");
            cargo = JOptionPane.showInputDialog("Ingrese el cargo: ");
            
            doc.setNombre(nom);
            doc.setApellido(apell);
            doc.setGenero(gen);
            doc.setEdad(edad);
            doc.setCi(ci);
            doc.setArea2(area);
            doc.setCargo(cargo);
        }else if(op.equalsIgnoreCase("LIMPIEZA")){
            nom = JOptionPane.showInputDialog("Ingrese el nombre: ");
            apell = JOptionPane.showInputDialog("Ingrese el apellido: ");
            gen = JOptionPane.showInputDialog("Ingrese el genero: ");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
            ci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la CI.: "));
            turno = JOptionPane.showInputDialog("Ingrese el Turno: ");
            
            lim.setNombre(nom);
            lim.setApellido(apell);
            lim.setGenero(gen);
            lim.setEdad(edad);
            lim.setCi(ci);
            lim.setTurno(turno);
        }else{
            JOptionPane.showMessageDialog(null, "OPCION NO VALIDAD");
            JOptionPane.showMessageDialog(null, "NO SEA IMBECIL");
            
        }
        }
    
        System.out.println("ADMINISTRATIVO \n"+ad.toString());
        System.out.println("DOCENTE \n"+doc.toString());
        System.out.println("LIMPIEZA \n"+lim.toString());
        
        System.out.println(su1.toString());
        System.out.println(su2.toString());
        System.out.println(su3.toString());
        
        ArrayList <Sueldos> lista = new ArrayList();
        lista.add(su1);
        lista.add(su2);
        lista.add(su3);
        
        Collections.sort(lista, new menor_mayor());
		System.out.println("orden de sueldo de menor a mayor: "+lista);
    }

   
}


