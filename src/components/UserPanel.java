/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package components;

import User.DBConnection;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JButton;

/**
 *
 * @author USER
 */
public final class UserPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserPanel
     */
    public UserPanel() {
        initComponents();
        loadUserTable(); 

        userTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                tableRowClicked(evt); // Method to load selected row data into form
            }
        });

// ✅ Handle Delete button click inside table
        userTable.setDefaultEditor(Object.class, null); // Disable default text editing
        userTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int row = userTable.rowAtPoint(e.getPoint());
                int column = userTable.columnAtPoint(e.getPoint());

                if (column == 6) { // ✅ Only trigger for "Delete" column
                    userTable.editCellAt(row, column); // Activate cell editor
                    Component editor = userTable.getEditorComponent();
                    if (editor instanceof JButton jButton) {
                        jButton.doClick(); // Simulate button click
                    }
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        userPanel = new javax.swing.JPanel();
        txtFirstName = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cmbGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        lblFirstName = new javax.swing.JLabel();
        lblUname = new javax.swing.JLabel();
        lblLastname = new javax.swing.JLabel();
        lblUname1 = new javax.swing.JLabel();
        lblLastname1 = new javax.swing.JLabel();
        lblFirstName1 = new javax.swing.JLabel();

        userPanel.setBackground(new java.awt.Color(204, 204, 204));

        txtFirstName.setPreferredSize(new java.awt.Dimension(71, 30));
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastname.setName(""); // NOI18N

        txtID.setEnabled(false);

        saveBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Username", "Email", "Gender", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.setRowHeight(25);
        jScrollPane1.setViewportView(userTable);

        lblFirstName.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblFirstName.setText("Firstname");

        lblUname.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblUname.setText("Username");

        lblLastname.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblLastname.setText("Lastname");

        lblUname1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblUname1.setText("ID");

        lblLastname1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblLastname1.setText("Gender");

        lblFirstName1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblFirstName1.setText("Email");

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUname)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastname1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUname1)
                            .addGroup(userPanelLayout.createSequentialGroup()
                                .addComponent(txtID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                            .addGroup(userPanelLayout.createSequentialGroup()
                                .addComponent(lblFirstName)
                                .addGap(121, 121, 121)
                                .addComponent(lblLastname)
                                .addGap(691, 691, 691)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(lblUname)
                            .addComponent(lblLastname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFirstName1)
                                .addComponent(lblLastname1))
                            .addComponent(lblUname1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        // ✅ Get updated values from form fields
        String id = txtID.getText();
        String firstname = txtFirstName.getText();
        String lastname = txtLastname.getText();
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String gender = cmbGender.getSelectedItem().toString();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "⚠ Please select a user first!");
            return;
        }

        // ✅ Update Query
        String sql = "UPDATE user_tbl SET firstname=?, lastname=?, username=?, email=?, gender=? WHERE id=?";

        try (Connection conn = DBConnection.openDBConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, firstname);
            pstmt.setString(2, lastname);
            pstmt.setString(3, username);
            pstmt.setString(4, email);
            pstmt.setString(5, gender);
            pstmt.setInt(6, Integer.parseInt(id));

            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "✅ User updated successfully!");
                loadUserTable(); // ✅ Refresh table after update

                txtFirstName.setText("");
                txtLastname.setText("");
                txtUsername.setText("");
                txtEmail.setText("");
                cmbGender.setSelectedIndex(0);
                txtID.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "❌ Update failed. No changes made.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error updating user: " + e.getMessage());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed
    public void loadUserTable() {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);
        Connection conn = null;
        try {
            conn = DBConnection.openDBConnection();
            String sql = "SELECT id, firstname, lastname, username, email, gender FROM user_tbl";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id"),
                    rs.getString("firstname"),
                    rs.getString("lastname"),
                    rs.getString("username"),
                    rs.getString("email"),
                    rs.getString("gender"),
                    "Delete"
                };
                model.addRow(row); // Add row to JTable
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "❌ Error loading users: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void tableRowClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = userTable.getSelectedRow();
        int selectedColumn = userTable.columnAtPoint(evt.getPoint());

        // If the click is in the "Action" column (index 6), do nothing.
        if (selectedColumn == 6) {
            deleteUserRow(selectedRow, userTable.getValueAt(selectedRow, 0).toString());
            return;
        }

        if (selectedRow >= 0) { // Ensure a row is selected
            String id = userTable.getValueAt(selectedRow, 0).toString();
            String firstname = userTable.getValueAt(selectedRow, 1).toString();
            String lastname = userTable.getValueAt(selectedRow, 2).toString();
            String username = userTable.getValueAt(selectedRow, 3).toString();
            String email = userTable.getValueAt(selectedRow, 4).toString();
            String gender = userTable.getValueAt(selectedRow, 5).toString();

            // Load data into form fields for update
            txtID.setText(id);
            txtFirstName.setText(firstname);
            txtLastname.setText(lastname);
            txtUsername.setText(username);
            txtEmail.setText(email);
            cmbGender.setSelectedItem(gender);
        }
    }

    private void deleteUserRow(int selectedRow, String userId) {
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No row selected to delete.");
            return;
        }
        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to delete this user id = " + userId + "?",
                "Confirm Delete", JOptionPane.YES_NO_OPTION);

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }
        try (Connection conn = DBConnection.openDBConnection()) {
            // Get the user id from the selected row (assuming id is in column 0)
            int id = Integer.parseInt(userTable.getValueAt(selectedRow, 0).toString());
            // Prepare the DELETE query
            String sql = "DELETE FROM user_tbl WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, id);
                int result = pstmt.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "User deleted successfully!");
                    loadUserTable();  // Refresh the table after deletion
                } else {
                    JOptionPane.showMessageDialog(this, "Deletion failed. No rows affected.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting user: " + e.getMessage());
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblLastname1;
    private javax.swing.JLabel lblUname;
    private javax.swing.JLabel lblUname1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPanel userPanel;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
