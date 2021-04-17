
package taller_8;

import com.sun.jmx.snmp.BerDecoder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;

public class Controlador implements ItemListener, ActionListener{
    private Modelo modelo;
    private Vista vista;
    private int  precio;
    private double prueba;
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.busqueda.addItemListener(this);
        this.vista.combo.addItemListener(this);
        this.vista.fecha.addItemListener(this);
        this.vista.nombre.addItemListener(this);
        this.vista.opciones.addItemListener(this);
        this.vista.vehiculo.addItemListener(this);
        this.vista.funcionarioComb.addItemListener(this);
        this.vista.precios.addActionListener(this);
        this.vista.uso.addActionListener(this);
        this.vista.introducir.addActionListener(this);
    }
    public void ver(){
        vista.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        
        if(vista.vehiculo==ie.getSource()){
            if(vista.vehiculo.getSelectedItem().equalsIgnoreCase("automovil")){
                vista.busqueda.setVisible(true);
                vista.busqueda1.setVisible(true);
                vista.busqueda.select(0);
                vista.nombre.setVisible(false);
               vista.opciones.setVisible(false);
               vista.fecha.setVisible(false);
               vista.informacion.setText(null);
               vista.Produccion.setText(null);
               vista.funcionarioComb.setVisible(false);
               vista.Costo.setText(null);
               vista.introducir.setVisible(false);
               vista.periodo.setVisible(false);
               vista.periodo1.setVisible(false);
               vista.combo.setVisible(false);
               vista.opciones.select(0);
               vista.nombre.select(0);
               vista.combo.select(0);
               vista.funcionarioComb.select(0);
               vista.fecha.select(0);
            }
             if(vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
                vista.busqueda.setVisible(true);
                vista.busqueda1.setVisible(true);
                vista.busqueda.select(0);
                vista.nombre.setVisible(false);
               vista.opciones.setVisible(false);
               vista.fecha.setVisible(false);
               vista.informacion.setText(null);
               vista.Produccion.setText(null);
               vista.funcionarioComb.setVisible(false);
               vista.Costo.setText(null);
               vista.introducir.setVisible(false);
               vista.periodo.setVisible(false);
               vista.periodo1.setVisible(false);
               vista.combo.setVisible(false);
               vista.opciones.select(0);
               vista.nombre.select(0);
               vista.combo.select(0);
               vista.funcionarioComb.select(0);
               vista.fecha.select(0);
               
               
            }
                
        }
        if(vista.busqueda==ie.getSource()){

            if(vista.busqueda.getSelectedItem().equalsIgnoreCase("Servicio")){
               vista.nombre.setVisible(false);
               vista.opciones.setVisible(true);
               vista.fecha.setVisible(false);
               vista.informacion.setText(null);
               vista.Produccion.setText(null);
               vista.funcionarioComb.setVisible(false);
               vista.Costo.setText(null);
               vista.introducir.setVisible(false);
               vista.periodo.setVisible(false);
               vista.periodo1.setVisible(false);
               vista.opciones.select(0);
               vista.periodo2.setVisible(false);
            }
            if(vista.busqueda.getSelectedItem().equalsIgnoreCase("Funcionario")){
               vista.nombre.setVisible(true);
               vista.opciones.setVisible(false);
               vista.fecha.setVisible(false);
               vista.informacion.setText(null);
               vista.Produccion.setText(null);
               vista.combo.setVisible(false);
               vista.Costo.setText(null);
               vista.introducir.setVisible(false);
               vista.periodo.setVisible(false);
               vista.periodo1.setVisible(false);
               vista.nombre.select(0);
               vista.periodo2.setVisible(false);
            }   
            if(vista.busqueda.getSelectedItem().equalsIgnoreCase("Rango fecha")){
               vista.nombre.setVisible(false);
               vista.opciones.setVisible(false);
               vista.fecha.setVisible(true);
               vista.informacion.setText(null);
               vista.Produccion.setText(null);
               vista.periodo.setVisible(true);
               vista.periodo1.setVisible(true);
               vista.funcionarioComb.setVisible(false);
               vista.combo.setVisible(false);
               vista.Costo.setText(null);
               vista.introducir.setVisible(true);
               vista.fecha.select(0);
               vista.periodo2.setVisible(true);
            }   
        }
        if(vista.opciones==ie.getSource()){
            if(vista.opciones.getSelectedItem().equalsIgnoreCase("Combos")){
               vista.combo.setVisible(true);
               vista.combo.select(0);
            }
            if(vista.opciones.getSelectedItem().equalsIgnoreCase("Lavado basico") && vista.vehiculo.getSelectedItem().equalsIgnoreCase("automovil")){
               vista.informacion.setText("Depende del tipo de auto existe una \n tarifa. "
                       + "Incluye lavado \n exterior, lavado interior\n y aspirada");
               vista.Costo.setText("23000");
               precio=23000;
               modelo.setPrecio(precio);
               modelo.autoLavB(); 
               vista.Produccion.setText("La produccion para este servicio es: " +String.valueOf(modelo.getResultado()));
               vista.combo.setVisible(false);
               
            }
            if(vista.opciones.getSelectedItem().equalsIgnoreCase("Lavado basico") && vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
               vista.informacion.setText("Depende del tipo de auto existe una \n tarifa. "
                       + "Incluye lavado \n exterior, lavado interior\n y aspirada");
               precio=29000;
               modelo.setPrecio(precio);
               modelo.camiLavB();
               vista.Costo.setText("29000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.combo.setVisible(false);
            }
            if(vista.opciones.getSelectedItem().equalsIgnoreCase("Lavado especial")&& vista.vehiculo.getSelectedItem().equalsIgnoreCase("automovil")){
               vista.informacion.setText("Incluye lavado básico más \n polichado con maquina y \n "
                       + "las mejores ceras de calidad");
               precio=64000;
               modelo.setPrecio(precio);
               modelo.autoLavE();
               vista.Costo.setText("64000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.combo.setVisible(false);
            }
             if(vista.opciones.getSelectedItem().equalsIgnoreCase("Lavado especial")&& vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
               vista.informacion.setText("Incluye lavado básico más \n polichado con maquina y \n "
                       + "las mejores ceras de calidad");
               precio=78000;
               modelo.setPrecio(precio);
               modelo.camiLavE();
               vista.Costo.setText("78000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.combo.setVisible(false);
            }
            if(vista.opciones.getSelectedItem().equalsIgnoreCase("Desinfeccion basica")&& vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
               vista.informacion.setText("Con maquina generadora de ozono");
               precio=33000;
               modelo.setPrecio(precio);
               modelo.camiDesinB();
               vista.Costo.setText("33000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.combo.setVisible(false);
            }
            if(vista.opciones.getSelectedItem().equalsIgnoreCase("Desinfeccion basica")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("automovil")){
               vista.informacion.setText("Con maquina generadora de ozono");
               precio=33000;
               modelo.setPrecio(precio);
               modelo.autoDesinB();
               vista.Costo.setText("33000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.combo.setVisible(false);
            }
            if(vista.opciones.getSelectedItem().equalsIgnoreCase("Desinfeccion avanzada")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("automovil")){
               vista.informacion.setText("Además de la desinfección básica,\n limpieza interior "
                       + "con máquina \n de vapor.");
               precio=66000;
               modelo.setPrecio(precio);
               modelo.autoDesinA();
               vista.Costo.setText("66000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.combo.setVisible(false);
            }
             if(vista.opciones.getSelectedItem().equalsIgnoreCase("Desinfeccion avanzada")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
               vista.informacion.setText("Además de la desinfección básica,\n limpieza interior "
                       + "con máquina \n de vapor.");
               precio=72000;
               modelo.setPrecio(precio);
               modelo.camiDesinA();
               vista.Costo.setText("72000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.combo.setVisible(false);
               
             }
              vista.opciones.select(0);
        }
        if(vista.combo==ie.getSource()){
            if(vista.combo.getSelectedItem().equalsIgnoreCase("Combo 1")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("automovil")){
               vista.informacion.setText("Informacion del combo: Lavado, \n polichado y desengrasante \n por debajo");
               precio=35000;
               modelo.setPrecio(precio);
               modelo.autoComb1();
               vista.Costo.setText("35000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
            }
            if(vista.combo.getSelectedItem().equalsIgnoreCase("Combo 1")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
               vista.informacion.setText("Informacion del combo: Lavado, \n polichado y desengrasante \n por debajo");
               precio=46000;
               modelo.setPrecio(precio);
               modelo.camiComb1();
               vista.Costo.setText("46000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
            }
            if(vista.combo.getSelectedItem().equalsIgnoreCase("combo 2")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("automovil")){
              vista.informacion.setText("Informacion del combo: Lavado, \n polichado y desengrasante \n por debajo+ grafitado \n de chasis");
               precio=63000;
               modelo.setPrecio(precio);
               modelo.autoComb2();
              vista.Costo.setText("63000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
            }
            if(vista.combo.getSelectedItem().equalsIgnoreCase("combo 2")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
              vista.informacion.setText("Informacion del combo: Lavado, \n polichado y desengrasante \n por debajo+ grafitado \n de chasis");
               precio=77000;
               modelo.setPrecio(precio);
               modelo.camiComb2();
              vista.Costo.setText("77000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
            }
            if(vista.combo.getSelectedItem().equalsIgnoreCase("combo 3")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("automovil")){
              vista.informacion.setText("Informacion del combo: Lavado, \n polichado y desengrasante "
                      + "\n por debajo+ grafitado \n de chasis+ tapicería (desmontado \n de sillas para un aseo \n más profundo)");
               precio=79000;
               modelo.setPrecio(precio);
               modelo.autoComb3();
               vista.Costo.setText("79000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
            }
            if(vista.combo.getSelectedItem().equalsIgnoreCase("combo 3")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
              vista.informacion.setText("Informacion del combo: Lavado, \n polichado y desengrasante "
                      + "\n por debajo+ grafitado \n de chasis+ tapicería (desmontado \n de sillas para un aseo \n más profundo)");
               precio=99000;
               modelo.setPrecio(precio);
               modelo.camiComb3();
               vista.Costo.setText("99000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
            }
            vista.combo.select(0);
        }
       if (vista.nombre==ie.getSource()){
           if(vista.nombre.getSelectedItem().equalsIgnoreCase("Empleado 1")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Automovil")){
               vista.informacion.setText("Asignado a lavado basico");
               precio=23000;
               modelo.setPrecio(precio);
               modelo.autoEmp1();
               vista.Costo.setText("23000");
               vista.Produccion.setText("La produccion para este servicio es: " +String.valueOf(modelo.getResultado()));
               vista.funcionarioComb.setVisible(false);
           }
            if(vista.nombre.getSelectedItem().equalsIgnoreCase("Empleado 1")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
               vista.informacion.setText("Asignado a lavado basico");
               precio=29000;
               modelo.setPrecio(precio);
               modelo.camiEmp1();
               vista.Costo.setText("29000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.funcionarioComb.setVisible(false);
           }
           if(vista.nombre.getSelectedItem().equalsIgnoreCase("Empleado 2")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Automovil")){
               vista.informacion.setText("Asignado a lavado especial");
               precio=64000;
               modelo.setPrecio(precio);
               modelo.autoEmp2();
               vista.Costo.setText("64000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.funcionarioComb.setVisible(false);
           }
           if(vista.nombre.getSelectedItem().equalsIgnoreCase("Empleado 2")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
               vista.informacion.setText("Asignado a lavado especial");
               precio=78000;
               modelo.setPrecio(precio);
               modelo.camiEmp2();
               vista.Costo.setText("78000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.funcionarioComb.setVisible(false);
           }
           if(vista.nombre.getSelectedItem().equalsIgnoreCase("Empleado 3")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
               vista.informacion.setText("Asignado a desinfeccion basica");
                precio=33000;
                modelo.setPrecio(precio);
                modelo.camiEmp3();
                vista.Costo.setText("33000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.funcionarioComb.setVisible(false);
           }
           if(vista.nombre.getSelectedItem().equalsIgnoreCase("Empleado 3")&& vista.vehiculo.getSelectedItem().equalsIgnoreCase("Automovil")){
                vista.informacion.setText("Asignado a desinfeccion basica");
                precio=33000;
                modelo.setPrecio(precio);
                modelo.autoEmp3();
                vista.Costo.setText("33000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.funcionarioComb.setVisible(false);
           }
           if(vista.nombre.getSelectedItem().equalsIgnoreCase("Empleado 4")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Automovil")){
               vista.informacion.setText("Asignado a desinfeccion avanzada");
                precio=66000;
                modelo.setPrecio(precio);
                modelo.autoEmp4();
                vista.Costo.setText("66000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.funcionarioComb.setVisible(false);
           }
           if(vista.nombre.getSelectedItem().equalsIgnoreCase("Empleado 4")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
               vista.informacion.setText("Asignado a desinfeccion avanzada");
               precio=72000;
               modelo.setPrecio(precio);
               modelo.camiEmp4();
               vista.Costo.setText("72000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
               vista.funcionarioComb.setVisible(false);
           }
           if(vista.nombre.getSelectedItem().equalsIgnoreCase("Empleados asignados a combos")){
                vista.Produccion.setText(null);
               vista.funcionarioComb.setVisible(true);
                vista.funcionarioComb.select(0);
           }
           vista.nombre.select(0);
       }
       if(vista.funcionarioComb==ie.getSource()){
           if(vista.funcionarioComb.getSelectedItem().equalsIgnoreCase("Funcionario 1")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("automovil")){
                vista.informacion.setText("Asignado a Combo 1");
                 precio=35000;
                 modelo.setPrecio(precio);
                 modelo.AEmpComb1();
                 vista.Costo.setText("35000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
           }
           if(vista.funcionarioComb.getSelectedItem().equalsIgnoreCase("Funcionario 1")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
                vista.informacion.setText("Asignado a Combo 1");
                 precio=46000;
                 modelo.setPrecio(precio);
                 modelo.CEmpComb1();
                vista.Costo.setText("46000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
           }
           if(vista.funcionarioComb.getSelectedItem().equalsIgnoreCase("Funcionario 2")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("automovil")){
                vista.informacion.setText("Asignado a Combo 2");
                 precio=63000;
                 modelo.setPrecio(precio);
                 modelo.AEmpComb2();
                 vista.Costo.setText("63000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
           }
           if(vista.funcionarioComb.getSelectedItem().equalsIgnoreCase("Funcionario 2")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
                vista.informacion.setText("Asignado a Combo 2");
                 precio=77000;
                 modelo.setPrecio(precio);
                 modelo.CEmpComb2();
                vista.Costo.setText("77000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
           }
           if(vista.funcionarioComb.getSelectedItem().equalsIgnoreCase("Funcionario 3")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("automovil")){
                vista.informacion.setText("Asignado a Combo 3");
                 precio=79000;
                 modelo.setPrecio(precio);
                 modelo.AEmpComb4();
                 vista.Costo.setText("79000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
           }
           if(vista.funcionarioComb.getSelectedItem().equalsIgnoreCase("Funcionario 3")&&vista.vehiculo.getSelectedItem().equalsIgnoreCase("Camioneta")){
                vista.informacion.setText("Asignado a Combo 3");
                 precio=99000;
                 modelo.setPrecio(precio);
                 modelo.CEmpComb4();
                vista.Costo.setText("99000");
               vista.Produccion.setText("La produccion para este servicio es: "+String.valueOf(modelo.getResultado()));
           }
           vista.funcionarioComb.select(0);
       }
       if(vista.fecha==ie.getSource()){
           if(vista.fecha.getSelectedItem().equalsIgnoreCase("3 meses")){
               double prueba;
               vista.informacion.setText("la produccion al cabo de 3 meses"); 
               try{
               prueba=Double.parseDouble(vista.periodo.getText());
               vista.Produccion.setText(String.valueOf(prueba));
               }catch(NumberFormatException e){
                   vista.Produccion.setText("no cumple con los parametros");
               }
           }
           if(vista.fecha.getSelectedItem().equalsIgnoreCase("6 meses")){
               vista.informacion.setText("la produccion al cabo de 6 meses");
               try{
               prueba=Double.parseDouble(vista.periodo.getText());
               vista.Produccion.setText(String.valueOf(prueba));
               }catch(NumberFormatException e){
                   vista.Produccion.setText("no cumple con los parametros");
               }
           }
           if(vista.fecha.getSelectedItem().equalsIgnoreCase("Un año")){
               vista.informacion.setText("la produccion al cabo de un año");
                 try{
               prueba=Double.parseDouble(vista.periodo.getText());
               vista.Produccion.setText(String.valueOf(prueba));
               }catch(NumberFormatException e){
                   vista.Produccion.setText("no cumple con los parametros");
               }
           }
           vista.fecha.select(0);
       }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(vista.precios==ae.getSource()){
            if(ae.getActionCommand().equalsIgnoreCase("Consultar precios")){
                JOptionPane.showMessageDialog(null, "♦Lavado basico: \n"+ "Automovil: 23000 \n"+ "Camioneta: 29000\n"
                + "♦Lavado Especial: \n"+"Automovil: 64000 \n"+"Camioneta:78000 \n"
                +"♦Desinfeccion basica: \n"+"Automovil y Camioneta 33000 \n"+"♦Desinfeccion avanzada:\n"
                +"Automovil: 66000 \n"+"Camioneta: 72000 \n"+ "♦Combo 1:\n Automovil:35000 \n Camioneta: 46000 \n"
                +"♦Combo 2: \n Automovil:63000 \n Camioneta:77000 \n ♦Combo 3: \n Automovil: 79000 \n Camioneta:99000");
            }
        }
        if (vista.uso==ae.getSource()){
            if(ae.getActionCommand().equalsIgnoreCase("Guia de uso")){
                JOptionPane.showMessageDialog(null,"1. antes de seleccionar un modo de \n busqueda"
                        + " asegurese de \n decir que tipo de vehiculo es.\n ");
                JOptionPane.showMessageDialog(null, "2. El sistema suma el precio correspondiente\n "
                        + "cada vez que se seleccione la misma \n opcion");
               JOptionPane.showMessageDialog(null, "Para realizar una busqueda por rango de fecha, \n introduzca primero "
                       + "la cantidad de produccion y luego el rango");        

            }
        }
    }
}
