/*
* Alexander Tejada OZuna
 * Santo Domingo, Republica Dominica
 * 20/10/2014
 * PrintZone and Source.
 * CopyRight
* Proyecto de Base de Dato para J.A. UASD./**/
package Formulario;

import Basedato.ConexionMySQL;
import java.util.Random;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

public class Registra extends javax.swing.JFrame {
    Random randomGenerator = new Random();
    //DefaultTableModel modelo;
    public Registra() {
        initComponents();
        inhabilitarCodigo();
        // CargarTablaIngeniero("");
        // inhabilitar();
        //       System.out.println("Cargando");
    }

    void habilitar() {

        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtFechaNac.setEnabled(true);
        txtGenero.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnSalir.setEnabled(true);
        txtCargo.setEnabled(true);
        txtDept.setEnabled(true);
        txtSalario.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtCedula.setEnabled(true);;
        txtEstadoCivil.setEnabled(true);
        txtEstado.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtCodigo.setEnabled(false);

        txtNombre.setText("");
        txtApellido.setText("");
        txtFechaNac.setText("");
        txtGenero.setText("");
        txtTelefono.setText("");
        txtCargo.setText("");
        txtDept.setText("");
        txtSalario.setText("");
        txtDireccion.setText("");
        txtCedula.setText("");
        txtEstadoCivil.setText("");
        txtEstado.setText("");
        txtCodigo.setText("");
        


    }

    void inhabilitar() {
       
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtFechaNac.setEnabled(false);
        txtGenero.setEnabled(false);
        btnGuardar.setEnabled(false);
        //btnCancelar.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCargo.setEnabled(false);
        txtDept.setEnabled(false);
        txtSalario.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtCedula.setEnabled(false);
        txtEstadoCivil.setEnabled(false);
        txtEstado.setEnabled(false);
        txtCodigo.setEnabled(true);
    }
 
   public void inhabilitarCodigo(){
       txtCodigo.setEnabled(false);
   }

 public static String generateRandomChars(String candidateChars, int length) {
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
        sb.append(candidateChars.charAt(random.nextInt(candidateChars
                .length())));
    }

    return sb.toString();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopMenu1 = new javax.swing.JPopupMenu();
        mmEditar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLID = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLSalario1 = new javax.swing.JLabel();
        jlDept = new javax.swing.JLabel();
        txtDept = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jlCodigo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        mmEditar.setText("Modificar");
        mmEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmEditarActionPerformed(evt);
            }
        });
        jPopMenu1.add(mmEditar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 102, 0));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 110, 40));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 100, 40));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Salir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 100, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 135, -1));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, -1));

        jLID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLID.setText("Cedula");
        jPanel1.add(jLID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 50, -1));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 180, -1));

        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });
        jPanel1.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 30, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Genero");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLSalario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLSalario1.setText("Salario");
        jPanel1.add(jLSalario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jlDept.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlDept.setText("Departameto");
        jPanel1.add(jlDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeptActionPerformed(evt);
            }
        });
        jPanel1.add(txtDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 180, -1));

        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 180, -1));

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 80, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fecha Nacimiento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 180, -1));

        txtFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 180, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Direccion completa");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 310, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cargo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Estado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 30, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Estado Civil");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        jPanel1.add(txtEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 180, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Developer\\Documents\\NetBeansProjects\\Empleado_Ferreteria_Ruben\\imagenes\\regss.png")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 140, 40));

        jlCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlCodigo.setText("Codigo");
        jPanel1.add(jlCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Developer\\Desktop\\smooth-ice.jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 840, 480));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        tblConsulta.setBackground(new java.awt.Color(255, 102, 0));
        tblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblConsulta.setComponentPopupMenu(jPopMenu1);
        jScrollPane1.setViewportView(tblConsulta);

        jLabel7.setBackground(new java.awt.Color(153, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setText("Buscar en Tabla");

        txtBuscar.setBackground(new java.awt.Color(204, 204, 255));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnbuscar.setBackground(new java.awt.Color(0, 102, 0));
        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 51, 51));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel6.setText("Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Datos de Empleado");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabilitar();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        txtApellido.transferFocus();
    }//GEN-LAST:event_txtApellidoActionPerformed

    //INSECTAR DATOS REGISTRAR
    
    
   
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        ConexionMySQL mysql = new ConexionMySQL();
        Connection con = mysql.Conectar();
        Calendar fecha = new GregorianCalendar();

        String  ap2, nom1,estc, statud, fn, tel,cod, gen, car, dept, sal, dic, ced; //Tabla Empleado
        String  fechI; // Tablas 
        String sqlEmpleado;
        String mensaje;
        
        mensaje = "Datos Guardados\n Por Favor Asegure su Codigo";

  //Tabla empleado
        ap2 = txtApellido.getText();
        nom1 = txtNombre.getText();
        fn = txtFechaNac.getText();
        tel = txtTelefono.getText();
        gen = txtGenero.getText();
        car = txtCargo.getText();
        dept = txtDept.getText();
        sal = txtSalario.getText();
        dic = txtDireccion.getText();
        ced = txtCedula.getText();
        estc = txtEstadoCivil.getText();
        statud = txtEstado.getText();
        
        
//fecha Actual

        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        fechI = String.valueOf(ano)+"/"+String.valueOf(mes)+"/"+String.valueOf(dia);
        
        
          
 //Generar Codigo Empleado Aleatorio
 
        cod = generateRandomChars("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 4);


        sqlEmpleado = "INSERT INTO Empleado VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
        try {
             int n = 0;
            PreparedStatement  tablaEmpleado;
            tablaEmpleado = con.prepareStatement(sqlEmpleado);
            tablaEmpleado.setString(1,cod );
            tablaEmpleado.setString(2, nom1);
            tablaEmpleado.setString(3, ap2);
            tablaEmpleado.setString(4, ced);
            tablaEmpleado.setString(5, gen);
            tablaEmpleado.setString(6, estc);
            tablaEmpleado.setString(7, dic);
            tablaEmpleado.setString(8, tel);
            tablaEmpleado.setString(9, car);
            tablaEmpleado.setString(10, dept);
            tablaEmpleado.setString(11, sal);
            tablaEmpleado.setString(12, statud);
            tablaEmpleado.setString(13, fechI);
           
            
            n = n + tablaEmpleado.executeUpdate();
            
                 System.out.println(n);
          
            if (n > 0) {
                JOptionPane.showMessageDialog(null, mensaje);
                //CargarTablaIngeniero("");
            }
            txtCodigo.setText(cod);
            inhabilitar();
        } catch (SQLException e) {
            System.out.println("Error A GUARDAR");
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        String valor = txtBuscar.getText();
        // CargarTablaIngeniero(valor);     
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void mmEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmEditarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void txtDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeptActionPerformed

    private void txtFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        txtGenero.transferFocus();
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLSalario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlDept;
    private javax.swing.JMenuItem mmEditar;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDept;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
