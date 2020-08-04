package mock;

public class MockDoorPanel extends DoorPanel{
    String closeStr = "";
    @Override
    void close() {
//        super.close();
        this.closeStr = "MockDoorPanel is closed!";
    }
}
