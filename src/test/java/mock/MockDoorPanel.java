package mock;

public class MockDoorPanel extends DoorPanel{
    String closeStr = "";
    @Override
    public void close() {
        this.closeStr = "MockDoorPanel is closed!";
    }
}
