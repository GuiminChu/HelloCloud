docker pull zookeeper:3.6.0

docker run -d -p 2181:2181 --name zookeeper_cgm --restart always zookeeper:3.6.0

docker exec -it 3f03c8120319 bash

./bin/zkCli.sh

ls /

ls /services

```
➜  ~ docker exec -it 3f03c8120319 bash
root@3f03c8120319:/apache-zookeeper-3.6.0-bin# ./bin/zkCli.sh
Connecting to localhost:2181
2020-04-11 09:23:08,313 [myid:] - INFO  [main:Environment@98] - Client environment:zookeeper.version=3.6.0--b4c89dc7f6083829e18fae6e446907ae0b1f22d7, built on 02/25/2020 14:38 GMT
2020-04-11 09:23:08,317 [myid:] - INFO  [main:Environment@98] - Client environment:host.name=3f03c8120319
2020-04-11 09:23:08,317 [myid:] - INFO  [main:Environment@98] - Client environment:java.version=11.0.6
2020-04-11 09:23:08,320 [myid:] - INFO  [main:Environment@98] - Client environment:java.vendor=Oracle Corporation
2020-04-11 09:23:08,320 [myid:] - INFO  [main:Environment@98] - Client environment:java.home=/usr/local/openjdk-11
2020-04-11 09:23:08,320 [myid:] - INFO  [main:Environment@98] - Client environment:java.class.path=/apache-zookeeper-3.6.0-bin/bin/../zookeeper-server/target/classes:/apache-zookeeper-3.6.0-bin/bin/../build/classes:/apache-zookeeper-3.6.0-bin/bin/../zookeeper-server/target/lib/*.jar:/apache-zookeeper-3.6.0-bin/bin/../build/lib/*.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/zookeeper-prometheus-metrics-3.6.0.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/zookeeper-jute-3.6.0.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/zookeeper-3.6.0.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/snappy-java-1.1.7.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/slf4j-log4j12-1.7.25.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/slf4j-api-1.7.25.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/simpleclient_servlet-0.6.0.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/simpleclient_hotspot-0.6.0.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/simpleclient_common-0.6.0.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/simpleclient-0.6.0.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/netty-transport-native-unix-common-4.1.45.Final.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/netty-transport-native-epoll-4.1.45.Final.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/netty-transport-4.1.45.Final.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/netty-resolver-4.1.45.Final.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/netty-handler-4.1.45.Final.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/netty-common-4.1.45.Final.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/netty-codec-4.1.45.Final.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/netty-buffer-4.1.45.Final.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/metrics-core-3.2.5.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/log4j-1.2.17.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/json-simple-1.1.1.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/jline-2.11.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/jetty-util-9.4.24.v20191120.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/jetty-servlet-9.4.24.v20191120.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/jetty-server-9.4.24.v20191120.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/jetty-security-9.4.24.v20191120.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/jetty-io-9.4.24.v20191120.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/jetty-http-9.4.24.v20191120.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/javax.servlet-api-3.1.0.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/jackson-databind-2.9.10.3.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/jackson-core-2.9.10.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/jackson-annotations-2.9.10.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/commons-lang-2.6.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/commons-cli-1.2.jar:/apache-zookeeper-3.6.0-bin/bin/../lib/audience-annotations-0.5.0.jar:/apache-zookeeper-3.6.0-bin/bin/../zookeeper-*.jar:/apache-zookeeper-3.6.0-bin/bin/../zookeeper-server/src/main/resources/lib/*.jar:/conf:
2020-04-11 09:23:08,321 [myid:] - INFO  [main:Environment@98] - Client environment:java.library.path=/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib
2020-04-11 09:23:08,321 [myid:] - INFO  [main:Environment@98] - Client environment:java.io.tmpdir=/tmp
2020-04-11 09:23:08,321 [myid:] - INFO  [main:Environment@98] - Client environment:java.compiler=<NA>
2020-04-11 09:23:08,321 [myid:] - INFO  [main:Environment@98] - Client environment:os.name=Linux
2020-04-11 09:23:08,321 [myid:] - INFO  [main:Environment@98] - Client environment:os.arch=amd64
2020-04-11 09:23:08,321 [myid:] - INFO  [main:Environment@98] - Client environment:os.version=3.10.0-1062.4.1.el7.x86_64
2020-04-11 09:23:08,321 [myid:] - INFO  [main:Environment@98] - Client environment:user.name=root
2020-04-11 09:23:08,321 [myid:] - INFO  [main:Environment@98] - Client environment:user.home=/root
2020-04-11 09:23:08,321 [myid:] - INFO  [main:Environment@98] - Client environment:user.dir=/apache-zookeeper-3.6.0-bin
2020-04-11 09:23:08,321 [myid:] - INFO  [main:Environment@98] - Client environment:os.memory.free=176MB
2020-04-11 09:23:08,322 [myid:] - INFO  [main:Environment@98] - Client environment:os.memory.max=256MB
2020-04-11 09:23:08,323 [myid:] - INFO  [main:Environment@98] - Client environment:os.memory.total=184MB
2020-04-11 09:23:08,328 [myid:] - INFO  [main:ZooKeeper@1005] - Initiating client connection, connectString=localhost:2181 sessionTimeout=30000 watcher=org.apache.zookeeper.ZooKeeperMain$MyWatcher@6166e06f
2020-04-11 09:23:08,339 [myid:] - INFO  [main:X509Util@77] - Setting -D jdk.tls.rejectClientInitiatedRenegotiation=true to disable client-initiated TLS renegotiation
2020-04-11 09:23:08,355 [myid:] - INFO  [main:ClientCnxnSocket@239] - jute.maxbuffer value is 1048575 Bytes
2020-04-11 09:23:08,373 [myid:] - INFO  [main:ClientCnxn@1703] - zookeeper.request.timeout value is 0. feature enabled=false
Welcome to ZooKeeper!
2020-04-11 09:23:08,393 [myid:localhost:2181] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@1154] - Opening socket connection to server localhost/127.0.0.1:2181.
2020-04-11 09:23:08,394 [myid:localhost:2181] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@1156] - SASL config status: Will not attempt to authenticate using SASL (unknown error)
JLine support is enabled
2020-04-11 09:23:08,430 [myid:localhost:2181] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@986] - Socket connection established, initiating session, client: /127.0.0.1:43218, server: localhost/127.0.0.1:2181
2020-04-11 09:23:08,443 [myid:localhost:2181] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@1420] - Session establishment complete on server localhost/127.0.0.1:2181, session id = 0x10016225a470005, negotiated timeout = 30000

WATCHER::

WatchedEvent state:SyncConnected type:None path:null
[zk: localhost:2181(CONNECTED) 0] ls /
[services, zookeeper]
[zk: localhost:2181(CONNECTED) 1] ls /services
[cloud-provider-payment]
[zk: localhost:2181(CONNECTED) 2] ls /services/cloud-provider-payment
[479f36c7-47f6-4363-9496-70eb061c9673]
[zk: localhost:2181(CONNECTED) 3] ls /services/cloud-provider-payment/479f36c7-47f6-4363-9496-70eb061c9673
[]
[zk: localhost:2181(CONNECTED) 4] get /services/cloud-provider-payment/479f36c7-47f6-4363-9496-70eb061c9673
{"name":"cloud-provider-payment","id":"479f36c7-47f6-4363-9496-70eb061c9673","address":"guimindembp","port":8004,"sslPort":null,"payload":{"@class":"org.springframework.cloud.zookeeper.discovery.ZookeeperInstance","id":"application-1","name":"cloud-provider-payment","metadata":{}},"registrationTimeUTC":1586597630241,"serviceType":"DYNAMIC","uriSpec":{"parts":[{"value":"scheme","variable":true},{"value":"://","variable":false},{"value":"address","variable":true},{"value":":","variable":false},{"value":"port","variable":true}]}}
[zk: localhost:2181(CONNECTED) 5] 
```