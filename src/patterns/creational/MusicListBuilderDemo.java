package patterns.creational;

import patterns.creational.MusicList.MusicListBuilder;

public class MusicListBuilderDemo {
	public static void main(String... args) {
		MusicListBuilder builder  = new MusicList.MusicListBuilder("romantic", "romanaticAndsadsongs");
		builder.playList2("playList2");
		MusicList musicList = builder.build();
		
		System.out.println(musicList);
		
	}

}
