package DigitalClock;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DigitalClockFrame extends javax.swing.JFrame implements Runnable{
    int hour;
    int minute;
    int second;
    int day;
    int month;
    int year;
    String timestr;
    String yearstr;
    
    public DigitalClockFrame() {
        Thread t = new Thread(this);
        t.start();
        initComponents();
    }

    @Override
    public void run() {
        for(int i=1; i<5; i++){
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                System.out.println(ex);
                System.out.println(i);
            }
        }
        while(true){
            try{
                Calendar c = Calendar.getInstance();
                hour = c.get(Calendar.HOUR_OF_DAY);
                if(hour>12){
                    hour = hour-12;
                }
                minute = c.get(Calendar.MINUTE);
                second = c.get(Calendar.SECOND);
                year = c.get(Calendar.YEAR);
                month = c.get(Calendar.MONTH);
                day = c.get(Calendar.DAY_OF_MONTH);
                
                SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss a");
                SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
                
                Date tanggal = c.getTime();
                timestr = sdf1.format(tanggal);
                yearstr = sdf2.format(tanggal);
                time.setText(timestr);
                date.setText(yearstr);
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DIGITAL CLOCK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, -1));

        time.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText(" ");
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, -1));

        date.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText(" ");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DigitalClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DigitalClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DigitalClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DigitalClockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DigitalClockFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

}
