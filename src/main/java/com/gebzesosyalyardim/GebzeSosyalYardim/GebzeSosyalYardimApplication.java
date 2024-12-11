package com.gebzesosyalyardim.GebzeSosyalYardim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.gebzesosyalyardim")
@EntityScan(basePackages = "com.gebzesosyalyardim.GebzeSosyalYardim.entities")
@EnableJpaRepositories(basePackages = "com.gebzesosyalyardim.GebzeSosyalYardim.repository")
public class GebzeSosyalYardimApplication {

    public static void main(String[] args) {
        SpringApplication.run(GebzeSosyalYardimApplication.class, args);
        openBrowser("http://localhost:8080"); // Burayı kendi URL'nize göre düzenleyebilirsiniz
    }

    private static void openBrowser(String url) {
        try {
            // Eğer sistem masaüstü desteği sağlıyorsa, taSrayıcıyı aç
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