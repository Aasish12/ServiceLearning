package ServiceModel;

import Data.Hours;
import ServiceInterface.HoursServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.http.converter.json.*;

import java.io.IOException;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HoursRoutesTests {

    @Autowired
    private MockMvc mvc;

    @Mock
    private HoursServices hoursServices;

    @Test
    public void testGetAllHours() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hours/all").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetHoursByStudentId() throws Exception {
        int studentId = 13;
        mvc.perform(MockMvcRequestBuilders.get("/hours/getHoursByStudentId/"+studentId)
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void testGetHoursByCourseId() throws Exception {
        int courseId = 3;
        mvc.perform(MockMvcRequestBuilders.get("/hours/getHoursByCourseId/"+courseId)
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void testGetNewHours() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hours/getNewHours")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void testPostNewHours() throws Exception {
        Hours hours = new Hours(2017, 2017, 3, 2, 1, 3,
                1, 1, "", 2);
        mvc.perform(MockMvcRequestBuilders.post("/hours/post")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }

    @Test
    public void testPutNewHours() throws Exception {
        mvc.perform(MockMvcRequestBuilders.put("/users/put")
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }
}
