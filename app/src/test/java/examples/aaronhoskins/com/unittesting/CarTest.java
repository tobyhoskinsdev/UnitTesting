package examples.aaronhoskins.com.unittesting;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {

    Car testCar;

    @Mock
    AutomotiveInformation mockAutoInfo;

    @Before
    public void setup() {
        Mockito.when(mockAutoInfo.getMake()).thenReturn("Toyota");
        testCar = new Car("V6",
                            "2",
                        "Auto",
                        4,
                        "Rust",
                        false,
                         mockAutoInfo);
    }

    @Test
    public void testAutoInfo() {

        Mockito.when(mockAutoInfo.getMake()).thenReturn("BMW");
        assertEquals("Toyota", testCar.getAutomotiveInformation().getMake());
        Mockito.verify(mockAutoInfo, Mockito.times(1)).getMake();
    }
}
