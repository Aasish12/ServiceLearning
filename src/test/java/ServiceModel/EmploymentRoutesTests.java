package ServiceModel;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EmploymentRoutesTests {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetAllEmployments() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/employments/all").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetNewEmployment() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/employments/getNewEmployment").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetEmploymentsById() throws Exception {
        int employmentId = 2;
        mvc.perform(MockMvcRequestBuilders.get("/employments/getById/" + employmentId)
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void testGetEmploymentsByStudentId() throws Exception {
        int studentId = 1;
        mvc.perform(MockMvcRequestBuilders.get("/employments/getByStudentId/"+studentId)
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

    @Test
    public void testGetEmploymentsByPositionIds() throws Exception {
        int positionId = 1;
        mvc.perform(MockMvcRequestBuilders.get("/employments/getByPositionId/"+positionId)
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }
}
