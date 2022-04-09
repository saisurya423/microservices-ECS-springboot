./mvnw clean package

docker build -t westerly/demo-movie-catalog-service .

docker run -p 9090:9090 westerly/demo-movie-catalog-service

docker images

docker tag westerly/demo-movie-catalog-service westerlytutors/demo-movie-catalog-service:1.0

docker tag westerly/demo-movie-catalog-service westerlytutors/demo-movie-catalog-service:latest

sudo docker login docker.io -u westerlytutors -p password

sudo docker push westerlytutors/demo-movie-catalog-service