import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {
    Radio radio = new Radio();


    @Test
    void shouldGetCurrentRadioStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(5);

        Assertions.assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetNextRadioStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);
        radio.setNextRadioStation();
        Assertions.assertEquals(16, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetPrevRadioStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);
        radio.setPrevRadioStation();
        Assertions.assertEquals(14, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterMaxStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(19);
        radio.setNextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterMintStation() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(0);
        radio.setPrevRadioStation();
        Assertions.assertEquals(19, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitsDown() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(-1);
        Assertions.assertEquals(19, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitsUp() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(22);
        Assertions.assertEquals(19, radio.getCurrentRadioStation());
    }


    @Test
    void shouldGetCurrentRadioStation_2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        Assertions.assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetNextRadioStation_2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setNextRadioStation();
        Assertions.assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetPrevRadioStation_2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setPrevRadioStation();
        Assertions.assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterMaxStation_2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.setNextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterMintStation_2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setPrevRadioStation();
        Assertions.assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitsDown_2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitsUp_2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    void shouldGetCurrentVolume() {
        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(92);
        radio.increaseVolume();
        Assertions.assertEquals(93, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(91);
        radio.decreaseVolume();
        Assertions.assertEquals(90, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeUp() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeDown() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitUp() {
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitDown() {
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
