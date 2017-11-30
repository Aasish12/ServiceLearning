package ServiceModel;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import Data.Course;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import java.io.IOException;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CourseRoutesTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetAllCourses() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/courses/all").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetCoursesById() throws Exception {
        int courseId = 13;
        mvc.perform(MockMvcRequestBuilders.get("/courses/getById/" + courseId)
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void testGetNewCourse() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/courses/getNewCourse")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
    }

    /*
    Post and Put
    */
}
