package View;

import javax.swing.JPanel;
import javax.swing.table.AbstractTableModel;

public class modeloTabla extends AbstractTableModel{
    private String[] columnNames; 
    private Object[][] data; 

    public modeloTabla(Object[][] data, String[] columnNames){
        this.columnNames = columnNames;
        this.data = data;
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    
    public boolean isCellEditable(int row, int col) {
         if (col < 2) {
            return false;
        } else {
            return true;
        }
    }

   
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
    
}
