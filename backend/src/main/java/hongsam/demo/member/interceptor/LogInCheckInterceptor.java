package hongsam.demo.member.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
public class LogInCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        log.info("인증 체크 인터셉터 실행 {}", request);
        HttpSession session = request.getSession();

        if (session == null || session.getAttribute("loginMember") == null) {
            log.info("미인증 사용자 접근");
//            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED); // 401 Unauthorized 상태 코드 설정
            response.getWriter().write("false");
            return false;
        }
        log.info("인터셉터 인증 성공");
        return true;
    }
}
