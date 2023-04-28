package case_study.repository.house;

import case_study.models.House;
import case_study.models.Villa;

import java.util.Map;

public interface IHouseRepository {

    Map<House, Integer> getAll();

    void add(Map<House, Integer> houses);


}
