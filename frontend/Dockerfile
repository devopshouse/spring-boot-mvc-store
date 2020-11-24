FROM node as BUILD
WORKDIR /app
COPY package.json /app/
RUN npm install --loglevel verbose
COPY . /app/
RUN node_modules/.bin/ng build --prod

FROM nginx:1.13.3-alpine
COPY --from=BUILD /app/nginx/default.conf /etc/nginx/conf.d/
RUN rm -rf /usr/share/nginx/html/*
COPY --from=BUILD /app/dist/shop /usr/share/nginx/html
