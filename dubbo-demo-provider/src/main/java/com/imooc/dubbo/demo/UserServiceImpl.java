package com.imooc.dubbo.demo;

import com.alibaba.dubbo.rpc.RpcContext;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public User findOne(Integer id) {
        log.info("id = ", id);
        log.info("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + ("reid" + id) + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return new User(id, "reid" + id);
    }

    @Override
    public User saveOne() {
        User user = new User(1, "reid02");
        return user;
    }
}
