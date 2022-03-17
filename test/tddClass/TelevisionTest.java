package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void TelevisionTurnOnTest() {
        //given
        Television tvSet = new Television();
        //assert
        assertFalse(tvSet.isOn());
        tvSet.turnOn();
        assertTrue(tvSet.isOn());
    }

    @Test
    public void TelevisionTurnOffTest() {
        //given
        Television tvSet = new Television();
        //assert
        assertFalse(tvSet.isOn());
        tvSet.turnOn();
        assertTrue(tvSet.isOn());
        tvSet.turnOn();
        assertFalse(tvSet.isOn());
    }

    @Test
    public void increaseVolumeTest() {
        //given
        Television tvSet = new Television();
        //assert
        assertFalse(tvSet.isOn());
        tvSet.turnOn();
        assertTrue(tvSet.isOn());
        //when
        tvSet.increaseVolume();
        tvSet.increaseVolume();
        tvSet.increaseVolume();
        tvSet.increaseVolume();
        //assert
        assertEquals(4, tvSet.getVolume());

    }

    @Test
    public void creaseVolumeTest() {
        //given
        Television tvSet = new Television();
        //assert
        assertFalse(tvSet.isOn());
        tvSet.turnOn();
        assertTrue(tvSet.isOn());
        tvSet.increaseVolume();
        //assert
        assertEquals(1, tvSet.getVolume());

    }

    @Test
    public void decreaseVolumeTest() {
        //given
        Television tvSet = new Television();
        //assert
        assertFalse(tvSet.isOn());
        tvSet.turnOn();
        assertTrue(tvSet.isOn());
        tvSet.increaseVolume();
        //assert
        assertEquals(1, tvSet.getVolume());
        tvSet.decreaseVolume();
        assertEquals(0, tvSet.getVolume());

    }

    @Test
    public void increaseChannelTest() {
        //given
        Television tvSet = new Television();
        //assert
        tvSet.turnOn();
        assertTrue(tvSet.isOn());
        //when
        tvSet.increaseChannel();
        tvSet.increaseChannel();
        //assert
        assertEquals(2, tvSet.getChannel());

    }

    @Test
    public void decreaseChannelTest() {
        //given
        Television tvSet = new Television();
        //assert
        tvSet.turnOn();
        assertTrue(tvSet.isOn());
        //when
        tvSet.increaseChannel();
        tvSet.increaseChannel();
        tvSet.increaseChannel();
        tvSet.increaseChannel();
        tvSet.increaseChannel();

        tvSet.decreaseChannel();
        tvSet.decreaseChannel();
        tvSet.decreaseChannel();
        //assert
        assertEquals(2, tvSet.getChannel());

    }

    @Test
    public void MuteTest() {
        //given
        Television tvSet = new Television();
        //assert
        tvSet.turnOn();
        assertTrue(tvSet.isOn());
        //when
        tvSet.mute();
        //assert
        assertTrue(tvSet.mute());

    }
    @Test
    public void UnMuteTest() {
        //given
        Television tvSet = new Television();
        //assert
        tvSet.turnOn();
        assertTrue(tvSet.isOn());
        //when
        tvSet.mute();
        //assert
        assertTrue(tvSet.isOn());
        tvSet.unMute();
        assertFalse(tvSet.isOn());

    }

}