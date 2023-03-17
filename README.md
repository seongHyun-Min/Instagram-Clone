## 📝인스타 그램 클론코딩



###  💻 사용 기술
#### Back-End
- JAVA 11 
- Spring MVC 
- Spring Boot
- Spring JPA
- Spring Security
- loombok

#### Build Tool

- Gradle

#### Database 

- MYSQL


#### Front-End 
- Javascript 
- Thymeleaf

### 💻 개발환경
-  IntelliJ 
-  Github(Git bash)

### 주요 기능 소개 
- 회원가입 및 로그인 기능 구현 

### 추가하면 좋을 기능
- 사용자 프로필 페이지: 사용자가 자신의 프로필 정보를 수정하고 게시물, 팔로워 및 팔로잉 목록을 볼 수 있는 페이지를 구현
- 게시물 업로드: 사용자가 이미지와 캡션을 함께 업로드할 수 있는 게시물 업로드 기능 추가
- 게시물 좋아요 및 댓글: 사용자가 게시물을 좋아하고 댓글을 달 수 있는 기능 추가
- 탐색 페이지: 사용자들이 다른 사람의 게시물을 찾고 검색할 수 있는 탐색 페이지 추가
- 스토리 기능: 사용자가 자신의 스토리를 업로드하고 다른 사람의 스토리를 볼 수 있는 스토리 기능 추가
- 채팅 기능: 사용자들이 서로 채팅할 수 있는 기능 추가
- 알림 기능: 사용자들이 자신에게 온 알림을 확인할 수 있는 알림 기능 추가
- 해시태그 검색 기능: 해시태그를 검색하여 해당 태그가 달린 게시물을 보여주는 검색 기능 추가
- 프로필 사진 변경: 사용자가 자신의 프로필 사진을 업로드하고 변경할 수 있는 기능 추가
- 게시물 저장 기능: 사용자가 다른 사람의 게시물을 저장할 수 있는 기능 추가



#### 03/15 
- 프로젝트 생성 
- MYSQL을 통해 DB 연동
- dto/entity 생성
- JPAReposiotry 생성 (ORM) -> 테이블 생성

#### 03/16
- BCryptPasswordEncoder 해시 함수로 암호화 하여 저장 및 비교
- UserDetails & UserDetailsService 구현
- WebSecurityConfigurerAdapter 구현
- AuthService 구현(회원가입 로직)
- AuthController 및 UserController를 통한 front-end 연동 
