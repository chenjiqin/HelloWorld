# HelloWorld
1. Build docker image
mvn clean package docker:build

2. Push the image to ECR (make sure you install the aws cli and do the aws configuration, please refer to the appendix below)
$(aws ecr get-login --no-include-email --region cn-northwest-1)  
docker tag jenny/helloworld 901841402669.dkr.ecr.cn-northwest-1.amazonaws.com.cn/eris:latest
docker push 901841402669.dkr.ecr.cn-northwest-1.amazonaws.com.cn/eris:latest

3. SSH EC2 and start the docker container
ssh ec2-user@52.82.45.240 -i ErisEC2KeyPair.pem
$(aws ecr get-login --no-include-email --region cn-northwest-1)
docker run -p 8080:8080 901841402669.dkr.ecr.cn-northwest-1.amazonaws.com.cn/eris

Appendix:
bogon:~ jennychen$ aws configure
AWS Access Key ID [None]: {access key id}
AWS Secret Access Key [None]: {secret access key}
Default region name [None]: cn-northwest-1
Default output format [None]: json
