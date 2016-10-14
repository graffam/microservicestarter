# microservicestarter
A very bare bones micro service starting template built with Akka.
Hopefully will be able to have clustering. This is built to be used eventually with
the SMACK(Spark,Mesos,Akka,Cassandra,Kafka) stack.
 
# To Run:
```
sbt assembly
java -jar target/scala-2.11/MicroServiceStarter-assembly-1.0.jar

```
2.

# To Test:
```
sbt test
```
