package PriorityQueue;

public class Loading extends javax.swing.JFrame {

    // Ini adalah kelas tampilan splash screen loading    
    public Loading() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        LabelPersen = new javax.swing.JLabel();
        LabelDeveloper1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelBackground.setBackground(new java.awt.Color(0, 102, 102));

        progressBar.setForeground(new java.awt.Color(0, 204, 153));

        LabelPersen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelPersen.setForeground(new java.awt.Color(255, 255, 255));
        LabelPersen.setText("100%");

        LabelDeveloper1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelDeveloper1.setForeground(new java.awt.Color(255, 255, 255));
        LabelDeveloper1.setText("Please wait...");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/dashboard1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RUMAH SAKIT ISLAM SALAMERTA");

        javax.swing.GroupLayout PanelBackgroundLayout = new javax.swing.GroupLayout(PanelBackground);
        PanelBackground.setLayout(PanelBackgroundLayout);
        PanelBackgroundLayout.setHorizontalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addGroup(PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBackgroundLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(PanelBackgroundLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBackgroundLayout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(LabelDeveloper1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelPersen))
                    .addGroup(PanelBackgroundLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        PanelBackgroundLayout.setVerticalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDeveloper1)
                    .addComponent(LabelPersen))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelDeveloper1;
    public javax.swing.JLabel LabelPersen;
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
