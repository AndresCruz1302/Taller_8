
package taller_8;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Vista extends JFrame{
    JPanel p1;
    Choice opciones,busqueda,combo, fecha, nombre, vehiculo,funcionarioComb ;
    JTextArea informacion, Produccion,Costo, periodo;
    JLabel servicios, funcionario, seleccion1, busqueda1, vehiculo1,Costo1,periodo1, periodo2 ;
    JButton precios, uso, introducir;
  public Vista(){
      this.setTitle("Lavado de vehiculos");
      setBounds(300, 100, 700, 600);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      p1= new JPanel();
      p1.setLayout(null);
      
      informacion=new JTextArea();
      informacion.setBounds(480, 100, 200, 120);
      
      Produccion=new JTextArea();
      Produccion.setBounds(10,250 , 650, 250);
      
      periodo=new JTextArea();
      periodo.setBounds(210,120 , 220, 20);
      
      Costo=new JTextArea();
      Costo.setBounds(20, 220, 100, 20);
      
      Costo1=new JLabel("Costo");
      Costo1.setBounds(20, 200, 80, 20);
      
      servicios=new JLabel("Seleccion de servicios");
      servicios.setBounds(140, 80, 140, 20);
      
      seleccion1=new JLabel("Informacion");
      seleccion1.setBounds(480, 80, 90, 20);
      
      busqueda1=new JLabel("Busqueda de produccion por:");
      busqueda1.setBounds(20, 100, 190, 20);
      
      funcionario=new JLabel("Nombre del funcionario");
      funcionario.setBounds(140, 140, 140, 20);
      
      vehiculo1=new JLabel("Tipo de vehiculo");
      vehiculo1.setBounds(20, 50, 120, 20);
      
      periodo1=new JLabel("Digite el total de produccion");
      periodo1.setBounds(210, 100, 260, 20);
      
      periodo2=new JLabel("Seleccione el lapso de tiempo");
      periodo2.setBounds(210, 160, 260, 20);
      
      opciones=new Choice();
      opciones.setBounds(140, 120, 150, 40);
      opciones.addItem("seleccionar");
      opciones.addItem("Lavado basico");
      opciones.addItem("Lavado especial");
      opciones.addItem("Desinfeccion basica");
      opciones.addItem("Desinfeccion avanzada");
      opciones.addItem("Combos");
      
      combo=new Choice();
      combo.setBounds(310,120 ,100 , 40);
      combo.addItem("Seleccionar");
      combo.addItem("Combo 1");
      combo.addItem("Combo 2");
      combo.addItem("Combo 3");
      
      nombre=new Choice();
      nombre.setBounds(140, 120, 190, 40);
      nombre.addItem("Seleccion");
      nombre.addItem("empleado 1");
      nombre.addItem("empleado 2");
      nombre.addItem("empleado 3");
      nombre.addItem("empleado 4");
      nombre.addItem("Empleados asignados a Combos");
      
      funcionarioComb=new Choice();
      funcionarioComb.setBounds(340,120 ,100 , 40);
      funcionarioComb.addItem("Seleccionar");
      funcionarioComb.addItem("Funcionario 1");
      funcionarioComb.addItem("Funcionario 2");
      funcionarioComb.addItem("Funcionario 3");
      
      fecha=new Choice();
      fecha.setBounds(210, 180, 150, 40);
      fecha.addItem("Seleccion");
      fecha.addItem("3 meses");
      fecha.addItem("6 meses");
      fecha.addItem("Un año");
      
      busqueda=new Choice();
      busqueda.setBounds(20, 120, 120, 40);
      busqueda.addItem("Seleccionar");
      busqueda.addItem("Servicio");
      busqueda.addItem("Funcionario");
      busqueda.addItem("Rango fecha");
      
      vehiculo=new Choice();
      vehiculo.setBounds(20, 80, 120, 40);
      vehiculo.addItem("Seleccionar");
      vehiculo.addItem("Automovil");
      vehiculo.addItem("Camioneta");
      
      precios=new JButton("Consultar precios");
      precios.setBounds(140, 220, 140, 20);
    
      uso=new JButton("Guia de uso");
      uso.setBounds(500, 20, 120, 20);
      
      introducir=new JButton("Introducir valor");
      introducir.setBounds(370,180 , 100, 20);
        
      servicios.setVisible(false);
      opciones.setVisible(false);
      funcionario.setVisible(false);
      nombre.setVisible(false);
      combo.setVisible(false);
      fecha.setVisible(false);
      funcionarioComb.setVisible(false);
      periodo.setVisible(false);
      periodo1.setVisible(false);
      periodo2.setVisible(false);
      busqueda.setVisible(false);
      busqueda1.setVisible(false);
      introducir.setVisible(false);
      
      
      add(p1);
      p1.add(servicios);
      p1.add(funcionario);
      p1.add(opciones);
      p1.add(nombre);
      p1.add(informacion);
      p1.add(seleccion1);
      p1.add(busqueda);
      p1.add(busqueda1);
      p1.add(combo);
      p1.add(fecha);
      p1.add(vehiculo);
      p1.add(vehiculo1);
      p1.add(funcionarioComb);
      p1.add(Produccion);
      p1.add(Costo);
      p1.add(Costo1);
      p1.add(precios);
      p1.add(periodo);
      p1.add(periodo1);
      p1.add(periodo2);
      p1.add(uso);

  }


  

    
}
