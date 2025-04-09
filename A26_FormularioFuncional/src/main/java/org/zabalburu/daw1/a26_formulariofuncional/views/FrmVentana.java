/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.a26_formulariofuncional.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

/**
 *
 * @author DAW1
 */
public class FrmVentana extends JFrame{
    
    private Dimension dmVentana = new Dimension (800,500);
     
    private JLabel lblTitulo = new JLabel("Actualiza tu Perfil");
    private JLabel lblNombre = new JLabel("Nombre completo");
    private JTextField txtNombre = new JTextField();
    private JLabel lblCorreoE = new JLabel ("Correo Electronico");
    private JTextField txtCorreoE = new JTextField();
    private JLabel lblTelefono = new JLabel ("Telefono");
    private JTextField txtTelefono = new JTextField();
    private JLabel lblDireccion = new JLabel ("Dirección");
    private JTextField txtDireccion = new JTextField();
    private JLabel lblSitioWeb = new JLabel ("Sitio Web");
    private JTextField txtSitioWeb = new JTextField();
    
    
    private JButton btnEnviar = new JButton("Guardar Cambios", new ImageIcon("images/Tick tick.png"));
    private JButton btnCancelar = new JButton("Cancelar", new ImageIcon("images/Undo.png"));
    
    
    
    private JPanel pnlDatos = new JPanel (new GridLayout(10,2,0,10));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    private JPanel pnlTitulo = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private Color COLOR_FONDO = new Color(66, 152, 201);
    private Color COLOR_TEXTO = new Color (0,0,153);
    private final Font FUENTE = new Font("Calibri",Font.PLAIN,22);
   // private MatteBorder MBLinea = new MatteBorder(0,0,3,0, COLOR_FONDO);
    
        public FrmVentana(){
                
            this.setSize(dmVentana);
            this.setTitle("Mi perfil");
            
            
            //TITULO
            
            pnlTitulo.add(lblTitulo);
            lblTitulo.setFont(new Font("Calibri",Font.BOLD,32));
            lblTitulo.setForeground(new Color(255,255,255));
            pnlTitulo.setBackground(COLOR_FONDO);
            lblTitulo.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            this.add(pnlTitulo, BorderLayout.NORTH); //Posición del titulo. Etiqueta que ocupa todo el espacio.
            
            /*Esto sería solo las etiquetas, arriba esta hecho el titulo como panel*/
            // lblTitulo.setHorizontalAlignment(JLabel.LEFT);
            //lblTitulo.setOpaque(true);
            
            /*Puedes hacer un panel para cada seccion y 
            luego añadirle las etiquetas dentro.
            Al hacerlo con panel, no tienes que alinear horizontalmente, se alinea solo.
            Si quieres moverlo de lado, en plan dcha o izq:
            privateJPanel pnlTitulo = new Jpanel(new FlowLayout(FlowLayout.LEFT));
            */
           
            
            //PANEL CENTRAL DE DATOS
            
            
                /*Añadir los cuadros de texto y los labels*/
            pnlDatos.add(lblNombre);
            pnlDatos.add(txtNombre);
            pnlDatos.add(lblCorreoE);
            pnlDatos.add(txtCorreoE);
            pnlDatos.add(lblTelefono);
            pnlDatos.add(txtTelefono);
            pnlDatos.add(lblDireccion);
            pnlDatos.add(txtDireccion);
            pnlDatos.add(lblSitioWeb);
            pnlDatos.add(txtSitioWeb);
            
            
            
            for(Component c : pnlDatos.getComponents()){
               if( c instanceof JTextField){
                JTextField txt = (JTextField) c;
                txt.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createMatteBorder(0,0,2,0, COLOR_FONDO),
                        BorderFactory.createEmptyBorder(5,2,2,2)
                        
                        /*Con esto generamos un bordecito 1mm por encima del borde. Algo así*/
                ));
                txt.setFont(new Font ("Calibri",Font.PLAIN,18));
               }
            }
            
            
                /*Bordes del panel*/
            pnlDatos.setBorder(BorderFactory.createEmptyBorder(0,20,0,20));
               /*Posicionar el panel de Datos */
            this.add(pnlDatos, BorderLayout.CENTER);
            
            /*
            A mano, dando un borde mate simple a cada caja de texto.
            txtNombre.setBorder(MBLinea);
            txtCorreoE.setBorder(MBLinea);
            txtTelefono.setBorder(MBLinea);
            txtDireccion.setBorder(MBLinea);
            txtSitioWeb.setBorder(MBLinea);
            */
            
            
            
             
            
            
            
            //BOTONES
                
                /*Añadirlos al panel*/
            pnlBotones.add(btnCancelar);
            pnlBotones.add(btnEnviar);
                /*Bordear panel con espacio*/
            pnlBotones.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
                /*Colorearlos*/
            btnCancelar.setBackground(Color.LIGHT_GRAY);
            btnEnviar.setBackground(COLOR_FONDO);
                 //Cada uno tiene un color, si no podrian ir denro del FOR
            
            
            for(Component c : pnlBotones.getComponents()){
                JButton b = (JButton) c;
                b.setBorder(null);
                b.setPreferredSize(new Dimension(170, 50));
                b.setForeground(Color.WHITE);
                b.setFont(new Font("Calibri",Font.PLAIN,12));
                
            }
            
              
                /*Posicionar el panel*/
            this.add(pnlBotones, BorderLayout.SOUTH);
            
            //VENTANA
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.getRootPane().setDefaultButton(btnEnviar);

        }      
}
