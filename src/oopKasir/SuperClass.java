/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopKasir;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Ilham
 */
public class SuperClass {
    
    public double BasoKikil;
    public double BasoCampur;
    public double MieBasoKuah;
    public double MieAyam;
    
    public double TehManis;
    public double EsJeruk;
    public double EsCampur;
    public double AirMineral;
    
    public double Makanan;
    public double Minuman;
    public double TotalMM;
    
    public double AllTotalMM;
    
    public double GetAmout(){
        
        Makanan = BasoKikil + BasoCampur + MieBasoKuah + MieAyam;
        Minuman = TehManis + EsJeruk + EsCampur + AirMineral;
        TotalMM = Makanan + Minuman;
        AllTotalMM = TotalMM;
        return AllTotalMM;
        
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Konfirmasi jika anda ingin keluar", "Aplikasi Kasir Bakso Mas Galing",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    //=====================pric================
    public double hBasoKikil = 37.000;
    public double hBasoCampur = 23.000;
    public double hMieBasoKuah = 27.000;
    public double hMieAyam = 25.000;
    
    public double hTehManis = 6.000;
    public double hEsJeruk = 10.000;
    public double hEsCampur = 12.000;
    public double hAirMineral = 5.000;
    
    //=============pajak
    public double Pajak = 0.5;
    
    public double hItungPajak(double hPajak){
        double ItungPajak = Pajak + (hPajak / 100 );
        return ItungPajak;
    }
    
}
