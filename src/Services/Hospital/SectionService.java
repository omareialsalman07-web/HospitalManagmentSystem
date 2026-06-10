package Services.Hospital;

import Models.Hospital.Section;
import Models.Hospital.Room;
import java.util.ArrayList;
import java.util.List;

public class SectionService {
    private List<Section> sections = new ArrayList<>();

    public boolean add(Section section) {
        if(section != null)
        {
            sections.add(section);
            return true;
        }

        return false;
    }

    public Section findByName(String name) {
        for(Section s : sections)
        {
            if(s.get_Name().equals(name)) return s;
        }

        return null;
    }

    public List<Room> getRoomsInSection(String sectionName, RoomService roomService) {
        return findByName(sectionName).get_Rooms();
    }
}
