package starter.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExcuteTimeInterceptor implements HandlerInterceptor {

    //在handler执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception{
        long startTime=System.currentTimeMillis();
        request.setAttribute("startTime",startTime);
        return true;
    }

    //在handler执行之后
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)throws Exception{
        long startTime=(Long)request.getAttribute("startTime");
        long endTime=System.currentTimeMillis();
        long excuteTime=endTime-startTime;

        //修改 modelAndView的数据
//        modelAndView.addObject("excuteTime",excuteTime);
        System.out.println("时间差："+excuteTime);
      // log.info("["+handler+"]excuteTime:"+excuteTime+"ms");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }


}
