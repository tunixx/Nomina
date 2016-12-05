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
//import javax.swing.table.DefaultTableModel;

public class Consulta11PP extends javax.swing.JFrame {

    //DefaultTableModel modelo;
    public Consulta11PP() {
        initComponents();
        // CargarTablaIngeniero("");
        inhabilitar();
        //       System.out.println("Cargando");
    }

    void habilitarActualizar(){
        
       // txtPrimerNombre.setEnabled(true);
        //txtSegundoNombre.setEnabled(true);
        //txtPrimerApellido.setEnabled(true);
       // txtSegundoApellido.setEnabled(true);
       // txtFechaNac.setEnabled(true);
    
        btnbuscar1.setEnabled(false);
        btnGuardar1.setEnabled(true);
        btnSalir.setEnabled(true);
        txtCargo.setEnabled(true);
        txtDept.setEnabled(true);
        txtSalario.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
       // txtCedula.setEnabled(true);
        txtAFp.setEnabled(true);
        txtISR.setEnabled(true);
        txtARS.setEnabled(true);
        txtHoraE.setEnabled(true);
        txtOtroB.setEnabled(true);
        txtOtroD.setEnabled(true);
        txtFechaI.setEnabled(true);

        txtPrimerApellido.requestFocus();

    }
    void habilitar() {

        btnbuscar1.setEnabled(true);
        txtPrimerNombre.setEnabled(true);
        txtSegundoNombre.setEnabled(true);
        txtPrimerApellido.setEnabled(true);
        txtSegundoApellido.setEnabled(true);
        txtFechaNac.setEnabled(true);
        txtGenero.setEnabled(true);
        btnSalir.setEnabled(true);
        txtCargo.setEnabled(true);
        txtDept.setEnabled(true);
        txtSalario.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtCedula.setEnabled(true);
        txtAFp.setEnabled(true);
        txtISR.setEnabled(true);
        txtARS.setEnabled(true);
        txtHoraE.setEnabled(true);
        txtOtroB.setEnabled(true);
        txtOtroD.setEnabled(true);
        txtFechaI.setEnabled(true);
        txtBuscar1.setEnabled(true);
           
        txtBuscar1.setText("");
        txtPrimerNombre.setText("");
        txtSegundoNombre.setText("");
        txtPrimerApellido.setText("");
        txtSegundoApellido.setText("");
        txtFechaNac.setText("");
        txtGenero.setText("");
        txtTelefono.setText("");
        txtCargo.setText("");
        txtDept.setText("");
        txtSalario.setText("");
        txtDireccion.setText("");
        txtCedula.setText("");
        txtAFp.setText("");
        txtISR.setText("");
        txtARS.setText("");
        txtHoraE.setText("");
        txtOtroB.setText("");
        txtOtroD.setText("");
        txtFechaI.setText("");

        txtPrimerApellido.requestFocus();

    }
    void inhabilitar() {
        //btnActualizar.setEnabled(false);
        //btnbuscar1.setEnabled(false);
        txtPrimerNombre.setEnabled(false);
        txtSegundoNombre.setEnabled(false);
        txtPrimerApellido.setEnabled(false);
        txtSegundoApellido.setEnabled(false);
        txtFechaNac.setEnabled(false);
        txtGenero.setEnabled(false);
        btnGuardar1.setEnabled(false);
        //btnCancelar.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCargo.setEnabled(false);
        txtDept.setEnabled(false);
        txtSalario.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtCedula.setEnabled(false);
        txtAFp.setEnabled(false);
        txtISR.setEnabled(false);
        txtARS.setEnabled(false);
        txtHoraE.setEnabled(false);
        txtOtroB.setEnabled(false);
        txtOtroD.setEnabled(false);
        txtFechaI.setEnabled(false);
    }
    void inhabilitarNuevo() {

       //btnActualizar.setEnabled(false);
        btnbuscar1.setEnabled(true);
        txtPrimerNombre.setEnabled(false);
        txtSegundoNombre.setEnabled(false);
        txtPrimerApellido.setEnabled(false);
        txtSegundoApellido.setEnabled(false);
        txtFechaNac.setEnabled(false);
        txtGenero.setEnabled(false);
        btnGuardar1.setEnabled(false);
        //btnCancelar.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCargo.setEnabled(false);
        txtDept.setEnabled(false);
        txtSalario.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtCedula.setEnabled(false);
      
           
          txtBuscar1.setText("");
        txtPrimerNombre.setText("");
        txtSegundoNombre.setText("");
        txtPrimerApellido.setText("");
        txtSegundoApellido.setText("");
        txtFechaNac.setText("");
        txtGenero.setText("");
        txtTelefono.setText("");
        txtCargo.setText("");
        txtDept.setText("");
        txtSalario.setText("");
        txtDireccion.setText("");
        txtCedula.setText("");
        txtAFp.setText("");
        txtISR.setText("");
        txtARS.setText("");
        txtHoraE.setText("");
        txtOtroB.setText("");
        txtOtroD.setText("");
        txtFechaI.setText("");
      

        txtPrimerApellido.requestFocus();

    }
      
      
  String id= "";
  void BuscarEmpleado(String id){
       
        ConexionMySQL mysql = new ConexionMySQL ();
        Connection con = mysql.Conectar();
       
        String sqlEmpleado, sqlIrs, sqlAfp, sqlArs, sqlHoraE, sqlOtroB, sqlOtroD, sqlFechaI;

      
        String ap1= "", ap2= "", nom1= "", nom2= "", fn= "", tel= "", gen= "", car= "", dept= "", sal= "", dic= "", ced= "" ; //Tabla Empleado
        String afp = "", ars= "", isr= ""; //Tabla deducible
        String horaEx= "", otroB= "", otroD= "", fechI= ""; // Tablas 
      
       
        sqlEmpleado =  "SELECT *FROM Empleado WHERE empleadoCodigo = "+id;
        sqlAfp = "SELECT *FROM AFP WHERE empleadoCodigo = "+id;
        sqlIrs = "SELECT *FROM IRS WHERE empleadoCodigo = "+id;
        sqlArs = "SELECT *FROM ARS WHERE empleadoCodigo = "+id;
        sqlHoraE = "SELECT *FROM HoraExtra WHERE empleadoCodigo = "+id;
        sqlOtroB = "SELECT *FROM OtroBeneficio WHERE empleadoCodigo = "+id;
        sqlOtroD = "SELECT *FROM OtroDescuento WHERE empleadoCodigo = "+id;
        sqlFechaI = "SELECT *FROM FechaIngreso WHERE empleadoCodigo = "+id;
             
       
        try {
            Statement estadoEmpleado,estadoIRS, estadoAfp, estadoArs, estadoHoraE, estadoOtroB, estadoOtroD, estadoFechaI;
            ResultSet  tablaEmpleado,tablaIRS, tablaAfp, tablaArs, tablaHoraE, tablaOtroB, tablaOtroD, tablaFechaI;

            estadoEmpleado = con.createStatement();
            estadoIRS = con.createStatement();
            estadoAfp = con.createStatement();
            estadoArs = con.createStatement();
            estadoHoraE = con.createStatement();
            estadoOtroB = con.createStatement();
            estadoOtroD = con.createStatement();
            estadoFechaI = con.createStatement();

            
            tablaEmpleado = estadoEmpleado.executeQuery(sqlEmpleado);
            tablaIRS = estadoIRS.executeQuery(sqlIrs);
            tablaAfp = estadoAfp.executeQuery(sqlAfp);
            tablaArs = estadoArs.executeQuery(sqlArs);
            tablaHoraE = estadoHoraE.executeQuery(sqlHoraE);
            tablaOtroB = estadoOtroB.executeQuery(sqlOtroB);
            tablaOtroD = estadoOtroD.executeQuery(sqlOtroD);
            tablaFechaI = estadoFechaI.executeQuery(sqlFechaI);
             
          while(tablaEmpleado.next()){
                ap1 = tablaEmpleado.getString("empleadoPApellido");
                ap2 = tablaEmpleado.getString("empleadoSApellido");
                nom1 = tablaEmpleado.getString("empleadoPNombre");
                nom2 = tablaEmpleado.getString("empleadoSNombre");
                fn = tablaEmpleado.getString("empleadoFNacimiento");
                gen = tablaEmpleado.getString("empleadoGenero");
                tel = tablaEmpleado.getString("empleadoTelefono");
                car = tablaEmpleado.getString("empleadoCargo");
                dept = tablaEmpleado.getString("empleadoDept");
                sal = tablaEmpleado.getString("empleadoSalario");
                dic = tablaEmpleado.getString("empleadoDireccion");
                ced= tablaEmpleado.getString("empleadoCedula");
            }
          //El nombre no es valido
          /*
             while(tablaIRS.next())
             {
                 isr = tablaIRS.getString("isrMonto");
             }
          */
             while(tablaHoraE.next()){
              horaEx = tablaHoraE.getString("horaExtra");
              }
             
              while(tablaAfp.next()){
              afp = tablaAfp.getString("afpMonto");
              }
              
               while(tablaArs.next()){
              ars = tablaArs.getString("arsMonto");
              }
               
             while(tablaOtroB.next()){
              otroB = tablaOtroB.getString("OtroBeneficioMonto");
              }
             
             while(tablaOtroD.next()){
              otroD = tablaOtroD.getString("otroDescuentoMonto");
              }
             
             while(tablaFechaI.next()){
              fechI = tablaFechaI.getString("FechaIngreso");
              }
              
        
            
            
                txtPrimerApellido.setText(ap1);
                txtSegundoApellido.setText(ap2);
                txtPrimerNombre.setText(nom1);
                txtSegundoNombre.setText(nom2);
                txtGenero.setText(gen);
                txtFechaNac.setText( fn);
                txtTelefono.setText(tel);
                txtCargo.setText(car);
                txtDept.setText(dept);
                txtSalario.setText(sal);
                txtDireccion.setText(dic);
                txtCedula.setText(ced);
                txtAFp.setText(afp);
                txtARS.setText(ars);
                txtISR.setText(isr);
                txtHoraE.setText(horaEx);
                txtOtroB.setText(otroB);
                txtOtroD.setText(otroD);
                txtFechaI.setText(fechI);
                
            
           //tblConsulta.setModel(modelo);
            
             con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
      
        inhabilitar();
    }  
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopMenu1 = new javax.swing.JPopupMenu();
        mmEditar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
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
        txtCedula = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLcargo1 = new javax.swing.JLabel();
        jLSalario1 = new javax.swing.JLabel();
        jLOtroDes = new javax.swing.JLabel();
        jLFechaI = new javax.swing.JLabel();
        jLHoraEx = new javax.swing.JLabel();
        jLOtroB = new javax.swing.JLabel();
        jlDept = new javax.swing.JLabel();
        jLISR = new javax.swing.JLabel();
        jLAFP = new javax.swing.JLabel();
        jLARS = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        txtDept = new javax.swing.JTextField();
        txtHoraE = new javax.swing.JTextField();
        txtOtroB = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtFechaI = new javax.swing.JTextField();
        txtOtroD = new javax.swing.JTextField();
        txtARS = new javax.swing.JTextField();
        txtAFp = new javax.swing.JTextField();
        txtISR = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFechaNac = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnbuscar1 = new javax.swing.JButton();
        txtBuscar1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Primer Apellido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, 171, -1));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 102, 0));
        btnNuevo.setText("Nuevo Busqueda");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 160, 40));

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
        jPanel1.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 180, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Segundo Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 56, 135, -1));

        txtSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Primer Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 82, 120, -1));

        txtPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Segundo Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 108, 170, -1));

        txtSegundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, -1));

        jLID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLID.setText("Cedula");
        jPanel1.add(jLID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 50, -1));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 160, -1));

        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });
        jPanel1.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 38, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Genero");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLcargo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLcargo1.setText("Cargo");
        jPanel1.add(jLcargo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLSalario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLSalario1.setText("Salario");
        jPanel1.add(jLSalario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLOtroDes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLOtroDes.setText("Otros Descuentos");
        jPanel1.add(jLOtroDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        jLFechaI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLFechaI.setText("Fecha de Ingreso");
        jPanel1.add(jLFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        jLHoraEx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLHoraEx.setText("Hora Extras");
        jPanel1.add(jLHoraEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLOtroB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLOtroB.setText("Otros Beneficios");
        jPanel1.add(jLOtroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jlDept.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlDept.setText("Departameto");
        jPanel1.add(jlDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLISR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLISR.setText("ISR");
        jPanel1.add(jLISR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLAFP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLAFP.setText("AFP");
        jPanel1.add(jLAFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLARS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLARS.setText("ARS");
        jPanel1.add(jLARS, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, -1));

        txtDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeptActionPerformed(evt);
            }
        });
        jPanel1.add(txtDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, -1));

        txtHoraE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraEActionPerformed(evt);
            }
        });
        jPanel1.add(txtHoraE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 70, -1));

        txtOtroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtroBActionPerformed(evt);
            }
        });
        jPanel1.add(txtOtroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 100, -1));

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 80, -1));

        txtFechaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaIActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 100, -1));

        txtOtroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtroDActionPerformed(evt);
            }
        });
        jPanel1.add(txtOtroD, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 70, -1));

        txtARS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtARSActionPerformed(evt);
            }
        });
        jPanel1.add(txtARS, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 80, -1));
        jPanel1.add(txtAFp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 100, -1));

        txtISR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISRActionPerformed(evt);
            }
        });
        jPanel1.add(txtISR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fecha Nacimiento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 134, 170, -1));

        txtFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 180, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 180, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Direccion completa");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 310, 30));

        btnGuardar1.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 100, 40));

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
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Consulta");

        btnbuscar1.setBackground(new java.awt.Color(0, 102, 0));
        btnbuscar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscar1.setText("Buscar");
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });

        txtBuscar1.setBackground(new java.awt.Color(204, 204, 255));
        txtBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscar1ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(153, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar1)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuscar1)
                            .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Datos de Empleado");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerApellidoActionPerformed
        txtPrimerApellido.transferFocus();
    }//GEN-LAST:event_txtPrimerApellidoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
          inhabilitarNuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inhabilitar();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoApellidoActionPerformed
        txtSegundoApellido.transferFocus();
    }//GEN-LAST:event_txtSegundoApellidoActionPerformed

    //INSECTAR DATOS REGISTRAR
    
    
   
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

    private void txtSegundoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoNombreActionPerformed
        txtSegundoNombre.transferFocus();
    }//GEN-LAST:event_txtSegundoNombreActionPerformed

    private void txtPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerNombreActionPerformed
        txtPrimerNombre.transferFocus();
    }//GEN-LAST:event_txtPrimerNombreActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void txtDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeptActionPerformed

    private void txtOtroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtroBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtroBActionPerformed

    private void txtFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        txtPrimerApellido.transferFocus();
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtHoraEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraEActionPerformed

    private void txtFechaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIActionPerformed

    private void txtARSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtARSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtARSActionPerformed

    private void txtOtroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtroDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtroDActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtISRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISRActionPerformed

    private void btnbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar1ActionPerformed
        String valor = txtBuscar1.getText();
        BuscarEmpleado(valor);
    }//GEN-LAST:event_btnbuscar1ActionPerformed

    private void txtBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar1ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        
        
        ConexionMySQL mysql = new ConexionMySQL();
        Connection con = mysql.Conectar();
        String valor;
        valor = txtBuscar1.getText();
       
        String ap1, ap2, nom1, nom2, fn, tel, gen, car, dept, sal, dic, ced; //Tabla Empleado
        String afp, ars, isr; //Tabla deducible
        String horaEx, otroB, otroD, fechI; // Tablas 

        String sqlEmpleado, sqlIrs, sqlAfp, sqlArs, sqlHoraE, sqlOtroB, sqlOtroD, sqlFechaI;
        String mensaje;
        mensaje = "Datos Guardados Correctamentes";

        //Tabla empleado
        ap1 = txtPrimerApellido.getText();
        ap2 = txtSegundoApellido.getText();
        nom1 = txtPrimerNombre.getText();
        nom2 = txtSegundoNombre.getText();
        fn = txtFechaNac.getText();
        tel = txtTelefono.getText();
        gen = txtGenero.getText();
        car = txtCargo.getText();
        dept = txtDept.getText();
        sal = txtSalario.getText();
        dic = txtDireccion.getText();
        ced = txtCedula.getText();

        afp = txtAFp.getText();
        isr = txtISR.getText();
        ars = txtARS.getText();
        horaEx = txtHoraE.getText();
        System.out.println("1");
        otroB = txtOtroB.getText();
        otroD = txtOtroD.getText();
        fechI = txtFechaI.getText();

 sqlEmpleado = "UPDATE Empleado SET empleadoCedula=?, empleadoPApellido=?, empleadoSApellido=?, empleadoPNombre=?, empleadoSNombre=?, empleadoGenero=?, empleadoFNacimiento=?,"+
                       " empleadoDireccion=?, empleadoTelefono=?,"+
                       " empleadoDept=?, empleadoCargo=?,"+
                       " empleadoSalario=? WHERE empleadoCodigo='"+txtBuscar1.getText()+"'";
       
      //  sqlIrs = "UPDATE IRS SET monto="+33+"WHERE empleadoCodigo = "+valor;

        System.out.println("2");
       
        /*
        sqlAfp = "INSERT INTO AFP VALUES(?)";
        sqlArs = "INSERT INTO ARS VALUES(?)";
        sqlHoraE = "INSERT INTO HoraExtra VALUES(?,?)";
        sqlOtroB = "INSERT INTO OtroBeneficio VALUES(?)";
        sqlOtroD = "INSERT INTO OtroDescuento VALUES(?)";
        sqlFechaI = "INSERT INTO FechaIngreso VALUES(?)";
        */
        try {
            
             int n = 0;
            PreparedStatement tablaIRS, tablaEmpleado, tablaAfp, tablaArs, tablaHoraE, tablaOtroB, tablaOtroD, tablaFechaI;
             System.out.println("3");
            
             tablaEmpleado = con.prepareStatement(sqlEmpleado);
            System.out.println("4");
            tablaEmpleado.setString(1, ced);
            System.out.println("5");
            tablaEmpleado.setString(2, ap1);
            tablaEmpleado.setString(3, ap2);
            tablaEmpleado.setString(4, nom1);
             System.out.println("6");
            tablaEmpleado.setString(5, nom2);
            tablaEmpleado.setString(6, gen);
            tablaEmpleado.setDate(7, Date.valueOf(fn));
            tablaEmpleado.setString(8, dic);
            tablaEmpleado.setString(9, tel);
            tablaEmpleado.setString(10, dept);
            tablaEmpleado.setString(11, car);
                         System.out.println(sal);

            tablaEmpleado.setDouble(12, Double.parseDouble(sal));
            
                         System.out.println("8");

           // tablaEmpleado.setString(13,);
            
             System.out.println("Se guardo");
            n = n + tablaEmpleado.executeUpdate();
            
           /*
             System.out.println(isr+"4");
            tablaIRS = con.prepareStatement(sqlIrs);
            tablaIRS.setString(1, isr);
             n = tablaIRS.executeUpdate();
              System.out.println(isr+"5");
      
 /
            tablaAfp = con.prepareStatement(sqlAfp);
            tablaAfp.setString(1, afp);

            tablaArs = con.prepareStatement(sqlArs);
            tablaArs.setString(1, ars);

            tablaHoraE = con.prepareStatement(sqlHoraE);
            tablaHoraE.setString(1, horaEx);
            int numero = 0;
            numero = Integer.parseInt(horaEx);
            Double suma = numero * 20.23;
            System.out.println(suma);
            tablaHoraE.setDouble(2, suma);

            tablaOtroB = con.prepareStatement(sqlOtroB);
            tablaOtroB.setString(1, otroB);

            tablaOtroD = con.prepareStatement(sqlOtroD);
            tablaOtroD.setString(1, otroD);

            tablaFechaI = con.prepareStatement(sqlFechaI);
            tablaFechaI.setString(1, fechI);

        
            n = n + tablaArs.executeUpdate();
            n = n + tablaAfp.executeUpdate();
            n = n + tablaHoraE.executeUpdate();
            n = n + tablaOtroB.executeUpdate();
            n = n + tablaOtroD.executeUpdate();
            n = n + tablaFechaI.executeUpdate();
            n = n + tablaIRS.executeUpdate();
            
          */
           con.close();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, mensaje);
                //CargarTablaIngeniero("");
            }
            inhabilitar();
        } catch (SQLException e) {
            System.out.println("Error A GUARDAR");
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consulta11PP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta11PP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta11PP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta11PP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Consulta11PP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JLabel jLAFP;
    private javax.swing.JLabel jLARS;
    private javax.swing.JLabel jLFechaI;
    private javax.swing.JLabel jLHoraEx;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLISR;
    private javax.swing.JLabel jLOtroB;
    private javax.swing.JLabel jLOtroDes;
    private javax.swing.JLabel jLSalario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jlDept;
    private javax.swing.JMenuItem mmEditar;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JTextField txtAFp;
    private javax.swing.JTextField txtARS;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDept;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaI;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtHoraE;
    private javax.swing.JTextField txtISR;
    private javax.swing.JTextField txtOtroB;
    private javax.swing.JTextField txtOtroD;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
