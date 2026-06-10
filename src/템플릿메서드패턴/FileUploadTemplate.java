package 템플릿메서드패턴;

public abstract class FileUploadTemplate {

    // 템플릿 메서드
    // 업로드 전체 순서를 고정합니다.
    // final을 붙인 이유:
    // 자식 클래스가 upload() 순서를 마음대로 바꾸면
    // 검증 없이 저장하거나, 로그 없이 종료되는 문제가 생길 수 있기 때문입니다.
    public final void upload(String fileName) {
        validate(fileName);
        save(fileName);
        afterUpload(fileName);
    }

    // 공통 검증 로직
    // 모든 업로드 방식에서 동일하게 사용됩니다.
    private void validate(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("파일명이 비어 있습니다.");
        }

        System.out.println("파일 검증 완료: " + fileName);
    }

    // 업로드 방식마다 저장 위치가 다르므로 자식 클래스가 구현합니다.
    protected abstract void save(String fileName);

    // Hook 메서드
    // 기본 동작은 비워두고, 필요한 자식 클래스만 재정의합니다.
    protected void afterUpload(String fileName) {
        // 기본 후처리 없음
        System.out.println("후처리 완료: " + fileName);
    }
}
