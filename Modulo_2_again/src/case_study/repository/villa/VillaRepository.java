package case_study.repository.villa;

import case_study.models.Villa;
import case_study.utils.ReadFileVilla;
import case_study.utils.WriteFileVilla;

import java.util.Map;

public class VillaRepository implements IVillaRepository{
    @Override
    public Map<Villa, Integer> getAll() {
        return ReadFileVilla.read();
    }

    @Override
    public void add(Map<Villa, Integer> villas) {
        WriteFileVilla.write(villas);
    }
}
