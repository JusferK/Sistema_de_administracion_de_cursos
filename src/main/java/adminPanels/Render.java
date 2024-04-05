package adminPanels;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer {
    
    public Component getTableCellRenderComponent(JTable table, Object myObject, boolean selected, boolean hasFocus, int row, int column) {
        
        if (myObject instanceof JCheckBox) {
            JCheckBox myCheckBox = (JCheckBox) myObject;
            return myCheckBox;
        }
        
        
        return super.getTableCellRendererComponent(table, myObject, selected, hasFocus, row, column);
    }
}
