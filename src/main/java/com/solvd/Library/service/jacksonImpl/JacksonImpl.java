package com.solvd.Library.service.jacksonImpl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.Library.entitie.Book;
import com.solvd.Library.entitie.Checkout;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JacksonImpl {
    private static final Logger log = LogManager.getLogger(JacksonImpl.class);
    ObjectMapper mapper = new ObjectMapper();

    public List<Checkout> unmarshallCheckout() {

        try {
            JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, Checkout.class);
            List<Checkout> checkouts = mapper.readValue(new File("src/main/resources/json/checkouts.json"), type);
            return checkouts;
        } catch (IOException e) {
            log.error(e);
        }
        return null;
    }

//    public void marshallCheckout(List<Checkout> inventory) {
//        File file = new File("src/main/resources/json/checkouts.json");
//        try {
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            mapper.writeValue(file, inventory);
//        } catch (IOException e) {
//            log.error(e);
//        }
//    }
}

