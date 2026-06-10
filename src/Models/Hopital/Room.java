package Models.Hopital;

public abstract class Room {
    private Section _Section;
    private int _Number;

    public Room(Section _Section, int _Number) {
        this._Section = _Section;
        this._Number = _Number;
    }

    public int get_Number() {
        return _Number;
    }

    public void set_Number(int _Number) {
        this._Number = _Number;
    }

    public Section get_Section() {
        return _Section;
    }

    public void set_Section(Section _Section) {
        this._Section = _Section;
    }

    public abstract boolean isBlank();
    public abstract boolean isFull();
}
