package com.gebzesosyalyardim.GebzeSosyalYardim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.gebzesosyalyardim.GebzeSosyalYardim.entities")
@SpringBootApplication
public class GebzeSosyalYardimApplication {

    public static void main(String[] args) {
        SpringApplication.run(GebzeSosyalYardimApplication.class, args);
        try {
            Thread.sleep(3000); // Uygulama başlatıldıktan 3 saniye bekle
            openBrowser("http://localhost:8080"); // Tarayıcıyı aç
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void openBrowser(String url) {
        try {            
            // Eğer sistem masaüstü desteği sağlıyorsa, tarayıcıyı aç
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(url));
            } else {              
                // İşletim sistemine göre uygun komutları çalıştır
                String os = System.getProperty("os.name").toLowerCase();
                if (os.contains("win")) {
                    Runtime.getRuntime().exec("cmd /c start " + url);  // Windows
                } else if (os.contains("mac")) {
                    Runtime.getRuntime().exec("open " + url);  // MacOS
                } else if (os.contains("nix") || os.contains("nux")) {
                    Runtime.getRuntime().exec("xdg-open " + url);  // Linux
                }
            }
        } catch (IOException | URISyntaxException e) {
            // Hata mesajını yazdır
            System.err.println("Tarayıcı açılamadı: " + e.getMessage());
        }
    }
}