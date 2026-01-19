package com.ishan.design_patterns.creational.factory.usecase.audio_player_example;

public class AudioPlayerFactory {

    public static AudioPlayer getAudioPlayer(MediaFormat mediaFormat, int volume, double playBackRate) {

        if (mediaFormat == null) {
            throw new IllegalArgumentException("Media format cannot be null");
        }

        return switch (mediaFormat) {
            case WAV -> new WAVPlayer(volume, playBackRate);
            case FLAC -> new FLACPlayer(volume, playBackRate);
            case MP3 -> new MP3Player(volume, playBackRate);
            default -> throw new IllegalArgumentException("Invalid media format: " + mediaFormat);
        };
    }
}
