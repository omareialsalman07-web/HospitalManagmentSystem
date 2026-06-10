package Services.Hospital;

import java.util.ArrayList;

import Models.Patient;
import Models.Hospital.Room;

public class RoomService {

    private ArrayList<Room> rooms;

    public RoomService()
    {
        load();
    }

    public boolean add(Room room)
    {
        if(room != null)
        {
            rooms.add(room);
            return true;
        }
        
        return false;
    }

    public Room findById(int roomId)
    {
        for(Room r : rooms)
        {
            if(r.get_ID() == roomId) return r;
        }

        return null;
    }

    public void AssignToRoom(int roomId, Patient patient) throws Exception
    {
        Room room = findById(roomId);

        if(room != null)
        {
            room.addPatient(patient);
        }
    }

    private void load()
    {
        rooms = new ArrayList<>();
    }
}
