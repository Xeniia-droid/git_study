package com.Feature.WSFeaure;

import com.Feature.WSFeature.User;
import com.Feature.WSFeature.UserRepository;
import com.Feature.WSFeature.WsFeaureApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ContextConfiguration(classes={WsFeaureApplication.class})
class WsFeaureApplicationTests {

	@Autowired
	UserRepository userRepository;


	@ParameterizedTest (name = "Add Users {0}")
	@ValueSource(strings = {"Robert", "Ivan","Nick", "Den"})
	@DisplayName("test add User")
	void testAddUser(String names) {
		userRepository.save(new User(names)); // в базу
	}

	@Test
	@DisplayName("test get User")
	void testFindAllUser() {
		userRepository.findAll();
	}

	@ParameterizedTest(name = "Find by Id {0}")
	@ValueSource (ints = {1,2,3})
	@DisplayName("test get User")
	void testFindById(Integer id) {
		userRepository.findById(id);
	}

	@ParameterizedTest(name = "Find by Name {0}")
	@ValueSource (strings = {"Ivan"})
	@DisplayName("test get User")
	void testFindByUser(String names) {
		userRepository.findAllByName(names);
	}

}
