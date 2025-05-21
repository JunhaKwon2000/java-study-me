package pkg_homework.practice02.model.vo;

public class Song {
	
	public String songTitle;
	protected String singer;
	private static int publishYear = 2009;
	private static final String ALBUM_NAME = "1집";
	
	public static int getPublishYear() {
		return publishYear;
	}
	public static String getALBUM_NAME() {
		return ALBUM_NAME;
	}

	
	
	

}
