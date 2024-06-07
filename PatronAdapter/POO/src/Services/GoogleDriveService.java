package Services;

/**
 *
 * @author Grupo 9
 */

public class GoogleDriveService {
    private String googleAccount;
    
    public GoogleDriveService (String googleAccount) {
        this.googleAccount = googleAccount;
    }
    
    public boolean uploadFile (String fileName, String fileType, Object content) {
        // upload file logic
        System.out.println("Uploading...");
        if (!fileName.isBlank() && !fileType.isBlank()) {
            System.out.println(fileName + "." + fileType + "\nUploaded successfully");
            return true;
        } else {
            System.out.println("An error has ocurred an error. " + fileName + "." + fileType + "\nUpload has been canceled");
            return false;
        }
    }
}