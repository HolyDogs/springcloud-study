## SpringCloud-Study

### Introduction

---
本人的springCloud学习项目，包含一些基本的注册中心、配置、断流器、负载均衡、路由等组件。

### environment
----

 - Spring Cloud Finchley.SR2
 - Spring Boot 2.0.2
 - Maven 3.5.4
 - JDK 1.8

需要配置host文件

	127.0.0.1	peer1 peer2

### 模块
---

**Eureka注册中心**

 - enreka-server-01
 - enreka-server-02

**服务提供**

 - enreka-producer-8001
 - enreka-producer-8002
 - enreka-producer-8003

**消费者**

 - eureka-consumer-9001

**zuul网关**

 - eureka-zuul-gateway

**springcloud配置服务端和客户端**

 - config-server-git
 - config-client-git

启动网关后访问地址为

	EUREKA-PRODUCER: /api-a/**  
	EUREKA-CONSUMER-9001: /api-b/**