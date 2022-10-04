/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alexm
 */
import java.util.*;

public class Uso_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Empleado empleado1=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        
        Empleado empleado2=new Empleado("Ana López", 95000, 1995, 06, 02);
        
        Empleado empleado3=new Empleado("María Martín", 105000, 2002, 03, 15);
        
        empleado1.subeSueldo(5);
        
        empleado2.subeSueldo(5);
        
        empleado3.subeSueldo(5);
        
        System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
                + " Fecha de Alta: " + empleado1.dameFechaContrato());
        
        System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
                + " Fecha de Alta: " + empleado2.dameFechaContrato());
        
        System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
                + " Fecha de Alta: " + empleado3.dameFechaContrato()); */
        
        Empleado[] misEmpleados=new Empleado[3];
        
        misEmpleados[0]=new Empleado("Paco Gomez",85000,1990,12,17);
        misEmpleados[1]=new Empleado("Ana Lopez",95000,1995,06,02);
        misEmpleados[2]=new Empleado("Maria Martin",105000,2002,03,15);
        
        for(Empleado e: misEmpleados){
            
            e.subeSueldo(5);
        }
        
        for(int i=0;i<3;i++){
            
            System.out.println("Nombre: " + misEmpleados[i].dameNombre()
                + "Sueldo: " + misEmpleados[i].dameSueldo()
                + "Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
        }
        
    }
    
}

class Empleado{
    
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        
        nombre=nom;
        
        sueldo=sue;
        
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        
        altaContrato=calendario.getTime();
        
    }
    
    public String dameNombre(){   //getter
        
        return nombre;
    }
    
    public double dameSueldo(){  //getter
        
        return sueldo;
    }
    
    public Date dameFechaContrato(){
        
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje){
        
        double aumento=sueldo*porcentaje/100;
        
        sueldo+=aumento;
    }
    
    private String nombre;
    
    private double sueldo;
    
    private Date altaContrato;
    
}
