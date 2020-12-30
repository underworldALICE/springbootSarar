package com.underworld.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

    public class MyLocaleResolver implements LocaleResolver {

        //解析请求
        @Override
        public Locale resolveLocale(HttpServletRequest request) {
            //获取请求中的参数
            String language = request.getParameter("L");
            System.out.println("Debug===>" + language);

            Locale locale = Locale.getDefault();//如果没有就使用默认的
            //如果请求的链接携带了国际化的参数
            System.out.println("Debug1" + language);
            if(!StringUtils.isEmpty(language)){
                System.out.println("Debug2" + language);
                //zh_CH
                String[] split = language.split("_");
                //国家_地区
                locale = new Locale(split[0],split[1]);
                System.out.println("Debug3" + language);
            }
            return locale;
        }

        @Override
        public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {
            //void 并不是我们所需要的
        }
}