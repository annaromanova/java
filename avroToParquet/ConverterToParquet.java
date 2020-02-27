package parquetconverter;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.commons.io.FileUtils;
import org.apache.hadoop.fs.Path;
import org.apache.parquet.avro.AvroParquetWriter;
import org.apache.parquet.hadoop.ParquetWriter;
import org.apache.parquet.hadoop.metadata.CompressionCodecName;

import java.io.File;

/**
 * Based on showcased solutions.
 * Converts our  avros into Parquet. Heavily based on the suggested example:
 * https://stackoverflow.com/questions/42078757/is-it-possible-to-read-and-write-parquet-using-java-without-a-dependency-on-hado/42224290#42224290
 */
public class ConverterToParquet {

    /**
     * Iterates over the input args and uses them to produce parquet files.
     *
     * Input: a list of  .avro files
     * Output: a parquet file in parquet/
     *
     * @param args The input files (.avro's)
     */
    public static void main(String[] args) throws Exception {

        // Iterate over all
        for(String fileName : args) {

            String parquetFileName = "parquet/" + new File(fileName).getName() + ".data.parquet";

            // Delete the results if they already exist:
            FileUtils.deleteQuietly(new File(parquetFileName));
            FileUtils.deleteQuietly(new File("." + parquetFileName + ".crc"));

            final Path path = new Path(parquetFileName);
            AvroParquetWriter<Pantheon> writer =
                    new AvroParquetWriter<>(path, Pantheon.SCHEMA$,
                            CompressionCodecName.SNAPPY,
                            ParquetWriter.DEFAULT_BLOCK_SIZE,
                            ParquetWriter.DEFAULT_PAGE_SIZE,
                            true);

            DatumReader<Pantheon> userDatumReader = new SpecificDatumReader<>(Pantheon.class);
            DataFileReader<Pantheon> dataFileReader = new DataFileReader<>(new File(fileName), userDatumReader);
            Pantheon pant = null;
            while (dataFileReader.hasNext()) {
                // Reuse user object by passing it to next(). This saves us from
                // allocating and garbage collecting many objects for files with
                // many items.
                pant = dataFileReader.next(pant);

                writer.write(pant);
            }

            writer.close();

            System.out.println("Converted  avro '" + fileName + "' into parquet: '" + parquetFileName + "'");
        }
    }
}
