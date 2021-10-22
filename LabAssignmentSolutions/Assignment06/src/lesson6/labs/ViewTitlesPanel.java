package lesson6.labs;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ViewTitlesPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final ViewTitlesPanel INSTANCE = new ViewTitlesPanel();
	
	private DefaultListModel<String> listModel = new DefaultListModel<String>();
	private JList<String> mainList = new JList<String>();
	private JScrollPane mainScroll;

	private ViewTitlesPanel() {};
	public ViewTitlesPanel init() {
		INSTANCE.setPreferredSize(new Dimension(300,300));
		initializeModel(Data.bookTitles);
		mainList = createJList();
		mainList.setFixedCellWidth(70);
		mainScroll = new JScrollPane(mainList);
		mainScroll.setPreferredSize(new Dimension(250,250));
		INSTANCE.setLayout(new FlowLayout(FlowLayout.CENTER));
		INSTANCE.add(mainScroll);
		return INSTANCE;
	}
	
	private void initializeModel(List<String> vals) {
		for(String s : vals){
			listModel.addElement(s);
		}
	}
	
	private JList<String> createJList() {
		JList<String> ret = new JList<String>(listModel);
		ret.setVisibleRowCount(10);
		return ret;
	}
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				JFrame mf = new JFrame();
				mf.add(new ViewTitlesPanel());
				mf.pack();
				mf.setVisible(true);
			}
		});
	}
}
