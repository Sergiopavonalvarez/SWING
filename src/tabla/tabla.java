package tabla;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class tabla extends JFrame {
    private JFrame frame;
    private JTable table;
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnNewRadioButton_1;
    private JScrollPane scrollPane;
    private JButton btnNewButton;
    private JDateChooser dateChooser;
    private JDateChooser dateChooser_1;
    
    public tabla() {
        getContentPane().setBackground(new Color(255, 255, 255));
        setResizable(false);
        setBackground(new Color(240, 240, 240));
        setBounds(100, 100, 1002, 643);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        rdbtnNewRadioButton = new JRadioButton("Datos 1");
        rdbtnNewRadioButton.setBounds(196, 114, 109, 23);
        getContentPane().add(rdbtnNewRadioButton);
        
        rdbtnNewRadioButton_1 = new JRadioButton("Datos 2");
        rdbtnNewRadioButton_1.setBounds(454, 114, 109, 23);
        getContentPane().add(rdbtnNewRadioButton_1);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(196, 200, 382, 217);
        getContentPane().add(scrollPane);
        
        table = new JTable();
        table.setAutoscrolls(false);
        table.setModel(new DefaultTableModel(
                new Object[][] {
         
                },
                new String[] {
                }
        ));
        scrollPane.setViewportView(table);
        
        btnNewButton = new JButton("consultar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                model.setColumnCount(0);
                
                // Agregar columnas
                model.addColumn("Fecha");
                if (rdbtnNewRadioButton.isSelected()) {
                    model.addColumn("dsgdfsgdfdssdgdgfdgsdgdf");
                }
                if (rdbtnNewRadioButton_1.isSelected()) {
                    model.addColumn("sffgsdgsfdsgfdsgddgfdgfdsfgfd");
                }
                
                // Obtener las fechas de inicio y fin
                Date fechaInicio = dateChooser.getDate();
                Date fechaFin = dateChooser_1.getDate();
                
                // Agregar filas a la tabla desde la fecha de inicio hasta la fecha final
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Calendar c = Calendar.getInstance();
                c.setTime(fechaInicio);
                while (!c.getTime().after(fechaFin)) {
                    Object[] rowData = {sdf.format(c.getTime())};
                    model.addRow(rowData);
                    c.add(Calendar.DATE, 1);
                }
                
                // Limpiar los campos y los botones de selección
                rdbtnNewRadioButton.setSelected(false);
                rdbtnNewRadioButton_1.setSelected(false);
                dateChooser.setDate(null);
                dateChooser_1.setDate(null);
            }
        });
        btnNewButton.setBounds(667, 240, 197, 124);
        getContentPane().add(btnNewButton);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(196, 47, 153, 20);
        getContentPane().add(dateChooser);
        
        dateChooser_1 = new JDateChooser();
        dateChooser_1.setBounds(196, 78, 153, 20);
        getContentPane().add(dateChooser_1);
        
        JButton btnNewButton_1 = new JButton("total");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		        rdbtnNewRadioButton.setSelected(true);
        		        rdbtnNewRadioButton_1.setSelected(true);
        		    
        	}
        });
        btnNewButton_1.setBounds(196, 155, 89, 23);
        getContentPane().add(btnNewButton_1);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        tabla t = new tabla();
    }
}
