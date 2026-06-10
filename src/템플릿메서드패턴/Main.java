package 템플릿메서드패턴;

public class Main {

    public static void main(String[] args) {
        FileUploadTemplate localUpload = new LocalFileUpload();
        localUpload.upload("test.txt");

        System.out.println("----------------");

        FileUploadTemplate s3Upload = new S3FileUpload();
        s3Upload.upload("image.png");
    }
}
