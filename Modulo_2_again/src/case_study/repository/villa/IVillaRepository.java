package case_study.repository.villa;

import case_study.models.Room;
import case_study.models.Villa;

import java.util.Map;

public interface IVillaRepository {
    Map<Villa, Integer> getAll();

    void add(Map<Villa, Integer> villas);
}
