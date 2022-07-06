# cryptoexchangeupi
## Tech Stacks 
### 1. Backend :- Java, Spring-boot.
### 2. Frontend :- Next.js, tailwind css, heroicons, axios, recharts.
### 3. Database :- Redis Local Database pulled image through docker, Redis Insight.
### 4. 3rd party data service :- Rapid API.

#### Answering few questions :-
#### 1) Why Springboot why not node ?
Ans:- Though Node.js would be the perfect techstack for building this project because there is not much heavy computation but I used spring-boot to make it a fully-fledged web-application in future. I would like to integrate some roles here RBAC and many things to upgrade this project. So, instead of writing in Js and if when I would like to upgrade this projects functionality then again shifting to Java would be a pain. Hence, I have directly written it in Java using Spring-boot.

#### 2) Why Redis Database ?
Ans:- Using redis database is the main implementation of the logic behind this project. We are storing the data from Rapid API to redis database which can be used as the 
time-series storing database, the data which we will consume from the Rapid API will come in time series and this data cannot be stored in simple nosql database. So we are using Redis Database here which will store data in time series database.

#### 3) Why backend if we can directly call the Rapid API service ?
Ans:- True, this project doesn't need backend at all. But simply hitting the Rapid api service and showing the data into the frontend is not a good idea. We are creating an abstraction layer so that the frontend guy could work on frontend and backend guy on backend and also the main reason is to support the web3 community. Through these data which is coming from Rapid API we can take those and educate people by doing some maths like when did was on its highest peak or lowest peak and all just showing raw data is not enough we have to convert it into meaningful one. So this is why I used backend.

## Frontend

### Commands I used to make this project:
#### 1) npx create-next-app frontend
#### 2) npm i recharts
#### 3) npm i --force @headless/react @heroicons/react
#### 4) npm install -D tailwindcss postcss autoprefixer
#### 5) npx tailwindcss init -p --force
#### 6) npm i --force axios
#### 7) npm i --force recharts

## Backend 

### Dependencies
1) Used Redis All dependency from Maven Repo.
2) Lombok

## Database 
1) Pulled image from docker of local redis Database.
