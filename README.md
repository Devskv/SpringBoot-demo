# SpringBoot-demo
- Developed REST API with CRUD operations to maintain the radio stations inventory, added swagger definition and docker image

## Docker Commands
- To create a docker image, cd to the project folder and run 
> docker build -f Dockerfile -t springboot-demo .
- To view the  created docker images run
> docker images
- To deploy application in the docker, run 
> docker run -p 8080:8080 springboot-demo 
