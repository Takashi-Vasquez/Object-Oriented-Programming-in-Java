
package Reporte_Fechas;
import java.io.*;
import java.util.Calendar;
public class PruebaFecha {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
       
        int a=0,i=0,ad,am,aa,Nm,d1,m1,a1,c,d2,m2,a2,cntIngreD;
        int cntd=0, cntm=0,cnta=0,Sd,Sm,Sa,valid,valim,valia,nroD;
//      a. Crear 2 fechas. Validar fechas haciendo uso del método de la Clase Fecha)
       
        do{
        if(i==0){
        System.out.println("\nINGRESANDO DATOS FECHA 1 "); 
        
        System.out.print("\nDía: ");
        d1=Integer.parseInt(br.readLine());
        
        System.out.print("\nMes: ");
        m1=Integer.parseInt(br.readLine());
        
        System.out.print("\nAño: ");
        a1=Integer.parseInt(br.readLine());
        
        Fecha fecha = new Fecha(d1,m1,a1);
                
        c=fecha.validarFecha();
        }else{System.out.println("\nDATO INCORRECTO INGRESE NUEVANTE\n"); 
        
        System.out.println("\nINGRESANDO DATOS FECHA 1 "); 
        
        System.out.print("\nDía: ");
        d1=Integer.parseInt(br.readLine());
        
        System.out.print("\nMes: ");
        m1=Integer.parseInt(br.readLine());
        
        System.out.print("\nAño: ");
        a1=Integer.parseInt(br.readLine());
        
        Fecha fecha = new Fecha(d1,m1,a1);
                
        c=fecha.validarFecha();
            
        }
        }while(c!=0);
        
       Fecha fecha1 = new Fecha();
       fecha1.setDia(d1);
       fecha1.setMes(m1);
       fecha1.setAño(a1);
   
        
        
        do{
        if(a==0){
        System.out.println("\nINGRESANDO DATOS FECHA 2 ");
        
        System.out.print("\nDía: ");
        d2=Integer.parseInt(br.readLine());
        
        System.out.print("\nMes: ");
        m2=Integer.parseInt(br.readLine());
        
        System.out.print("\nAño: ");
        a2=Integer.parseInt(br.readLine());
        
        Fecha fecha = new Fecha(d2,m2,a2);
                
        c=fecha.validarFecha();
        }else{System.out.println("\nDATO INCORRECTO INGRESE NUEVANTE"); 
        
        System.out.println("\nINGRESANDO DATOS FECHA 2 "); 
        
        System.out.print("\nDía: ");
        d2=Integer.parseInt(br.readLine());
        
        System.out.print("\nMes: ");
        m2=Integer.parseInt(br.readLine());
        
        System.out.print("\nAño: ");
        a2=Integer.parseInt(br.readLine());
        
        Fecha fecha = new Fecha(d2,m2,a2);
                
        c=fecha.validarFecha();
            
        }
        }while(c!=0);
        
       Fecha fecha2 = new Fecha();
       fecha2.setDia(d2);
       fecha2.setMes(m2);
       fecha2.setAño(a2);
       
       
//      b. Mostrar las fechas creadas.
        System.out.println("\nREPORTTE DE LAS FECHAS:");
        System.out.println("\nFECHA 1: "+fecha1.toString());
      
        System.out.println("\nFECHA 2: "+fecha2.toString());
       
//      c. Mostrar si alguna de las fechas creadas, es un año bisiesto o no.
        System.out.println("\nVALIDANDO SI ES AÑO BISIESTO:");
        fecha1.AñoBisiesto();
        fecha2.AñoBisiesto();
        
        
//      d. Modificar sólo el mes de la 1era fecha y mostrar en pantalla.
        System.out.println("\nModificando el mes del fecha 1");
        System.out.println("\nLa Fecha es: "+fecha1.toString());
        
        int cc=0;
        do{if(cc==0){System.out.print("\nMes: ");
        Nm=Integer.parseInt(br.readLine());
        }else{
        System.out.print("\nEl mes que Usd. a ingresado no es válido, ingrese de 1 a 12 meses");
        System.out.print("\nMes: ");
        Nm=Integer.parseInt(br.readLine());
        }
        cc++;
        }while(Nm<1 ^ Nm>12);
        fecha1.setMes(Nm);
        System.out.println("\nREPORTTE");
        System.out.println("\nLA FECHA MODIFICADA ES: "+fecha1.toString());
        
        
        
        
//      e. Adelantar la 2da fecha y mostrar en pantalla.
        System.out.println("\nADELANTAR LA 2DA FECHA");
        System.out.println("\nLa Fecha es: "+fecha2.toString());
        
        nroD=fecha2.nroDias(m2);
        valid=fecha2.getDia();
        cntIngreD=nroD-valid;
        do{if(cntd==0){System.out.print("\nCuantos días desea adelantar: ");
        ad=Integer.parseInt(br.readLine());
        }else{
        System.out.println("\nNo es valido, usd puede adelantar hasta: "+cntIngreD+" días");
        System.out.print("\nCuantos días desea adelantar: ");
        ad=Integer.parseInt(br.readLine());
        }
        cntd++;
        }while(ad>cntIngreD);
        
        
        
        valim=fecha2.getMes();
        cntIngreD=12-valim;
        do{if(cntm==0){System.out.print("\nCuantos meses desea adelantar: ");
        am=Integer.parseInt(br.readLine());
        }else{
        System.out.println("\nNo es valido, usd puede adelantar hasta: "+cntIngreD+" mes/es");
        System.out.print("\nCuantos meses desea adelantar: ");
        am=Integer.parseInt(br.readLine());   
        }
        cntm++;
        }while(am>cntIngreD);
        
        
        
        do{System.out.print("\nCuantos años desea adelantar: ");
        aa=Integer.parseInt(br.readLine());
        }while(aa<1^aa>1000); //Se puede adelantar hasta 1000 años para adelante(es opcional). 
        
        Sd=ad+d2;
        Sm=am+m2;
        Sa=aa+a2;
        
        System.out.println("\n\tREPORTTE");
        fecha2.adelantarFecha(Sd,Sm,Sa);
        System.out.println("\nLA FECHA ADELANTADA ES: "+fecha2.toString());
        
        
//        f. Reiniciar la 2da fecha a la fecha actual y mostrar en pantalla.
        Calendar cal=Calendar.getInstance();
       
        fecha2.reiniciarFecha(cal.get(Calendar.DATE),(cal.get(Calendar.MONTH)+1),cal.get(Calendar.YEAR));
        System.out.println("\nLA FECHA REINICIADA: "+fecha2.toString());
        
        
    }
    
}
