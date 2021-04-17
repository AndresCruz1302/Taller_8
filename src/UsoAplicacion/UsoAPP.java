
package UsoAplicacion;

import taller_8.Controlador;
import taller_8.Modelo;
import taller_8.Vista;

public class UsoAPP {
        public static void main(String[] args) {
           Vista vista=new Vista();
           Modelo modelo=new Modelo();
          Controlador controlador=new Controlador(modelo,vista);
          controlador.ver();
    }
}
