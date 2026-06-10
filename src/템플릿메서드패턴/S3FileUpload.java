package 템플릿메서드패턴;

public class S3FileUpload extends FileUploadTemplate {

    @Override
    protected void save(String fileName) {
        System.out.println("AWS S3에 파일 저장: " + fileName);
    }

    @Override
    protected void afterUpload(String fileName) {
        super.afterUpload(fileName);
        System.out.println("S3 업로드 완료 이벤트 발행: " + fileName);
    }
}
