package ServiceModel;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import Data.Hours;
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
public class HoursRoutesTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetAllHours() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hours/all").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
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
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"));
    }

    /*
    @Test
    public void testPostNewHours() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/hours/post")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }

    @Test
    public void testPutNewHours() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Hours hours = new Hours();
        hours.setInTime(3);
        hours.setOutTime(5);
        hours.setHours(2);
        hours.setStudentId(3);
        hours.setPositionId(2);
        hours.setPartnerId(1);
        hours.setProfessorId(5);
        hours.setCourseID(2);
        hours.setResponses("");
        hours.setLocationId(3);

        String json = mapper.writeValueAsString(hours);
        System.out.println(json);

        mvc.perform(MockMvcRequestBuilders
                .put("/hours/put", json)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }
    */
}
