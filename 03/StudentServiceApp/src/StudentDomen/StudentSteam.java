package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroups;
    private int steamID;

    public StudentSteam(List<StudentGroup> studentGroups, int steamID) {
        this.studentGroups = studentGroups;
        this.steamID = steamID;
    }
    
    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    public int getSteamID() {
        return steamID;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<studentGroups.size();
            }
            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                return studentGroups.get(index++);        
            }

        };
    }
}
