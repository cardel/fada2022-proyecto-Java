package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LoadFileTest {

    private LoadFile loader = LoadFile.getInstance();
    private String file0 = "inputs/matrix0.in";

    private String file1 = "inputs/matrix1.in";
    private String file2 =  "inputs/matrix2.in";
    private String file3 = "inputs/matrix3.in";
    private String file4 =  "inputs/matrix4.in";
    private String file5 =  "inputs/matrix5.in";

    private File objFile0;

    private File objFile1;
    private File objFile2;
    private File objFile3;
    private File objFile4;
    private File objFile5;


    private int[][] readMatrix(File in) throws FileNotFoundException {
        Scanner reader = new Scanner(in);
        int rows = reader.nextInt();
        int cols = reader.nextInt();
        int matrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = reader.nextInt();
            }
        }
        return matrix;
    }

    @BeforeEach
    void loadExamples() throws Exception
    {
        objFile0 = new File(file0);
        objFile1 = new File(file1);
        objFile2 = new File(file2);
        objFile3 = new File(file3);
        objFile4 = new File(file4);
        objFile5 = new File(file5);
    }

    @Test
    void loadFile() throws Exception
    {
        int matrix[][];
        //Test file 0
        matrix = readMatrix(objFile0);
        loader.loadFile(file0);
        assertTrue(Arrays.deepEquals(loader.getMatrix(), matrix));

        //Test file 1
        matrix = readMatrix(objFile1);
        loader.loadFile(file1);
        assertTrue(Arrays.deepEquals(loader.getMatrix(), matrix));

        //Test file 2
        matrix = readMatrix(objFile2);
        loader.loadFile(file2);
        assertTrue(Arrays.deepEquals(loader.getMatrix(), matrix));

        //Test file 3
        matrix = readMatrix(objFile3);
        loader.loadFile(file3);
        assertTrue(Arrays.deepEquals(loader.getMatrix(), matrix));

        //Test file 4
        matrix = readMatrix(objFile4);
        loader.loadFile(file4);
        assertTrue(Arrays.deepEquals(loader.getMatrix(), matrix));

        //Test file 5
        matrix = readMatrix(objFile5);
        loader.loadFile(file5);
        assertTrue(Arrays.deepEquals(loader.getMatrix(), matrix));
    }
}