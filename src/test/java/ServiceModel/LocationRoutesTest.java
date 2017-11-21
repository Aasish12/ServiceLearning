package ServiceModel;

import Data.Location;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LocationRoutesTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetNewLocation() throws Exception {

        MvcResult mvr =  mvc.perform(MockMvcRequestBuilders.get("/locations/getNewLocation").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String content = mvr.getResponse().getContentAsString();
        //System.out.println(content);
    }

    @Test
    public void testGetAllLocations() throws Exception {
        MvcResult mvr =  mvc.perform(MockMvcRequestBuilders.get("/locations/all").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String content = mvr.getResponse().getContentAsString();
        //System.out.println(content);
    }

    @Test
    public void testGetById() throws Exception {
        MvcResult mvr =  mvc.perform(MockMvcRequestBuilders.get("/locations/getById/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String content = mvr.getResponse().getContentAsString();
        //System.out.println(content);
    }

    @Test
    public void testSearch() throws Exception {
        MvcResult mvr =  mvc.perform(MockMvcRequestBuilders.get("/locations/search/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String content = mvr.getResponse().getContentAsString();
//        System.out.println(content);
    }

    @Test
    public void testPostLocation() throws Exception {
        Location l = new Location();
        l.setAddressLine1("Line1");
        l.setAddressLine2("Line2");
        l.setCity("Testing City");
        l.setCountry("Test Country");
        l.setPrimary(true);
        l.setState("MA");
        l.setZipcode("02120");

        MvcResult mvr =  mvc.perform(MockMvcRequestBuilders.post("/locations/post/", l).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String content = mvr.getResponse().getContentAsString();
//        System.out.println(content);
    }

    @Test
    public void testPutLocation() throws Exception {
        Location l = new Location();
        l.setAddressLine1("Line1");
        l.setAddressLine2("Line2");
        l.setCity("Testing City");
        l.setCountry("Test Country");
        l.setPrimary(true);
        l.setState("MA");
        l.setZipcode("02120");

        MvcResult mvr =  mvc.perform(MockMvcRequestBuilders.put("/locations/put/", l).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String content = mvr.getResponse().getContentAsString();
//        System.out.println(content);
    }
    
}
