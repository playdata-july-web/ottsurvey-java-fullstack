# ottsurvey-java-fullstack
## 설명
이 프로젝트는 OTT 설문조사 풀스택 프로젝트입니다.
## 목표
* HTML 페이지로 입력을 받아 DB에 CRUD 작업을 수행합니다.
* MySQL을 활용하여 DB에 table을 생성합니다.
* JPA를 활용하여 DB에 CRUD 작업을 수행합니다.
* JSP를 활용하여 View를 구현합니다.
* Servlet을 활용해 HTTP Requset와 Response를 Handling 합니다.
* MVC Design Pattern을 적용해 Java Application을 구현합니다.
## Table
```mysql
CREATE TABLE ott_form(
    ott_id      int AUTO_INCREMENT,
    ott_name    varchar(10),
    ott_genre   varchar(10),
    ott_reason  varchar(10),
    ott_time    varchar(10),
    CONSTRAINT pk_ott_id_ott_form PRIMARY KEY(ott_id)
);
```
## Project Configuration
![image](https://user-images.githubusercontent.com/105186724/177277388-7823dbbe-49c7-4f10-9b83-49c3ea1fa2f6.png)
## 실행 예시
### 설문조사 Page
![설문조사form](https://user-images.githubusercontent.com/83337802/177273912-c2c67547-c2e0-4c4c-a14f-e4ff8f4d316a.png)
### 전체 설문 결과 Page
![전체 결과](https://user-images.githubusercontent.com/83337802/177273839-82134d48-aff9-4c61-8629-828e5b1e3f18.png)
