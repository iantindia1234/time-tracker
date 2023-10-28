package training.taylor.timetracker.core;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int index) {
        if (index >= 0 && index < entries.size()) {
            return entries.get(index);
        } else {
            // Handle the index being out of bounds or other exceptions.
            throw new IllegalArgumentException("Invalid index");
        }
    }
}
