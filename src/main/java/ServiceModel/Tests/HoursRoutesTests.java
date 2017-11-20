package ServiceModel.Tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HoursRoutesTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetAllHours() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hours/all").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetHoursByStudentId() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hours/getHoursByStudentId/{studentId}")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void testGetHoursByCourseId() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hours/getHoursByCourseId/{courseId}")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void testGetNewHours() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hours/getNewHours")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void testPostNewHours() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/users/post")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void testPutNewHours() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/users/put")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

}