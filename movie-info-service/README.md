./mvnw clean package

docker build -t westerly/demo-movie-info-service .

docker run -p 9091:9091 westerly/demo-movie-info-service

docker images

docker tag westerly/demo-movie-info-service westerlytutors/demo-movie-info-service:1.0

docker tag westerly/demo-movie-info-service westerlytutors/demo-movie-info-service:latest

sudo docker login docker.io -u westerlytutors -p password

docker push westerlytutors/demo-movie-info-service
