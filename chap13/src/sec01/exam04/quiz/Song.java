package sec01.exam04.quiz;

import java.util.Objects;

public class Song {
	
	private String name;
	private String singer;
	
	public Song() {}
	public Song(String name, String singer) {
		this.name = name;
		this.singer = singer;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, singer);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(name, other.name) && Objects.equals(singer, other.singer);
	}
	@Override
	public String toString() {
		return "{제목=" + name + ", 가수=" + singer + "}";
	}
	
	
	
	

}
