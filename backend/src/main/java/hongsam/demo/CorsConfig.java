package hongsam.demo;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 요청에 대해 CORS 설정 적용
                .allowedOrigins("https://d138-13-209-119-114.ngrok-free.app", "http:localhost:3000", "https://318b-1-217-43-45.ngrok-free.app") // 허용할 도메인 지정
                .allowedMethods("GET", "POST", "PATCH", "DELETE", "HEAD", "OPTIONS") // 허용할 HTTP 메서드 지정
                .allowedHeaders("Content-Type", "Cookie", "headers", "*") // 허용할 헤더 지정
                .allowCredentials(true) // 인증 정보 허용
                .maxAge(3600);
    }
}


