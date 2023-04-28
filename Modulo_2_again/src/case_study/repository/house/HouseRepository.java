package case_study.repository.house;

import case_study.models.House;
import case_study.utils.ReadFileHouse;
import case_study.utils.WriteFileHouse;

import java.util.Map;

public class HouseRepository implements IHouseRepository{
    @Override
    public Map<House, Integer> getAll() {
        return ReadFileHouse.read();
    }

    @Override
    public void add(Map<House, Integer> houses) {
        WriteFileHouse.write(houses);
    }


}
