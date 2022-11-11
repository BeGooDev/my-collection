FROM node:16
ENV TZ=Europe/Paris

WORKDIR /usr/src/app

COPY . ./

# Oh my zsh
RUN ["apt-get", "update"]
RUN ["apt-get", "install", "-y", "zsh"]
RUN wget https://github.com/robbyrussell/oh-my-zsh/raw/master/tools/install.sh -O - | zsh || true

# building the app
RUN yarn

# Running the app
EXPOSE 3000
CMD [ "yarn", "dev" ]