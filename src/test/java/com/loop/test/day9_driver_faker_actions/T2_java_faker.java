package com.loop.test.day9_driver_faker_actions;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class T2_java_faker {
    @Test
    public void java_faker(){
        Faker faker = new Faker();

        System.out.println(faker.name().fullName());
        System.out.println(faker.numerify("###_###_####"));

        System.out.println(faker.numerify("202-###-####"));
        System.out.println(faker.letterify("?????"));
        System.out.println(faker.address().fullAddress());

        System.out.println(faker.bothify("##???#"));
        System.out.println(faker.chuckNorris().fact());

    }
}
