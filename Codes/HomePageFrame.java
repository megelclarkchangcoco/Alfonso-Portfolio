package AlfonsoPortfolioInheritance;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import AlfonsoPortfolio.About_me;
import AlfonsoPortfolio.Educational_Background;
import AlfonsoPortfolio.Login;
import AlfonsoPortfolio.Profile;

//AboutMeFrame class inheriting from the base class Frame
class HomePageFrame extends Frame {
	
	private JPanel contentPane;
	
    public HomePageFrame(int width, int height) {
        super(width, height); // Invoke the base class constructor
        setTitle("Home Page ");
        // Add home page frame components and functionality
        
        contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Strip_pnl = new JPanel();
		Strip_pnl.setBounds(0, 0, 1063, 35);
		Strip_pnl.setBackground(new Color(255, 255, 255));
		contentPane.add(Strip_pnl);
		Strip_pnl.setLayout(null);
		Strip_pnl.setBorder(new LineBorder(new Color(0, 51, 102), 2));
		
		JLabel Logout = new JLabel("Logout");
		Logout.setBounds(986, 3, 77, 30);
		Strip_pnl.add(Logout);
		Logout.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		Logout.setHorizontalAlignment(SwingConstants.LEFT);
		Logout.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Logout.png"));
		Logout.setBackground(new Color(225, 204, 204));
		
		JPanel Homepage_pnl = new JPanel();
		Homepage_pnl.setBackground(new Color(128, 128, 128));
		Homepage_pnl.setBounds(0, 33, 1084, 563);
		contentPane.add(Homepage_pnl);
		Homepage_pnl.setLayout(null);
		
		JLabel AboutMe = new JLabel("");
		AboutMe.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AboutMeFrame Frame = new AboutMeFrame(1100, 635);
				Frame.setVisible(true);
				dispose();
			}
		});
		AboutMe.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\About_Me.png"));
		AboutMe.setBounds(252, 233, 100, 100);
		Homepage_pnl.add(AboutMe);
		
		JLabel Profile = new JLabel("");
		Profile.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ProfileFrame Frame = new ProfileFrame(1100, 635);
				Frame.setVisible(true);
				dispose();
			}
		});
		
		Profile.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\ProfilePerson.png"));
		Profile.setBounds(252, 111, 100, 100);
		Homepage_pnl.add(Profile);
		
		JLabel Profile_lbl = new JLabel("Profile");
		Profile_lbl.setForeground(new Color(255, 255, 255));
		Profile_lbl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ProfileFrame Frame = new ProfileFrame(1100, 635);
				Frame.setVisible(true);
				dispose();
			}
		});
		Profile_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		Profile_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Profile_lbl.setBounds(385, 131, 94, 71);
		Homepage_pnl.add(Profile_lbl);
		
		JLabel About_Me_lbl = new JLabel("About Me");
		About_Me_lbl.setForeground(new Color(255, 255, 255));
		About_Me_lbl.setBackground(new Color(255, 255, 255));
		About_Me_lbl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AboutMeFrame Frame = new AboutMeFrame(1100, 635);
				Frame.setVisible(true);
				dispose();
			}
		});
		About_Me_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		About_Me_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		About_Me_lbl.setBounds(385, 253, 121, 71);
		Homepage_pnl.add(About_Me_lbl);
		
		JLabel Educ_Back = new JLabel("");
		Educ_Back.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Background.png"));
		Educ_Back.setBounds(252, 364, 100, 100);
		Homepage_pnl.add(Educ_Back);
		
		JLabel Educ_Back_lbl = new JLabel("Educational Background");
		Educ_Back_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Educ_Back_lbl.setForeground(Color.WHITE);
		Educ_Back_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
		Educ_Back_lbl.setBackground(Color.WHITE);
		Educ_Back_lbl.setBounds(385, 384, 323, 71);
		Educ_Back_lbl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Educational_Background Frame = new Educational_Background();
				Frame.setVisible(true);
				dispose();
			}
		});
		Homepage_pnl.add(Educ_Back_lbl);
		
		
		
	}
}