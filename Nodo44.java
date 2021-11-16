
package nodo4.pkg4;

import java.util.Scanner;
import java.util.Random;

public class Nodo44 {
    
 Scanner sc= new Scanner (System.in); 
    
    static class Nodo { //Plantilla nodo
    String Name; //se define name como string
    Nodo next; //Se define next como el nodo (enlace)
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in); 
        int opc;
        Nodo44 n= new Nodo44 ();
        do{ //se abre un do while para nuestro menu
           
System.out.println ("\n Menu de opciones :"+ "\n 1-Agregar nodo "+"\n 2-Eliminar nodos"+"\n 3-Mostrar lista"+"\n 4-Generar palabra" +"\n 5-Buscar "+"\n 6-Salir ");  //menu de opciones
//Menu de opciones
            
            switch (opc = sc.nextInt()){ //Se abre un switch para evaluar lo que elija el usuario de a cuerdo al menu
                
                case 1:  //caso uno Agregar
                    n.Agregar ();  //se manda a traer el metodo agregar de la case Nodo22
                    break; //cierra caso uno
                    
                    
                case 2: //caso dos Eliminar
                    n.Eliminar (); //se manda a traer el metodo eliminar de la clase Nodo22
                    break; //cierra caso dos 
                    
                    
                 case 3: //caso tres Mostrar
                    n.Mostrar (); //se manda a traer el metodo mostrar de la clase Nodo22
                    break; //cierra caso tres  
                    
                 case 4:
                     n.Generar ();
                    break;
                 case 5:
                     n.Buscar ();
                    break;
            }  
        } while (opc != 6);   // se ejecutara la opcion de mennu mientras opc sea diferente de 4
    } Nodo inicial=null; //se declara el nodo inicial que tendra los atributos de nodo: (name)--->dato & (next)--> enlace
    
    
    //METODO PEDIR AL USUARIO AGREGAR UN NODO
    public void Agregar (){ //Se crea el metodo Agregar 
        if (inicial== null) { //Se abre un condicional para saber si hay datos en la lista
            inicial = new Nodo (); //si inicial es nulo entonces
            System.out.println ("Ingrese: "); // se le pide al usuario que ingrese un dato en el nodo
            inicial.Name = sc.nextLine(); //se almacena en el nodo inicial Nombre ya que en Nombre van los datos
        } else {  Nodo post = new Nodo (); //si no se cumple la condicion entonces se almacenara en otro nodo
                  System.out.println ("Ingrese: "); //se pedira al usuario que ingrese un dato en el nodo
                  post.Name = sc.nextLine(); //se almacena en inicial Nombre ya que en Nombre van los datos
                  post.next= inicial; //el nodo nuevo sera igual a inicial 
                  inicial=post; //Entonces post sera ahora Inicial
            }
    }
     
     
    //METODO MOSTRAR LISTA
    public void Mostrar(){ //se crea el metodo Mostrar
        Nodo post = new Nodo (); post=inicial; //En este metodo nodo post ahora sera igual a un nuevo nodo
        if(inicial!= null){ //Si temporal es diferente de null entonces hay datos
        while(post != null){ //Y dado a que post es igual inicial, mientras sea diferente de nulo
            System.out.print(post.Name + "\n"); //se mostrara el dato
            post = post.next; //Por lo que el nodo post señalara al enlace del post siguiente --->
        }
        } else{ System.out.println ("La lista esta vacia");} //Si no, entonces mandara el mensaje 
    }
    
    
     //METODO ELIMINAR NODOS
     public void Eliminar(){ //se crea el metodo Eliminar 
        if(inicial == null){ //Si inicial es igual  a nulo quiere decir que no hay datos en la lista
            System.out.println ("No hay nodos que eliminar"); //mandara mensaje
        } else{ System.out.print("\n Nodo eliminado"); //Si inicial es diferente de nulo quiere decir que si hay datos en la lista y mandara mensaje de que un elemento se ha eliminado
            inicial = inicial.next;} //entonces el que antes era inicial ahora ya no lo sera, si no que lo sera el que le seguia
    }   
    
  //METODO GENERAR PALABRA
     public void Generar(){ //se crea el metodo generar
         char L1,L2,L3,L4,L5;//se declaran las variables designadas para cada letra de la palabra(5)
         Random r= new Random (); 
         L1 = (char)(r.nextInt(26)+'A');//la primera letra de la palabra debe ser un valor del ABC random
         L2 = (char)(r.nextInt(74)+48);//L2 debe ser una letra alfanumerica por lo que se define desde 48 que es donde inician los numero en ascii
         //y va a avanzar hacia adelante hasta que llegue a abc minuscula
         L3 = (char)(r.nextInt(74)+48); //ocurre lo mismo que en L2
         L4 = (char)(r.nextInt(74)+48);//ocurre lo mismo que en L2
         L5 = (char)(r.nextInt(14)+33);//la ultima letra debe ser un caracter por lo que la variable L5 va
         //a estar definida desde el 33 en codigo ascii y va a avanzar 14 lugares random en caracteres 
         
         if (inicial== null) {// si inicial es igual a nulo quiere decir que no hay datos  
            inicial = new Nodo ();//entonces inicial va a hacer igual a nuevo nodo 
            inicial.Name = (""+L1+L2+L3+L4+L5+"");//por lo que name de inicial va a ser igual a la suma de 
            //las letras definidas anteriormente, conformando una palabra random
        } else {  Nodo post = new Nodo ();//si no, quiere decir que si hay datos por lo que nodo post
        //sera igual a un nuevo nodo 
                  post.Name = (""+L1+L2+L3+L4+L5+""); //por lo que name de post va a ser igual a la suma de 
            //las letras definidas anteriormente, conformando una palabra random
                  post.next= inicial; //el enlace de post(next) dara a siguiente
                  inicial=post;//post sera el nuevo nodo inicial 
            }
     } //cierra generar palabra 
    
    
   //METODO BUSCAR PALABRA
   public void Buscar (){
        int cont=0; //se declara cont=0 yya que este sera nuestro contador en posiciones
        Nodo post= new Nodo(); //Nodo post sera igual a nuevo nodo
        Boolean Encontrado= false ; //Boolean nos servira para saber si es cierto o falso el valor
        String valor; // Se declara valo como string, aquí se almacenara el nodo a buscar 
        
        if (inicial != null ){ //Si inicial es diferente de nulo quiere deci que hay datos entonces:
            
        System.out.println("Ingrese el nodo a buscar"); //Se mandara un mensaje pidiendo que ingrese el nodol a buscar
        valor = sc.nextLine(); // el dato se almacenara en valor 
        post = inicial; //post sera igual a inicial 
        
            if(post != null && Encontrado != false  ){  // Si post es diferente de nulo y encontrado de falso entonces:
                cont ++;
                if( post.Name == valor ) { //Si post Name (que es donde se encuentra el dato) es igual al valor ingresado por el usuario
                    Encontrado= true; //Entonces encontrado va a ser igual a true
                    System.out.println ("Valor encontrado en la posicion"+ cont); //se mandara a imprimir un mensaje diciendo que se ha 
                    //encontrado el valor en la posicion x
                } else { //Si no entonces 
                     inicial.next= post.next;  //el nodo inicial se pasara al siguiente nodo post 
                     cont ++; //e ira sumando los lugares 
                }
            } else {
                System.out.println ("Nodo no encontrado"); //Si no se encuentra nada entonces 
                //se manda a decir que el nodo no ha sido encontrado
            }   
        } else { //Si no
            System.out.println("Lista vacia"); //Si no hay datos se mandara mensaje de que la lista esta via 
        }
    }     
} //JESSICA VIRIDIANA GARCIA SILVA 
