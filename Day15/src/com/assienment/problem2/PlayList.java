package com.assienment.problem2;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	public List<Song> songs = new ArrayList<>() ;
	
	public void addSong(Song song) {
		boolean present = false ;
		for( Song s : songs) {
			if(s.equals(song)) {
				present = true ;
			}
		}
		
		if(!present) {
			songs.add(song) ;
			System.out.println("Song added to the playlist successfully");
		}
		else
			System.out.println("Song already in the playlist");
		
	}
}
