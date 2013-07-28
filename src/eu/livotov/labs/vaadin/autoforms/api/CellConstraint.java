package eu.livotov.labs.vaadin.autoforms.api;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 * (c) Livotov Labs Ltd. 2012
 * Date: 27/07/2013
 */
public class CellConstraint implements Serializable
{
    private int startCell;
    private int endCell;
    private int startRow;
    private int endRow;

    public CellConstraint(final int startRow, final int startCell,  final int endRow, final int endCell)
    {
        this.startCell = startCell;
        this.endCell = endCell;
        this.startRow = startRow;
        this.endRow = endRow;
    }

    public CellConstraint(final int row, final int cell)
    {
        this.startCell = cell;
        this.endCell = cell;
        this.startRow = row;
        this.endRow = row;
    }

    public CellConstraint(final String constraintString)
    {
        StringTokenizer tok = new StringTokenizer(constraintString,",",false);
        if (tok.countTokens()==2)
        {
            try
            {
                startCell = Integer.parseInt(tok.nextToken());
                startRow = Integer.parseInt(tok.nextToken());
                endRow = startRow;
                endCell = startCell;
            } catch (Throwable err)
            {
                throw new IllegalArgumentException(String.format("Invalid constraint string format: \"%s\" - %s.", constraintString, err.getMessage()), err);
            }
        } else if (tok.countTokens()==4)
        {
            try
            {
                startCell = Integer.parseInt(tok.nextToken());
                startRow = Integer.parseInt(tok.nextToken());
                endCell = Integer.parseInt(tok.nextToken());
                endRow = Integer.parseInt(tok.nextToken());
            } catch (Throwable err)
            {
                throw new IllegalArgumentException(String.format("Invalid constraint string format: \"%s\" - %s.", constraintString, err.getMessage()), err);
            }
        } else
        {
            throw new IllegalArgumentException(String.format("Invalid constraint string: \"%s\" - number of tokens must be either 2 or 4.", constraintString));
        }

        if (endRow<startRow)
        {
            throw new IllegalArgumentException(String.format("Invalid constraint string format: \"%s\" - end row must be >= start row.", constraintString));
        }

        if (endCell<startCell)
        {
            throw new IllegalArgumentException(String.format("Invalid constraint string format: \"%s\" - end cell must be >= start cell.", constraintString));
        }

        if (startRow<0 || endRow<0 || startCell<0 || endCell<0)
        {
            throw new IllegalArgumentException(String.format("Invalid constraint string format: \"%s\" - row or cell cannot be negative.", constraintString));
        }
    }

    public int getStartCell()
    {
        return startCell;
    }

    public void setStartCell(final int startCell)
    {
        this.startCell = startCell;
    }

    public int getEndCell()
    {
        return endCell;
    }

    public void setEndCell(final int endCell)
    {
        this.endCell = endCell;
    }

    public int getStartRow()
    {
        return startRow;
    }

    public void setStartRow(final int startRow)
    {
        this.startRow = startRow;
    }

    public int getEndRow()
    {
        return endRow;
    }

    public void setEndRow(final int endRow)
    {
        this.endRow = endRow;
    }

    public String toString()
    {
        return "CellConstraint{" +
                       "startRow=" + startRow +
                       ", startCell=" + startCell +
                       ", endRow=" + endRow +
                       ", endCell=" + endCell +
                       '}';
    }

}
