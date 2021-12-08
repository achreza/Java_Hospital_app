/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriorityQueue;

import java.sql.SQLException;

/**
 *
 * @author 62852
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Loading loading = new Loading();
        dropdown halamanutama = new dropdown();
        loading.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(10);
                loading.LabelPersen.setText(Integer.toString(i) + "%");
                loading.progressBar.setValue(i);
                if (i == 100) { 
                    halamanutama.setVisible(true);
                    loading.dispose();
                }
            }
        } 
        catch (InterruptedException e) {
        }
    }
}
