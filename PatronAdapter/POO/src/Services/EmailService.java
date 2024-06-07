package Services;

/**
 *
 * @author Grupo 9
 */

public class EmailService {
    private String email;

    public EmailService(String email) {
        this.email = email;
    }
    
    public boolean sendEmail (String receptor, String subject, String emailBody) {
        // email logic
        if (!receptor.isBlank() && !subject.isBlank() && !emailBody.isBlank()) {
            System.out.println("Sending email to: " + receptor);
            System.out.println("Subject: " + subject);
            System.out.println(emailBody);
            return true;
        } else return false;
    }
}
