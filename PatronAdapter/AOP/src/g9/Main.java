package g9;

import Reportes.EmailAdapter;
import Reportes.EnviadorReportes;
import Reportes.GoogleDriveAdapter;
import Services.EmailService;
import Services.GoogleDriveService;

/**
 *
 * @author Grupo 9
 */	

public class Main {
//EmailService emailService, String receptor, String subject
    //String receptor, String subject, String emailBody
    public static void main(String[] args) {
        String subject = "Enviar documentos";
        String emailBody = "Buenas tardes, le escribo para solicitarle que envíe los documentos que le faltan para finalizar el proceso.\nGracias";
        
        EmailService emailService = new EmailService ("joguherr@espol.edu.ec");
        EnviadorReportes emailAdapter = new EmailAdapter (emailService, "guamanijoel8b2016@gmail.com", subject);
        
        emailAdapter.enviarReporte(emailBody);
        
        System.out.println();
        
        GoogleDriveService googleDriveService = new GoogleDriveService("guamanijoel8b2016@gmail.com");
        GoogleDriveAdapter googleAdapter = new GoogleDriveAdapter (googleDriveService, "documentosFaltantes", "zip");
        
        googleAdapter.enviarReporte("*** archivos ***");
    }  
}