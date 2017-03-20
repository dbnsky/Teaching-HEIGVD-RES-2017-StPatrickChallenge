package ch.heigvd.res.stpatrick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * Created by dbnsky on 20.03.2017.
 */
public class EremoverStreamProcessor implements IStreamProcessor{
    public void process(Reader in, Writer out) throws IOException {
            BufferedReader br = new BufferedReader(in);
            BufferedWriter bw = new BufferedWriter(out);
            int c = br.read();
            while (c != -1) {
                if( c != 'e' && c != 'E') {
                    out.write(c);

                }
                c = br.read();
            }
            bw.flush();
        }

    }


