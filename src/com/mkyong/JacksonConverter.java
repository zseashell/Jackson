package com.mkyong;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonConverter {

    public static void main(String[] args) throws Exception {
        User user = new User();

        // convert java object to json string
        ObjectMapper mapper = new ObjectMapper();
        
        String jsonString = mapper.writeValueAsString(user);
        System.out.println(jsonString);
        String jsonPrettyString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        System.out.println(jsonPrettyString);
        
        // convert json string to java object
        user = mapper.readValue(jsonString, User.class);
        System.out.println(user);
    }

}
