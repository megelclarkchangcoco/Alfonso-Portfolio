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

import AlfonsoPortfolio.HomePage;
import AlfonsoPortfolio.Profile;

//AboutMeFrame class inheriting from the base class Frame
class AboutMeFrame extends Frame {
	private JPanel contentPane;
	private JPanel Panel_2;
	
    public AboutMeFrame(int width, int height) {
        super(width, height);// Invoke the base class constructor
        setTitle("About Me ");
        // Add about me frame components and functionality
        contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Panel_1 = new JPanel();
		Panel_1.setBorder(new LineBorder(new Color(0, 51, 102), 2));
		Panel_1.setBounds(0, 33, 344, 566);
		contentPane.add(Panel_1);
		Panel_1.setLayout(null);
		
		JLabel About_Me = new JLabel("");
		About_Me.setBounds(0, 29, 346, 57);
		Panel_1.add(About_Me);
		About_Me.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\AboutMe.png"));
		
		JPanel BasicSkills_pnl = new JPanel();
		BasicSkills_pnl.setLayout(null);
		BasicSkills_pnl.setBounds(83, 215, 167, 217);
		Panel_1.add(BasicSkills_pnl);
		
		JLabel BasicSkill = new JLabel("Basic Skills");
		BasicSkill.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		BasicSkill.setHorizontalAlignment(SwingConstants.CENTER);
		BasicSkill.setBounds(40, 0, 87, 23);
		BasicSkills_pnl.add(BasicSkill);
		
		JLabel lblJava = new JLabel("• Java");
		lblJava.setHorizontalAlignment(SwingConstants.CENTER);
		lblJava.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblJava.setBounds(35, 65, 87, 23);
		BasicSkills_pnl.add(lblJava);
		
		JLabel PowerPoint = new JLabel("• PowePoint");
		PowerPoint.setHorizontalAlignment(SwingConstants.CENTER);
		PowerPoint.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		PowerPoint.setBounds(40, 115, 94, 23);
		BasicSkills_pnl.add(PowerPoint);
		
		JLabel VideoEditing = new JLabel("•Video Editing");
		VideoEditing.setHorizontalAlignment(SwingConstants.CENTER);
		VideoEditing.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		VideoEditing.setBounds(25, 164, 122, 23);
		BasicSkills_pnl.add(VideoEditing);
		
		JLabel BgColor2 = new JLabel("");
		BgColor2.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\B-G3.png"));
		BgColor2.setBounds(-11, 0, 189, 217);
		BasicSkills_pnl.add(BgColor2);
		
		JLabel BGPic_lbl1 = new JLabel("");
		BGPic_lbl1.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Portfolio bg.png"));
		BGPic_lbl1.setBounds(0, 2, 344, 560);
		Panel_1.add(BGPic_lbl1);
		
		
		
		Panel_2 = new JPanel();
		Panel_2.setBorder(new LineBorder(new Color(0, 51, 102), 2));
		Panel_2.setBounds(342, 33, 742, 566);
		contentPane.add(Panel_2);
		Panel_2.setLayout(null);
		
		JLabel Talent_lbl = new JLabel("TALENT");
		Talent_lbl.setBounds(235, 305, 253, 37);
		Panel_2.add(Talent_lbl);
		Talent_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Talent_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 45));
		
		JPanel WatchingMovie_pnl = new JPanel();
		WatchingMovie_pnl.setLayout(null);
		WatchingMovie_pnl.setBounds(35, 66, 170, 171);
		Panel_2.add(WatchingMovie_pnl);
		
		JLabel WatchingMovie = new JLabel("");
		WatchingMovie.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\WatchingMovie.png"));
		WatchingMovie.setBounds(10, 15, 155, 145);
		WatchingMovie_pnl.add(WatchingMovie);
		
		JLabel BGC_1 = new JLabel("");
		BGC_1.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\B-G1.png"));
		BGC_1.setBounds(5, 5, 160, 161);
		WatchingMovie_pnl.add(BGC_1);
		
		JPanel Gaming_pnl = new JPanel();
		Gaming_pnl.setBounds(285, 66, 170, 171);
		Panel_2.add(Gaming_pnl);
		Gaming_pnl.setLayout(null);
		
		JLabel Gaming = new JLabel("");
		Gaming.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Gaming.png"));
		Gaming.setBounds(15, 15, 138, 138);
		Gaming_pnl.add(Gaming);
		
		JLabel BGC_2 = new JLabel("");
		BGC_2.setBounds(5, 5, 160, 161);
		Gaming_pnl.add(BGC_2);
		BGC_2.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\B-G1.png"));
		
		
		JPanel Cycling_pnl = new JPanel();
		Cycling_pnl.setLayout(null);
		Cycling_pnl.setBounds(530, 59, 180, 178);
		Panel_2.add(Cycling_pnl);
		
		JLabel Cycling = new JLabel("");
		Cycling.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Cycling.png"));
		Cycling.setBounds(15, 19, 155, 138);
		Cycling_pnl.add(Cycling);
		
		JLabel BGC_3 = new JLabel("");
		BGC_3.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\B-G2.png"));
		BGC_3.setBounds(5, 0, 175, 178);
		Cycling_pnl.add(BGC_3);
		
		JLabel Gaming_lbl = new JLabel("Gaming");
		Gaming_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		Gaming_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Gaming_lbl.setBounds(285, 241, 170, 25);
		Panel_2.add(Gaming_lbl);
		
		JLabel Cycling_lbl = new JLabel("Cycling");
		Cycling_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Cycling_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		Cycling_lbl.setBounds(530, 235, 180, 25);
		Panel_2.add(Cycling_lbl);
		
		JLabel Driving_lbl = new JLabel("Driving");
		Driving_lbl.setBounds(140, 531, 180, 25);
		Panel_2.add(Driving_lbl);
		Driving_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Driving_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel Driving_pnl = new JPanel();
		Driving_pnl.setLayout(null);
		Driving_pnl.setBounds(140, 353, 180, 178);
		Panel_2.add(Driving_pnl);
		
		JLabel Driving = new JLabel("");
		Driving.setBounds(15, 27, 150, 130);
		Driving_pnl.add(Driving);
		Driving.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Driving.png"));
		
		JLabel BGC_4 = new JLabel("");
		BGC_4.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\B-G2.png"));
		BGC_4.setBounds(5, 0, 175, 178);
		Driving_pnl.add(BGC_4);
		
		JPanel PlayingDrums_pnl = new JPanel();
		PlayingDrums_pnl.setLayout(null);
		PlayingDrums_pnl.setBounds(397, 353, 180, 178);
		Panel_2.add(PlayingDrums_pnl);
		
		JLabel PlayingDrums = new JLabel("");
		PlayingDrums.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Playing Drums.png"));
		PlayingDrums.setBounds(15, 19, 155, 138);
		PlayingDrums_pnl.add(PlayingDrums);
		
		JLabel BGC_5 = new JLabel("");
		BGC_5.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\B-G2.png"));
		BGC_5.setBounds(5, 0, 175, 178);
		PlayingDrums_pnl.add(BGC_5);
		
		JLabel PlayingDrums_lbl = new JLabel("Playing Drums");
		PlayingDrums_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		PlayingDrums_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		PlayingDrums_lbl.setBounds(397, 531, 180, 25);
		Panel_2.add(PlayingDrums_lbl);
		
		JLabel WatchingMovie_lbl = new JLabel("Watching Movie");
		WatchingMovie_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		WatchingMovie_lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		WatchingMovie_lbl.setBounds(35, 241, 170, 25);
		Panel_2.add(WatchingMovie_lbl);
		
		JLabel Hobbies_lbl = new JLabel("HOBBIES");
		Hobbies_lbl.setBounds(260, 18, 213, 37);
		Panel_2.add(Hobbies_lbl);
		Hobbies_lbl.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 45));
		Hobbies_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel BGPic_lbl2 = new JLabel("");
		BGPic_lbl2.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Portfolio BG2.png"));
		BGPic_lbl2.setBounds(0, 2, 742, 560);
		Panel_2.add(BGPic_lbl2);
		
		JPanel Strip_pnl = new JPanel();
		Strip_pnl.setBorder(new LineBorder(new Color(0, 51, 102), 2));
		Strip_pnl.setBackground(new Color(255, 204, 204));
		Strip_pnl.setBounds(0, 0, 1084, 35);
		contentPane.add(Strip_pnl);
		Strip_pnl.setLayout(null);
		
		JLabel Profile_lbl = new JLabel("Profile"); // To return to HomePage without closing the frame
		Profile_lbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		Profile_lbl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Profile Frame = new Profile();
				Frame.setVisible(true);
				dispose();
			}
		});
		Profile_lbl.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Profile_lbl.png"));
		Profile_lbl.setBounds(3, 2, 84, 30);
		Strip_pnl.add(Profile_lbl);
		
		JLabel Back_lbl = new JLabel("Back");
		Back_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		Back_lbl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				HomePage Frame = new HomePage();
				Frame.setVisible(true);
				dispose();
			}
		});
		
		Back_lbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		Back_lbl.setIcon(new ImageIcon("C:\\Users\\rafae\\Desktop\\School\\JPG\\icons\\Return.png"));
		Back_lbl.setBounds(1000, 3, 84, 30);
		Strip_pnl.add(Back_lbl);
	}
    
}