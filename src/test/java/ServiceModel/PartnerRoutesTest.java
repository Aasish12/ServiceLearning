package ServiceModel;

import Data.Partner;
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
public class PartnerRoutesTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetNewPartner() throws Exception {

        MvcResult mvr =  mvc.perform(MockMvcRequestBuilders.get("/partners/getNewPartner").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String content = mvr.getResponse().getContentAsString();
        //System.out.println(content);
    }

    @Test
    public void testGetAllPartners() throws Exception {
        MvcResult mvr =  mvc.perform(MockMvcRequestBuilders.get("/partners/all").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String content = mvr.getResponse().getContentAsString();
        //System.out.println(content);
    }

    @Test
    public void testGetById() throws Exception {
        MvcResult mvr =  mvc.perform(MockMvcRequestBuilders.get("/partners/getById/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String content = mvr.getResponse().getContentAsString();
        //System.out.println(content);
    }

    @Test
    public void testSearch() throws Exception {
        MvcResult mvr =  mvc.perform(MockMvcRequestBuilders.get("/partners/search/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String content = mvr.getResponse().getContentAsString();
//        System.out.println(content);
    }

    @Test
    public void testPostPartner() throws Exception {
        Partner p = new Partner(-1, "Peyok Inc", "Josh", "Peyok", "0123456789");


        MvcResult mvr =  mvc.perform(MockMvcRequestBuilders.post("/partners/post/", p).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String content = mvr.getResponse().getContentAsString();
//        System.out.println(content);
    }



}
