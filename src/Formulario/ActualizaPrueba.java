/*
* Alexander Tejada OZuna
 * Santo Domingo, Republica Dominica
 * 20/10/2014
 * PrintZone and Source.
 * CopyRight
* Proyecto de Base de Dato para J.A. UASD./**/
 
package Formulario;

import Basedato.ConexionMySQL;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Developer
 */
public class ActualizaPrueba extends javax.swing.JFrame {

    
    DefaultTableModel modelo;

    /**
     *
     */
    public ActualizaPrueba() {
        initComponents();
       // CargarTablaIngeniero("");
        // inhabilitar();
           //      System.out.println("Cargando")
    }
    
    void CargarTablaIngeniero(String valor){
        String [] titulos = {"ID","Primer Nombre","Segundo Nombre","Primer Apellido","Segundo Apellido","F.Nac","Genero"};
        String [] registro = new String [7];
        modelo = new DefaultTableModel(null, titulos);
   
        ConexionMySQL mysql = new ConexionMySQL ();
        Connection con = mysql.Conectar();
        
      
        String sSQL = "";
        String mensaje ="";
        
      
    
        sSQL = "SELECT id, apellido1,apellido2, nombre1, nombre2, fecha_nac,genero FROM datos_ingenieros "+
                "WHERE CONCAT (apellido1, ' ', apellido2, ' ',nombre1, ' ', nombre2) LIKE '%"+valor+"%'";
        mensaje = "Los Datos se entraron bien";
        
        
        
        try {
            Statement prepararEstado = con.createStatement();
            
            ResultSet rs = prepararEstado.executeQuery(sSQL);
            
            while(rs.next()){
                
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("apellido1");
                registro[2] = rs.getString("apellido2");
                registro[3] = rs.getString("nombre1");
                registro[4] = rs.getString("nombre2");
                registro[5] = rs.getString("genero");
                registro[6] = rs.getString("fecha_nac");
                modelo.addRow(registro);
                
            }
            tblConsulta.setModel(modelo);
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }            
        
   String id_actualizar = "";
   void BuscarEmpleado(String id){
       
        ConexionMySQL mysql = new ConexionMySQL ();
        Connection con = mysql.Conectar();
        
         String sSQL = "";
        // String mensaje ="";
         String ap1 ="",ap2="",nom1="",nom2="",fn="",gen="";

        sSQL = "SELECT id, apellido1,apellido2, nombre1, nombre2, fecha_nac,genero FROM datos_ingenieros "+
                "WHERE id = "+id;
        //mensaje = "Los Datos se entraron bien";        
       
        try {
            Statement prepararEstado = con.createStatement();
            ResultSet rs = prepararEstado.executeQuery(sSQL);
            
            while(rs.next()){
                
                ap1 = rs.getString("apellido1");
                ap2 = rs.getString("apellido2");
                nom1 = rs.getString("nombre1");
                nom2 = rs.getString("nombre2");
                fn = rs.getString("fecha_nac");
                gen = rs.getString("genero");
            }
                txtPrimerApellido.setText(ap1);
                txtSegundoApellido.setText(ap2);
                txtPrimerNombre.setText(nom1);
                txtSegundoNombre.setText(nom2);
                txtFechaNac.setText(fn);
                id_actualizar = id;
            
            
           // tblConsulta.setModel(modelo);
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }  
        
        
        
    
    
    void habilitar(){
        
        
        txtPrimerNombre.setEnabled(true);
        txtSegundoNombre.setEnabled(true);
        txtPrimerApellido.setEnabled(true);;
        txtSegundoApellido.setEnabled(true);
        txtFechaNac.setEnabled(true);
        cboGenero.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        
        txtPrimerNombre.setText("");        
        txtSegundoNombre.setText("");
        txtPrimerApellido.setText("");
        txtSegundoApellido.setText("");
        txtFechaNac.setText("");
        
        txtPrimerApellido.requestFocus();
        
    }
    
    void inhabilitar (){
        
        txtPrimerNombre.setEnabled(false);
        txtSegundoNombre.setEnabled(false);
        txtPrimerApellido.setEnabled(false);
        txtSegundoApellido.setEnabled(false);
        txtFechaNac.setEnabled(false);
        cboGenero.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        txtPrimerNombre.setText("");        
        txtSegundoNombre.setText("");
        txtPrimerApellido.setText("");
        txtSegundoApellido.setText("");
        txtFechaNac.setText("");
        cboGenero.setText("");
        
                }

    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopMenu1 = new javax.swing.JPopupMenu();
        mmEditar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtPrimerApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLID = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        cboGenero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLcargo1 = new javax.swing.JLabel();
        jLSalario1 = new javax.swing.JLabel();
        jLSalario6 = new javax.swing.JLabel();
        jTCargo = new javax.swing.JTextField();
        jTDept = new javax.swing.JTextField();
        jTSalario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFechaNac = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JButton();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Primer Apellido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, 171, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("Deshabilitar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 120, 40));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Salir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 100, 40));

        txtPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 30, 180, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Segundo Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 56, 135, -1));

        txtSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 56, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Primer Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 82, 120, -1));

        txtPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 82, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Segundo Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 108, 170, -1));

        txtSegundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 108, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, -1));

        jLID.setText("ID");
        jPanel1.add(jLID, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 325, -1, -1));

        jTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIDActionPerformed(evt);
            }
        });
        jPanel1.add(jTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 322, 47, -1));
        jPanel1.add(cboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 38, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Genero");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLcargo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLcargo1.setText("Cargo");
        jPanel1.add(jLcargo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLSalario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLSalario1.setText("Salario");
        jPanel1.add(jLSalario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLSalario6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLSalario6.setText("Departameto");
        jPanel1.add(jLSalario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jTCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCargoActionPerformed(evt);
            }
        });
        jPanel1.add(jTCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, -1));

        jTDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDeptActionPerformed(evt);
            }
        });
        jPanel1.add(jTDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, -1));
        jPanel1.add(jTSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 80, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fecha Nacimiento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 134, 170, -1));

        txtFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 134, 180, -1));

        jTTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 180, -1));

        jLabel8.setText(" ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 300, 250));

        btnGuardar1.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar1.setText("Actualizar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 68, 817, 465));
        jPanel1.getAccessibleContext().setAccessibleName("Datos de Empleado");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

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
                .addGap(0, 46, Short.MAX_VALUE)
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 715, 817, 0));

        jLabel6.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Actualizar Empleado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerApellidoActionPerformed
            txtPrimerApellido.transferFocus();
    }//GEN-LAST:event_txtPrimerApellidoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabilitar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoApellidoActionPerformed
         txtSegundoApellido.transferFocus();
    }//GEN-LAST:event_txtSegundoApellidoActionPerformed

    String accion = "Insertar";
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      
        ConexionMySQL mysql = new ConexionMySQL ();
        Connection con = mysql.Conectar();
    
        
         String ap1, ap2, nom1, nom2, fn, gen;
         
         String sSQL = "";
        String mensaje ="";
        
        ap1 = txtPrimerApellido.getText();
        ap2 = txtSegundoApellido.getText();
        nom1 = txtPrimerNombre.getText();
        nom2 = txtSegundoNombre.getText();
        fn = txtFechaNac.getText();
        gen = cboGenero.getText();
        
        if(accion.equals("Insertar")){
        sSQL = "INSERT INTO datos_ingenieros(apellido1,apellido2, nombre1, nombre2, fecha_nac,genero)"+
                "VALUES(?,?,?,?,?,?)";
        mensaje = "Los Datos se Insectado bien POR FINnnnnnnnnn";        

        }else if(accion.equals("Modificar")){
          
          int fila = tblConsulta.getSelectedRow();
          System.out.println(ap1);
          System.out.println(ap2);
          System.out.println(nom1);
          System.out.println(nom2);
          System.out.println(fn);
          System.out.println(gen);
                    
            
           sSQL = "UPDATE datos_ingenieros SET apellido1 ="+ap1+",apellido2="+ap2+",nombre1 = "+nom1+",nombre2 = "+nom2+",fecha_nac = "+fn+",genero="+gen+" WHERE id="+tblConsulta.getValueAt(fila, 0);
                 
         
       }
        
        try {
          
           
            PreparedStatement prepararEstado = con.prepareStatement(sSQL);
            prepararEstado.setString(1, ap1);
            prepararEstado.setString(2, ap2);
            prepararEstado.setString(3, nom1);
            prepararEstado.setString(4, nom2);
            prepararEstado.setString(5, fn);
            prepararEstado.setString(6,gen);
            
            int n = prepararEstado.executeUpdate();
            
            if (n >0 ){
                JOptionPane.showMessageDialog(null, mensaje);
                CargarTablaIngeniero("");
            }
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
        CargarTablaIngeniero(valor);
       
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void mmEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmEditarActionPerformed
        int filase1;
        String id;
        try
        {
        filase1 = tblConsulta.getSelectedRow();
        if(filase1 == -1)
        {
            JOptionPane.showMessageDialog(null,"Joder Selecciones Un Elemento");
    }//GEN-LAST:event_mmEditarActionPerformed
        else
                {
                 accion = "Modificar";
                 modelo = (DefaultTableModel) tblConsulta.getModel();
                 id = (String)modelo.getValueAt(filase1, 0);
                 System.out.println(id);
                 habilitar();
                    BuscarEmpleado(id);

                }

                }
                catch(Exception e){

                }
    }
    private void txtSegundoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoNombreActionPerformed
        txtSegundoNombre.transferFocus();
    }//GEN-LAST:event_txtSegundoNombreActionPerformed

    private void txtPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerNombreActionPerformed
        txtPrimerNombre.transferFocus();
    }//GEN-LAST:event_txtPrimerNombreActionPerformed

    private void jTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIDActionPerformed

    private void jTCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCargoActionPerformed

    private void jTDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDeptActionPerformed

    private void txtFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacActionPerformed

    private void jTTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelefonoActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed
        
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ActualizaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ActualizaPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JTextField cboGenero;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLSalario1;
    private javax.swing.JLabel jLSalario6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLcargo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCargo;
    private javax.swing.JTextField jTDept;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTSalario;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JMenuItem mmEditar;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    // End of variables declaration//GEN-END:variables
}
