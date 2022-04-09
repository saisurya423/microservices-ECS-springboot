./mvnw clean package

docker build -t westerly/demo-movie-ratings-service .

docker run -p 9092:9092 westerly/demo-movie-ratings-service


docker images

docker tag westerly/demo-movie-ratings-service westerlytutors/demo-movie-ratings-service:1.0

docker tag westerly/demo-movie-ratings-service westerlytutors/demo-movie-ratings-service:latest

sudo docker login docker.io -u westerlytutors -p password

sudo docker push westerlytutors/demo-movie-ratings-service