package net.ayushitrials.journalApp.service;

import net.ayushitrials.journalApp.entity.User;
import net.ayushitrials.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private UserService userService;

    @Test
    public void testFindByUserName(){
        User user = userRepository.findByUserName("ayu1");
        //assertNotNull(userRepository.findByUserName("ayu1"));
        assertTrue(!user.getJournalEntries().isEmpty());
    }

}
