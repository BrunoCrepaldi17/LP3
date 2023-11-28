/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.compra_venda;

import controlador.CompraVendaDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Cliente;
import modelo.CompraVenda;
import modelo.CompraVendaProduto;
import visao.DadosDeSessao;
import visao.Selecionar;

/**
 *
 * @author bcrep
 */
public class Compra_Venda extends javax.swing.JFrame {

    /**
     * Creates new form Compra_Venda
     */
    public Compra_Venda() {
        /* this.setTitle(DadosDeSessao.nomeSistema + "-"+ 
                DadosDeSessao.getUsuario().getNome());*/
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxOperacao = new javax.swing.JComboBox<>();
        jTextFieldIdCliente = new javax.swing.JTextField();
        jTextFieldNomeCliente = new javax.swing.JTextField();
        jButtonSelecionarClientes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldIdProduto = new javax.swing.JTextField();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jButtonSelecionarProdutos = new javax.swing.JButton();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldValorUnitario = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jComboBoxFormaPagamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDesconto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Compra/Venda");

        jLabel2.setText("Operação:");

        jLabel3.setText("Clientes:");

        jComboBoxOperacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Compra", "Venda" }));

        jTextFieldIdCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldNomeCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonSelecionarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar-pequeno.png"))); // NOI18N
        jButtonSelecionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarClientesActionPerformed(evt);
            }
        });

        jLabel4.setText("Produto");

        jLabel5.setText("Qtd.");

        jTextFieldIdProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdProdutoActionPerformed(evt);
            }
        });

        jTextFieldNomeProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonSelecionarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar-pequeno.png"))); // NOI18N
        jButtonSelecionarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarProdutosActionPerformed(evt);
            }
        });

        jTextFieldQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("Valor Unit.");

        jTextFieldValorUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Produto", "Qtd.", "Valor Un.", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTableDados);

        jComboBoxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Pix", "Cartão de Crédito", "Cartão de Débito", "Boleto" }));
        jComboBoxFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFormaPagamentoActionPerformed(evt);
            }
        });

        jLabel7.setText("Forma de Pagamento:");

        jLabel8.setText("Desconto:");

        jTextFieldDesconto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldDesconto.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Valor Total:");

        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTotal.setText("0");
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        jButton6.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemove))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1)))
                .addGap(201, 245, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxOperacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldIdCliente)
                            .addComponent(jTextFieldIdProduto)
                            .addComponent(jTextFieldQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNomeProduto)
                                    .addComponent(jTextFieldNomeCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSelecionarClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSelecionarProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelecionarClientes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelecionarProdutos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonRemove))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        //validações
        if (jTextFieldQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe a quantidade.");
            jTextFieldQuantidade.requestFocus();
            return;
        }
        if (jTextFieldValorUnitario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o valor unitario.");
            jTextFieldValorUnitario.requestFocus();
            return;
        }
        if (jTextFieldNomeProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o nome do produto");
            jTextFieldNomeProduto.requestFocus();
            return;
        }
        if (jTextFieldIdProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o código do produto");
            jTextFieldIdProduto.requestFocus();
            return;
        }
        if (jTextFieldNomeCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o nome do cliente");
            jTextFieldNomeCliente.requestFocus();
            return;
        }
         if (jTextFieldIdCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o código do cliente");
            jTextFieldIdCliente.requestFocus();
            return;
        }
        
        Integer idProduto = Integer.parseInt(jTextFieldIdProduto.getText());
        String nome = jTextFieldNomeProduto.getText();
        Double qtd = Double.parseDouble(jTextFieldQuantidade.getText().replaceAll(",", "."));
        Double valorUnit = Double.parseDouble(jTextFieldValorUnitario.getText().replaceAll(",", "."));
        Double valorTotal = qtd * valorUnit;
        
        
        DefaultTableModel modelo = (DefaultTableModel) jTableDados.getModel();

        String[] linha = {
            idProduto.toString(), nome,
            qtd.toString(),
            valorUnit.toString(),
            valorTotal.toString()
        };
 
        modelo.addRow(linha);
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonSelecionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarClientesActionPerformed
        new Selecionar(
                jTextFieldIdCliente,
                jTextFieldNomeCliente,
                "cliente",
                "nome"
        ).setVisible(true);
    }//GEN-LAST:event_jButtonSelecionarClientesActionPerformed

    private void jTextFieldIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdProdutoActionPerformed

    private void jButtonSelecionarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarProdutosActionPerformed
        new Selecionar(
                jTextFieldIdProduto,
                jTextFieldNomeProduto,
                "produto",
                "nome"
        ).setVisible(true);
    }//GEN-LAST:event_jButtonSelecionarProdutosActionPerformed


    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        
        
//pega os dados para inserir em compravenda
        String operacao = jComboBoxOperacao.getSelectedItem().toString();
        String formaPagamento = jComboBoxFormaPagamento.getSelectedItem().toString();
        int cliente_id = Integer.valueOf(jTextFieldIdCliente.getText());
        double desconto = Double.valueOf(jTextFieldDesconto.getText());

        //cria o objeto compravenda
        CompraVenda cv = new CompraVenda();
        cv.setOperacao(operacao.substring(0, 1));// "C" ou "V"
        cv.setCliente_id(cliente_id);
        cv.setFormaPagamento(formaPagamento);
        cv.setDesconto(desconto);

        //percorrer todos os produtos para adicionar no compravenda
        TableModel tabela = jTableDados.getModel();
        //percorre cada linha da tabela Produto
        for (int linha = 0; linha < tabela.getRowCount(); linha++) {
            Integer id = Integer.parseInt(tabela.getValueAt(linha, 0).toString());
            Double quantidade = Double.parseDouble(tabela.getValueAt(linha, 3).toString());
            Double valorUn = Double.parseDouble(tabela.getValueAt(linha, 4).toString());

            CompraVendaProduto produto = new CompraVendaProduto();
            produto.setProduto_id(id);
            produto.setQuantidade(quantidade);
            produto.setValorUnitario(valorUn);

            cv.addProduto(produto);

        }

        CompraVendaDao dao = new CompraVendaDao();
        try {
            dao.inserir(cv);
            JOptionPane.showMessageDialog(this, "Cadastro inserido com sucesso");
            

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar: " + ex.getMessage());
        }


    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFormaPagamentoActionPerformed

    }//GEN-LAST:event_jComboBoxFormaPagamentoActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed

        int linhaSelecionada = jTableDados.getSelectedRow();
        if (linhaSelecionada == -1) {
            return;
        }
        jTableDados.remove(linhaSelecionada);
        
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

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
            java.util.logging.Logger.getLogger(Compra_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra_Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSelecionarClientes;
    private javax.swing.JButton jButtonSelecionarProdutos;
    private javax.swing.JComboBox<String> jComboBoxFormaPagamento;
    private javax.swing.JComboBox<String> jComboBoxOperacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTextField jTextFieldDesconto;
    private javax.swing.JTextField jTextFieldIdCliente;
    private javax.swing.JTextField jTextFieldIdProduto;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldValorUnitario;
    // End of variables declaration//GEN-END:variables
}
