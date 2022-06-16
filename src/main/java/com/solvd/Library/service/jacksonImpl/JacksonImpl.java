package com.solvd.Library.service.jacksonImpl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.Library.entitie.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JacksonImpl {
    private static final Logger log = LogManager.getLogger(JacksonImpl.class);
    ObjectMapper mapper = new ObjectMapper();

    public List<Book> unmarshallSuperCar() {

        try {
            JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, Book.class);
            List<Book> books = mapper.readValue(new File("src/main/resources/json/Book.json"), type);
            return books;
        } catch (IOException e) {
            log.error(e);
        }
        return null;
    }

    public void marshallBook(List<Book> inventory) {
        File file = new File("src/main/resources/json/Book.json");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            mapper.writeValue(file, inventory);
        } catch (IOException e) {
            log.error(e);
        }
    }
}

