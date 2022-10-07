package com.leonardo.toolsChallenge;

import com.leonardo.toolsChallenge.controller.impl.PagamentoController;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ToolsChallengeApplication.class)
@TestPropertySource(locations = "classpath:teste.properties")
class ToolsChallengeApplicationTests  {

    @Test
    void contextLoads() {
    }

}
