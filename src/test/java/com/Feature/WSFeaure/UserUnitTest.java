package com.Feature.WSFeaure;

import com.Feature.WSFeature.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.springframework.util.Assert;

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
        assert userTest != null : "Didn't create new User";

    }

    @Test
    @DisplayName("getUserName")
    public void getUserName(){
        userTest = new User(1, "Test1");
        assert userTest.getName()!= "" : "Didn't find user by name";
    }

    @Test
    @DisplayName("getUserId")
    public void getUserId(){
        userTest = new User(1, "Test1");
        assert userTest.getId()>0 : "Didn't find user by id";
    }

    @ParameterizedTest(name = "Set new User Name {0} .")
    @ValueSource(strings = { "Den Brown", "Luckyanenko", "Frank Tillie" })
    @DisplayName("setUserName")
    public void setUserName(String sets){
        userTest = new User(1, "Test1");
        userTest.setName(sets);
        assert  userTest.getName().equals(sets) : "Didn't set new Name";
    }


    @DisplayName("setUserId")
    @ParameterizedTest(name = "Set new User Id {0} .")
    @ValueSource(ints = { 10, 123, 4 })
    public void setUserId(int unts){
        userTest = new User(1, "Test1");
        userTest.setId(unts);
        assert userTest.getId()==unts : "Didn't set new id";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

}

