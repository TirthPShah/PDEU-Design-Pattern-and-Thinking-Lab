package com.club;

import java.util.ArrayList;
import java.util.Collections;

public class AllClubInfo implements baseClub {
	
	public void spec() {
		
		ArrayList<String> infoList = new ArrayList<>();
		
		infoList.add("Ajia Bunker - The Korean and Japanese Club of PDEU");
		infoList.add("Alchemy - The Chemistry Club of PDEU");
		infoList.add("Anirveda - The Finance Club of PDEU");
		infoList.add("Brahmaand - The Astronomy Club of PDEU");
		infoList.add("Cretus - The Robotics Club of PDEU");
		infoList.add("Daastaan - The Dramatics Club of PDEU");
		infoList.add("Encode - The Computer Science Club of PDEU");
		infoList.add("Envirofreaks - The Enviornment and Nature Club of PDEU");
		infoList.add("Jharokha - The Literature Club of PDEU");
		infoList.add("Malang - The Dance Club of PDEU");
		infoList.add("Mithakshaastra - The Mythology Club of PDEU");
		infoList.add("Nucleus- The Physics Club of PDEU");
		infoList.add("Offbeat - The Music and Singing Club of PDEU");
		infoList.add("Panache - The Fashion Club of PDEU");
		infoList.add("Radiance - The Spirituality Club of PDEU");
		infoList.add("Rang - The Fine Arts Club of PDEU");
		infoList.add("Respawn - The E-Sports and Gaming Club of PDEU");
		infoList.add("Rotaract - The Social Awareness Club of PDEU");
		infoList.add("Society of Mathematics - The Mathematics Club of PDEU");
		infoList.add("Sorriso - The Photography Club of PDEU");
		infoList.add("Step Up - The Health and Fitness Club of PDEU");
		infoList.add("Symmetry - The Graphic Designing Club of PDEU");
		infoList.add("Synergy - The Entrepreneurship Club of PDEU");
		infoList.add("Video Graphics Assosciation - The Film Making Club of PDEU");
		infoList.add("Zaayka - The Food and Cuisine Club of PDEU");
		
		Collections.sort(infoList);
		
		System.out.println("\nNeed Help? Here are all the major clubs of PDEU:\n");
		
		for (String info : infoList) {
			System.out.println(info);
		}
		
	}
}