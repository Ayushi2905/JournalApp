package net.ayushitrials.journalApp.service;

import net.ayushitrials.journalApp.repository.UserRepository;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsServiceImplTests {

    @Autowired
    private UserDetailServiceImpl userDetailService;

    @Mock
    private UserRepository userRepository;

    void loadUserByUsernameTest(){
        UserDetails user = userDetailService.loadUserByUsername("ayu1");
    }
}
