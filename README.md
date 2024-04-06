# imyeomsu-common-utils
I'm YeomSu lck 웹 서비스 공통 유틸 레포지토리 입니다.
# jitpack
## 프로젝트 생성 
### 1. 모듈화 할 자바 프로젝트를 생성 
- 여러곳에서 사용될 중복 코드를 유틸로 만들어 사용합니다.

## 릴리즈
### 1. 프로젝트 깃허브 업로드
- 업로드 후에 릴리즈 작업 진행

## jitpack에서 
### 1. 확인 후 사용 
- [임염수팀 공통 코드 라이브러리화](https://jitpack.io/#I-m-YeomSu/imyeomsu-lck-common-utils)

## 테스트 커버리지 향상
### 1. 기존 커버리지
![image](https://github.com/I-m-YeomSu/imyeomsu-lck-common-utils/assets/81970382/75374ce1-64c4-4401-ad29-7190c08fec5e)
- 기존 라이브러리로 만들기 전 프로젝트의 테스트 커버리지는 43%로 테스트 할수 없는 응답 값을 보내는 객체, 에러 타입을 명시한 Enum 클래스 등을 어떻게 처리할지에 대해서 고민
- 테스트 커버리지 향상을 위해서 여러 서버에서 사용될 테스트 부적절한 코드들을 라이브러리로 만들어주기로 함
  
### 2. 라이브러리로 만든 후 커버리지
![image](https://github.com/I-m-YeomSu/imyeomsu-lck-common-utils/assets/81970382/d10e5afb-6b2d-420f-b000-b332c536dd98)
- 세가지의 공통 코드들만 본 프로젝트에서 빼고 라이브러리로 만들어주니 6% 가량의 커버리지 향상을 확인할 수 있음
