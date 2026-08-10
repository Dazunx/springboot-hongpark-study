# Spring Boot 3 Practice & Study Log

> **교재**: 홍팍의 스프링 부트 3 입문  
> **기간**: 2026.08
> **목적**: Spring Boot 기반 백엔드 동작 원리 및 MVC 패턴 실습

---

## 🛠 Tech Stack
- **Language**: Java 21
- **Framework**: Spring Boot 4.1.0
- **Build Tool**: Gradle
- **Template Engine**: Mustache
- **Database**: H2 Database

---

## 📂 주요 학습 내용

### 🗓️ Day 1 - MVC 패턴과 뷰 템플릿 (`Firstproject`)
- **Controller**: `@Controller` 어노테이션을 활용한 요청 핸들링 및 URL 매핑 (`/hi`, `/bye`)
- **Model**: `Model` 객체를 이용해 컨트롤러에서 뷰(View)로 데이터 전달 (`addAttribute`)
- **View**: Mustache 템플릿 엔진을 활용하여 동적 페이지 랜더링 실습

### 🗓️ Day 2 - DTO, Entity, Repository 및 의존성 주입 (DI)

* **Form Data & DTO:** View에서 전달된 폼 데이터를 수집하기 위한 `ArticleForm` DTO 구현
* **Entity & Repository:** DB 테이블 매핑을 위한 `@Entity` 정의 및 `CrudRepository`를 활용한 데이터 저장(CRUD) 흐름 이해
* **Dependency Injection:** `@Autowired` (필드 주입)의 개념과 실무 표준인 `@RequiredArgsConstructor` + `final` (생성자 주입)의 안전성(불변성, 컴파일 시점 오류 감지) 비교
* **JPA & DDL Auto:** 서버 구동 시 Entity 기반 테이블 자동 생성 원리 및 실무 환경(`ddl-auto: none`)에서의 DB 안전 관리 이해

### 🗓️ Day 3 - REST Controller, Service 계층 및 댓글 CRUD 기능 구현

* **REST API & Service Layer:** `@RestController`를 사용해 JSON 응답 처리 및 `ResponseEntity`를 통한 HTTP 상태 코드 설계, 비즈니스 로직 분리를 위한 `@Service` 계층 및 `@Transactional` 기반 트랜잭션 관리
* **Comment DTO & Entity Mapping:** 댓글 데이터를 안전하게 주고받기 위한 DTO 정의 및 게시글(Article)과의 연관관계(`@ManyToOne`) 매핑 구조 이해
* **Custom Query & Repository:** `@Query`(JPQL/Native) 및 `orm.xml` 매핑을 활용한 사용자 정의 쿼리 작성 및 `@DataJpaTest`를 통한 리포지토리 단위 테스트 검증
* **View Template Integration:** Mustache 템플릿 내 댓글 목록 렌더링, 댓글 작성/수정 모달 UI 구성
* **JavaScript Fetch API & DOM Control:** `fetch()`를 활용한 비동기 댓글 생성(`POST`), 수정(`PATCH`), 삭제(`DELETE`) 요청 처리 및 `dataset` 속성을 활용한 DOM 이벤트 제어
