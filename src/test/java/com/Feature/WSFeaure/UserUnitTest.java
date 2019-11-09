package com.Feature.WSFeaure;

import com.Feature.WSFeature.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;

import java.io.IOException;

@Nested
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class UserUnitTest {
    private User userTest;

    Logger logger;

   // @BeforeAll
    @Test
    @DisplayName("AddUserInstance")
    public void addUserTest(){
        userTest = new User(1, "Test1");

    }

    @Test
    @DisplayName("getUserName")
    public void getUserName(){
        userTest = new User(1, "Test1");
        userTest.getName();
    }

    @Test
    @DisplayName("getUserId")
    public void getUserId(){
        userTest = new User(1, "Test1");
        userTest.getId();
    }

    @ParameterizedTest(name = "Set new User Name {0} .")
    @ValueSource(strings = { "Den Brown", "Luckyanenko", "Frank Tillie" })
    @DisplayName("setUserName")
    public void setUserName(String sets){
        userTest = new User(1, "Test1");
        userTest.setName(sets);
    }


    @DisplayName("setUserId")
    @ParameterizedTest(name = "Set new User Id {0} .")
    @ValueSource(ints = { 10, 123, 4 })
    public void setUserId(int unts){
        userTest = new User(1, "Test1");
        userTest.setId(unts);
    }


    public void setLogger(Logger logger) {
        this.logger = logger;
    }

}

