//import javax.sound.sampled.AudioSystem;
//import java.io.InputStream;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;
//
//public class Music {
//    private static InputStream IN;
//    private static AudioSystem BGM;
//    private static AudioPlayer MGP = AudioPlayer.player;
//
//    public Music(String bgm) {
//        IN = Music.class.getResourceAsStream("Inspired (Clean) - NEFFEX.mp3" + bgm);
//    }
//
//    public static void Play() {
//        try {
//            BGM = new AudioStream(IN);
//            MGP.start(BGM);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void Stop() {
//        MGP.stop(BGM);
//    }
//}
//
//
//}
