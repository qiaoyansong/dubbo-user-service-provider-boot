package com.qiaoyansong.service.impl;

import com.qiaoyansong.entity.UserAddress;
import com.qiaoyansong.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2021/4/21 20:46
 * description: 参考provider的xml配置文件进行配置，有的需要在application.properties中配置,并且
 * 对于Springboot的主方法必须加上@EnableDubbo
 *
 * 按照provider.xml需要配置bean以及dubbo:service所以需要使用两个注解，用于暴露服务提供者的服务
 */

@Service
@com.alibaba.dubbo.config.annotation.Service(version = "0.0.1")
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("------old------");
        UserAddress address1 = new UserAddress(1,"北京市昌平区宏福科技园综合楼3层","1","李老师","101-123456","Y");
        UserAddress address2 = new UserAddress(2,"深圳市宝安区西部硅谷大厦B座3层（深圳分校)", "1","王老师","010-654321","Y");
        return Arrays.asList(address1,address2);
    }

}
