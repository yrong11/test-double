package Mockito;

import mock.DoorPanel;
import mock.MockDoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class SecurityCenterTest {

    SecurityCenter securityCenter;
    DoorPanel doorPanel;

    @BeforeEach
    public void setUp() {
        doorPanel = mock(DoorPanel.class);
        securityCenter = new SecurityCenter(doorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(doorPanel).close();
    }

}