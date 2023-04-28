package case_study.repository.room;

import case_study.models.Room;

import java.util.Map;

public interface IRoomRepository {
    Map<Room, Integer> getAll();

    void add(Map<Room, Integer> rooms);

}
