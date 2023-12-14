/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package L10_GUI.S11_JTable;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGHIA NGUYEN
 */
public class JTableDemo3 extends javax.swing.JFrame {

    /**
     * Creates new form JTableDemo
     */
    public JTableDemo3() {
        initComponents();
        initDataTable();
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
        postCodesTable = new javax.swing.JTable();
        selectedRowLbl = new javax.swing.JLabel();
        selectedRowData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        postCodesTable.setAutoCreateRowSorter(true);
        postCodesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Province/City", "PostalCode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        postCodesTable.setColumnSelectionAllowed(false);
        jScrollPane1.setViewportView(postCodesTable);
        if (postCodesTable.getColumnModel().getColumnCount() > 0) {
            postCodesTable.getColumnModel().getColumn(0).setPreferredWidth(250);
        }

        selectedRowLbl.setText("Selected row:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectedRowLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedRowData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectedRowLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(selectedRowData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     */
    public void initDataTable() {

        /**
         * get the properties of current table model first, then add new rows to
         * it
         */
        // get current properties
        DefaultTableModel defaultTableModel = (DefaultTableModel) postCodesTable.getModel();

        // add rows
        defaultTableModel.addRow(new Object[]{"Hà Giang", "20xxx"});
        defaultTableModel.addRow(new Object[]{"Cao Bằng", "21xxx"});
        defaultTableModel.addRow(new Object[]{"Bắc Kạn", "23xxx"});
        defaultTableModel.addRow(new Object[]{"Tuyên Quang", "22xxx"});
        defaultTableModel.addRow(new Object[]{"Lào Cai", "31xxx"});
        defaultTableModel.addRow(new Object[]{"Điện Biên", "32xxx"});
        defaultTableModel.addRow(new Object[]{"Lai Châu", "30xxx"});
        defaultTableModel.addRow(new Object[]{"Sơn La", "34xxx"});
        defaultTableModel.addRow(new Object[]{"Yên Bái", "33xxx"});
        defaultTableModel.addRow(new Object[]{"Hòa Bình", "36xxx"});
        defaultTableModel.addRow(new Object[]{"Thái Nguyên", "24xxx"});

        ListSelectionModel listSelectionModel = postCodesTable.getSelectionModel();
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = postCodesTable.getSelectedRow();

                selectedRowData.setText(String.valueOf(postCodesTable.getValueAt(selectedRow, 0))
                        + " - " + String.valueOf(postCodesTable.getValueAt(selectedRow, 1)));

            }
        });

    }

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
            java.util.logging.Logger.getLogger(JTableDemo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTableDemo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTableDemo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTableDemo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTableDemo3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable postCodesTable;
    private javax.swing.JLabel selectedRowData;
    private javax.swing.JLabel selectedRowLbl;
    // End of variables declaration//GEN-END:variables
}
