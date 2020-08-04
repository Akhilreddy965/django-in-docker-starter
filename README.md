# Starter project for Docker + Django + Postgres + nginx

## Important:

`SECRET_KEY` in `settings.py` is *EMPTY* - you must generate it. 

[Django SECRET_KEY](https://docs.djangoproject.com/en/2.2/ref/settings/#std:setting-SECRET_KEY)

## How to run:

Prerequisites: 
* [Docker](https://docs.docker.com/install/)
* [docker-compose](https://docs.docker.com/compose/install/)

1. Clone this repo `git clone https://github.com/kreatemore/django-in-docker-starter.git <project_name>`
2. Change remote in git to point to your repo (or just reinit wit `git init`)
3. Generate your SECRET_KEY (example: https://djecrety.ir/)
4. `docker-compose up web`

## Structure

* `src` contains your django application. It also has a `bin` folder for
scripts you might want to run (even in prod)
* `web` contains a sample `nginx.conf` file, and a `static` folder where you can put
your js/css/whatever files.

For static files defined in the Django app, the path will be `server/static/resource.ext` (`/static` is defined in `settings.py`).
For all other assets, it'll be the subfolder names only in `web/static`. 
Example: js files will be `server/js/hello.js` not `server/static/hello.js` nor `sever/static/js/hello.js`
