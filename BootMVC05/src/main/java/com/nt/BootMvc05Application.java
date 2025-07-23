package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BootMvc05Application implements CommandLineRunner{
	@Autowired
	private Environment env;
	public static void main(String[] args) {
		SpringApplication.run(BootMvc05Application.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
        String port = env.getProperty("server.port", "8080");  // Default to 8080 if not defined
        String url = "http://localhost:" + port + "/";

        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("rundll32", "url.dll,FileProtocolHandler", url).start();
            } else if (os.contains("mac")) {
                new ProcessBuilder("open", url).start();
            } else if (os.contains("nix") || os.contains("nux")) {
                new ProcessBuilder("xdg-open", url).start();
            } else {
                System.out.println("Open in browser manually: " + url);
            }
        } catch (Exception e) {
            System.out.println("Could not open browser automatically. Visit: " + url);
        }
    }

}
