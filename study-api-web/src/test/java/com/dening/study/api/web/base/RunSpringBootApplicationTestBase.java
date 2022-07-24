package com.dening.study.api.web.base;

import com.dening.study.api.web.StudyApiWebApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = StudyApiWebApplication.class)
@ExtendWith({SpringExtension.class})
@WebAppConfiguration
public class RunSpringBootApplicationTestBase {

    @Test
    public void testDemo() {
        System.out.println("A Test");
    }

}
