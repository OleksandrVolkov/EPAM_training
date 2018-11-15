package projects.project_2.service;

import java.io.*;

public class FileHandler {

    public String getText(String path) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        String line;

        try(BufferedReader br = new BufferedReader(new FileReader(path));) {
            line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}

