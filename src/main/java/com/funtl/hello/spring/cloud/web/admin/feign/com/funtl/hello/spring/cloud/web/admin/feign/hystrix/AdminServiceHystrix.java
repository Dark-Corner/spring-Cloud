package com.funtl.hello.spring.cloud.web.admin.feign.com.funtl.hello.spring.cloud.web.admin.feign.hystrix;

import com.funtl.hello.spring.cloud.web.admin.feign.com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {

        return String.format("Hi you message is :%s but request bad",message);
    }
}
