package 템플릿메서드패턴;

public class LocalFileUpload extends FileUploadTemplate {

    @Override
    protected void save(String fileName) {
        System.out.println("로컬 디스크에 파일 저장: " + fileName);
    }
}
