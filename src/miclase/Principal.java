package miclase;


public class Principal {

    public static void main(String[] args) {
      String nombre = "Luis";
      int edad = 23;
      double estatura = 1.72;
      char sexo = 'H';
      boolean casado = false;
      
      System.out.println("Nombre    :" + nombre);
      System.out.println("Edad      :" + edad);
      System.out.println("Estatura  :" + estatura);
      System.out.println("Sexo      :" + sexo);
      System.out.println("Casado    :" + casado);
      
      
      Persona Miguel = new Persona ("Miguel", 45, 1.72, 'H',true);
      
      System.out.println("Nombre    :" + Miguel.nombre);
      System.out.println("Edad       :" + Miguel.edad);
      System.out.println("Estatura   :" + Miguel.estatura);
      System.out.println("Sexo       :" + Miguel.sexo);
      System.out.println("Casado     :" + Miguel.casado);
      
      Persona Natali = new Persona ("Natali", 25, 1.70, 'M',false);
      Natali.miToString();
      System.out.println(Natali);
      Persona x = Natali;
      
      Natali.cabecera();
      Natali.cuerpo();
      Miguel.cuerpo ();
      
              
      
    }
    
}
