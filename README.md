# Download Router

다운로드된 파일을 사용자 규칙에 따라 지정된 폴더로 자동 이동하는 Windows 트레이 애플리케이션입니다.

> A Windows tray application that automatically routes downloaded files based on user-defined rules.

## 프로젝트 소개
브라우저의 기본 다운로드 폴더에는 문서, 이미지, 설치 파일, 압축 파일 등이 한곳에 쌓이기 쉽습니다.
Download Router는 다운로드 완료를 감지하고, 파일 확장자와 파일명 규칙에 따라 파일을 사용자가 지정한 폴더로 자동 이동합니다.
평소에는 Windows 시스템 트레이에서 실행되며, 사용자가 직접 저장 위치를 지정한 파일이나 규칙과 일치하지 않는 파일은 임의로 이동하지 않는 것을 기본 원칙으로 합니다.

## 주요 기능
- 다운로드 폴더 실시간 감시
- 다운로드 완료 파일 감지
- 확장자 및 파일명 기반 이동 규칙
- 규칙별 목적지 폴더 설정
- 파일 이름 충돌 처리
- 이동 내역 확인 및 되돌리기
- Windows 로그인 시 자동 실행
- 시스템 트레이에서 감시 일시정지 및 종료

## 개발 상태
현재 초기 개발 단계입니다.
우선 다운로드 폴더 감시와 규칙 기반 파일 이동 기능을 구현한 뒤, 설정 화면과 Windows 트레이 기능을 추가할 예정입니다.
## 기술 스택
- Java 21
- Gradle
- JavaFX
- JUnit 5
## 기술적 결정
Java 버전과 주요 기술 선택에 대한 이유는
[Architecture Decision Records](docs/decisions/README.md)에 기록합니다.
