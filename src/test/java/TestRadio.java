import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {
    Radio radio = new Radio();

    @Test
    void shouldGetCurrentRadioStation () {
        int expected = 1;
        radio.setCurrentRadioStation(expected);

        Assertions.assertEquals (expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetNextRadioStation () {
        int station = 8;
        int expected = 9;

        radio.setCurrentRadioStation(station);
        radio.setNextRadioStation ();
        Assertions.assertEquals (expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldSetPrevRadioStation() {
        int station = 8;
        int expected = 7;

        radio.setCurrentRadioStation(station);
        radio.setPrevRadioStation();
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterLastStation () {
        int station = 9;
        int expected = 0;

        radio.setCurrentRadioStation(station);
        radio.setNextRadioStation();
        Assertions.assertEquals (expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterFirstStation() {
        int station = 0;
        int expected = 9;

        radio.setCurrentRadioStation(station);
        radio.setPrevRadioStation();
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitsDown(){
        int station = -1;
        int expected = 0;

        radio.setCurrentRadioStation(station);
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitsUp () {
        int station = 10;
        int expected = 0;

        radio.setCurrentRadioStation(station);
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldGetCurrentVolume () {
        int volume = 1;
        int expected =1;

        radio.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume () {
        int volume = 8;
        int expected = 9;

        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume (){
        int volume = 8;
        int expected = 7;

        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeUp () {
        int volume = 10;
        int expected = 10;

        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeDown (){
        int volume = 0;
        int expected = 0;

        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitUp () {
        int volume = 11;
        int expected = 0;

        radio.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitDown () {
        int volume = -1;
        int expected = 0;

        radio.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }








}
