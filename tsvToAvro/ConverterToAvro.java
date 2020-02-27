package avroconverter;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Using showcased solutions:
 * Converter of tsv files to avro
 * Run the converter.
 * Input: a list of input files in 'args'
 * Output: a new file per input, created using the original names plus a '.avro' suffix.
 * @param args A list of files to convert.
 */

public class ConverterToAvro {
	
	public static void main(String[] args) throws IOException {
        for(String fileName : args) {
            String avroName = fileName + ".avro";

            // Make the result file using the Pantheon schema:
            DatumWriter<Pantheon> userDatumWriter = new SpecificDatumWriter<Pantheon>(Pantheon.class);
            DataFileWriter<Pantheon> dataFileWriter = new DataFileWriter<Pantheon>(userDatumWriter);
            dataFileWriter.create(Pantheon.getClassSchema(), new File(avroName));

            // Get tsv lines and parse them into avro:
           Files.lines(Paths.get(fileName)).forEach(s -> writeLine(dataFileWriter, s));

            dataFileWriter.close();
            System.out.println("Wrote " + fileName + " into avro file as " + avroName);
        }
    }

	/**
     * Write a single line from the origin file into avro via the data file writer.
     * @param dataFileWriter An AVRO data file writer for tsv file
     * @param inputLine The string line from the input file
     */
    private static void writeLine(DataFileWriter<Pantheon> dataFileWriter, String inputLine) {
        
    		TsvLine tsvline = ParserTsv1.parseLine(inputLine);


        Pantheon avroPant = Pantheon.newBuilder()
        			.setEnCurid(tsvline.GETen_curid())
        			.setName(tsvline.GETname())
        			.setNumlangs(tsvline.GETnumlangs())
        			.setBirthcity(tsvline.GETbirthcity())
        			.setBirthstate(tsvline.GETbirthstate())
        			.setCountryName(tsvline.GETcountryName())
        			.setCountryCode(tsvline.GETcountryCode())
        			.setCountryCode3(tsvline.GETcountryCode3())
        			.setLAT(tsvline.GETLAT())
        			.setLON(tsvline.GETLON())
        			.setContinentName(tsvline.GETcontinentName())
        			.setBirthyear(tsvline.GETbirthyear())
        			.setGender(tsvline.GETgender())
        			.setOccupation(tsvline.GEToccupation())
        			.setIndustry(tsvline.GETindustry())
        			.setDomain(tsvline.GETdomain())
        			.setTotalPageViews(tsvline.GETTotalPageViews())
        			.setLStar(tsvline.GETL_star())
        			.setStdDevPageViews(tsvline.GETStdDevPageViews())
        			.setPageViewsEnglish(tsvline.GETPageViewsEnglish())
        			.setPageViewsNonEnglish(tsvline.GETPageViewsNonEnglish())
        			.setAverageViews(tsvline.GETAverageViews())
        			.setHPI(tsvline.GETHPI())
                .build();
                

        //Need to wrap any IOException into a RuntimeException because the stream forEach above cannot handle checked
        // exceptions like IOException:
       try {
            dataFileWriter.append(avroPant);
       } catch (IOException e) {
            throw new RuntimeException("Bad data file write", e);
       }
    }
}
