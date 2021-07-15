call docker-compose -f docker-build/docker-compose.yml run --rm build-container
call cd  buildx
call docker buildx bake core
rem call docker push ashokkumarta/ids-trusted-connector:latest
call cd  ..
