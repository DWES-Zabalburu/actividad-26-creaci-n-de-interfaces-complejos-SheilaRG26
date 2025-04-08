/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.a26_formulariofuncional.views;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

/**
 *
 * @author DAW1
 */
public class FrmVentanaGame extends JFrame{
    
    private Dimension dmVentana = new Dimension (800,600);
    
    private JLabel lblTitulo = new JLabel("GAME ZONE");
    private JLabel lblGamerTag = new JLabel("GAMERTAG");
    private JTextField txtGamerTag = new JTextField();
    private JLabel lblEmail = new JLabel ("EMAIL");
    private JTextField txtEmail = new JTextField();
    private JLabel lblPassword = new JLabel("Contraseña");
    private JPasswordField pwdPassword = new JPasswordField();
    private JButton btnEnviar = new JButton("Registrarse");
    private JButton btnCancelar = new JButton("Cancelar");
    
    
    private JPanel pnlDatos = new JPanel (new GridLayout(10,2,0,10));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    private Color COLOR_FONDO = new Color(27, 28, 26);
    private Color COLOR_TEXTO = new Color (69, 240, 17);
    private final Font FUENTE = new Font("Calibri",Font.PLAIN,22);
    private MatteBorder MBLinea = new MatteBorder(1,1,1,1, new Color(69, 240, 17));
      
    
        public FrmVentanaGame() {
            this.setSize(dmVentana);
            this.setTitle("GameZone - Registro");
            
            //TITULO
            lblTitulo.setFont(new Font("SansSerif",Font.PLAIN,32));
            lblTitulo.setHorizontalAlignment(JLabel.CENTER);
            lblTitulo.setForeground(COLOR_TEXTO);
            lblTitulo.setOpaque(true);
            lblTitulo.setBackground(COLOR_FONDO);
            lblTitulo.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            this.add(lblTitulo, BorderLayout.NORTH); //Posición del titulo

            
            //PANEL CENTRAL DE DATOS
            
            
                /*Añadir los cuadros de texto y los labels*/
            pnlDatos.add(lblGamerTag);
            pnlDatos.add(txtGamerTag);
            pnlDatos.add(lblEmail);
            pnlDatos.add(txtEmail);
            pnlDatos.add(lblPassword);
            pnlDatos.add(pwdPassword);
            
            txtEmail.setBorder(MBLinea);
            txtGamerTag.setBorder(MBLinea);
            pwdPassword.setBorder(MBLinea);
            
            pnlDatos.setBorder(BorderFactory.createEmptyBorder(0,20,0,20));
            pnlDatos.setBackground(COLOR_FONDO);
            lblGamerTag.setForeground(COLOR_TEXTO);
            lblEmail.setForeground(COLOR_TEXTO);
            lblPassword.setForeground(COLOR_TEXTO);
                /*Posicionar el panel de Datos */
            this.add(pnlDatos, BorderLayout.CENTER);
            
            
            
            //BOTONES
                /*fuente*/
            btnCancelar.setFont(new Font("Calibri",Font.PLAIN,12));
            btnEnviar.setFont(new Font("Calibri",Font.PLAIN,12));
                /*Añadirlos al panel*/
            pnlBotones.add(btnCancelar);
            pnlBotones.add(btnEnviar);
                /*Bordear panel con espacio*/
            pnlBotones.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
                /*Colorearlos*/
            btnCancelar.setBackground(Color.RED);
            btnEnviar.setBackground(Color.GREEN);
            btnEnviar.setForeground(new Color(0,0,0));
            btnCancelar.setForeground(new Color(0,0,0));
            btnCancelar.setPreferredSize(new Dimension(140,40));
            btnEnviar.setPreferredSize(new Dimension(140,40));
            
            pnlBotones.setBackground(COLOR_FONDO);
            this.add(pnlBotones, BorderLayout.SOUTH);
            
            //VENTANA
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.getRootPane().setDefaultButton(btnEnviar);
            
        }
    
    
    
    
}
