package Presentacion;
import AccesoDatos.ListaCuentas;
import Entidades.Cuenta;
import Cliente.Cliente;
import Cliente.Direccion;
import java.io.*;
public class PruebaCuenta {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
       
       int n = 0,op;
       String clie, dni;
       double sal;
       long nro;
       char rsp;
       //Creacion de Objeto para acceder a los metodos de ArrayList
       ListaCuentas lista= new ListaCuentas();
       Cliente oCli= new Cliente();
       Direccion dir[]=new Direccion[50];
            
            do{ op=menu();
                    switch(op)
                    {case 1: 
                                oCli=Cliente(dir);
                             break;
                             
                     case 2: 
                                n=Leern();
                                RegistrandoDatos(n,lista,oCli);
                             
                             break;
                     case 3: if(n>0)
                                lista.Listar(n);
                             else 
                                System.out.println("\nPrimero Escoja La Opción [1] luego la opción [2]");
                             break;
                             
                     case 4: if(n>0)
                                depositar(n, lista);
                             else 
                                System.out.println("\nPrimero Escoja La Opción [1] luego la opción [2]");
                            break;
                            
                     case 5: if(n>0)
                                retirar(n, lista);
                             else 
                                System.out.println("\nPrimero Escoja La Opción [1] luego la opción [2]");
                            break;
                            
                     case 6: if(n>0)
                                transferencia(n, lista);
                             else 
                                System.out.println("\nPrimero Escoja La Opción [1] luego la opción [2]");
                             break;
                             
                     case 7: if(n>0)
                                n=agregar(n,lista,oCli);
                             else 
                                System.out.println("\nPrimero Escoja La Opción [1] luego la opción [2]");
                             break;
                             
                     case 8: if(n>0)
                                n=eliminar(n, lista);
                             else 
                                System.out.println("\nPrimero Escoja La Opción [1]");
                             break;        
                     
                     case 9: if(n>0){
                                rsp=consultar();
                                if (rsp=='N') 
                                    modificar_xNom(n, lista);
                                if (rsp=='C') 
                                    modificar_xNro(n, lista);
                         
                             }
                             else 
                                System.out.println("\nPrimero Escoja La Opción [1]");
                             break;
                             
                     case 10: Terminar();
                             break;

                    }

          
            }while (op!=10);
        
    }
    //  Leer el tamaño de la coleccion
    static int Leern()throws IOException {
        int n;
        do{System.out.println("Ingrese N cuentas a crear: ");
        n= Integer.parseInt(br.readLine());
        }while(n<=0);
        return n;
    }
    static int menu() throws IOException 
            {int opc;
                    do{System.out.print("\n\n       MENÚ          \n");
                     System.out.println("[1] Ingresar y Reportar dato del Cliente");
                     System.out.println("[2] Registrar datos");
                     System.out.println("[3] Reportar Cuentas");
                     System.out.println("[4] Depositar dinero");
                     System.out.println("[5] Retirar dinero");
                     System.out.println("[6] Transferir dinero ");
                     System.out.println("[7] Agregar nueva cuenta ");
                     System.out.println("[8] Eliminar cuenta ");
                     System.out.println("[9] Modificar datos del Cliente");
                     System.out.println("[10 ] Terminar ");
                     System.out.println("Escoger opción[1-11]:");
                            opc=Integer.parseInt(br.readLine());
                    } 
                    while(opc<1||opc>10);
                    return opc;
	}
    //Creando al cliente con sus respectivas direcciones
    static Cliente Cliente(Direccion dir[])throws IOException {
        String clie, dni,dire;
        int cant;
        char sex;
        System.out.println("\nCliente: ");
        clie=br.readLine();
        System.out.println("Dni: ");
        dni=br.readLine();
        System.out.println("Sexo: ");
        sex=br.readLine().toUpperCase().charAt(0);
        Cliente oCli = new Cliente(clie, dni, sex);
        
        System.out.println("\nCuantas Direcciones tiene el cliente?: ");
        cant=Integer.parseInt(br.readLine());
        for (int i = 0; i < cant; i++) {
           System.out.println("Direccion Nº "+(i+1)+": ");
           dire=br.readLine();
           dir[i]= new Direccion(dire);
           oCli.agregarDirec(dir[i]);
           
        }
        System.out.println("\nCliente{" + "Cliente=" + clie + ", Dni=" + dni + ", sexo=" + sex + '}');
        System.out.println("Direccion del cliente>");
        for (int i = 0; i < cant; i++) {
            System.out.println(dir[i]+"\n");
        }
        return oCli;
    }
    //Ingreso de datos para cuentas
    static void RegistrandoDatos(int n, ListaCuentas lista, Cliente cli)throws IOException {
       double sal;
        System.out.println("Ingresando saldo de las cuentas");
        for (int i = 0; i <n; i++) {

            System.out.println("Saldo: ");
            sal=Double.parseDouble(br.readLine());
            //Se agrega la cuenta a la coleccion y devuelve el nro
            long num = lista.agregarCta(cli,sal);
            System.out.println("Nro Cuenta creada " +num);
        }
    }
   
    
    // Agregando datos
    static int agregar(int n, ListaCuentas lista, Cliente cli)throws IOException {
        double sal;  
        
            System.out.println("Saldo: ");
            sal=Double.parseDouble(br.readLine());
            
            //Se agrega la cuenta a la coleccion y devuelve el nro
            long num = lista.agregarCta(cli,sal);
            System.out.println("Nro Cuenta creada " +num);
            n++;
        return n;
    }
    //  Depositar en una Cuenta
    static void depositar(int n, ListaCuentas lista)throws IOException {
        long nro;
        System.out.println("\nNro Cuenta a depositar: ");
         nro= Long.parseLong(br.readLine());
        
        Cuenta oC= lista.buscarCtaxNro(nro);
        if (oC==null) 
            System.out.println("Cuenta no existe");
        else{
            System.out.println("Monto a depositar: ");
            double mon = Double.parseDouble(br.readLine());
            boolean resp = oC.depositar(mon);
            if (resp==true) 
                System.out.println("Nuevo saldo ->" +oC.getSaldo());
            else 
                System.out.println("Operación no exitosa");
            
        }
    }
    
    
    //Retirar en una Cuenta
    static void retirar(int n, ListaCuentas lista)throws IOException {
        long nro;
        System.out.println("\nNro Cuenta a retirar: ");
        nro= Long.parseLong(br.readLine());
        
        Cuenta oCt= lista.buscarCtaxNro(nro);
        if (oCt==null) 
            System.out.println("Cuenta no existe");
        else{
            System.out.println("Monto a retirar: ");
            double mon = Double.parseDouble(br.readLine());
            boolean resp = oCt.retirar(mon);
            if (resp==true) 
                System.out.println("Nuevo saldo-> " +oCt.getSaldo());
            else 
                System.out.println("Operación no exitosa");
        }
    }
    
    //Realizar alguna transferencia
    static void transferencia(int n, ListaCuentas lista)throws IOException {
        
        System.out.println("\nNro Cuenta que va tranferir el dinero: ");
        long nro1= Long.parseLong(br.readLine());
        System.out.println("\nNro Cuenta que va recibir la tranferencia: ");
        long nro2= Long.parseLong(br.readLine());
        
        Cuenta oCta1= lista.buscarCtaxNro(nro1);
        Cuenta oCta2= lista.buscarCtaxNro(nro2);
        if (oCta1==null) 
            System.out.println("Cuenta va tranferir no existe");
        if (oCta2==null) 
            System.out.println("Cuenta que recibe la tranferencia no existe");
        else{
            System.out.println("Monto a transferir: ");
            double mon = Double.parseDouble(br.readLine());
            boolean resp = oCta1.transferir(oCta2, mon);
            if (resp==true){ 
                System.out.println("Nuevo saldo el que hizo la transferencia-> " +oCta1.getSaldo());
                System.out.println("Nuevo saldo el que recibio-> " +oCta2.getSaldo());
            }
            else 
                System.out.println("Operación no exitosa");
        }
    }
    
    //Eliminar una Cuenta
    static int eliminar(int n, ListaCuentas lista)throws IOException{
        long nro;
        System.out.println("\nNro Cuenta a Eliminar: ");
        nro= Long.parseLong(br.readLine());
        Cuenta oCe= lista.buscarCtaxNro(nro);
        if (oCe==null) 
            System.out.println("Cuenta no existe");
        else{
            boolean resp=lista.eliminarCta(oCe);
            n--;
            
            if (resp==true) 
                System.out.println("Cuenta Eliminada");
            else 
                System.out.println("Operación no exitosa");
        }
        return n;
    }
    //Modificar datos de una Cuenta. (Preguntando qué desea modificar)
    //Buscar por Nombre
    static void modificar_xNom(int n, ListaCuentas lista)throws IOException{
        int opc;
        char resp;      

                                System.out.print("\n\n---------MODIFICAR DATOS DEL CLIENTE----------\n");
                                System.out.print("\nNombre del cliente que desea modificar:");
                                String nomaux=br.readLine();
                                Cuenta oCm= lista.buscarCtaxCliente(nomaux);
                            
                            
                        if (oCm==null) 
                            System.out.println("Cuenta no existe");
			else{System.out.print("QUE DATO DESEA MODIFICAR ");
                            do{ opc=opciones();
                                          switch(opc)
                                          {case 1: System.out.print("Ingrese Nombre del cliente: ");
                                                   String nom=br.readLine();
                                                   oCm.setCliente(nom);
                                                   break;
                                           case 2: System.out.print("Ingrese DNI del cliente: ");
                                                   String Dni=br.readLine();
                                                   oCm.setDni(Dni);
                                                   break;
                                           case 3: System.out.print("Ingrese saldo del cliente: ");
                                                   double sald=Double.parseDouble(br.readLine());
                                                   oCm.setSaldo(sald);
                                                   break;
                                           case 4: FindeModificacion();       
                                          }


                            }while (opc!=4);
                        }
    }
    //Modificar datos de una Cuenta. (Preguntando qué desea modificar)
    //Buscar por numero de cuenta 
    static void modificar_xNro(int n, ListaCuentas lista)throws IOException{
        long nro;
        int opc;
        char resp;      

                                System.out.print("\n\n---------MODIFICAR DATOS DEL CLIENTE----------\n");
                                System.out.print("\nNombre del cliente que desea modificar:");
                                nro=Long.parseLong(br.readLine());
                                Cuenta oCm= lista.buscarCtaxNro(nro);
                            
                            
                        if (oCm==null) 
                            System.out.println("Cuenta no existe");
			else{System.out.print("QUE DATO DESEA MODIFICAR ");
                            do{ opc=opciones();
                                          switch(opc)
                                          {case 1: System.out.print("Ingrese Nombre del cliente: ");
                                                   String nom=br.readLine();
                                                   oCm.setCliente(nom);
                                                   break;
                                           case 2: System.out.print("Ingrese DNI del cliente: ");
                                                   String Dni=br.readLine();
                                                   oCm.setDni(Dni);
                                                   break;
                                           case 3: System.out.print("Ingrese saldo del cliente: ");
                                                   double sald=Double.parseDouble(br.readLine());
                                                   oCm.setSaldo(sald);
                                                   break;
                                           case 4: FindeModificacion();       
                                          }


                            }while (opc!=4);
                        }
    }
    // terminando de modificar
    static void FindeModificacion() throws IOException{
        System.out.println("\nFin de la modificacion.");
                }
    
    //consultar 
    static char consultar() throws IOException 
     {char res;

            do{System.out.println("Desea buscar por nombre o nro de cuenta(N/C)?");
                    res=br.readLine().toUpperCase().charAt(0);
            }
            while (res!='N'&&res!='C');
            return res;

     }
    // opciones de que dato desea modificar del cliente
    static int opciones() throws IOException 
            {int opc;
                    do{System.out.print("\n\n       ¿Que desea modificar?          \n");
                     System.out.println("[1] Modificar nombre del Cliente");
                     System.out.println("[2] Modificar DNI del Cliente");
                     System.out.println("[3] Modifdicar saldo del Cliente");
                     System.out.println("[4] Terminar ");
                     System.out.println("Escoger opción[1-4]:");
                            opc=Integer.parseInt(br.readLine());
                    } 
                    while(opc<1||opc>4);
                    return opc;
	}
    //Metodo Terminar indica el fin del programa 
    static void Terminar() throws IOException{
        System.out.println("\nFin del programa......Vuelva pronto");
    }
}
