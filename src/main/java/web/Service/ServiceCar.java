package web.Service;

import model.Cars;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceCar {
    private List<Cars> list;

    {
        list = new ArrayList<>();
        list.add(new Cars("Arnold Schwarzenegger", 236, 247));
        list.add(new Cars("Ronnie Coleman", 260, 380));
        list.add(new Cars("Chris Bumstead", 200, 300));
        list.add(new Cars("Kirill Sarychev", 335, 412));
        list.add(new Cars("David Laid", 180, 210));
    }

    public List<Cars> returnCars() {
        return list;
    }

    public List<Cars> show(int count) {
        List<Cars> result = null;
        switch (count) {
            case 1:
                result = new ArrayList<>(list.subList(0, Math.min(count, list.size())));
                return result;
            case 2:
                result = new ArrayList<>(list.subList(0, Math.min(count, list.size())));
                return result;
            case 3:
                result = new ArrayList<>(list.subList(0, Math.min(count, list.size())));
                return result;
            case 4:
                result = new ArrayList<>(list.subList(0, Math.min(count, list.size())));
                return result;
            case 5:
                result = new ArrayList<>(list.subList(0, Math.min(count, list.size())));
                return result;
            default:
                return result;
        }
    }
}
