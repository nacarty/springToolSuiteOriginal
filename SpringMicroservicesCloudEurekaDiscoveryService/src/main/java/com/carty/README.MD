THIS PROJECT HAS THREE SPRING PROJECTS ASSOCIATED WITH IT:
1. SpringMicroservicesCloudEurekaDiscoveryService
2. SpringMicroservicesCloudEurekaDiscovery-FirstService
3. SpringMicroservicesCloudEurekaDiscovery-SecondService
4. SpringMicroservicesCloudEurekaDiscoveryGatewayService

This is an implementation service using Spring Cloud Eureka (instead of Zuul). 
This technology is supposed to be almost 10 times faster.

Start the servers in the same order in which they appear.

We also added Hystrix for fault tolerance. Whenever you visit an endpoint with a wrong url, it should fail you over to
a fallback module which displays a message. That part did not work for me although it appears that I hasd all the pieces 
my other colleagues had. 