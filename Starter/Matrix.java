package Starter;

/**
 * Write a description of class Matrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matrix
{
    // class variables
    private int[][] matrix;
    
    
    // constructor
    public Matrix()
    {
        
    }
    
    
    
    // class methods
    
    
    
    @Override
    public String toString()
    {
        String str = "[";
        
        for(int r = 0; r < matrix.length; r++)
        {
            for(int c = 0; c < matrix[r].length; c++)
            {
                str += matrix[r][c];
                
                if(c != matrix[r].length - 1)
                {
                    str += ", ";
                }
            }
            
            if(r != matrix.length - 1)
            {
                str += "\n";
            }
        }
        
        str += "]";
        
        return str;
    }
}
