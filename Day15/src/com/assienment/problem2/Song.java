package com.assienment.problem2;

public class Song {

	private String movieName ;
	private String songName ;
	
	@Override
	public int hashCode() {
		
		return movieName.hashCode()+songName.hashCode() ;
	}
	
	@Override
	public boolean equals(Object obj1) {
		Song obj = (Song) obj1 ;
		return (movieName.equals(obj.movieName) && songName.equals(obj.songName) )  ;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}
	
	public Song() {
	}
	
	public void play() {
		System.out.println(songName + " of " + movieName+" is playing...!");
	}
	
}
