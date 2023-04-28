package case_study.repository.room;

import case_study.models.Room;
import case_study.repository.room.IRoomRepository;
import case_study.utils.ReadFileRooms;
import case_study.utils.WriteFileRooms;

import java.util.Map;

public class RoomRepository implements IRoomRepository {

    @Override
    public Map<Room, Integer> getAll() {
        return ReadFileRooms.read();
    }

    @Override
    public void add(Map<Room, Integer> rooms) {
        WriteFileRooms.write(rooms);
    }
}
