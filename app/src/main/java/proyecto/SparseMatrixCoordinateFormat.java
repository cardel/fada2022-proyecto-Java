package proyecto;

import javax.naming.OperationNotSupportedException;
import lombok.Getter;
import lombok.Setter;

import java.io.FileNotFoundException;

public class SparseMatrixCoordinateFormat {

    private LoadFile loader = LoadFile.getInstance();
    @Setter
    private int[][] matrix;
    @Getter
    @Setter
    private int[] rows;
    @Getter
    @Setter
    private int[] columns;
    @Getter
    @Setter
    private int[] values;

    public void createRepresentation(String inputFile) throws OperationNotSupportedException, FileNotFoundException {
        //Load data
        loader.loadFile(inputFile);
        matrix = loader.getMatrix();
        throw new OperationNotSupportedException();
    }

    public int getElement(int i, int j) throws OperationNotSupportedException
    {
        //No usar this.matrix aqui.
        throw new OperationNotSupportedException();
    }

    public int[] getRow(int i) throws OperationNotSupportedException
    {
        //No usar this.matrix aqui.
        throw new OperationNotSupportedException();
    }

    public int[] getColumn(int j) throws OperationNotSupportedException
    {
        //No usar this.matrix aqui.
        throw new OperationNotSupportedException();
    }

    public void setValue(int i, int j, int value) throws OperationNotSupportedException
    {
        //Cambiar los atributos rows, cols, values y matrix aqui
        throw new OperationNotSupportedException();
    }

    /*
    * This method returns a representation of the Squared matrix
    * @return object that contests the squared matrix;
     */
    public SparseMatrixCoordinateFormat getSquareMatrix() throws OperationNotSupportedException
    {
        SparseMatrixCoordinateFormat squaredMatrix = new SparseMatrixCoordinateFormat();
        //Usar los metodos Set aqui de los atributos
        throw new OperationNotSupportedException();
    }

    /*
     * This method returns a representation of the transposed matrix
     * @return object that contests the transposed matrix;
     */
    public SparseMatrixCoordinateFormat getTransposedMatrix() throws OperationNotSupportedException
    {
        SparseMatrixCoordinateFormat squaredMatrix = new SparseMatrixCoordinateFormat();
        //Usar los metodos Set aqui de los atributos
        throw new OperationNotSupportedException();
    }

}
