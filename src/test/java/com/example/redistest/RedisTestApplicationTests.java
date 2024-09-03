package com.example.redistest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private PersonRepository personRepository;

    @Test
    void test(){
        Person person = new Person("KO", 25);

        personRepository.save(person);

    }


//github upload test
}
