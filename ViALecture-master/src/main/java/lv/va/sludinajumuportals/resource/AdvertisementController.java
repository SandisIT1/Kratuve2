package lv.va.sludinajumuportals.resource;

import lv.va.sludinajumuportals.domain.Response;
import lv.va.sludinajumuportals.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;
    

    @GetMapping(value = "/")
    @ResponseBody
    public String testEndpoint() {
        return "Hello!";
    }

    @GetMapping(value = "/hey")
    @ResponseBody
    public Response nextTestEndpoint() {
        return new Response("Hey Ya");
    }
    
    
    //Atvainojos par neracionalo risinajumu, bet atrast racionalu veidu ka izpildit majasdarba prasibas man neizdevas.

    @RequestMapping("/main")
    public String getUI(Map<String, Object> model) {
        model.put("message", "Hello User!");
        model.put("advertisement", advertisementService.getAdvertisement());
        model.put("advertisement2", advertisementService.getAdvertisement2());
        model.put("advertisement3", advertisementService.getAdvertisement3());
        model.put("advertisement4", advertisementService.getAdvertisement4());
        model.put("advertisement5", advertisementService.getAdvertisement5());
        model.put("advertisement6", advertisementService.getAdvertisement6());
        
        return "main";
    }

}