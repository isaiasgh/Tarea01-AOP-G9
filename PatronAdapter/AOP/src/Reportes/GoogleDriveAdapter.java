package Reportes;

import Services.GoogleDriveService;

/**
 *
 * @author Grupo 9
 */

public class GoogleDriveAdapter implements EnviadorReportes {
    private GoogleDriveService googleDriveService;
    private String fileName;
    private String fileType;

    public GoogleDriveAdapter(GoogleDriveService googleDriveService, String fileName, String fileType) {
        this.googleDriveService = googleDriveService;
        this.fileName = fileName;
        this.fileType = fileType;
    }

    @Override
    public boolean enviarReporte(String content) {
        boolean result=  googleDriveService.uploadFile(fileName, fileType, content);
        return result;
    }
    
    public String getFileName () {
    	return fileName;
    }
    
    public String getFileType () {
    	return fileType;
    }
    
    public GoogleDriveService getGoogleDriveService () {
    	return googleDriveService;
    }
}