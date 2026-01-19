package com.ishan.design_patterns.creational.factory.usecase.audio_player_example;

public class AudioPlayerClient {

    public static void main(String[] args) {
        AudioPlayer player =
                AudioPlayerFactory.getAudioPlayer(MediaFormat.MP3, 50, 1.0);

        player.play();
        player.pause();
        player.stop();
    }
}
