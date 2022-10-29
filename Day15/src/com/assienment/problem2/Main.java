package com.assienment.problem2;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Please enter the details of 4 songs");
		int count = 1 ;
		
		PlayList playList = new PlayList() ;
		for(int i=0;i<4;i++) {
			System.out.println("Enter the name of Movie "+count);
			String movieName = sc.nextLine() ;
			System.out.println("Enter the name of Song "+count);
			String songName = sc.nextLine() ;
			Song song = new Song(movieName , songName) ;
			playList.addSong(song);
			count++ ;
		}
		for( Song s : playList.songs) {
			s.play();
		}
		sc.close(); 
	}
}
