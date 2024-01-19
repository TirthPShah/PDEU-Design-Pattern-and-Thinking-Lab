package com.club;

public class ClubSelectionGiver {
	
	public baseClub getInstance(String str) {
		
		switch(str) {
			
			case "Technology":
			case "Computer Science":
				return new Encode();
			
			case "Chemistry":
			case "Chemical":
				return new Alchemy();
				
			case "Finance":
			case "FinTech":
				return new Anirveda();
			
			case "Space":
			case "Astronomy":
				return new Brahmaand();
			
			case "Robotics":
			case "Mechanics":
			case "Mechanical":
				return new Cretus();
				
			case "Dramatics":
				return new Daastaan();
				
			case "Korean":
			case "Japanese":
				return new AjiaBunker();
				
			case "Enviornment":
			case "Nature":
				return new Envirofreaks();
				
			case "Literature":
				return new Jharokha();
				
			case "Dance":
			case "Dancing":
				return new Malang();
				
			case "Mythology":
				return new Mithakshaastra();
				
			case "Physics":
				return new Nucleus();
				
			case "Singing":
			case "Music":
				return new Offbeat();
				
			case "Fashion":
			case "Fashion Designing":
				return new Panache();
				
			case "Spirituality":
			case "Spiritual":
			case "Religion":
			case "Religious":
			case "Religiousity":
				return new Radiance();
				
			case "Arts":
			case "Fine Arts":
				return new Rang();
				
			case "E-Sports":
			case "E Sports":
			case "Gaming":
				return new Respawn();
				
			case "Social Activity":
			case "Social Awareness":
				return new Rotaract();
				
			case "Maths":
			case "Mathematics":
				return new SOM();
				
			case "Photography":
				return new Sorriso();
				
			case "Health":
			case "Fitness":
				return new StepUp();
				
			case "Graphic Design":
			case "Graphic Designing":
			case "UI Designing":
			case "UX Designing":
			case "UI/UX Designing":
				return new Symmetry();
				
			case "Start Up":
			case "Startup":
			case "Entrepreneurship":
				return new Synergy();
				
			case "Sanskrit":
				return new Tattvam();
				
			case "Film Making":
			case "Videography":
				return new VGA();
				
			case "Food":
			case "Cullinary":
				return new Zaayka();
				
			default:
				return new AllClubInfo();
			
		}
	}
}