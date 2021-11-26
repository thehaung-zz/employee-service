docker build -t microservice-employee .
docker stop microservice-employee
docker rm microservice-employee
docker run -d --restart=always -p 9001:9001 --name microservice-employee -t microservice-employee
