call docker-compose -f docker-build/docker-compose.yml run --rm build-container
call del D:\Ashok\Work\IDS\git\ids-trusted-connector\ids-connector\build\libs\libraryJars\tmf-ids-processors-0.1-SNAPSHOT.jar
call copy D:\Ashok\Work\IDS\git\tmf-ids-processors\build\libs\tmf-ids-processors-0.1-SNAPSHOT.jar D:\Ashok\Work\IDS\git\ids-trusted-connector\ids-connector\build\libs\libraryJars\tmf-ids-processors-0.1-SNAPSHOT.jar
call del D:\Ashok\Work\IDS\git\ids-trusted-connector\ids-connector\build\libs\libraryJars\idscp2-0.4.3.jar
call copy D:\Ashok\Work\IDS\git\ids-idscp2-java\idscp2\build\libs\idscp2-0.4.5-ex.jar D:\Ashok\Work\IDS\git\ids-trusted-connector\ids-connector\build\libs\libraryJars\idscp2-0.4.5-ex.jar
call cd  buildx
call docker buildx bake core
call docker push ashokkumarta/ids-trusted-connector:latest
call cd  ..
