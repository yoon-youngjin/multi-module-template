tasks.getByName("bootJar") {
	enabled = true
}

tasks.getByName("jar") {
	enabled = true
}

dependencies {
	implementation(project(":support:logging")) // 이런식으로 공통화된 로깅 모듈을 사용해볼 수 있다. 즉, 새로운 모듈이 늘어나도 로그 설정을 그대로 유지할 수 있다.
	implementation(project(":storage:db-core"))

	implementation("org.springframework.boot:spring-boot-starter-web")
}
