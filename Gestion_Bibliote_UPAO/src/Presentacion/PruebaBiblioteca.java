/**
 *
 * @author Hugo Takashi Vásquez Miranda
 */
package Presentacion;
import Entidades.Autor;
import Entidades.Libro;
import AccesoDatos.Lista;

import java.io.*;
public class PruebaBiblioteca {
static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int opc,n=0; char rsp;
        Autor oA = new Autor();
        Lista oL = new Lista();
        
        
            do{
                opc=menu();
                switch(opc){
                case 1: n=LeerN();
                        RegistrarDatos(n,oL);
                        break;
                            
                case 2: if(n>0)
                            BuscarporCod(oL);
                        else 
                            System.out.println("\nPrimero Escoja La Opción 1");
                        break;
                
                case 3: if(n>0)
                            BuscarLibAutor(oL);
                        else
                            System.out.println("\nPrimero Escoja La Opción 1");

                        break;
                
                case 4: if(n>0)
                            ComprarLib(n,oL);
                        else 
                            System.out.println("\nPrimero Escoja La Opción 1");
                        break;
                
                case 5: if(n>0){
                            rsp=consultar("Desea buscar por indice o codigo del Libro(I/C)?",'I','C');
                            if (rsp=='I') 
                                modificar_xIndiceLib(n, oL);
                            if (rsp=='C') 
                                modificar_xCodLib(n, oL);
                         
                             }
                        else 
                            System.out.println("\nPrimero Escoja La Opción 1");
                
                             break;
                
                case 6: if(n>0)
                            n=EliminarLib(n, oL);
                        else 
                            System.out.println("\nPrimero Escoja La Opción 1");
                        break;
                
                case 7: if(n>0)
                            n=agregarLib(n,oL);
                        else 
                            System.out.println("\nPrimero Escoja La Opción 1");
                        break;
                
                case 8: if(n>0)
                            oL.ordenarPorAutor(oL);
                        rsp=consultar("Desea imprimir la lista de libros(S/N)?",'S','N');
                        if (rsp=='S') 
                            ListarLibro(n, oL);
                        else 
                            System.out.println("\nPrimero Escoja La Opción 1");
                        break;        
                
                case 9: if(n>0)
                            oL.ordenarPorTitulo(oL);
                        rsp=consultar("Desea imprimir la lista de libros(S/N)?",'S','N');
                        if (rsp=='S')
                            ListarLibro(n, oL);
                        else 
                            System.out.println("\nPrimero Escoja La Opción 1");
                        break;
                        
                case 10: if(n>0)
                            ListarLibro(n, oL);
                         else 
                            System.out.println("\nPrimero Escoja La Opción 1");
                        break;
                
                case 11: System.out.println("Fin del Programa..... Vuelva pronto");
                        break;
            }
            }while(opc != 11 );
    }
    static int LeerN()throws IOException{
        int n;
        do{
            System.out.println("Cuantos Libros desea crear");
            n=Integer.parseInt(br.readLine());
        }while(n<=0);
        return n;
    }
    static int menu()throws IOException{
        int op = 0;
        System.out.println("-----MENÚ DE OPCIONES-----");
          do{
              System.out.println("1.- IngresarLibros");
              System.out.println("2.- Buscar Libro por código");
              System.out.println("3.- Buscar Libros de un Autor");
              System.out.println("4.- Comprar Libros");
              System.out.println("5.- Modificar Libro");
              System.out.println("6.- Eliminar Libro");
              System.out.println("7.- Agregar Libros");
              System.out.println("8.- Ordenar por Autor");
              System.out.println("9.- Ordenar por Titulo del Libro");
              System.out.println("10.- Listar Libros");
              System.out.println("11.- Salir");
              System.out.println("Elija entre [1-11]");
              op=Integer.parseInt(br.readLine());
          }while(op < 1 || op > 11);
          
          return op;
    }
    
    static void RegistrarDatos(int n, Lista lis)throws IOException{
        
        for (int i = 0; i < n; i++) {
            Autor oA=autor();
            System.out.println("Codigo de Libro");
            String codi=br.readLine();
            System.out.println("Titulo del Libro");
            String tit=br.readLine();
            System.out.println("Categoria del Libro");
            String categ=br.readLine();
            System.out.println("Stock del Libro");
            int stock=Integer.parseInt(br.readLine());
            lis.agregarLibro(codi, tit, categ, stock,oA);
            System.out.println("Libro creado!!");
        }
    }

    static void ListarLibro(int n,  Lista lis)throws IOException{
        lis.Listar(n);
    }
    static Autor autor()throws IOException{
        System.out.println("Nombre del Autor");
        String nom=br.readLine();
        System.out.println("Pais del Autor");
        String pais=br.readLine();
        Autor oA= new Autor(nom, pais);
        return oA;
    }
    static void BuscarporCod( Lista lis)throws IOException{
        System.out.println("Codigo del Libro");
        String cod= br.readLine();
        Libro oLi=lis.BucarLibPorCodigo(cod);
        System.out.println(oLi.toString());
    }
    static void BuscarLibAutor( Lista lis)throws IOException{
        System.out.println("Nombre del autor que desea buscar");
        String name= br.readLine();
        String cad=lis.buscarLibAutor(name);
        System.out.println(cad);
    }
    static int EliminarLib(int n, Lista lis)throws IOException{
       
        System.out.println("Ingresar codigo del Libro que desea eliminar");
        String  cod= br.readLine();
        Libro oLi=lis.BucarLibPorCodigo(cod);
        if (oLi==null) 
            System.out.println("Cuenta no existe");
        else{
            boolean resp=lis.EliminarLibro(oLi);
            n--;
            
            if (resp==true) 
                System.out.println("Libro Eliminado");
            else 
                System.out.println("Operación no exitosa");
        }
        return n;
    }
    
    static int agregarLib(int n, Lista lis)throws IOException{
        Autor oA=autor();
            System.out.println("Codigo de Libro");
            String codi=br.readLine();
            System.out.println("Titulo del Libro");
            String tit=br.readLine();
            System.out.println("Categoria del Libro");
            String categ=br.readLine();
            System.out.println("Stock del Libro");
            int stock=Integer.parseInt(br.readLine());
            lis.agregarLibro(codi, tit, categ, stock,oA);
            System.out.println("Libro creado!!");

            n++;
        return n;
    }
    
    static void ComprarLib(int n, Lista lis)throws IOException{
        System.out.println("Ingrese codigo del libro que desea comprar");
        String cod=br.readLine();
        lis.comprarLibro(cod);
        Libro lib=lis.BucarLibPorCodigo(cod);
        System.out.println("Dato Actualizado...");
        lib.toString();
        
    }
    //Modificar datos de un Libro y autor. (Preguntando qué desea modificar)
    //Buscar por indice libro 
    static void modificar_xIndiceLib(int n, Lista lista)throws IOException{
        int opc;
        char resp;      

                                System.out.print("\n\n---------MODIFICAR DATOS DEL LIBRO----------\n");
                                System.out.print("\nIndice del Libro que desea modificar:");
                                int indaux=Integer.parseInt(br.readLine());
                                Libro oL= lista.buscarLibPorIndice(indaux);
                            
                            
                        if (oL==null) 
                            System.out.println("Libro no existe");
			else{System.out.print("QUE DATO DESEA MODIFICAR ");
                            do{ opc=opciones();
                                          switch(opc)
                                          {case 1: System.out.print("Ingrese Título del Libro: ");
                                                   String tit=br.readLine();
                                                   oL.setTitulo(tit);
                                                   System.out.println("Dato Actalizado....");
                                                   break;
                                          
                                           case 2: System.out.println("Ingrese Categoria del Libro");
                                                   String categ=br.readLine();
                                                   oL.setCategoria(categ);
                                                   System.out.println("Dato Actalizado....");
                                                   break;
                                           
                                           case 3: System.out.println("Ingrese Stock del Libro");
                                                   int stock=Integer.parseInt(br.readLine());
                                                   oL.setStock(stock);
                                                   System.out.println("Dato Actalizado....");
                                                   break;
                                                   
                                           case 4: char rsp=consultar("Desea modificar el nombre o el país del Autor(N/P)?",'N','P');
                                                   if(rsp=='N'){System.out.println("Ingrese Nombre del Autor");
                                                   String nom=br.readLine();
                                                   oL.getAut().setNombre(nom);
                                                   System.out.println("Dato Actalizado....");
                                                   }
                                                   if(rsp=='P'){System.out.println("Ingrese País del Autor");
                                                   String pais=br.readLine();
                                                   oL.getAut().setPais(pais);
                                                   System.out.println("Dato Actalizado....");
                                                   }
                                                   break;
                                                   
                                           case 5: System.out.println("\nFin de la modificacion.");
                                                   break;
                                          }


                            }while (opc!=5);
                        }
    }
    //Modificar datos de un Libro y autor. (Preguntando qué desea modificar)
    //Buscar por codigo libro 
    static void modificar_xCodLib(int n, Lista lista)throws IOException{
        long nro;
        int opc;
        char resp;      

                                System.out.print("\n\n---------MODIFICAR DATOS LIBRO----------\n");
                                System.out.print("\nCodigo del Libro que desea modificar:");
                                String codaux=br.readLine();
                                Libro oL= lista.BucarLibPorCodigo(codaux);
                            
                            
                        if (oL==null) 
                            System.out.println("Libro no existe");
			else{System.out.print("QUE DATO DESEA MODIFICAR ");
                            do{ opc=opciones();
                                          switch(opc)
                                          {case 1: System.out.print("Ingrese Título del Libro: ");
                                                   String tit=br.readLine();
                                                   oL.setTitulo(tit);
                                                   System.out.println("Dato Actalizado....");
                                                   break;
                                          
                                           case 2: System.out.println("Ingrese Categoria del Libro");
                                                   String categ=br.readLine();
                                                   oL.setCategoria(categ);
                                                   System.out.println("Dato Actalizado....");
                                                   break;
                                           
                                           case 3: System.out.println("Ingrese Stock del Libro");
                                                   int stock=Integer.parseInt(br.readLine());
                                                   oL.setStock(stock);
                                                   System.out.println("Dato Actalizado....");
                                                   break;
                                                   
                                           case 4: char rsp=consultar("Desea modificar el nombre o el país del Autor(N/P)?",'N','P');
                                                   if(rsp=='N'){System.out.println("Ingrese Nombre del Autor");
                                                   String nom=br.readLine();
                                                   oL.getAut().setNombre(nom);
                                                   System.out.println("Dato Actalizado....");
                                                   }
                                                   if(rsp=='P'){System.out.println("Ingrese País del Autor");
                                                   String pais=br.readLine();
                                                   oL.getAut().setPais(pais);
                                                   System.out.println("Dato Actalizado....");
                                                   }
                                                   break;
                                                   
                                           case 5: System.out.println("\nFin de la modificacion.");
                                                   break;       
                                          }


                            }while (opc!=5);
                        }
    }

    //consultar 
    static char consultar(String msj, char a, char b) throws IOException 
     {char res;

            do{System.out.println(msj);
                    res=br.readLine().toUpperCase().charAt(0);
            }
            while (res!=a && res!= b);
            return res;

     }
    // opciones de que dato desea modificar del cliente
    static int opciones() throws IOException 
            {int opc;
                    do{System.out.print("\n\n       ¿Que desea modificar?          \n");
                     System.out.println("[1] Titulo del Libro");
                     System.out.println("[2] Categoria del Libro");
                     System.out.println("[3] Stock del Libro");
                     System.out.println("[4] Autor del Libro ");
                     System.out.println("[5] Terminar ");
                     System.out.println("Escoger opción[1-5]:");
                            opc=Integer.parseInt(br.readLine());
                    } 
                    while(opc<1||opc>5);
                    return opc;
	}
    
   
    
    //Metodo ordenar por Titulo
    static int ordenarTitulo() throws IOException 
            {int opc;
                    do{System.out.print("\n\n       ¿Que desea modificar?          \n");
                     System.out.println("[1] Titulo del Libro");
                     System.out.println("[2] Categoria del Libro");
                     System.out.println("[3] Stock del Libro");
                     System.out.println("[4] Autor del Libro ");
                     System.out.println("[5] Terminar ");
                     System.out.println("Escoger opción[1-5]:");
                            opc=Integer.parseInt(br.readLine());
                    } 
                    while(opc<1||opc>5);
                    return opc;
	}
}
