
import java.time.Clock;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class Interfaz extends javax.swing.JFrame {
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tLUno = new javax.swing.JTextField();
        tCUno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tLDos = new javax.swing.JTextField();
        tCDos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tLTres = new javax.swing.JTextField();
        tCTres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tLCuatro = new javax.swing.JTextField();
        tCCuatro = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablona = new javax.swing.JTable();
        btnEjecutar = new javax.swing.JButton();
        indice = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel1.setText("Algoritmo de planificación SRTF “short remaining time first”");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Procesos");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Tiempo de llegada");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Tiempo de CPU");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Proceso 1");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Proceso 2");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Proceso 3");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Proceso 4");

        tablona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Proceso", "Tiempo de llegada", "Tiempo de CPU", "Tiempo de espera", "Tiempo de respuesta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablona);
        if (tablona.getColumnModel().getColumnCount() > 0) {
            tablona.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        indice.setText("0");

        jLabel11.setText("Segundos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btnEjecutar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(indice)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addGap(96, 96, 96)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tLUno)
                                            .addComponent(tLDos)
                                            .addComponent(tLTres)
                                            .addComponent(tLCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(85, 85, 85)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tCUno)
                                            .addComponent(tCDos)
                                            .addComponent(tCTres)
                                            .addComponent(tCCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tLUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tLDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tLTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tLCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indice)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEjecutar)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnEjecutar) {
            try {
                
                Procesos a = new Procesos(Integer.valueOf(tLUno.getText()), Integer.valueOf(tCUno.getText()));// SE CREAN LOS PROCESOS
                Procesos b = new Procesos(Integer.valueOf(tLDos.getText()), Integer.valueOf(tCDos.getText()));
                Procesos c = new Procesos(Integer.valueOf(tLTres.getText()), Integer.valueOf(tCTres.getText()));
                Procesos d = new Procesos(Integer.valueOf(tLCuatro.getText()), Integer.valueOf(tCCuatro.getText()));
                TablaProcesos tablaProcesos = new TablaProcesos();
                tablaProcesos.agregar(a, b, c, d);
                
                tablaProcesos.ordenar(2); // PRIMERO SE ORDENA POR TIEMPOS DE CPU Y
                // LUEGO POR
                tablaProcesos.ordenar(1); // TIEMPO DE LLEGADA EN CASO DE QUE DOS
                // PROCESOS LLEGUEN A LA VEZ

                tablaProcesos.datosCPU();
                TimerTask timerTask = new TimerTask() {
                    int i = -1;
                    
                    public void run() {
                        // Aqu� el c�digo que queremos ejecutar.

                        tablaProcesos.iniciar(i);
                        i++;
                        Colores c = new Colores();
                        c.pedirDatos(tablaProcesos.getProceso());

                        tablona.setDefaultRenderer(Object.class, c);

                        boolean cond = false;

                        if (tablaProcesos.getProceso() == 5) {

                            // EL PROCESO ACTUAL NO EXISTE, 5 ES PARA QUE NO REDUZCA
                            // NINGUNO,ES UN MECANISMO DE CONTROL MIENTRAS INGRESA EL
                            // PRIMER PROCESO
                            tablaProcesos.imprimir(tablaProcesos.getTabla(), tablona);

                            System.out.println();
                            System.out.println("i:  " + i);
                            System.out.println("Proceso Actual:   " + tablaProcesos.getProceso());

                        } else {
                            // S� NO ES 5 SIGNIFICA QUE EL PRIMER PROCESO EN LLEGAR Y
                            // CON MENOR
                            // TIEMPO DE CPU SE HA INICIADO

                            

                            tablaProcesos.validarProcesoNuevo(i); 														// DEL
                            cond = tablaProcesos.validaCero();

                            tablaProcesos.validarProcesoMasCorto(cond, i);
                            tablaProcesos.reducirTiempoCPU(tablaProcesos.getProceso());
                            tablaProcesos.imprimir(tablaProcesos.getTabla(), tablona); // EN CASO DE
                           
                            boolean x = tablaProcesos.terminar();
                            //
                            //
                            //
                            //
                            //
                            if (x == true) {
                                cancel();// QUE validarProcesoNuevo SEA TRUE SIGNIFICA
                                // QUE EL
                                // PROCESO ACTUAL LLEGO A CERO Y PROCEDE A INICIAR EL
                                // PROCESO
                                // CON MENOR TIEMPO DE CPU

                            }
                            tablaProcesos.tiempoEspera(i);
                            tablaProcesos.tiempoRespuesta();

                            System.out.println();
                            indice.setText(String.valueOf(i));

                        }
                        

                    }

                };

                // Aqu� se pone en marcha el timer cada segundo.
                Timer timer = new Timer();
                // Dentro de 0 milisegundos av�same cada 1000 milisegundos
                timer.scheduleAtFixedRate(timerTask, 0, 1000);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Error de algún tipo " + "\n" + e);
                
            }
            	
     

        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JLabel indice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField tCCuatro;
    private javax.swing.JTextField tCDos;
    private javax.swing.JTextField tCTres;
    private javax.swing.JTextField tCUno;
    private javax.swing.JTextField tLCuatro;
    private javax.swing.JTextField tLDos;
    private javax.swing.JTextField tLTres;
    private javax.swing.JTextField tLUno;
    private javax.swing.JTable tablona;
    // End of variables declaration//GEN-END:variables

    public JTable getTablona() {
        return tablona;
    }

    public void setTablona(JTable tablona) {
        this.tablona = tablona;
    }
}
