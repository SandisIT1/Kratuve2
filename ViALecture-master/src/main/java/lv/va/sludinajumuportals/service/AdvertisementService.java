package lv.va.sludinajumuportals.service;

import lv.va.sludinajumuportals.domain.Advertisement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdvertisementService {

    public Advertisement getAdvertisement() {
        Advertisement advertisement = new Advertisement(1L, "Pardodu Mašīnu", "Rīga", "Jānis", 23426211L, 8650.76D);
        return advertisement;
    }
    public Advertisement getAdvertisement2() {
        Advertisement advertisement = new Advertisement(2L, "Pardodu Maju", "Cēsis", "Amanda", 24566232L, 56680.89D);
        return advertisement;
    }
    public Advertisement getAdvertisement3() {
        Advertisement advertisement = new Advertisement(3L, "Pardodu Datoru", "Tukums", "Juris", 23459454L, 450.00D);
        return advertisement;
    }
    public Advertisement getAdvertisement4() {
        Advertisement advertisement = new Advertisement(4L, "Pardodu Televizoru", "Liepa", "Aivis", 29879211L, 150.76D);
        return advertisement;
    }
    public Advertisement getAdvertisement5() {
        Advertisement advertisement = new Advertisement(5L, "Pardodu Skapi", "Talsi", "Madara", 24536211L, 350.99D);
        return advertisement;
    }
    public Advertisement getAdvertisement6() {
        Advertisement advertisement = new Advertisement(6L, "Pardodu Velosipedu", "Valmiera", "Ivans", 26726211L, 200.16D);
        return advertisement;
    }
    
    {
        
    }

    //Nekadigi nesanaca izveidot ar array
    public ArrayList<Advertisement> getAdvertisementList() {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        Advertisement advertisement = new Advertisement(1L, "Pardodu Mašīnu", "Rīga", "Jānis", 23426211L, 8650.76D);
        Advertisement advertisement2 = new Advertisement(2L, "Pardodu Maju", "Cēsis", "Amanda", 24566232L, 56680.89D);
        Advertisement advertisement3 = new Advertisement(3L, "Pardodu Datoru", "Tukums", "Juris", 23459454L, 450.00D);
        Advertisement advertisement4 = new Advertisement(4L, "Pardodu Televizoru", "Liepa", "Aivis", 29879211L, 150.76D);
        Advertisement advertisement5 = new Advertisement(5L, "Pardodu Skapi", "Talsi", "Madara", 24536211L, 350.99D);
        Advertisement advertisement6 = new Advertisement(6L, "Pardodu Velosipedu", "Valmiera", "Ivans", 26726211L, 200.16D);

        advertisements.add(advertisement);
        advertisements.add(advertisement2);
        advertisements.add(advertisement3);
        advertisements.add(advertisement4);
        advertisements.add(advertisement5);
        advertisements.add(advertisement6);
        return advertisements;
    }
}
