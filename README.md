# ysii_dubbo_zookeeper
dubbo and zookeeper and nginx 负载均衡

### service Maven Webapp 公用接口服务
### provider01 Maven Webapp 提供者1
### provider02 Maven Webapp 提供者2
### dubbo-consumer01 Maven Webapp 消费者1
### dubbo-consumer02 Maven Webapp 消费者2


#nginx配置（负载均衡）
    

```

    upstream dubbo-test-server{
		    server 127.0.0.1:8091;
	    	server 127.0.0.1:8089;
	    }
      
      
    server {
        listen       80;
        server_name  localhost;

        #charset koi8-r;

        #access_log  logs/host.access.log  main;

        location / {
            proxy_pass http://dubbo-test-server;
        }
        。。。

```
