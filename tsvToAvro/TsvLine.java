package avroconverter;



public class TsvLine {
	
	String en_curid;
	String name;
	String numlangs;
	String birthcity;
	String birthstate;
	String countryName;
	String countryCode;
	String countryCode3;
	String LAT;
	String LON;
	String continentName;
	String birthyear;
	String gender;
	String occupation;
	String industry;
	String domain;
	String TotalPageViews;
	String L_star;
	String StdDevPageViews;
	String PageViewsEnglish;
	String PageViewsNonEnglish;
	String AverageViews;
	String HPI;
	
	public TsvLine(String en_curid, String name, String numlangs, String birthcity, String birthstate,
			String countryName, String countryCode, String countryCode3, String LAT, String LON,
			String continentName, String birthyear, String gender, String occupation, String industry, String domain,
			String TotalPageViews, String L_star, String StdDevPageViews, String PageViewsEnglish,
			String PageViewsNonEnglish, String AverageViews, String HPI) {
		
		super();
		this.en_curid = en_curid;
		this.name = name;
		this.numlangs = numlangs;
		this.birthcity = birthcity;
		this.birthstate = birthstate;
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.countryCode3 = countryCode3;
		this.LAT = LAT;
		this.LON = LON;
		this.continentName = continentName;
		this.birthyear = birthyear;
		this.gender = gender;
		this.occupation = occupation;
		this.industry = industry;
		this.domain = domain;
		this.TotalPageViews = TotalPageViews;
		this.L_star = L_star;
		this.StdDevPageViews = StdDevPageViews;
		this.PageViewsEnglish = PageViewsEnglish;
		this.PageViewsNonEnglish = PageViewsNonEnglish;
		this.AverageViews = AverageViews;
		this.HPI = HPI;		
	}

	
	public String GETen_curid() {
		return en_curid;
	}

	public void SETen_curid(String en_curid) {
		this.en_curid = en_curid;
	}

	public String GETname() {
		return name;
	}

	public void SETname(String name) {
		this.name = name;
	}
	
	public String GETnumlangs() {
		return numlangs;
	}

	public void SETnumlangs(String numlangs) {
		this.numlangs = numlangs;
	}
	
	public String GETbirthcity() {
		return birthcity;
	}

	public void SETbirthcity(String birthcity) {
		this.birthcity = birthcity;
	}
	
	public String GETbirthstate() {
		return birthstate;
	}

	public void SETbirthstate(String birthstate) {
		this.birthstate = birthstate;
	}
	
	public String GETcountryName() {
		return countryName;
	}

	public void SETcountryName(String countryName) {
		this.countryName = countryName;
	}

	public String GETcountryCode() {
		return countryCode;
	}

	public void SETcountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public String GETcountryCode3() {
		return countryCode3;
	}

	public void SETcountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}
	
	public String GETLAT() {
		return LAT;
	}

	public void SETLAT(String LAT) {
		this.LAT = LAT;
	}
	
	public String GETLON() {
		return LON;
	}

	public void SETLON(String LON) {
		this.LON = LON;
	}
	
	public String GETcontinentName() {
		return continentName;
	}

	public void SETcontinentName(String continentName) {
		this.continentName = continentName;
	}
	
	public String GETbirthyear() {
		return birthyear;
	}

	public void SETbirthyear(String birthyear) {
		this.birthyear = birthyear;
	}
	
	public String GETgender() {
		return gender;
	}

	public void SETgender(String gender) {
		this.gender = gender;
	}
	
	public String GEToccupation() {
		return occupation;
	}

	public void SEToccupation(String occupation) {
		this.occupation = occupation;
	}	
	
	public String GETindustry() {
		return industry;
	}

	public void SETindustry(String industry) {
		this.industry = industry;
	}
	
	public String GETdomain() {
		return domain;
	}

	public void SETdomain(String domain) {
		this.domain = domain;
	}
	
	public String GETTotalPageViews() {
		return TotalPageViews;
	}

	public void SETTotalPageViews(String TotalPageViews) {
		this.TotalPageViews = TotalPageViews;
	}
	
	public String GETL_star() {
		return L_star;
	}

	public void SETL_star(String L_star) {
		this.L_star = L_star;
	}
	
	public String GETStdDevPageViews() {
		return StdDevPageViews;
	}

	public void SETStdDevPageViews(String StdDevPageViews) {
		this.StdDevPageViews = StdDevPageViews;
	}
	
	public String GETPageViewsEnglish() {
		return PageViewsEnglish;
	}

	public void SETPageViewsEnglish(String PageViewsEnglish) {
		this.PageViewsEnglish = PageViewsEnglish;
	}
	
	public String GETPageViewsNonEnglish() {
		return PageViewsNonEnglish;
	}

	public void SETPageViewsNonEnglish(String PageViewsNonEnglish) {
		this.PageViewsNonEnglish = PageViewsNonEnglish;
	}
	
	public String GETAverageViews() {
		return AverageViews;
	}

	public void SETAverageViews(String AverageViews) {
		this.AverageViews = AverageViews;
	}
	
	public String GETHPI() {
		return HPI;
	}

	public void HPI(String HPI) {
		this.HPI = HPI;
	}
		

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((en_curid == null) ? 0 : en_curid.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numlangs == null) ? 0 : numlangs.hashCode());
		result = prime * result + ((birthcity == null) ? 0 : birthcity.hashCode());
		result = prime * result + ((birthstate == null) ? 0 : birthstate.hashCode());
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result + ((countryCode3 == null) ? 0 : countryCode3.hashCode());
		result = prime * result + ((LAT == null) ? 0 : LAT.hashCode());
		result = prime * result + ((LON == null) ? 0 : LON.hashCode());
		result = prime * result + ((continentName == null) ? 0 : continentName.hashCode());
		result = prime * result + ((birthyear == null) ? 0 : birthyear.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((industry == null) ? 0 : industry.hashCode());
		result = prime * result + ((domain == null) ? 0 : domain.hashCode());
		result = prime * result + ((TotalPageViews == null) ? 0 : TotalPageViews.hashCode());
		result = prime * result + ((L_star == null) ? 0 : L_star.hashCode());
		result = prime * result + ((StdDevPageViews == null) ? 0 : StdDevPageViews.hashCode());
		result = prime * result + ((PageViewsEnglish == null) ? 0 : PageViewsEnglish.hashCode());
		result = prime * result + ((PageViewsNonEnglish == null) ? 0 : PageViewsNonEnglish.hashCode());
		result = prime * result + ((AverageViews == null) ? 0 : AverageViews.hashCode());
		result = prime * result + ((HPI == null) ? 0 : HPI.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TsvLine other = (TsvLine) obj;
		
		if (en_curid == null) {
			if (other.en_curid != null)
				return false;
		} else if (!en_curid.equals(other.en_curid))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		if (numlangs == null) {
			if (other.numlangs != null)
				return false;
		} else if (!numlangs.equals(other.numlangs))
			return false;
		
		if (birthcity == null) {
			if (other.birthcity != null)
				return false;
		} else if (!birthcity.equals(other.birthcity))
			return false;
		
		if (birthstate == null) {
			if (other.birthstate != null)
				return false;
		} else if (!birthstate.equals(other.birthstate))
			return false;
		
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		

		if (countryCode3 == null) {
			if (other.countryCode3 != null)
				return false;
		} else if (!countryCode3.equals(other.countryCode3))
			return false;

		
		if (LAT == null) {
			if (other.LAT != null)
				return false;
		} else if (!LAT.equals(other.LAT))
			return false;


		if (LON == null) {
			if (other.LON != null)
				return false;
		} else if (!LON.equals(other.LON))
			return false;
		
		
		if (continentName == null) {
			if (other.continentName != null)
				return false;
		} else if (!continentName.equals(other.continentName))
			return false;

		
		if (birthyear == null) {
			if (other.birthyear != null)
				return false;
		} else if (!birthyear.equals(other.birthyear))
			return false;

		
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		
		if (occupation == null) {
			if (other.occupation != null)
				return false;
		} else if (!occupation.equals(other.occupation))
			return false;
		
		
		if (industry == null) {
			if (other.industry != null)
				return false;
		} else if (!industry.equals(other.industry))
			return false;
		
		
		if (domain == null) {
			if (other.domain != null)
				return false;
		} else if (!domain.equals(other.domain))
			return false;
		

		if (TotalPageViews == null) {
			if (other.TotalPageViews != null)
				return false;
		} else if (!TotalPageViews.equals(other.TotalPageViews))
			return false;


		if (L_star == null) {
			if (other.L_star != null)
				return false;
		} else if (!L_star.equals(other.L_star))
			return false;
		

		if (StdDevPageViews == null) {
			if (other.StdDevPageViews != null)
				return false;
		} else if (!StdDevPageViews.equals(other.StdDevPageViews))
			return false;
		
		
		if (PageViewsEnglish == null) {
			if (other.PageViewsEnglish != null)
				return false;
		} else if (!PageViewsEnglish.equals(other.PageViewsEnglish))
			return false;


		if (PageViewsNonEnglish == null) {
			if (other.PageViewsNonEnglish != null)
				return false;
		} else if (!PageViewsNonEnglish.equals(other.PageViewsNonEnglish))
			return false;
		
		
		if (AverageViews == null) {
			if (other.AverageViews != null)
				return false;
		} else if (!AverageViews.equals(other.AverageViews))
			return false;
		

		if (HPI == null) {
			if (other.HPI != null)
				return false;
		} else if (!HPI.equals(other.HPI))
			return false;		
		
		return true;
	}


	
	@Override
	public String toString() {
		return "LogLine1 [en_curid=" + en_curid + ", name=" + name + ", numlangs=" + numlangs + ", "
				+ "birthcity=" + birthcity + ", birthstate=" + birthstate + ", "
				+ "countryName=" + countryName + ", countryCode=" + countryCode + ", "
				+ "countryCode3=" + countryCode3 + ", LAT=" + LAT + ", "
				+ "LON=" + LON + ", continentName=" + continentName + ","
				+ "birthyear=" + birthyear + ", gender=" + gender + ", "
				+ "occupation=" + occupation + ", industry=" + industry + ", "
				+ "domain=" + domain + ", TotalPageViews=" + TotalPageViews + ", "
				+ "L_star=" + L_star + ", StdDevPageViews=" + StdDevPageViews + ", "
				+ "PageViewsEnglish=" + PageViewsEnglish + ", PageViewsNonEnglish=" + PageViewsNonEnglish + ","
				+ " AverageViews=" + AverageViews + ", HPI=" + HPI+ "]"; 
	}
}
