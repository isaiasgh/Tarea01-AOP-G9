package Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

@Aspect
public class ValidacionAspect {

    @Before("execution(* Reportes.EmailAdapter.enviarReporte(..)) && args(emailBody)")
    public void validarEmail(JoinPoint joinPoint, String emailBody) {
        if (emailBody.isBlank()) {
            throw new IllegalArgumentException("El cuerpo del correo electrónico está vacío");
        }
    }

    @Before("execution(* Reportes.GoogleDriveAdapter.enviarReporte(..)) && args(content)")
    public void validarContenido(JoinPoint joinPoint, String content) {
        if (content.isBlank()) {
            throw new IllegalArgumentException("El contenido del archivo está vacío");
        }
    }

    @Before("execution(* Services.EmailService.sendEmail(..)) && args(receptor, subject, emailBody)")
    public void validarEmailService(JoinPoint joinPoint, String receptor, String subject, String emailBody) {
        if (receptor.isBlank() || subject.isBlank() || emailBody.isBlank()) {
            throw new IllegalArgumentException("Uno o más campos del correo electrónico están vacíos");
        }
    }

    @Before("execution(* Services.GoogleDriveService.uploadFile(..)) && args(fileName, fileType, content)")
    public void validarGoogleDriveService(JoinPoint joinPoint, String fileName, String fileType, String content) {
        if (fileName.isBlank() || fileType.isBlank() || content.isBlank()) {
            throw new IllegalArgumentException("Uno o más campos del archivo para subir a Google Drive están vacíos");
        }
    }
}
