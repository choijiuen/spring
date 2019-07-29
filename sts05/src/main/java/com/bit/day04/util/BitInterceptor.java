package com.bit.day04.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BitInterceptor extends HandlerInterceptorAdapter{
	Logger log=Logger.getLogger(this.getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.debug("preHandle...");
		return true;		//여기서 false면 pre만 찍히고 다음은 안찍힌다. , 다음을 할 것인지 말것인지, 
							//로그인 할 때 쓴다. 로그인 안되있으면 return false 해서 
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.debug("postHandle...");				//컨트롤러 다음에 출력. 
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.debug("afterCompletion...");		//얘는 마지막 인자로 exception을 가진다. 오류처리 할 수 있음 
	}
}
