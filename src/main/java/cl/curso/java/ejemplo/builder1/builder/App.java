package cl.curso.java.ejemplo.builder1.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Director dir = new Director();
       dir.setBuilderAuto( new BuilderAutoTesla());
       
       Auto auto = dir.construirAuto();
       
       System.out.println(  auto.getMarca() );
    }
}
