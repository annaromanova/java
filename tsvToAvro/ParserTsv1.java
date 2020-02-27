package avroconverter;

import org.apache.commons.lang.StringUtils;


public class ParserTsv1 {
	
	public static TsvLine parseLine(String tsvLine) {
		
		if (StringUtils.isEmpty(tsvLine))
			return null;
		
		String [] tokens = tsvLine.split("\\t");
		if (tokens.length < 23) {
			return null;
		}

		return new TsvLine(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5],
				tokens[6], tokens[7], tokens[8], tokens[9], tokens[10], tokens[11],
				tokens[12], tokens[13], tokens[14], tokens[15], tokens[16], tokens[17],
				tokens[18], tokens[19], tokens[20], tokens[21], tokens[22]);
	}
}
