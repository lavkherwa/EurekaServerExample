# EurekaServerExample

Sample application to setup Eureka Server

After running the application Eureka Server will start at <br>
http://localhost:8090/ 

From spring 2.x onward security is default enabled for Eureka Server
and therefore to access Eureka server application you need below credentials <br>
that we have configured in the application.yml file <br>
**name:** admin <br>
**password:** pwd


Corresonding Eureka client is enabled in another application. <br> 
Application can be located at below github repo <br>
https://github.com/lavkherwa/AllAboutREST 

specific commit details for enabling Eureka client in above repo <br>
https://github.com/lavkherwa/AllAboutREST/commit/ae9d266687e1d0983c268c97510903d149972154

After starting the Eureka server, start the corresponding All About Rest application as well 
to verify it registers to the server ;)
