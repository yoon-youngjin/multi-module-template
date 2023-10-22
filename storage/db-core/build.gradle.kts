// DB 관련 설정을 별도의 모듈에 모아둠으로써 특정 모듈의 설정이 비대해지는 것을 방지할 수 있으며 관리가 수월해진다.

allOpen {
	annotation("jakarta.persistence.Entity")
	annotation("jakarta.persistence.MappedSuperclass")
	annotation("jakarta.persistence.Embeddable")
}

dependencies {
	api("org.springframework.boot:spring-boot-starter-data-jpa")
	runtimeOnly("com.mysql:mysql-connector-j")
	runtimeOnly("com.h2database:h2")
}