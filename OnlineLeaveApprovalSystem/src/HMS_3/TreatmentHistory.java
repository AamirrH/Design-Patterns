package HMS_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreatmentHistory {
    private final TreatmentRecord record;
    private final Deque<TreatmentMemento> history = new ArrayDeque<>();

    public TreatmentHistory(TreatmentRecord record) {
        this.record = record;
    }

    public void save() {
        history.push(record.save());
    }

    public boolean undo() {
        if (history.isEmpty()) {
            return false;
        }
        record.restore(history.pop());
        return true;
    }
}
