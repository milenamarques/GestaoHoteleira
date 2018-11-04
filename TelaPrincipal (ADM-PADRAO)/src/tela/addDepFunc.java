/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Departamento;
import logica.Funcionario;

/**
 *
 * @author Davi
 */
public class addDepFunc extends javax.swing.JFrame {
    ArrayList<Departamento> ListaDep;
    ArrayList<Funcionario> ListaFunc;
    String modoDep;
    String modoFunc;
    
    public void LoadTableDep(){
    DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código","Nome"},0);
    
    
    for(int i=0;i<ListaDep.size();i++){
        Object linha[] = new Object[]{ListaDep.get(i).getCodigo(),
                                    ListaDep.get(i).getNome()};
        modelo.addRow(linha);
        }
    
        tbl_dep_dpts.setModel(modelo);
        tbl_dep_dpts.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_dep_dpts.getColumnModel().getColumn(1).setPreferredWidth(200);
        
        LoadCBDep();
    }
    
    public void LoadCBDep(){
    cb_func_deps.removeAllItems();
    cb_func_deps.addItem("Selecione");
    
    
    for(int i=0;i<ListaDep.size();i++){
        cb_func_deps.addItem(ListaDep.get(i).getNome());
    }   
    }
     
    public void LoadTableFunc(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Matrícula","Nome","Departamento"},0);
    
    for(int i=0;i<ListaFunc.size();i++){
        Object linha[] = new Object[]{ListaFunc.get(i).getMatricula(),
                                    ListaFunc.get(i).getNome(),
                                    ListaFunc.get(i).getDep().getNome()};
        modelo.addRow(linha);
        }
    
        tbl_func_funcs.setModel(modelo);
        tbl_func_funcs.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_func_funcs.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbl_func_funcs.getColumnModel().getColumn(2).setPreferredWidth(100);
        
    }
    /**
     * Creates new form TelaPrincipal
     */
    public addDepFunc() {
        initComponents();
        setLocationRelativeTo(null);
        ListaDep = new ArrayList();
        ListaFunc = new ArrayList();
        modoDep= "Navegar";
        modoFunc= "Navegar";
        ManipulaInterfaceDep();
        ManipulaInterfaceFunc();
    }

    public void ManipulaInterfaceDep(){
        switch(modoDep){
            case "Navegar":
                    btn_dep_salvar.setEnabled(false);
                    btn_dep_cancelar.setEnabled(false);
                    c_dep_codigo.setEnabled(false);
                    c_dep_nome.setEnabled(false);  
                    btn_dep_novo.setEnabled(true);
                    btn_dep_editar.setEnabled(false);
                    btn_dep_excluir.setEnabled(false);
                    cb_func_deps.setEnabled(false);
                break;
            case "Novo":
                    btn_dep_salvar.setEnabled(true);
                    btn_dep_cancelar.setEnabled(true);
                    c_dep_codigo.setEnabled(true);
                    cb_func_deps.setEnabled(true);
                    c_dep_nome.setEnabled(true);

                    btn_dep_editar.setEnabled(false);
                    btn_dep_excluir.setEnabled(false);
                break;
            case "Editar":
                    btn_dep_salvar.setEnabled(true);
                    btn_dep_cancelar.setEnabled(true);
                    c_dep_codigo.setEnabled(true);
                    c_dep_nome.setEnabled(true);
                    cb_func_deps.setEnabled(true);
                    btn_dep_novo.setEnabled(true);
                    btn_dep_editar.setEnabled(false);
                    btn_dep_excluir.setEnabled(false);
                break;
            case "Excluir":
                    btn_dep_salvar.setEnabled(true);
                    btn_dep_cancelar.setEnabled(true);
                    c_dep_codigo.setEnabled(false);
                    cb_func_deps.setEnabled(false);
                    c_dep_nome.setEnabled(false);
                    btn_dep_novo.setEnabled(true);
                    btn_dep_editar.setEnabled(false);
                    btn_dep_excluir.setEnabled(false);                
                break;
            case "Selecao":
                    btn_dep_salvar.setEnabled(false);
                    btn_dep_cancelar.setEnabled(false);
                    c_dep_codigo.setEnabled(false);
                    c_dep_nome.setEnabled(false);
                    cb_func_deps.setEnabled(false);
                    btn_dep_novo.setEnabled(true);
                    btn_dep_editar.setEnabled(true);
                    btn_dep_excluir.setEnabled(true);                     
                break;
            
            default: System.out.println("Modo Inválido");
        }
    }
    public void ManipulaInterfaceFunc(){
        switch(modoFunc){
            case "Navegar":
                    btn_func_salvar.setEnabled(false);
                    btn_func_cancelar.setEnabled(false);
                    c_func_mat.setEnabled(false);
                    c_func_nome.setEnabled(false);  
                    btn_func_novo.setEnabled(true);
                    btn_func_editar.setEnabled(false);
                    btn_func_excluir.setEnabled(false);
                    cb_func_deps.setEnabled(false);
                break;
            case "Novo":
                    btn_func_salvar.setEnabled(true);
                    btn_func_cancelar.setEnabled(true);
                    c_func_mat.setEnabled(true);
                    c_func_nome.setEnabled(true);  
                    btn_func_novo.setEnabled(true);
                    btn_func_editar.setEnabled(false);
                    btn_func_excluir.setEnabled(false);
                    cb_func_deps.setEnabled(true);
                break;
            case "Editar":
                    btn_func_salvar.setEnabled(true);
                    btn_func_cancelar.setEnabled(true);
                    c_func_mat.setEnabled(true);
                    c_func_nome.setEnabled(true);  
                    btn_func_novo.setEnabled(true);
                    btn_func_editar.setEnabled(false);
                    btn_func_excluir.setEnabled(false);
                    cb_func_deps.setEnabled(true);
                break;
            case "Excluir":
                    btn_func_salvar.setEnabled(false);
                    btn_func_cancelar.setEnabled(false);
                    c_func_mat.setEnabled(false);
                    c_func_nome.setEnabled(false);  
                    btn_func_novo.setEnabled(true);
                    btn_func_editar.setEnabled(false);
                    btn_func_excluir.setEnabled(false);
                    cb_func_deps.setEnabled(false);               
                break;
            case "Selecao":
                    btn_func_salvar.setEnabled(false);
                    btn_func_cancelar.setEnabled(false);
                    c_func_mat.setEnabled(false);
                    c_func_nome.setEnabled(false);  
                    btn_func_novo.setEnabled(true);
                    btn_func_editar.setEnabled(true);
                    btn_func_excluir.setEnabled(true);
                    cb_func_deps.setEnabled(false);                  
                break;
            
            default: System.out.println("Modo Inválido");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dep_dpts = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        c_dep_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_dep_nome = new javax.swing.JTextField();
        btn_dep_salvar = new javax.swing.JButton();
        btn_dep_cancelar = new javax.swing.JButton();
        btn_dep_novo = new javax.swing.JButton();
        btn_dep_editar = new javax.swing.JButton();
        btn_dep_excluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_func_novo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_func_funcs = new javax.swing.JTable();
        btn_func_editar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        c_func_mat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_func_nome = new javax.swing.JTextField();
        btn_func_salvar = new javax.swing.JButton();
        btn_func_cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cb_func_deps = new javax.swing.JComboBox<>();
        btn_func_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_dep_dpts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_dep_dpts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dep_dptsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_dep_dpts);
        if (tbl_dep_dpts.getColumnModel().getColumnCount() > 0) {
            tbl_dep_dpts.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_dep_dpts.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Departamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        btn_dep_salvar.setText("Salvar");
        btn_dep_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dep_salvarActionPerformed(evt);
            }
        });

        btn_dep_cancelar.setText("Cancelar");
        btn_dep_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dep_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_dep_nome)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_dep_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_dep_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btn_dep_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_dep_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_dep_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dep_salvar)
                    .addComponent(btn_dep_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_dep_novo.setText("Novo");
        btn_dep_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dep_novoActionPerformed(evt);
            }
        });

        btn_dep_editar.setText("Editar");
        btn_dep_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dep_editarActionPerformed(evt);
            }
        });

        btn_dep_excluir.setText("Excluir");
        btn_dep_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dep_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_dep_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btn_dep_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn_dep_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dep_novo)
                    .addComponent(btn_dep_editar)
                    .addComponent(btn_dep_excluir))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Departamentos", jPanel3);

        btn_func_novo.setText("Novo");
        btn_func_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_novoActionPerformed(evt);
            }
        });

        tbl_func_funcs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_func_funcs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_func_funcsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_func_funcs);
        if (tbl_func_funcs.getColumnModel().getColumnCount() > 0) {
            tbl_func_funcs.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_func_funcs.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbl_func_funcs.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        btn_func_editar.setText("Editar");
        btn_func_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_editarActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Departamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel3.setText("Matrícula:");

        jLabel4.setText("Nome:");

        btn_func_salvar.setText("Salvar");
        btn_func_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_salvarActionPerformed(evt);
            }
        });

        btn_func_cancelar.setText("Cancelar");
        btn_func_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_cancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Dep:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_func_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(btn_func_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                            .addComponent(btn_func_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cb_func_deps, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(c_func_nome, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_func_mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_func_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cb_func_deps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_func_salvar)
                    .addComponent(btn_func_cancelar))
                .addContainerGap())
        );

        btn_func_excluir.setText("Excluir");
        btn_func_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_func_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btn_func_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn_func_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_func_novo)
                    .addComponent(btn_func_editar)
                    .addComponent(btn_func_excluir))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionarios", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dep_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dep_novoActionPerformed
        
        c_dep_codigo.setText("");
        c_dep_nome.setText("");
        
        modoDep="Novo";
        ManipulaInterfaceDep();

    }//GEN-LAST:event_btn_dep_novoActionPerformed

    private void btn_dep_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dep_cancelarActionPerformed
        c_dep_codigo.setText("");
        c_dep_nome.setText("");
        
        modoDep="Navegar";
        ManipulaInterfaceDep();

    }//GEN-LAST:event_btn_dep_cancelarActionPerformed

    private void btn_dep_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dep_salvarActionPerformed
        int cod = Integer.parseInt(c_dep_codigo.getText());
        if(modoDep.equals("Novo")){

        Departamento D = new Departamento(cod, c_dep_nome.getText());
        ListaDep.add(D);
        }else if(modoDep.equals("Editar")){
        
            int index = tbl_dep_dpts.getSelectedRow();
            ListaDep.get(index).setCodigo(cod);
            ListaDep.get(index).setNome(c_dep_nome.getText());
        
        }
        LoadTableDep();
        modoDep="Navegar";
        ManipulaInterfaceDep();
        c_dep_codigo.setText("");
        c_dep_nome.setText("");
        
        
    }//GEN-LAST:event_btn_dep_salvarActionPerformed

    private void tbl_dep_dptsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dep_dptsMouseClicked
        int index = tbl_dep_dpts.getSelectedRow();
        if(index>=0 && index<ListaDep.size()){
            Departamento D = ListaDep.get(index);
            c_dep_codigo.setText(String.valueOf(D.getCodigo()));
            c_dep_nome.setText(D.getNome());
            
            modoDep="Selecao";
            ManipulaInterfaceDep();
        }

        
    }//GEN-LAST:event_tbl_dep_dptsMouseClicked

    private void btn_dep_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dep_editarActionPerformed
        
             modoDep="Editar";
             ManipulaInterfaceDep();
             
    }//GEN-LAST:event_btn_dep_editarActionPerformed

    private void btn_dep_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dep_excluirActionPerformed
        int index = tbl_dep_dpts.getSelectedRow();
        if(index>=0 && index<ListaDep.size()){
            ListaDep.remove(index);
        }
            LoadTableDep();
            modoDep="Navegar";
            ManipulaInterfaceDep();
       
    }//GEN-LAST:event_btn_dep_excluirActionPerformed

    private void btn_func_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_novoActionPerformed
        modoFunc="Novo";
        ManipulaInterfaceFunc();
        
    }//GEN-LAST:event_btn_func_novoActionPerformed

    private void tbl_func_funcsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_func_funcsMouseClicked
        modoFunc="Selecao";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_tbl_func_funcsMouseClicked

    private void btn_func_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_editarActionPerformed
         modoFunc="Editar";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_editarActionPerformed

    private void btn_func_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_salvarActionPerformed
        int index = cb_func_deps.getSelectedIndex();
        if(index==0){
            JOptionPane.showMessageDialog(this,"Selecione Dep");
        } else{
            Funcionario F = new Funcionario();
            F.setMatricula(Integer.parseInt(c_func_mat.getText()));
            F.setNome(c_func_nome.getText());  
            F.setDep(ListaDep.get(index-1));
            ListaDep.get(index-1).addFunc(F);
            ListaFunc.add(F);
            
        }
        modoFunc="Navegar";
        LoadTableFunc();
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_salvarActionPerformed

    private void btn_func_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_cancelarActionPerformed
        modoFunc="Navegar";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_cancelarActionPerformed

    private void btn_func_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_excluirActionPerformed
        int index = tbl_func_funcs.getSelectedRow();
        if(index>=0 && index<ListaFunc.size()){
            ListaFunc.remove(index);
        }
            
        LoadTableFunc();
     
        modoFunc="Excluir";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_excluirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addDepFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDepFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDepFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDepFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDepFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dep_cancelar;
    private javax.swing.JButton btn_dep_editar;
    private javax.swing.JButton btn_dep_excluir;
    private javax.swing.JButton btn_dep_novo;
    private javax.swing.JButton btn_dep_salvar;
    private javax.swing.JButton btn_func_cancelar;
    private javax.swing.JButton btn_func_editar;
    private javax.swing.JButton btn_func_excluir;
    private javax.swing.JButton btn_func_novo;
    private javax.swing.JButton btn_func_salvar;
    private javax.swing.JTextField c_dep_codigo;
    private javax.swing.JTextField c_dep_nome;
    private javax.swing.JTextField c_func_mat;
    private javax.swing.JTextField c_func_nome;
    private javax.swing.JComboBox<String> cb_func_deps;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_dep_dpts;
    private javax.swing.JTable tbl_func_funcs;
    // End of variables declaration//GEN-END:variables
}
