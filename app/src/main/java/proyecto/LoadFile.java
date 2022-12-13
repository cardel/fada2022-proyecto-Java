package proyecto;

import lombok.Getter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
* Class for loading matrix representation files.
 */
public class LoadFile {

    private static LoadFile instance;
    @Getter
    private int[][] matrix;

    public static LoadFile getInstance() {
        return (instance == null) ? new LoadFile() : instance;
    }

    public void loadFile(String path) throws FileNotFoundException {
        File in = new File(path);
        Scanner reader = new Scanner(in);
        int rows = reader.nextInt();
        int cols = reader.nextInt();
        this.matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = reader.nextInt();
            }
        }
    }
}
