docker pull registry.gitlab.com/3hvn/employee-service
docker stop microservice-employee
docker rm microservice-employee
docker run -d -p 9002:9002 --name microservice-employee registry.gitlab.com/3hvn/employee-service
