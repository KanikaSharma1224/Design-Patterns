package patterns.creational;

public class MusicList {
	private String playList1;
	private String playList2;
	private String romanticList;
	private String sadSongList;

	public static class MusicListBuilder {
		private String playList1;
		private String playList2;
		private String romanticList;
		private String sadSongList;

		public MusicListBuilder(String romanticList, String playList1) {
			this.romanticList = romanticList;
			this.playList1 = playList1;
		}

		public MusicListBuilder playList2(String pList2) {
			this.playList2 = pList2;
			return this;
		}

		public MusicListBuilder sadSongList(String sadSongs) {
			this.sadSongList = sadSongs;
			return this;
		}

		public MusicList build() {
			return new MusicList(this);
		}
	}

	private MusicList(MusicListBuilder builder) {
		this.playList1 = builder.playList1;
		this.playList2 = builder.playList2;
		this.romanticList = builder.romanticList;
		this.sadSongList = builder.sadSongList;
	}

	public String getPlayList1() {
		return playList1;
	}

	public String getPlayList2() {
		return playList2;
	}

	public String getRomanticSongs() {
		return romanticList;
	}

	public String getSadSongList() {
		return sadSongList;
	}

	public String toString() {
		return playList1 + " " + playList2 + " " + romanticList + " " + sadSongList;
	}

}
