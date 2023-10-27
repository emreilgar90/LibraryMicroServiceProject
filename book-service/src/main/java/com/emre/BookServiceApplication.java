package com.emre;

import com.emre.repository.BookServiceRepository;

import com.emre.service.JsonDataService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookServiceApplication  {
//    private final BookServiceRepository repository;
//    private final JsonDataService jsonDataService;
//
//    public BookServiceApplication(BookServiceRepository repository, JsonDataService jsonDataService) {
//        this.repository = repository;
//        this.jsonDataService = jsonDataService;
// }

    public static void main(String[] args) {
        SpringApplication.run(BookServiceApplication.class,args);

    }

//    @Override
//    public void run(String... args) throws Exception {
//        Book book1= new Book("Beyaz zambaklar ülkesinde",1923,"Grigory Petrov","Yayınevi","313215165651");
//        Book book2= new Book("Yüzüklerin efendisi",1960,"J.R.R Tolkien","Z yayınevi", "3165465165");
//        Book book3= new Book("Keyfimin Kahyası",2023,"Emre ILGAR","EMRE YAYINEVİ","13165616515");
//
//        List<Book> bookList= repository.saveAll(Arrays.asList(book1,book2,book3));
//        System.out.println(bookList);
//
//    }
}