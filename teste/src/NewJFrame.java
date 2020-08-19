
import java.awt.Font;


public class NewJFrame extends javax.swing.JFrame {
    
    private String font = "Serif"; //Variavel de controle para fonte
    private int style;             //Variavel de controle para o estilo (negrito)
    private int size = 18;         //Variavel de controle para o tamanho

    //Declaração dos componentes                   
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
   
    public NewJFrame() { //construtor
        initComponents(); 
    }

    
   
                          
    private void initComponents() { //Instancia, define caracteristicas e organiza componentes

	//Instanciacao dos componentes
        jScrollPane1 = new javax.swing.JScrollPane(); 
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); // Operacao de fechamento da janela
	
	//Define a quantidade de colunas e linhas; fonte, estilo e tamanho; texto inicial para o JTextArea
        jTextArea1.setColumns(20); 
        jTextArea1.setFont(new java.awt.Font("Serif", 0, 18)); //tamanho inicial 18, como especificado
        jTextArea1.setRows(5); 
        jTextArea1.setText("Default"); 
        jScrollPane1.setViewportView(jTextArea1);
	
	//Define fonte, estilo e tamanho; texto inicial para o JButton1
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 20)); //tamanho inicial 20, como especificado
        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

	//Define fonte, estilo e tamanho; texto inicial para o JButton2
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 20)); //tamanho inicial 20, como especificado
        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

	//Define fonte, estilo e tamanho; opcoes para o JComboBox
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); //tamanho inicial 20, como especificado
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Serif", "SansSerif", "Monospaced", "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
	
	//Define fonte, estilo e tamanho; texto inicial para o JCheckBox
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); //tamanho inicial 20, como especificado
        jCheckBox1.setText("Negrito");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
	
	//Definicao do layout e das cordenadas dos componentes
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }                       
 	
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { //Aumenta em 1 o tamanho do texto quando acionado                                        
        size = size+1;
        jTextArea1.setFont(new Font(font,style,size));
    }                                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) { //Altera a fonte do texto de acordo com o item selecionado                                       
       if(jComboBox1.getSelectedItem()=="Serif"){
           font = "Serif";
           jTextArea1.setFont(new Font(font,style,size));        
       }else
           if(jComboBox1.getSelectedItem()=="SansSerif"){
                font = "SansSerif";
                jTextArea1.setFont(new Font(font,style,size));  
           }else
               if(jComboBox1.getSelectedItem()=="Monospaced"){
                   font = "Monospaced";
                   jTextArea1.setFont(new Font(font,style,size));
               }
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { //Diminui em 1 o tamanho do texto quando acionado	                                     
        size = size-1;
        jTextArea1.setFont(new Font(font,style,size));
    }                                        

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) { //Caso selecionado alterna o texto para negrito                                       
        if(jCheckBox1.isSelected()){ //Ativa o negrito
            style = Font.BOLD;
            jTextArea1.setFont(new Font(font,style,size));
        }
        else{ //Desativa o negrito
            style = 0;
            jTextArea1.setFont(new Font(font,style,size)); 
        }
    }                                          

 
    public static void main(String args[]) { 
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);//torna a janela visivel
            }
        });
    }

                  

}
