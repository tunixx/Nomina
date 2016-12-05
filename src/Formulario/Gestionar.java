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
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

public class Gestionar extends javax.swing.JFrame {
    double ISR;
   
    //DefaultTableModel modelo;
    public Gestionar() {
        initComponents();
        // CargarTablaIngeniero("");
      inhabilitar();
        //       System.out.println("Cargando");
    }
 
    public double calcularISR(double salario){
           
        if(salario >= 409281.00 && salario <= 613921.00){
             ISR=((salario-409281.00)*0.15)/12;    
           //  System.out.println(ISR);
            }else if(salario >= 613921.00 && salario <= 852667.00){
             ISR=((salario-613921.00)*0.20)/12+(30696.00/12); 
            // System.out.println(ISR);
            }else if(salario >= 852667.01){
            ISR=((salario-852667.01)*0.25)/12+(78446.00/12); 
            // System.out.println(ISR);
        }else{
                ISR = 0;
            }
        
        return ISR;
        }
    void habilitarActualizar(){
        
    
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtFechaI.setEnabled(false);
        txtSalario.setEnabled(false);
        txtBuscar1.setEnabled(false);
        txtOtroD.requestFocus();

    }
    void habilitar() {

        btnbuscar1.setEnabled(true);
        btnSalir.setEnabled(true);
        txtHoraE.setEnabled(true);
        txtOtroB.setEnabled(true);
        txtOtroD.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnCargar.setEnabled(true);
        txtBuscar1.setEnabled(true);
           
       // txtBuscar1.setText("");
        
      
        txtHoraE.setText("");
        txtOtroB.setText("");
        txtOtroD.setText("");
      //  jPSalario.setText("");
        txtOtroD.requestFocus();

    }
    void inhabilitar() {
        txtSalario.setEnabled(false);
        txtNombre.setEnabled(false);
        txtFechaActual.setEnabled(false);
        txtApellido.setEnabled(false);
        btnCargar.setEnabled(false);
        btnNuevo.setEnabled(false);
        txtHoraE.setEnabled(false);
        txtOtroB.setEnabled(false);
        txtOtroD.setEnabled(false);
        txtFechaI.setEnabled(false);
    }
    void inhabilitarNuevo() {

        
         txtSalario.setEnabled(false);
        txtNombre.setEnabled(false);
        txtFechaActual.setEnabled(false);
        txtApellido.setEnabled(false);
        btnCargar.setEnabled(false);
       // btnNuevo.setEnabled(false);
        txtHoraE.setEnabled(false);
        txtOtroB.setEnabled(false);
        txtOtroD.setEnabled(false);
        txtFechaI.setEnabled(false);

       // txtBuscar1.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtHoraE.setText("");
        txtOtroB.setText("");
        txtOtroD.setText("");
        txtFechaI.setText("");
       
      

        txtBuscar1.requestFocus();

    }
      
      
  String id= "";
  void BuscarEmpleado(String id){
       
        ConexionMySQL mysql = new ConexionMySQL ();
        Connection con = mysql.Conectar();
        Calendar fecha = new GregorianCalendar();
       
        String sqlEmpleado,sqlNominaTran;

      
        String  cod = "",estCivil ="",statud ="",ap1= "", ap2= "", nom1= "", nom2= "", fn= "", tel= "", gen= "", car= "", dept= "", sal= "", dic= "", ced= "" ; //Tabla Empleado
        String afp = "", ars= "", isr= ""; //Tabla deducible
        String horaEx= "", otroB= "", otroD= "", fechI= ""; // Tablas 
        String fechA;
        
        //fecha Actual

        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        fechA = String.valueOf(ano)+"-"+String.valueOf(mes)+"-"+String.valueOf(dia);
  
        sqlEmpleado =  "SELECT *FROM Empleado WHERE empleadoCodigo ='"+id+"'";
       
       // sqlNominaTran = "SELECT *FROM TransacionNomina WHERE empleadoCodigo ='"+id+"'";
         /*
        sqlIrs = "SELECT *FROM IRS WHERE empleadoCodigo = "+id;
        sqlArs = "SELECT *FROM ARS WHERE empleadoCodigo = "+id;
        sqlHoraE = "SELECT *FROM HoraExtra WHERE empleadoCodigo = "+id;
        sqlOtroB = "SELECT *FROM OtroBeneficio WHERE empleadoCodigo = "+id;
        sqlOtroD = "SELECT *FROM OtroDescuento WHERE empleadoCodigo = "+id;
        sqlFechaI = "SELECT *FROM FechaIngreso WHERE empleadoCodigo = "+id;
             
       */
        try {
            Statement estadoEmpleado,estadoNominaTran;
            ResultSet  tablaEmpleado,tablaNominaTran;

            estadoEmpleado = con.createStatement();
            estadoNominaTran = con.createStatement();

            
            tablaEmpleado = estadoEmpleado.executeQuery(sqlEmpleado);
           
            //tablaNominaTran = estadoNominaTran.executeQuery(sqlNominaTran);
            
          while(tablaEmpleado.next()){
                //cod = tablaEmpleado.getString( "empleadoCodigo");
                nom1 = tablaEmpleado.getString("empleadoNombre");
                ap1 = tablaEmpleado.getString( "empleadoApellido");
                ced= tablaEmpleado.getString(  "empleadoCedula");
                gen = tablaEmpleado.getString( "empleadoGenero");
                estCivil = tablaEmpleado.getString(  "empleadoEstadoCivil");
                dic = tablaEmpleado.getString( "empleadoDireccion");
                tel = tablaEmpleado.getString( "empleadoTelefono");
                car = tablaEmpleado.getString( "empleadoPuesto");
                dept = tablaEmpleado.getString("empleadoDepartamento");
                sal = tablaEmpleado.getString( "empleadoSalario");
                statud = tablaEmpleado.getString( "empleadoEstado");
                fechI = tablaEmpleado.getString("empleadoFechaIngreso");
            }
       /*
             while( tablaNominaTran.next())
             {
                 isr = tablaNominaTran.getString("nominaISR");
                 afp = tablaNominaTran.getString("nominaAFp");
                 ars= tablaNominaTran.getString("nominaARS");
                 horaEx=tablaNominaTran.getString("nominaCantHoraExtra");
                 otroB=tablaNominaTran.getString("nominaOtrosBeneficios");
                 otroD=tablaNominaTran.getString("nominaOtrosDescuentos");
             }
       
        */  
                
                txtApellido.setText(ap1);
                txtNombre.setText(nom1);
                txtSalario.setText(sal);
                txtFechaI.setText(fechI);
                txtFechaActual.setText(fechA);

             con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
      
       habilitar();
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
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLOtroDes = new javax.swing.JLabel();
        jLFechaI = new javax.swing.JLabel();
        jLHoraEx = new javax.swing.JLabel();
        jLOtroB = new javax.swing.JLabel();
        txtHoraE = new javax.swing.JTextField();
        txtOtroB = new javax.swing.JTextField();
        txtFechaI = new javax.swing.JTextField();
        txtOtroD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        txtFechaActual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Apellido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 30));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 102, 0));
        btnNuevo.setText("Nueva");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 100, 40));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Developer\\Documents\\NetBeansProjects\\Empleado_Ferreteria_Ruben\\imagenes\\espalda-icono-5979-64.png")); // NOI18N
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 100, 80));

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtApellido.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 160, 30));

        jLOtroDes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLOtroDes.setText("Otros Descuentos");
        jPanel1.add(jLOtroDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 130, 30));

        jLFechaI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLFechaI.setText("Fecha de Ingreso");
        jPanel1.add(jLFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jLHoraEx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLHoraEx.setText("Hora Extras");
        jPanel1.add(jLHoraEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 100, 30));

        jLOtroB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLOtroB.setText("Otros Beneficios");
        jPanel1.add(jLOtroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 120, 20));

        txtHoraE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtHoraE.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHoraE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraEActionPerformed(evt);
            }
        });
        jPanel1.add(txtHoraE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 180, 30));

        txtOtroB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtOtroB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOtroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtroBActionPerformed(evt);
            }
        });
        jPanel1.add(txtOtroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 180, 30));

        txtFechaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaIActionPerformed(evt);
            }
        });
        jPanel1.add(txtFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 100, -1));

        txtOtroD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtOtroD.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOtroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtroDActionPerformed(evt);
            }
        });
        jPanel1.add(txtOtroD, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Developer\\Documents\\NetBeansProjects\\Empleado_Ferreteria_Ruben\\imagenes\\gestion.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 130, 120));

        btnCargar.setBackground(new java.awt.Color(255, 255, 255));
        btnCargar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 100, 40));
        jPanel1.add(txtFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha Actual");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Salario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        txtSalario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSalario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 100, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Developer\\Desktop\\smooth-ice.jpg")); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 470));

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
        jLabel6.setText("Gestion Nomina");

        btnbuscar1.setBackground(new java.awt.Color(0, 102, 0));
        btnbuscar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscar1.setText("Buscar");
        btnbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar1ActionPerformed(evt);
            }
        });

        txtBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscar1ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(153, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("CODIGO");

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
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscar1)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Datos de Empleado");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        txtApellido.transferFocus();
    }//GEN-LAST:event_txtApellidoActionPerformed

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

    private void txtOtroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtroBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtroBActionPerformed

    private void txtHoraEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraEActionPerformed

    private void txtFechaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIActionPerformed

    private void txtOtroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtroDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOtroDActionPerformed

    private void btnbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar1ActionPerformed
        String valor = txtBuscar1.getText();
        BuscarEmpleado(valor);
        habilitarActualizar();
        
    }//GEN-LAST:event_btnbuscar1ActionPerformed

    private void txtBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar1ActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed

        ConexionMySQL mysql = new ConexionMySQL();
        Connection con = mysql.Conectar();
        String valor;
        valor = txtBuscar1.getText();

      
        String horaEx, otroB, otroD, fechI,fechA,cod,  sal; // Tablas
        String sqlEmpleado;
        double montoHoraExtra,montoAFP,montoARS,montoISR,sueldoBruto,salarioR,totalD,sueldoNeto;

        String mensaje;
        mensaje = "Datos Guardados Correctamentes";

        //Datos Geteados
        fechA = txtFechaActual.getText();
        horaEx = txtHoraE.getText();
        otroB = txtOtroB.getText();
        otroD = txtOtroD.getText();
        cod = txtBuscar1.getText();
        sal = txtSalario.getText();

//HORA EXTRA 50 peso por hora

        montoHoraExtra = Double.parseDouble(horaEx)*100;
//Sueldo Bruto
         sueldoBruto = montoHoraExtra+Double.parseDouble(sal)+Double.parseDouble(otroB);   
 //AFP        
         montoAFP = (Double.parseDouble(sal)+Double.parseDouble(otroB))*(2.87/100);     
 //ARS
         montoARS = (Double.parseDouble(sal)+Double.parseDouble(otroB))*(3.04/100);
         //salario despues de ARS y AFP 
         salarioR = (Double.parseDouble(sal)+montoHoraExtra+Double.parseDouble(otroB))-montoAFP-montoARS;
 //ISR
        montoISR = calcularISR(salarioR*12);
 //total Descuento 
        totalD = montoAFP+montoARS+Double.parseDouble(otroD)+montoISR;
 // Sueldo Neto
        sueldoNeto = sueldoBruto-totalD;

       sqlEmpleado = "INSERT INTO TRANSACIONNOMINA (empleadoCodigo, nominaCantHoraExtra, nominaMontoHoraExtra, nominaOtrosDescuentos, nominaFecha, nominaOtrosBeneficios, nominaAFP, nominaARS, nominaISR, nominaSueldoBruto, nominaTotalDescuento, nominaSueldoNeto)"+ 
	"VALUES (?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            int n = 0;
            PreparedStatement tablaEmpleado;
            tablaEmpleado = con.prepareStatement(sqlEmpleado);
            
           
            tablaEmpleado.setString(1, cod);
            tablaEmpleado.setString(2, horaEx);
            tablaEmpleado.setDouble(3, montoHoraExtra);
            tablaEmpleado.setString(4, otroD);
            tablaEmpleado.setString(5, fechA);
            tablaEmpleado.setString(6, otroB);
            tablaEmpleado.setDouble(7, montoAFP);
            tablaEmpleado.setDouble(8, montoARS);
            tablaEmpleado.setDouble(9, montoISR );
            tablaEmpleado.setDouble(10, sueldoBruto);
            tablaEmpleado.setDouble(11, totalD);
            tablaEmpleado.setDouble(12, sueldoNeto);
           
            n = n + tablaEmpleado.executeUpdate();

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
    }//GEN-LAST:event_btnCargarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnbuscar1;
    private javax.swing.JLabel jLFechaI;
    private javax.swing.JLabel jLHoraEx;
    private javax.swing.JLabel jLOtroB;
    private javax.swing.JLabel jLOtroDes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mmEditar;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtFechaActual;
    private javax.swing.JTextField txtFechaI;
    private javax.swing.JTextField txtHoraE;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOtroB;
    private javax.swing.JTextField txtOtroD;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
