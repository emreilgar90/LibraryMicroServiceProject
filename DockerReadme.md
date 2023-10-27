# DOCKER KULLANIMI

## Image oluşturmak için;
    docker build --build-arg JAR_FILE=<build path >-t <image name> .
    docker build --build-arg JAR_FILE=book-service/build/libs/book-service-v.0.0.1.jar -t LibraryBookService:v001 .
    build path: servisimizden build aldığımız zaman oluşan jar dosyasının konumu
    image name: oluşturacağımız image e vereceğimiz isim ( versiyon numarası vermeyi unutmayın !!! )
## Image üzerinden Container Çalıştırma;
    docker run -d -p disport:icport <service-name>:v003
    docker run -d -p 9091:8090 LibraryBookService:v001
    icport: application yml da uygulamanin ayaga kalktigi port
    disport: containerın dısarıya acildiği port istekler bu porta gelecek bu port iç porta yonlendirecek
## Network oluşturma isteniyorsa;
    docker network ls: var olan networklerimizi listeleme
    docker network rm somenetwork : network adıyla networkumuzu silme
    docker network create --driver bridge --subnet <ağ portları > --gateway 182.18.0.1 < network name>
    docker network create --driver bridge --subnet 182.18.0.1/24 --gateway 182.18.0.1 LibraryMicroservice-network
    ag portları: networkumuzdeki ip aralığını belirlediğmiz yer
    network create komutu ile bir network olusturabiliriz





