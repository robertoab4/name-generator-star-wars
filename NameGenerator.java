/**
 * Crea un nombre "de Star Wars" utilizando las cuatro primeras letras de tu apellido,
 * las tres primeras de tu nombre, las dos primeras letras del apellido de tu madre 
 * y las cinco primeras letras de la ciudad donde naciste
 *
 * 
 * @author (Roberto Alarcon Bardon) 
 * @version (22-02-2021)
 */
public class NameGenerator
{
   public final static int PRIMERA_LETRA_APELLIDO_REAL = 0;
   //public final static int SEGUNDA_LETRA_APELLIDO_REAL = 1;
   //public final static int TERCERA_LETRA_APELLIDO_REAL = 1+1;
   //public final static int CUARTA_LETRA_APELLIDO_REAL = 1+1+1;
   public final static int QUINTA_LETRA_APELLIDO_REAL = 1+1+1+1;
   public final static int PRIMERA_LETRA_NOMBRE_REAL = 0;
   //public final static int SEGUNDA_LETRA_NOMBRE_REAL = 1;
   //public final static int TERCERA_LETRA_NOMBRE_REAL = 1+1;
   public final static int CUARTA_LETRA_NOMBRE_REAL = 1+1+1;
   public final static int PRIMERA_LETRA_APELLIDO_MADRE = 0;
   //public final static int SEGUNDA_LETRA_APELLIDO_MADRE = 1;
   public final static int TERCERA_LETRA_APELLIDO_MADRE = 1+1;
   public final static int PRIMERA_LETRA_CIUDAD_NACIMIENTO = 0;
   //public final static int SEGUNDA_LETRA_CIUDAD_NACIMIENTO = 1;
   //public final static int TERCERA_LETRA_CIUDAD_NACIMIENTO = 1+1;
   //public final static int CUARTA_LETRA_CIUDAD_NACIMIENTO = 1+1+1;
   //public final static int QUINTA_LETRA_CIUDAD_NACIMIENTO = 1+1+1+1;
   public final static int SEXTA_LETRA_CIUDAD_NACIMIENTO = 1+1+1+1+1;
      
   public NameGenerator(){
       /*
       nombreReal = "";
       apellidoReal = "";
       apellidoMadre = "";
       ciudadDeNacimiento = "";
       */
   }
   
   public void generateStarWarsName(String nombreReal, String apellidoReal, String apellidoDeTuMadre, String ciudadDeNacimiento){
       String nombreStarWars = apellidoReal.substring(PRIMERA_LETRA_APELLIDO_REAL, QUINTA_LETRA_APELLIDO_REAL) + nombreReal.substring(PRIMERA_LETRA_NOMBRE_REAL, CUARTA_LETRA_NOMBRE_REAL);
       String apellidoStarWars;
       if (ciudadDeNacimiento.length() < 5){
           apellidoStarWars = apellidoDeTuMadre.substring(PRIMERA_LETRA_APELLIDO_MADRE,TERCERA_LETRA_APELLIDO_MADRE) + ciudadDeNacimiento;
       }
       else{
           apellidoStarWars = apellidoDeTuMadre.substring(PRIMERA_LETRA_APELLIDO_MADRE,TERCERA_LETRA_APELLIDO_MADRE) + ciudadDeNacimiento.substring(PRIMERA_LETRA_CIUDAD_NACIMIENTO, SEXTA_LETRA_CIUDAD_NACIMIENTO);
       }
       System.out.println(nombreStarWars +" "+ apellidoStarWars);
   }
}
