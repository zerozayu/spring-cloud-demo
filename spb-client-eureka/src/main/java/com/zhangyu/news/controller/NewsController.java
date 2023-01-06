package com.zhangyu.news.controller;

import com.zhangyu.news.proto.NewProto;
import com.zhangyu.news.proto.NewServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyu
 * @date 2023/1/6 17:23
 */
@RestController
@RequestMapping("/grpc")
public class NewsController {
    @GrpcClient("spb-server-eureka")
    private NewServiceGrpc.NewServiceBlockingStub newServiceBlockingStub;

    @GetMapping("/list")
    public void list() {
        NewProto.NewsResponse newsResponse = newServiceBlockingStub.listNews(NewProto.NewsRequest.newBuilder().setName("震惊!现在居然还有人在用 Eureka!").build());

        System.out.println(newsResponse.getResult());
    }
}
