package test.assignment00;

public class Position {
    public byte positionID;
    public enum PositionName {
        DEV,
        TESTER,
        SCRUM_MASTER,
        PM
    }
    public PositionName positionName;

    @Override
    public String toString() {
        return "Position{" +
                "positionID=" + positionID +
                ", positionName=" + positionName +
                '}';
    }
}
