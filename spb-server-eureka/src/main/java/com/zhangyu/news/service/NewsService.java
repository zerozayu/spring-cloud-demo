package com.zhangyu.news.service;

import com.zhangyu.news.proto.NewProto;
import com.zhangyu.news.proto.NewServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author zhangyu
 * @date 2023/1/6 16:36
 */
@GrpcService
public class NewsService extends NewServiceGrpc.NewServiceImplBase {

    @Override
    public void listNews(NewProto.NewsRequest request, StreamObserver<NewProto.NewsResponse> responseObserver) {
        String name = request.getName();
        responseObserver.onNext(NewProto.NewsResponse.newBuilder().setResult("News name is " + name).build());
        responseObserver.onCompleted();
    }
}
