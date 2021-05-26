
package Banco;

import java.io.*;

public class PruebaBanco {
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
      long nroC; String Clave; double dep,ret,saldo,porcInte,costMant; char tipS;  
     
//Creando Cuenta Ahorro
     nroC=nroCuenta("Ahorro");
     Clave=clave("Ahorro");
     saldo=saldo("Ahorro");
     tipS=tipM("Ahorro");
     porcInte=porcYcostMant( "Ahorro","el porcentaje del impuesto");
     Ahorro Ahorro1 = new Ahorro(nroC, Clave, saldo,tipS, porcInte);
     System.out.println("\n\t¡CUENTA DE AHORRO CREADO CON EXITO!");

//Creando Cuenta Corriente
     nroC=nroCuenta("Corriente");
     Clave=clave("Corriente");
     saldo=saldo("Corriente");
     tipS=tipM("Corriente");
     porcInte=porcYcostMant("Corriente","el Costo de Mantenimiento");
     Corriente Corriente1 = new Corriente(nroC, Clave, saldo, tipS, porcInte);
     System.out.println("\n\t¡CUENTA DE CORRIENTE CREADO CON EXITO!");
    System.out.println("\n\t\tREPORTE\n"+"\""+"Banco BCP"+"\""+"   \n");
     
//        Imprimiendo Cuentas

    System.out.println(Ahorro1.Cuenta("Ahorro"));
    System.out.println(Corriente1.Cuenta("Corriente")+"\n");
    
    //Depositar y retirar (Ahorro)
    dep=depositar("Ahorro");
    Ahorro1.depositar(dep);
    ret=retirar("Ahorro");
    Ahorro1.retirar(ret);
    System.out.println(Ahorro1.Cuenta("Ahorro"));
    System.out.println(Ahorro1.toString()+"\n");
    
    //Depositar y retirar (Corriente)
    dep=depositar("Corriente");
    Corriente1.depositar(dep);
    ret=retirar("Corriente");
    Corriente1.retirar(ret);
    System.out.println(Corriente1.Cuenta("Corriente"));
    System.out.println(Corriente1.toString());
    
    }
    
   static long nroCuenta(String msj)throws IOException{
       long n;
       System.out.println("\nIngrese su numero de la cuenta "+msj);
       n=Long.parseLong(br.readLine());
      return n;
   }
   static String clave(String msj)throws IOException{
       String clave;
       System.out.println("Ingrese su clave de la cuenta "+msj);
       clave=br.readLine();
      
       return clave;
   }
   
   static double saldo(String msj)throws IOException{
       double saldo;
       do{System.out.println("Ingrese su saldo de la cuenta "+msj);
       saldo=Double.parseDouble( br.readLine());
       }while(saldo<0);
       return saldo;
   }
   
   static char tipM(String msj)throws IOException{
       char tip;
       do{System.out.println("Ingrese su tipo de moneda de la cuenta "+msj);
       tip=br.readLine().toUpperCase().charAt(0);
       }while(tip=='S' && tip=='E'&& tip=='D');
       return tip;
   }
   static double porcYcostMant(String cta, String msj)throws IOException{
       double porc;
       System.out.println("Ingrese "+msj+" de la cuenta "+cta);
       porc=Double.parseDouble( br.readLine());
       
       
       return porc;
   }
   static double depositar(String msj)throws IOException{
       double monto;
       System.out.println("Ingrese su monto que desea depositar de la cuenta "+msj);
       monto=Double.parseDouble( br.readLine());
      
       return monto;
   }
   static double retirar(String msj)throws IOException{
       double monto;
       System.out.println("Ingrese su monto que desea retirar de la cuenta "+msj);
       monto=Double.parseDouble( br.readLine());
       
       return monto;
   }
}
