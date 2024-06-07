package Reportes;

import Services.EmailService;

/**
 *
 * @author Grupo 9
 */

public class EmailAdapter implements EnviadorReportes {
    private EmailService emailService;
    private String receptor;
    private String subject;

    public EmailAdapter(EmailService emailService, String receptor, String subject) {
        this.emailService = emailService;
        this.receptor = receptor;
        this.subject = subject;
    }

    @Override
    public boolean enviarReporte(String emailBody) {
        boolean result = emailService.sendEmail(receptor, subject, emailBody);
        return result;
    }
}