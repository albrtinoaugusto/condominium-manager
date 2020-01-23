
package Applicaton;

import AppPackage.AnimationClass;
import java.io.File;
import java.awt.Frame;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import javax.swing.JFileChooser;
import java.awt.image.BufferedImage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Albertino Augusto
 */
public class MainGUI extends javax.swing.JFrame 
{
    // Este código cria um objecto da Classe AnimationClass que é responsavel pelas animações na janela princpal **/
    public static AnimationClass AC = new AnimationClass();
    
    int xMouse;
    int yMouse;
    
    int countMenu;
    int countText;
    int countAbout;
    int countSearch;
    int countSocial;
    int countSwicth;
    int countVisible;
    int countMagement;
    int countSettings;
    
    String sex = "";
    String status = "";
    
    public static int countAll;
    public static int countInfo;
    public static int countFrame;
    
    // Este código cria um objecto da Classe DBClass que é responsável por fazer operações que envolvam a Base de Dados **/
    DBClass DB = new DBClass();     

    public MainGUI() 
    {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/taskbar_icon.png")).getImage()); // Este código faz com apareça uma imagem no gestor de tarefas.   

        DB.connectDB(); // Este código faz uma chamada ao método que conecta o Sistema a Base de Dados **/
        
        cctv.setVisible(false);
        about.setVisible(false);
        houses.setVisible(false);
        configs.setVisible(false);
        
        twitter.setVisible(false);
        facebook.setVisible(false);
        
        howto.setVisible(false);
        software.setVisible(false);
        developer.setVisible(false);
        
        about_drop.setVisible(false);        
        homeButton.setVisible(false);        
        searchField.setVisible(false);
        
        scroller.setOpaque(false);
        scroller.getViewport().setOpaque(false);
        scroller.setBorder(null);
        //list.setBackground(new Color(0, 0, 0, 0));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        menuButton = new javax.swing.JButton();
        menuLabel = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        frameDragg = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();
        information = new javax.swing.JLabel();
        houses = new javax.swing.JButton();
        cctv = new javax.swing.JButton();
        configs = new javax.swing.JButton();
        about = new javax.swing.JButton();
        developer = new javax.swing.JButton();
        howto = new javax.swing.JButton();
        software = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        mainMenu = new javax.swing.JLabel();
        about_drop = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();
        firstPanel = new javax.swing.JPanel();
        panelTwo = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        listButton = new javax.swing.JButton();
        managerPanel = new javax.swing.JPanel();
        pnAdd = new javax.swing.JPanel();
        choosePhoto = new javax.swing.JButton();
        imageViewer = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        numField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        typeHouseField = new javax.swing.JTextField();
        membersLabel = new javax.swing.JLabel();
        membersField = new javax.swing.JTextField();
        carsLabel = new javax.swing.JLabel();
        carsField = new javax.swing.JTextField();
        romsLabel = new javax.swing.JLabel();
        romsField = new javax.swing.JTextField();
        upMember1 = new javax.swing.JButton();
        downMember1 = new javax.swing.JButton();
        upCars1 = new javax.swing.JButton();
        downCars1 = new javax.swing.JButton();
        upRoms1 = new javax.swing.JButton();
        downRoms1 = new javax.swing.JButton();
        upHouse1 = new javax.swing.JButton();
        downHouse1 = new javax.swing.JButton();
        saveData = new javax.swing.JButton();
        m = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        sim = new javax.swing.JCheckBox();
        nao = new javax.swing.JCheckBox();
        backgroundAdd = new javax.swing.JLabel();
        pnRemove = new javax.swing.JPanel();
        getPhoto = new javax.swing.JButton();
        showImage = new javax.swing.JLabel();
        findData = new javax.swing.JButton();
        showCode = new javax.swing.JTextField();
        showNums = new javax.swing.JTextField();
        showName = new javax.swing.JTextField();
        showM = new javax.swing.JRadioButton();
        showF = new javax.swing.JRadioButton();
        showSim = new javax.swing.JCheckBox();
        showNao = new javax.swing.JCheckBox();
        textMembers = new javax.swing.JLabel();
        showMembers = new javax.swing.JTextField();
        upMember = new javax.swing.JButton();
        downMember = new javax.swing.JButton();
        showCars = new javax.swing.JTextField();
        textCars = new javax.swing.JLabel();
        upCars = new javax.swing.JButton();
        downCars = new javax.swing.JButton();
        showHouseType = new javax.swing.JTextField();
        upHouse = new javax.swing.JButton();
        downHouse = new javax.swing.JButton();
        showRoms = new javax.swing.JTextField();
        textRoms = new javax.swing.JLabel();
        upRom = new javax.swing.JButton();
        downRom = new javax.swing.JButton();
        updateData = new javax.swing.JButton();
        deleteData = new javax.swing.JButton();
        backgroundRemove = new javax.swing.JLabel();
        pnLists = new javax.swing.JPanel();
        scroller = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        backgroundManager = new javax.swing.JLabel();
        panelThree = new javax.swing.JPanel();
        allCameras = new javax.swing.JButton();
        entourage = new javax.swing.JButton();
        runDors = new javax.swing.JButton();
        garage = new javax.swing.JButton();
        freeSpace = new javax.swing.JButton();
        none1 = new javax.swing.JButton();
        none2 = new javax.swing.JButton();
        none3 = new javax.swing.JButton();
        none4 = new javax.swing.JButton();
        BackgroundCctv = new javax.swing.JLabel();
        panelFour = new javax.swing.JPanel();
        general = new javax.swing.JButton();
        camera = new javax.swing.JButton();
        conections = new javax.swing.JButton();
        settingsPanel = new javax.swing.JPanel();
        pnGeneral = new javax.swing.JPanel();
        backgroundGeneral = new javax.swing.JLabel();
        pnCameras = new javax.swing.JPanel();
        backgroundCameras = new javax.swing.JLabel();
        pnConnections = new javax.swing.JPanel();
        backgroundConnections = new javax.swing.JLabel();
        BackgroundConfigs = new javax.swing.JLabel();
        socialButton = new javax.swing.JButton();
        facebook = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        socialLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão de Concomínios");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMain.setLayout(null);

        menuButton.setBorder(null);
        menuButton.setBorderPainted(false);
        menuButton.setContentAreaFilled(false);
        menuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        pnMain.add(menuButton);
        menuButton.setBounds(24, 3, 120, 18);

        menuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu_button.png"))); // NOI18N
        pnMain.add(menuLabel);
        menuLabel.setBounds(0, 0, 150, 25);

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minimizeMouseReleased(evt);
            }
        });
        pnMain.add(minimize);
        minimize.setBounds(980, 4, 18, 16);

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeMouseReleased(evt);
            }
        });
        pnMain.add(close);
        close.setBounds(1001, 4, 18, 16);

        frameDragg.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        frameDragg.setForeground(new java.awt.Color(204, 204, 204));
        frameDragg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameDragg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameDraggMouseDragged(evt);
            }
        });
        frameDragg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameDraggMousePressed(evt);
            }
        });
        pnMain.add(frameDragg);
        frameDragg.setBounds(0, 0, 1024, 25);

        warning.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        warning.setForeground(new java.awt.Color(102, 102, 0));
        pnMain.add(warning);
        warning.setBounds(360, 0, 70, 25);

        information.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        information.setForeground(new java.awt.Color(204, 204, 204));
        pnMain.add(information);
        information.setBounds(429, 0, 540, 25);

        houses.setBorder(null);
        houses.setBorderPainted(false);
        houses.setContentAreaFilled(false);
        houses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        houses.setEnabled(false);
        houses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                housesActionPerformed(evt);
            }
        });
        pnMain.add(houses);
        houses.setBounds(24, 59, 104, 18);

        cctv.setBorder(null);
        cctv.setBorderPainted(false);
        cctv.setContentAreaFilled(false);
        cctv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cctv.setEnabled(false);
        cctv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cctvActionPerformed(evt);
            }
        });
        pnMain.add(cctv);
        cctv.setBounds(140, 59, 90, 18);

        configs.setBorder(null);
        configs.setBorderPainted(false);
        configs.setContentAreaFilled(false);
        configs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configs.setEnabled(false);
        configs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configsActionPerformed(evt);
            }
        });
        pnMain.add(configs);
        configs.setBounds(248, 59, 86, 18);

        about.setToolTipText("");
        about.setBorder(null);
        about.setBorderPainted(false);
        about.setContentAreaFilled(false);
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.setEnabled(false);
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        pnMain.add(about);
        about.setBounds(358, 59, 100, 18);

        developer.setToolTipText("");
        developer.setBorder(null);
        developer.setBorderPainted(false);
        developer.setContentAreaFilled(false);
        developer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        developer.setEnabled(false);
        developer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                developerActionPerformed(evt);
            }
        });
        pnMain.add(developer);
        developer.setBounds(358, 82, 100, 18);

        howto.setToolTipText("");
        howto.setBorder(null);
        howto.setBorderPainted(false);
        howto.setContentAreaFilled(false);
        howto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        howto.setEnabled(false);
        howto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howtoActionPerformed(evt);
            }
        });
        pnMain.add(howto);
        howto.setBounds(358, 101, 100, 18);

        software.setToolTipText("");
        software.setBorder(null);
        software.setBorderPainted(false);
        software.setContentAreaFilled(false);
        software.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        software.setEnabled(false);
        software.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softwareActionPerformed(evt);
            }
        });
        pnMain.add(software);
        software.setBounds(358, 121, 100, 18);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon.png"))); // NOI18N
        searchButton.setToolTipText("");
        searchButton.setBorder(null);
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        pnMain.add(searchButton);
        searchButton.setBounds(970, 55, 30, 24);

        mainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu_bar.png"))); // NOI18N
        pnMain.add(mainMenu);
        mainMenu.setBounds(0, -25, 476, 25);

        about_drop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/about_dropdown_menu.png"))); // NOI18N
        about_drop.setEnabled(false);
        pnMain.add(about_drop);
        about_drop.setBounds(358, 20, 110, 60);

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_icon.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.setEnabled(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        pnMain.add(homeButton);
        homeButton.setBounds(480, 55, 26, 26);

        searchField.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        searchField.setForeground(new java.awt.Color(204, 204, 204));
        searchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchField.setText("Procurar");
        searchField.setBorder(null);
        searchField.setEnabled(false);
        searchField.setOpaque(false);
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });
        pnMain.add(searchField);
        searchField.setBounds(806, 57, 168, 20);

        searchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_bar.png"))); // NOI18N
        pnMain.add(searchLabel);
        searchLabel.setBounds(1024, 55, 200, 25);

        panelCenter.setBackground(new java.awt.Color(51, 51, 51));
        panelCenter.setOpaque(false);
        panelCenter.setLayout(new java.awt.CardLayout());

        firstPanel.setOpaque(false);
        firstPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelCenter.add(firstPanel, "card2");

        panelTwo.setOpaque(false);
        panelTwo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addButton.setToolTipText("");
        addButton.setBorder(null);
        addButton.setBorderPainted(false);
        addButton.setContentAreaFilled(false);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        panelTwo.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 32));

        removeButton.setToolTipText("");
        removeButton.setBorder(null);
        removeButton.setBorderPainted(false);
        removeButton.setContentAreaFilled(false);
        removeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        panelTwo.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 34, 150, 32));

        listButton.setToolTipText("");
        listButton.setBorder(null);
        listButton.setBorderPainted(false);
        listButton.setContentAreaFilled(false);
        listButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });
        panelTwo.add(listButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 150, 32));

        managerPanel.setOpaque(false);
        managerPanel.setLayout(new java.awt.CardLayout());

        pnAdd.setOpaque(false);
        pnAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        choosePhoto.setToolTipText("");
        choosePhoto.setBorder(null);
        choosePhoto.setBorderPainted(false);
        choosePhoto.setContentAreaFilled(false);
        choosePhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choosePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosePhotoActionPerformed(evt);
            }
        });
        pnAdd.add(choosePhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 342, 34, 23));

        imageViewer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnAdd.add(imageViewer, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 71, 442, 291));

        codeField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        codeField.setForeground(new java.awt.Color(204, 204, 204));
        codeField.setBorder(null);
        codeField.setOpaque(false);
        pnAdd.add(codeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 68, 126, 22));

        numField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        numField.setForeground(new java.awt.Color(204, 204, 204));
        numField.setBorder(null);
        numField.setOpaque(false);
        pnAdd.add(numField, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 131, 126, 22));

        nameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nameField.setForeground(new java.awt.Color(204, 204, 204));
        nameField.setBorder(null);
        nameField.setOpaque(false);
        pnAdd.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 192, 290, 22));

        typeHouseField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        typeHouseField.setForeground(new java.awt.Color(204, 204, 204));
        typeHouseField.setText("Casa Normal");
        typeHouseField.setBorder(null);
        typeHouseField.setOpaque(false);
        pnAdd.add(typeHouseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 329, 112, 22));

        membersLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        membersLabel.setForeground(new java.awt.Color(204, 204, 204));
        pnAdd.add(membersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 266, 94, 18));

        membersField.setEditable(false);
        membersField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        membersField.setForeground(new java.awt.Color(204, 204, 204));
        membersField.setText("0");
        membersField.setBorder(null);
        membersField.setOpaque(false);
        pnAdd.add(membersField, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 265, 14, 22));

        carsLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        carsLabel.setForeground(new java.awt.Color(204, 204, 204));
        pnAdd.add(carsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 266, 94, 18));

        carsField.setEditable(false);
        carsField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        carsField.setForeground(new java.awt.Color(204, 204, 204));
        carsField.setText("0");
        carsField.setBorder(null);
        carsField.setOpaque(false);
        pnAdd.add(carsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 265, 14, 22));

        romsLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        romsLabel.setForeground(new java.awt.Color(204, 204, 204));
        pnAdd.add(romsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 330, 94, 18));

        romsField.setEditable(false);
        romsField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        romsField.setForeground(new java.awt.Color(204, 204, 204));
        romsField.setText("0");
        romsField.setBorder(null);
        romsField.setOpaque(false);
        pnAdd.add(romsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 329, 14, 22));

        upMember1.setBorder(null);
        upMember1.setBorderPainted(false);
        upMember1.setContentAreaFilled(false);
        upMember1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upMember1.setFocusable(false);
        upMember1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upMember1ActionPerformed(evt);
            }
        });
        pnAdd.add(upMember1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 265, 12, 10));

        downMember1.setBorder(null);
        downMember1.setBorderPainted(false);
        downMember1.setContentAreaFilled(false);
        downMember1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downMember1.setFocusable(false);
        downMember1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMember1ActionPerformed(evt);
            }
        });
        pnAdd.add(downMember1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 276, 12, 10));

        upCars1.setBorder(null);
        upCars1.setBorderPainted(false);
        upCars1.setContentAreaFilled(false);
        upCars1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upCars1.setFocusable(false);
        upCars1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upCars1ActionPerformed(evt);
            }
        });
        pnAdd.add(upCars1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 265, 12, 10));

        downCars1.setBorder(null);
        downCars1.setBorderPainted(false);
        downCars1.setContentAreaFilled(false);
        downCars1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downCars1.setFocusable(false);
        downCars1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downCars1ActionPerformed(evt);
            }
        });
        pnAdd.add(downCars1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 276, 12, 10));

        upRoms1.setBorder(null);
        upRoms1.setBorderPainted(false);
        upRoms1.setContentAreaFilled(false);
        upRoms1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upRoms1.setFocusable(false);
        upRoms1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upRoms1ActionPerformed(evt);
            }
        });
        pnAdd.add(upRoms1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 329, 12, 10));

        downRoms1.setBorder(null);
        downRoms1.setBorderPainted(false);
        downRoms1.setContentAreaFilled(false);
        downRoms1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downRoms1.setFocusable(false);
        downRoms1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downRoms1ActionPerformed(evt);
            }
        });
        pnAdd.add(downRoms1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 341, 12, 10));

        upHouse1.setBorder(null);
        upHouse1.setBorderPainted(false);
        upHouse1.setContentAreaFilled(false);
        upHouse1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upHouse1.setFocusable(false);
        upHouse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upHouse1ActionPerformed(evt);
            }
        });
        pnAdd.add(upHouse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 329, 12, 10));

        downHouse1.setBorder(null);
        downHouse1.setBorderPainted(false);
        downHouse1.setContentAreaFilled(false);
        downHouse1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downHouse1.setFocusable(false);
        downHouse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downHouse1ActionPerformed(evt);
            }
        });
        pnAdd.add(downHouse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 341, 12, 10));

        saveData.setToolTipText("");
        saveData.setBorder(null);
        saveData.setBorderPainted(false);
        saveData.setContentAreaFilled(false);
        saveData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataActionPerformed(evt);
            }
        });
        pnAdd.add(saveData, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 398, 134, 31));

        m.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        m.setForeground(new java.awt.Color(204, 204, 204));
        m.setText("M");
        m.setBorder(null);
        m.setContentAreaFilled(false);
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        pnAdd.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 224, 26, 13));

        f.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        f.setForeground(new java.awt.Color(204, 204, 204));
        f.setText("F");
        f.setBorder(null);
        f.setContentAreaFilled(false);
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        pnAdd.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 224, 26, 13));

        sim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sim.setForeground(new java.awt.Color(204, 204, 204));
        sim.setText("Sim");
        sim.setBorder(null);
        sim.setContentAreaFilled(false);
        sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simActionPerformed(evt);
            }
        });
        pnAdd.add(sim, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 224, 44, 13));

        nao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nao.setForeground(new java.awt.Color(204, 204, 204));
        nao.setText("Não");
        nao.setBorder(null);
        nao.setContentAreaFilled(false);
        nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoActionPerformed(evt);
            }
        });
        pnAdd.add(nao, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 224, 44, 13));

        backgroundAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add_data_background.png"))); // NOI18N
        pnAdd.add(backgroundAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 460));

        managerPanel.add(pnAdd, "card2");

        pnRemove.setOpaque(false);
        pnRemove.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getPhoto.setToolTipText("");
        getPhoto.setBorder(null);
        getPhoto.setBorderPainted(false);
        getPhoto.setContentAreaFilled(false);
        getPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getPhoto.setEnabled(false);
        getPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPhotoActionPerformed(evt);
            }
        });
        pnRemove.add(getPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 342, 34, 23));

        showImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnRemove.add(showImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 71, 442, 291));

        findData.setToolTipText("");
        findData.setBorder(null);
        findData.setBorderPainted(false);
        findData.setContentAreaFilled(false);
        findData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        findData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findDataActionPerformed(evt);
            }
        });
        pnRemove.add(findData, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 70, 134, 31));

        showCode.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showCode.setForeground(new java.awt.Color(204, 204, 204));
        showCode.setBorder(null);
        showCode.setOpaque(false);
        pnRemove.add(showCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 130, 22));

        showNums.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showNums.setForeground(new java.awt.Color(204, 204, 204));
        showNums.setBorder(null);
        showNums.setOpaque(false);
        pnRemove.add(showNums, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 131, 130, 22));

        showName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showName.setForeground(new java.awt.Color(204, 204, 204));
        showName.setBorder(null);
        showName.setOpaque(false);
        pnRemove.add(showName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 192, 294, 22));

        showM.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showM.setForeground(new java.awt.Color(204, 204, 204));
        showM.setText("M");
        showM.setBorder(null);
        showM.setContentAreaFilled(false);
        showM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMActionPerformed(evt);
            }
        });
        pnRemove.add(showM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 224, 26, 13));

        showF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showF.setForeground(new java.awt.Color(204, 204, 204));
        showF.setText("F");
        showF.setBorder(null);
        showF.setContentAreaFilled(false);
        showF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFActionPerformed(evt);
            }
        });
        pnRemove.add(showF, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 224, 26, 13));

        showSim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showSim.setForeground(new java.awt.Color(204, 204, 204));
        showSim.setText("Sim");
        showSim.setBorder(null);
        showSim.setContentAreaFilled(false);
        showSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSimActionPerformed(evt);
            }
        });
        pnRemove.add(showSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 224, 44, 13));

        showNao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showNao.setForeground(new java.awt.Color(204, 204, 204));
        showNao.setText("Não");
        showNao.setBorder(null);
        showNao.setContentAreaFilled(false);
        showNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showNaoActionPerformed(evt);
            }
        });
        pnRemove.add(showNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 224, 44, 13));

        textMembers.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textMembers.setForeground(new java.awt.Color(204, 204, 204));
        pnRemove.add(textMembers, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 266, 94, 18));

        showMembers.setEditable(false);
        showMembers.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showMembers.setForeground(new java.awt.Color(204, 204, 204));
        showMembers.setBorder(null);
        showMembers.setOpaque(false);
        pnRemove.add(showMembers, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 265, 14, 22));

        upMember.setBorder(null);
        upMember.setBorderPainted(false);
        upMember.setContentAreaFilled(false);
        upMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upMember.setEnabled(false);
        upMember.setFocusable(false);
        upMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upMemberActionPerformed(evt);
            }
        });
        pnRemove.add(upMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 265, 12, 10));

        downMember.setBorder(null);
        downMember.setBorderPainted(false);
        downMember.setContentAreaFilled(false);
        downMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downMember.setEnabled(false);
        downMember.setFocusable(false);
        downMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMemberActionPerformed(evt);
            }
        });
        pnRemove.add(downMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 276, 12, 10));

        showCars.setEditable(false);
        showCars.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showCars.setForeground(new java.awt.Color(204, 204, 204));
        showCars.setBorder(null);
        showCars.setOpaque(false);
        pnRemove.add(showCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 265, 14, 22));

        textCars.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textCars.setForeground(new java.awt.Color(204, 204, 204));
        pnRemove.add(textCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 266, 94, 18));

        upCars.setBorder(null);
        upCars.setBorderPainted(false);
        upCars.setContentAreaFilled(false);
        upCars.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upCars.setEnabled(false);
        upCars.setFocusable(false);
        upCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upCarsActionPerformed(evt);
            }
        });
        pnRemove.add(upCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 265, 12, 10));

        downCars.setBorder(null);
        downCars.setBorderPainted(false);
        downCars.setContentAreaFilled(false);
        downCars.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downCars.setEnabled(false);
        downCars.setFocusable(false);
        downCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downCarsActionPerformed(evt);
            }
        });
        pnRemove.add(downCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 276, 12, 10));

        showHouseType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showHouseType.setForeground(new java.awt.Color(204, 204, 204));
        showHouseType.setBorder(null);
        showHouseType.setOpaque(false);
        pnRemove.add(showHouseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 329, 112, 22));

        upHouse.setBorder(null);
        upHouse.setBorderPainted(false);
        upHouse.setContentAreaFilled(false);
        upHouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upHouse.setEnabled(false);
        upHouse.setFocusable(false);
        upHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upHouseActionPerformed(evt);
            }
        });
        pnRemove.add(upHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 329, 12, 10));

        downHouse.setBorder(null);
        downHouse.setBorderPainted(false);
        downHouse.setContentAreaFilled(false);
        downHouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downHouse.setEnabled(false);
        downHouse.setFocusable(false);
        downHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downHouseActionPerformed(evt);
            }
        });
        pnRemove.add(downHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 341, 12, 10));

        showRoms.setEditable(false);
        showRoms.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showRoms.setForeground(new java.awt.Color(204, 204, 204));
        showRoms.setBorder(null);
        showRoms.setOpaque(false);
        pnRemove.add(showRoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 329, 14, 22));

        textRoms.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textRoms.setForeground(new java.awt.Color(204, 204, 204));
        pnRemove.add(textRoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 330, 94, 18));

        upRom.setBorder(null);
        upRom.setBorderPainted(false);
        upRom.setContentAreaFilled(false);
        upRom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upRom.setEnabled(false);
        upRom.setFocusable(false);
        upRom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upRomActionPerformed(evt);
            }
        });
        pnRemove.add(upRom, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 329, 12, 10));

        downRom.setBorder(null);
        downRom.setBorderPainted(false);
        downRom.setContentAreaFilled(false);
        downRom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        downRom.setEnabled(false);
        downRom.setFocusable(false);
        downRom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downRomActionPerformed(evt);
            }
        });
        pnRemove.add(downRom, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 341, 12, 10));

        updateData.setToolTipText("");
        updateData.setBorder(null);
        updateData.setBorderPainted(false);
        updateData.setContentAreaFilled(false);
        updateData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDataActionPerformed(evt);
            }
        });
        pnRemove.add(updateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 398, 134, 31));

        deleteData.setToolTipText("");
        deleteData.setBorder(null);
        deleteData.setBorderPainted(false);
        deleteData.setContentAreaFilled(false);
        deleteData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataActionPerformed(evt);
            }
        });
        pnRemove.add(deleteData, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 398, 134, 31));

        backgroundRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update_data_background.png"))); // NOI18N
        pnRemove.add(backgroundRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 460));

        managerPanel.add(pnRemove, "card3");

        pnLists.setOpaque(false);
        pnLists.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroller.setViewportView(list);

        pnLists.add(scroller, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, 430));

        managerPanel.add(pnLists, "card4");

        panelTwo.add(managerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 0, 870, 460));

        backgroundManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manage_houses_background.png"))); // NOI18N
        panelTwo.add(backgroundManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, -1));

        panelCenter.add(panelTwo, "card3");

        panelThree.setOpaque(false);
        panelThree.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allCameras.setToolTipText("");
        allCameras.setBorder(null);
        allCameras.setBorderPainted(false);
        allCameras.setContentAreaFilled(false);
        allCameras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        allCameras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allCamerasActionPerformed(evt);
            }
        });
        panelThree.add(allCameras, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 148, 30));

        entourage.setToolTipText("");
        entourage.setBorder(null);
        entourage.setBorderPainted(false);
        entourage.setContentAreaFilled(false);
        entourage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entourage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entourageActionPerformed(evt);
            }
        });
        panelThree.add(entourage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 150));

        runDors.setToolTipText("");
        runDors.setBorder(null);
        runDors.setBorderPainted(false);
        runDors.setContentAreaFilled(false);
        runDors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        runDors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runDorsActionPerformed(evt);
            }
        });
        panelThree.add(runDors, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 70, 244, 150));

        garage.setToolTipText("");
        garage.setBorder(null);
        garage.setBorderPainted(false);
        garage.setContentAreaFilled(false);
        garage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        garage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garageActionPerformed(evt);
            }
        });
        panelThree.add(garage, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 240, 150));

        freeSpace.setToolTipText("");
        freeSpace.setBorder(null);
        freeSpace.setBorderPainted(false);
        freeSpace.setContentAreaFilled(false);
        freeSpace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        freeSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freeSpaceActionPerformed(evt);
            }
        });
        panelThree.add(freeSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 244, 150));

        none1.setToolTipText("");
        none1.setBorder(null);
        none1.setBorderPainted(false);
        none1.setContentAreaFilled(false);
        none1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        none1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none1ActionPerformed(evt);
            }
        });
        panelThree.add(none1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 254, 240, 150));

        none2.setToolTipText("");
        none2.setBorder(null);
        none2.setBorderPainted(false);
        none2.setContentAreaFilled(false);
        none2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        none2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none2ActionPerformed(evt);
            }
        });
        panelThree.add(none2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 254, 244, 150));

        none3.setToolTipText("");
        none3.setBorder(null);
        none3.setBorderPainted(false);
        none3.setContentAreaFilled(false);
        none3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        none3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none3ActionPerformed(evt);
            }
        });
        panelThree.add(none3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 254, 240, 150));

        none4.setToolTipText("");
        none4.setBorder(null);
        none4.setBorderPainted(false);
        none4.setContentAreaFilled(false);
        none4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        none4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none4ActionPerformed(evt);
            }
        });
        panelThree.add(none4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 254, 244, 150));

        BackgroundCctv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cctv_background.png"))); // NOI18N
        panelThree.add(BackgroundCctv, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, -1));

        panelCenter.add(panelThree, "card4");

        panelFour.setOpaque(false);
        panelFour.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        general.setToolTipText("");
        general.setBorder(null);
        general.setBorderPainted(false);
        general.setContentAreaFilled(false);
        general.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalActionPerformed(evt);
            }
        });
        panelFour.add(general, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 148, 32));

        camera.setToolTipText("");
        camera.setBorder(null);
        camera.setBorderPainted(false);
        camera.setContentAreaFilled(false);
        camera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        camera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cameraActionPerformed(evt);
            }
        });
        panelFour.add(camera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 148, 32));

        conections.setToolTipText("");
        conections.setBorder(null);
        conections.setBorderPainted(false);
        conections.setContentAreaFilled(false);
        conections.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        conections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectionsActionPerformed(evt);
            }
        });
        panelFour.add(conections, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 78, 148, 32));

        settingsPanel.setOpaque(false);
        settingsPanel.setLayout(new java.awt.CardLayout());

        pnGeneral.setOpaque(false);
        pnGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnGeneral.add(backgroundGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 460));

        settingsPanel.add(pnGeneral, "card2");

        pnCameras.setOpaque(false);
        pnCameras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnCameras.add(backgroundCameras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 460));

        settingsPanel.add(pnCameras, "card3");

        pnConnections.setOpaque(false);
        pnConnections.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnConnections.add(backgroundConnections, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 460));

        settingsPanel.add(pnConnections, "card4");

        panelFour.add(settingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 0, 870, 460));

        BackgroundConfigs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/configs_background.png"))); // NOI18N
        panelFour.add(BackgroundConfigs, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, -1));

        panelCenter.add(panelFour, "card5");

        pnMain.add(panelCenter);
        panelCenter.setBounds(1, 90, 1022, 460);

        socialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/social_networks_icon.png"))); // NOI18N
        socialButton.setToolTipText("");
        socialButton.setBorder(null);
        socialButton.setBorderPainted(false);
        socialButton.setContentAreaFilled(false);
        socialButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socialButtonActionPerformed(evt);
            }
        });
        pnMain.add(socialButton);
        socialButton.setBounds(961, 557, 30, 24);

        facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facebook.setEnabled(false);
        facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                facebookMouseReleased(evt);
            }
        });
        pnMain.add(facebook);
        facebook.setBounds(830, 561, 50, 16);

        twitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twitter.setEnabled(false);
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                twitterMouseReleased(evt);
            }
        });
        pnMain.add(twitter);
        twitter.setBounds(904, 561, 38, 16);

        socialLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/social_networks_bar.png"))); // NOI18N
        pnMain.add(socialLabel);
        socialLabel.setBounds(1024, 557, 200, 25);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundMouseClicked(evt);
            }
        });
        pnMain.add(background);
        background.setBounds(0, 0, 1024, 600);

        getContentPane().add(pnMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed

        warning.setText("");
        information.setText("");

        switch(countMenu)
        {
            case 0:
                ImageIcon II = new ImageIcon(getClass().getResource("/Images/menu_button_down.png"));
                menuLabel.setIcon(II);

                AC.jLabelYDown(-25, 55, 2, 2, mainMenu);

                cctv.setEnabled(true);
                cctv.setVisible(true);

                about.setEnabled(true);
                about.setVisible(true);

                houses.setEnabled(true);
                houses.setVisible(true);

                configs.setEnabled(true);
                configs.setVisible(true);

                homeButton.setEnabled(true);
                homeButton.setVisible(true);

                countMenu = 1;
            break;

            case 1:
                ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/menu_button.png"));
                menuLabel.setIcon(II2);

                AC.jLabelYUp(55, -25, 2, 2, mainMenu);

                cctv.setEnabled(false);
                cctv.setVisible(false);

                about.setEnabled(false);
                about.setVisible(false);

                houses.setEnabled(false);
                houses.setVisible(false);

                configs.setEnabled(false);
                configs.setVisible(false);

                homeButton.setEnabled(false);
                homeButton.setVisible(false);

                if(countAbout == 1)
                {
                    about_drop.setEnabled(false);
                    about_drop.setVisible(false);

                    developer.setEnabled(false);
                    developer.setVisible(false);

                    howto.setEnabled(false);
                    howto.setVisible(false);

                    software.setEnabled(false);
                    software.setVisible(false);

                    countAbout = 0;
                }
                    
                countMenu = 0;
            break;
        }
    }//GEN-LAST:event_menuButtonActionPerformed

    private void minimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseReleased
        // Este código faz com que a janela seja minimizada **/
        this.setState(MainGUI.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseReleased

    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        // Este código faz com que a janela seja fechada **/
        Runtime.getRuntime().exit(0);
    }//GEN-LAST:event_closeMouseReleased

    private void frameDraggMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDraggMouseDragged
        // Este código faz com a janela seja arastavel **/
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameDraggMouseDragged

    private void frameDraggMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDraggMousePressed
        // Este código faz com as posições x e y sejam "Pegadas" pra uma certa ação **/
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameDraggMousePressed

    private void housesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_housesActionPerformed

        if(countAbout == 1)
        {
            ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/menu_bar.png"));
            mainMenu.setIcon(II2);

            AC.jLabelYUp(82, 20, 3, 2, about_drop);

            about_drop.setEnabled(false);
            about_drop.setVisible(false);

            developer.setEnabled(false);
            developer.setVisible(false);

            howto.setEnabled(false);
            howto.setVisible(false);

            software.setEnabled(false);
            software.setVisible(false);

            countAbout = 0;
        }

        if(countSwicth == 0 || countSwicth == 2 || countSwicth == 3)
        {
            panelCenter.removeAll();
            panelCenter.repaint();
            panelCenter.revalidate();

            panelCenter.add(panelTwo);
            panelTwo.repaint();
            panelTwo.revalidate();

            countSwicth = 1;
        }

    }//GEN-LAST:event_housesActionPerformed

    private void cctvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cctvActionPerformed

        if(countAbout == 1)
        {
            ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/menu_bar.png"));
            mainMenu.setIcon(II2);

            AC.jLabelYUp(82, 20, 3, 2, about_drop);

            about_drop.setEnabled(false);
            about_drop.setVisible(false);

            developer.setEnabled(false);
            developer.setVisible(false);

            howto.setEnabled(false);
            howto.setVisible(false);

            software.setEnabled(false);
            software.setVisible(false);

            countAbout = 0;
        }

        if(countSwicth == 0 || countSwicth == 1 || countSwicth == 3)
        {
            panelCenter.removeAll();
            panelCenter.repaint();
            panelCenter.revalidate();

            panelCenter.add(panelThree);
            panelTwo.repaint();
            panelTwo.revalidate();

            countSwicth = 2;
        }
    }//GEN-LAST:event_cctvActionPerformed

    private void configsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configsActionPerformed

        if(countAbout == 1)
        {
            ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/menu_bar.png"));
            mainMenu.setIcon(II2);

            AC.jLabelYUp(82, 20, 3, 2, about_drop);

            about_drop.setEnabled(false);
            about_drop.setVisible(false);

            developer.setEnabled(false);
            developer.setVisible(false);

            howto.setEnabled(false);
            howto.setVisible(false);

            software.setEnabled(false);
            software.setVisible(false);

            countAbout = 0;
        }

        if(countSwicth == 0 || countSwicth == 1 || countSwicth == 2)
        {
            panelCenter.removeAll();
            panelCenter.repaint();
            panelCenter.revalidate();

            panelCenter.add(panelFour);
            panelTwo.repaint();
            panelTwo.revalidate();

            countSwicth = 3;
        }
    }//GEN-LAST:event_configsActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed

        switch(countAbout)
        {
            case 0:
                ImageIcon II = new ImageIcon(getClass().getResource("/Images/menu_bar_about_down.png"));
                mainMenu.setIcon(II);

                about_drop.setEnabled(true);
                about_drop.setVisible(true);

                AC.jLabelYDown(20, 82, 2, 2, about_drop);

                developer.setEnabled(true);
                developer.setVisible(true);

                howto.setEnabled(true);
                howto.setVisible(true);

                software.setEnabled(true);
                software.setVisible(true);

                countAbout = 1;
            break;

            case 1:
                ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/menu_bar.png"));
                mainMenu.setIcon(II2);

                AC.jLabelYUp(82, 20, 3, 2, about_drop);

                about_drop.setEnabled(false);
                about_drop.setVisible(false);

                developer.setEnabled(false);
                developer.setVisible(false);

                howto.setEnabled(false);
                howto.setVisible(false);

                software.setEnabled(false);
                software.setVisible(false);

                countAbout = 0;
            break;
        }
    }//GEN-LAST:event_aboutActionPerformed

    private void developerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_developerActionPerformed

        if(countAbout == 1)
        {
            ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/menu_bar.png"));
            mainMenu.setIcon(II2);

            AC.jLabelYUp(82, 20, 3, 2, about_drop);

            about_drop.setEnabled(false);
            about_drop.setVisible(false);

            developer.setEnabled(false);
            developer.setVisible(false);

            howto.setEnabled(false);
            howto.setVisible(false);

            software.setEnabled(false);
            software.setVisible(false);

            DevGUI DG = new DevGUI(new Frame(), true);
            DG.setVisible(true);

            countAbout = 0;
        }
    }//GEN-LAST:event_developerActionPerformed

    private void howtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howtoActionPerformed

        if(countAbout == 1)
        {
            ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/menu_bar.png"));
            mainMenu.setIcon(II2);

            AC.jLabelYUp(82, 20, 3, 2, about_drop);

            about_drop.setEnabled(false);
            about_drop.setVisible(false);

            developer.setEnabled(false);
            developer.setVisible(false);

            howto.setEnabled(false);
            howto.setVisible(false);

            software.setEnabled(false);
            software.setVisible(false);

            HowToGUI HG = new HowToGUI(new Frame(), true);
            HG.setVisible(true);

            countAbout = 0;
        }
    }//GEN-LAST:event_howtoActionPerformed

    private void softwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softwareActionPerformed

        if(countAbout == 1)
        {
            ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/menu_bar.png"));
            mainMenu.setIcon(II2);

            AC.jLabelYUp(82, 20, 3, 2, about_drop);

            about_drop.setEnabled(false);
            about_drop.setVisible(false);

            developer.setEnabled(false);
            developer.setVisible(false);

            howto.setEnabled(false);
            howto.setVisible(false);

            software.setEnabled(false);
            software.setVisible(false);

            SoftGUI SG = new SoftGUI(new Frame(), true);
            SG.setVisible(true);

            countAbout = 0;
        }
    }//GEN-LAST:event_softwareActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        if(countInfo == 1)
        {
            warning.setText("");
            information.setText("");

            countInfo = 0;
        }

        if(countSearch == 0)
        {
            AC.jLabelXLeft(1024, 800, 1, 2, searchLabel);

            searchField.setEnabled(true);
            searchField.setVisible(true);

            searchField.setText("Procurar");

            searchButton.setEnabled(false);
            searchButton.setVisible(false);

            String word = searchField.getText() + "";

            if(word.equals(""))
            {
                searchField.setText("Procurar");
            }
            countSearch = 1;
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed

        if(countAbout == 1)
        {
            ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/menu_bar.png"));
            mainMenu.setIcon(II2);

            AC.jLabelYUp(82, 20, 3, 2, about_drop);

            about_drop.setEnabled(false);
            about_drop.setVisible(false);

            developer.setEnabled(false);
            developer.setVisible(false);

            howto.setEnabled(false);
            howto.setVisible(false);

            software.setEnabled(false);
            software.setVisible(false);

            countAbout = 0;
        }

        if(countSwicth == 1 || countSwicth == 2 || countSwicth == 3)
        {
            panelCenter.removeAll();
            panelCenter.repaint();
            panelCenter.revalidate();

            panelCenter.add(firstPanel);
            panelTwo.repaint();
            panelTwo.revalidate();

            countSwicth = 0;
        }

        if(countMagement == 1 || countMagement == 2 || countMagement == 3)
        {
            managerPanel.removeAll();
            managerPanel.repaint();
            managerPanel.revalidate();

            managerPanel.add(pnAdd);
            managerPanel.repaint();
            managerPanel.revalidate();

            countMagement = 0;
        }

        if(countSettings == 1 || countSettings == 2 || countSettings == 3)
        {
            settingsPanel.removeAll();
            settingsPanel.repaint();
            settingsPanel.revalidate();

            settingsPanel.add(pnGeneral);
            settingsPanel.repaint();
            settingsPanel.revalidate();

            countMagement = 0;
        }
    }//GEN-LAST:event_homeButtonActionPerformed

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked

        searchField.setText(" ");
    }//GEN-LAST:event_searchFieldMouseClicked

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String word = searchField.getText();

            String error = " Nada foi encontrado para" + " '" + word + " ' " ;

            if(word.matches(".*vol.*") || word.matches(".*fez.*"))
            {
                searchField.setText("Procurar");

                DevGUI DG = new DevGUI(new Frame(), true);
                DG.setVisible(true);
            }
            else if(word.matches(".*usa.*"))
            {
                searchField.setText("Procurar");

                HowToGUI HG = new HowToGUI(new Frame(), true);
                HG.setVisible(true);
            }
            else if(word.matches(".*sof.*") || word.matches(".*ver.*"))
            {
                searchField.setText("Procurar");

                SoftGUI SG = new SoftGUI(new Frame(), true);
                SG.setVisible(true);
            }
            else
            {
                warning.setText("Informação:");
                information.setText(error);
            }
        }
    }//GEN-LAST:event_searchFieldKeyPressed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        if(countMagement == 0 || countMagement == 2 || countMagement == 3)
        {
            managerPanel.removeAll();
            managerPanel.repaint();
            managerPanel.revalidate();

            managerPanel.add(pnAdd);
            managerPanel.repaint();
            managerPanel.revalidate();

            countMagement = 1;
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed

        if(countMagement == 0 || countMagement == 1 || countMagement == 3)
        {
            managerPanel.removeAll();
            managerPanel.repaint();
            managerPanel.revalidate();

            managerPanel.add(pnRemove);
            managerPanel.repaint();
            managerPanel.revalidate();

            countMagement = 2;
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        
        try
        {
            DB.connectDB();
            Statement stm = DB.conn.createStatement();
            String query = "SELECT * FROM Houses";
            ResultSet rs = stm.executeQuery(query);
            
            DefaultListModel DLM = new DefaultListModel();
            
            while(rs.next())
            {
                DLM.addElement(rs.getString(1));
                list.setModel(DLM);
            }
            
        }
        catch(SQLException e)
        {
            
        }
        
        if(countMagement == 0 || countMagement == 1 || countMagement == 2)
        {
            managerPanel.removeAll();
            managerPanel.repaint();
            managerPanel.revalidate();

            managerPanel.add(pnLists);
            managerPanel.repaint();
            managerPanel.revalidate();

            countMagement = 3;
        }
    }//GEN-LAST:event_listButtonActionPerformed

    private void choosePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosePhotoActionPerformed

        FileFilter filter = new FileNameExtensionFilter("Images Files", "jpg", "png", "gif");

        JFileChooser chooser = new  JFileChooser("D:\\Others\\Backgrounds");
        chooser.addChoosableFileFilter(filter);

        int returVal = chooser.showOpenDialog(null);

        if(returVal == JFileChooser.APPROVE_OPTION)
        {
            File myFile = chooser.getSelectedFile();

            try
            {
                BufferedImage img = ImageIO.read(myFile);
                ImageIcon icon = new ImageIcon(img);
                imageViewer.setIcon(icon);

                String pah = myFile.getAbsolutePath() + "";
                frameDragg.setText(pah);
            }
            catch (IOException ex)
            {

            }
        }
    }//GEN-LAST:event_choosePhotoActionPerformed

    private void upMember1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upMember1ActionPerformed

        int men = Integer.parseInt(membersField.getText());

        if(men >= 0 && men < 12)
        {
            ++ men;
        }
        
        if(men == 1)
        {
            membersLabel.setText("Membro");
        }
        else if(men > 1)
        {
            membersLabel.setText("Membros");
        }

        membersField.setText(Integer.toString(men));
    }//GEN-LAST:event_upMember1ActionPerformed

    private void downMember1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMember1ActionPerformed

        int men = Integer.parseInt(membersField.getText());

        if(men > 0 && men <= 12)
        {
            -- men;
        }

        if(men > 1)
        {
            membersLabel.setText("Membros");
        }
        else if(men == 1)
        {
            membersLabel.setText("Membro");
        }
        else if(men == 0)
        {
            membersLabel.setText(" ");
        }

        membersField.setText(Integer.toString(men));
    }//GEN-LAST:event_downMember1ActionPerformed

    private void upCars1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upCars1ActionPerformed

        int car = Integer.parseInt(carsField.getText());

        if(car >= 0 && car < 8)
        {
            ++ car;
        }

        if(car == 1)
        {
            carsLabel.setText("Automóvel");
        }
        else if(car > 1)
        {
            carsLabel.setText("Automóveis");
        }

        carsField.setText(Integer.toString(car));
    }//GEN-LAST:event_upCars1ActionPerformed

    private void downCars1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downCars1ActionPerformed

        int car = Integer.parseInt(carsField.getText());

        if(car > 0 && car <= 8)
        {
            -- car;
        }

        if(car == 1)
        {
            carsLabel.setText("Automóvel");
        }
        else if(car > 1)
        {
            carsLabel.setText("Automóveis");
        }
        else if(car == 0)
        {
            carsLabel.setText(" ");
        }

        carsField.setText(Integer.toString(car));
    }//GEN-LAST:event_downCars1ActionPerformed

    private void upRoms1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upRoms1ActionPerformed

        int rom = Integer.parseInt(romsField.getText());

        if(rom >= 0 && rom < 6)
        {
            ++ rom;
        }

        if(rom == 1)
        {
            romsLabel.setText("Quarto");
        }
        else if(rom > 1)
        {
            romsLabel.setText("Quartos");
        }

        romsField.setText(Integer.toString(rom));
    }//GEN-LAST:event_upRoms1ActionPerformed

    private void downRoms1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downRoms1ActionPerformed

        int rom = Integer.parseInt(romsField.getText());

        if(rom > 0 && rom <= 6)
        {
            -- rom;
        }

        if(rom == 1)
        {
            romsLabel.setText("Quarto");
        }
        else if(rom > 1)
        {
            romsLabel.setText("Quartos");
        }
        else if(rom == 0)
        {
            romsLabel.setText(" ");
        }

        romsField.setText(Integer.toString(rom));
    }//GEN-LAST:event_downRoms1ActionPerformed

    private void upHouse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upHouse1ActionPerformed

        switch(countText)
        {
            case 0:
            typeHouseField.setText("Apartamento");
            break;
            case 1:
            typeHouseField.setText("Casa Normal");
            break;
        }
    }//GEN-LAST:event_upHouse1ActionPerformed

    private void downHouse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downHouse1ActionPerformed

        switch(countText)
        {
            case 0:
            typeHouseField.setText("Casa Normal");
            break;
            case 1:
            typeHouseField.setText("Apartamento");
            break;
        }
    }//GEN-LAST:event_downHouse1ActionPerformed

    private void saveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataActionPerformed

        warning.setText("");
        information.setText("");

        if(codeField.getText().equals("") || numField.getText().equals("") || nameField.getText().equals("") || sex == null || status == null || membersField.getText().equals("0") || carsField.getText().equals("0") || typeHouseField.getText().equals("") || romsField.getText().equals("0"))
        {
            warning.setText("Informação:");
            information.setText("Preencha os dados de maneira correcta!");
        }
        else
        {
            DB.writeData(codeField.getText(), Integer.parseInt(numField.getText()), nameField.getText(), sex, status, Integer.parseInt(membersField.getText()), Integer.parseInt(carsField.getText()), typeHouseField.getText(), Integer.parseInt(romsField.getText()));
        }

        if(DBClass.countWrite == 0)
        {
            numField.setText("");
            codeField.setText("");
            nameField.setText("");

            f.setSelected(false);
            m.setSelected(false);
            sim.setSelected(false);
            nao.setSelected(false);

            carsLabel.setText("");
            romsLabel.setText("");
            membersLabel.setText("");

            carsField.setText("0");
            romsField.setText("0");
            membersField.setText("0");
            typeHouseField.setText("");

            DBClass.countWrite = 1;
        }
    }//GEN-LAST:event_saveDataActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed

        if(m.isSelected())
        {
            sex = "M";
            f.setSelected(false);
        }
    }//GEN-LAST:event_mActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed

        if(f.isSelected())
        {
            sex = "F";
            m.setSelected(false);
        }
    }//GEN-LAST:event_fActionPerformed

    private void simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simActionPerformed

        if(sim.isSelected() && sex.equals("M"))
        {
            status = "Casado";
            nao.setSelected(false);
        }
        else
        {
            status = "Casada";
            nao.setSelected(false);
        }
    }//GEN-LAST:event_simActionPerformed

    private void naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoActionPerformed

        if(nao.isSelected() && sex.equals("M"))
        {
            status = "Solteiro";
            sim.setSelected(false);
        }
        else
        {
            status = "Solteira";
            sim.setSelected(false);
        }
    }//GEN-LAST:event_naoActionPerformed

    private void getPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPhotoActionPerformed

        FileFilter filter = new FileNameExtensionFilter("Images Files", "jpg", "png", "gif");

        JFileChooser chooser = new  JFileChooser("D:\\Others\\Backgrounds");
        chooser.addChoosableFileFilter(filter);

        int returVal = chooser.showOpenDialog(null);

        if(returVal == JFileChooser.APPROVE_OPTION)
        {
            File myFile = chooser.getSelectedFile();

            try
            {
                BufferedImage img = ImageIO.read(myFile);
                ImageIcon icon = new ImageIcon(img);
                showImage.setIcon(icon);

                String pah = myFile.getAbsolutePath() + "";
                frameDragg.setText(pah);
            }
            catch (IOException ex)
            {
                frameDragg.setText(" INFORMAÇÃO: Ouve problemas ao caregar a imagem. ");
            }
        }
    }//GEN-LAST:event_getPhotoActionPerformed

    private void findDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findDataActionPerformed

        warning.setText("");
        information.setText("");

        try
        {
            String sql = "SELECT * FROM Houses WHERE codeCasa = ?";
            DB.connectDB();
            PreparedStatement PS = DB.conn.prepareStatement(sql);
            PS.setString(1, showCode.getText());

            DB.rs = PS.executeQuery();

            while(DB.rs.next())
            {
                showCode.setText(DB.rs.getString("codeCasa"));
                showNums.setText(Integer.toString(DB.rs.getInt("numCasa")));
                showName.setText(DB.rs.getString("nomeDono"));

                if(DB.rs.getString("sexo").equals("M"))
                {
                    showM.setSelected(true);
                }
                else
                {
                    showF.setSelected(true);
                }

                if(DB.rs.getString("estadoCivil").equals("Solteiro"))
                {
                    showNao.setSelected(true);
                }
                else
                {
                    showSim.setSelected(true);
                }

                showMembers.setText(Integer.toString(DB.rs.getInt("totalMembros")));
                if(DB.rs.getInt("totalMembros") == 0)
                {
                    textMembers.setText("");
                }
                else if(DB.rs.getInt("totalMembros") == 1)
                {
                    textMembers.setText("Membro");
                }
                else if(DB.rs.getInt("totalMembros") > 1)
                {
                    textMembers.setText("Membros");
                }

                showCars.setText(Integer.toString(DB.rs.getInt("totalCars")));
                if(DB.rs.getInt("totalCars") == 0)
                {
                    textCars.setText("");
                }
                else if(DB.rs.getInt("totalCars") == 1)
                {
                    textCars.setText("Automóvel");
                }
                else if(DB.rs.getInt("totalCars") > 1)
                {
                    textCars.setText("Automóveis");
                }

                showRoms.setText(Integer.toString(DB.rs.getInt("numQuartos")));
                if(DB.rs.getInt("numQuartos") == 0)
                {
                    textRoms.setText("");
                }
                else if(DB.rs.getInt("numQuartos") == 1)
                {
                    textRoms.setText("Quarto");
                }
                else if(DB.rs.getInt("numQuartos") > 1)
                {
                    textRoms.setText("Quartos");
                }

                showHouseType.setText(DB.rs.getString("tipoResidencia"));

                //////
                warning.setText("");
                information.setText("");

                upMember.setEnabled(true);
                downMember.setEnabled(true);
                upCars.setEnabled(true);
                downCars.setEnabled(true);
                upRom.setEnabled(true);
                downRom.setEnabled(true);
                upHouse.setEnabled(true);
                downHouse.setEnabled(true);
                getPhoto.setEnabled(true);

                ImageIcon II = new ImageIcon(getClass().getResource("/Images/update_data_background_2.png"));
                backgroundRemove.setIcon(II);
            }
        }
        catch(SQLException e)
        {
            warning.setText("Informação:");
            information.setText("Erro ao buscar dados reveja o código escrto! ");
        }
    }//GEN-LAST:event_findDataActionPerformed

    private void showMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMActionPerformed

        if(showM.isSelected())
        {
            sex = "M";
            showF.setSelected(false);
        }
    }//GEN-LAST:event_showMActionPerformed

    private void showFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFActionPerformed

        if(showF.isSelected())
        {
            sex = "F";
            showM.setSelected(false);
        }
    }//GEN-LAST:event_showFActionPerformed

    private void showSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSimActionPerformed

        if(showSim.isSelected() && sex.equals("M"))
        {
            status = "Casado";
            showNao.setSelected(false);
        }
        else
        {
            status = "Casada";
            showNao.setSelected(false);
        }
    }//GEN-LAST:event_showSimActionPerformed

    private void showNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showNaoActionPerformed

        if(showNao.isSelected() && sex.equals("M"))
        {
            status = "Solteiro";
            showSim.setSelected(false);
        }
        else
        {
            status = "Solteira";
            showSim.setSelected(false);
        }
    }//GEN-LAST:event_showNaoActionPerformed

    private void upMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upMemberActionPerformed

        int men = Integer.parseInt(showMembers.getText());

        if(men >= 0 && men < 12)
        {
            ++ men;
        }

        if(men == 1)
        {
            textMembers.setText("Membro");
        }
        else if(men > 1)
        {
            textMembers.setText("Membros");
        }

        showMembers.setText(Integer.toString(men));
    }//GEN-LAST:event_upMemberActionPerformed

    private void downMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMemberActionPerformed

        int men = Integer.parseInt(showMembers.getText());

        if(men > 0 && men <= 12)
        {
            -- men;
        }

        if(men == 1)
        {
            textMembers.setText("Membro");
        }
        else if(men > 1)
        {
            textMembers.setText("Membros");
        }
        else if(men == 0)
        {
            textMembers.setText(" ");
        }

        showMembers.setText(Integer.toString(men));
    }//GEN-LAST:event_downMemberActionPerformed

    private void upCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upCarsActionPerformed

        int car = Integer.parseInt(showCars.getText());

        if(car >= 0 && car < 8)
        {
            ++ car;
        }

        if(car == 1)
        {
            textCars.setText("Automóvel");
        }
        else if(car > 1)
        {
            textCars.setText("Automóveis");
        }

        showCars.setText(Integer.toString(car));
    }//GEN-LAST:event_upCarsActionPerformed

    private void downCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downCarsActionPerformed

        int car = Integer.parseInt(showCars.getText());

        if(car > 0 && car <= 8)
        {
            -- car;
        }

        if(car == 1)
        {
            textCars.setText("Automóvel");
        }
        else if(car > 1)
        {
            textCars.setText("Automóveis");
        }
        else if(car == 0)
        {
            textCars.setText(" ");
        }

        showCars.setText(Integer.toString(car));
    }//GEN-LAST:event_downCarsActionPerformed

    private void upHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upHouseActionPerformed

        switch(countText)
        {
            case 0:
                showHouseType.setText("Apartamento");
            break;
            case 1:
                showHouseType.setText("Casa Normal");
            break;
        }
    }//GEN-LAST:event_upHouseActionPerformed

    private void downHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downHouseActionPerformed

        switch(countText)
        {
            case 0:
                showHouseType.setText("Apartamento");
            break;
            case 1:
                showHouseType.setText("Casa Normal");
            break;
        }
    }//GEN-LAST:event_downHouseActionPerformed

    private void upRomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upRomActionPerformed

        int rom = Integer.parseInt(showRoms.getText());

        if(rom >= 0 && rom < 6)
        {
            ++ rom;
        }

        if(rom == 1)
        {
            textRoms.setText("Quarto");
        }
        else if(rom > 1)
        {
            textRoms.setText("Quartos");
        }
        showRoms.setText(Integer.toString(rom));
    }//GEN-LAST:event_upRomActionPerformed

    private void downRomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downRomActionPerformed

        int rom = Integer.parseInt(showRoms.getText());

        if(rom > 0 && rom <= 6)
        {
            -- rom;
        }

        if(rom == 1)
        {
            textRoms.setText("Quarto");
        }
        else if(rom > 1)
        {
            textRoms.setText("Quartos");
        }
        else if(rom == 0)
        {
            textRoms.setText(" ");
        }
        showRoms.setText(Integer.toString(rom));
    }//GEN-LAST:event_downRomActionPerformed

    private void updateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDataActionPerformed

        warning.setText("");
        information.setText("");

        if(showCode.getText().equals("") || showNums.getText().equals("") || showName.getText().equals("") || sex == null || status == null || showMembers.getText().equals("0") || showCars.getText().equals("0") || showHouseType.getText().equals("") || showRoms.getText().equals("0"))
        {
            warning.setText("Informação:");
            information.setText("Preencha os dados de maneira correcta!");
        }
        else
        {
            DB.updaTeData(showCode.getText(), Integer.parseInt(showNums.getText()), showName.getText(), sex, status, Integer.parseInt(showMembers.getText()), Integer.parseInt(showCars.getText()), showHouseType.getText(), Integer.parseInt(showRoms.getText()));
        }

        if(DBClass.countUpdate == 0)
        {
            showCode.setText("");
            showNums.setText("");
            showName.setText("");

            showM.setSelected(false);
            showF.setSelected(false);
            showSim.setSelected(false);
            showNao.setSelected(false);

            textMembers.setText("");
            textCars.setText("");
            textRoms.setText("");

            showCars.setText("0");
            showRoms.setText("0");
            showMembers.setText("0");
            showHouseType.setText("");

            upMember.setEnabled(false);
            downMember.setEnabled(false);
            upCars.setEnabled(false);
            downCars.setEnabled(false);
            upRom.setEnabled(false);
            downRom.setEnabled(false);
            upHouse.setEnabled(false);
            downHouse.setEnabled(false);
            getPhoto.setEnabled(false);

            ImageIcon II = new ImageIcon(getClass().getResource("/Images/update_data_background.png"));
            backgroundRemove.setIcon(II);

            DBClass.countUpdate = 1;
        }
    }//GEN-LAST:event_updateDataActionPerformed

    private void deleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataActionPerformed

    }//GEN-LAST:event_deleteDataActionPerformed

    private void allCamerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allCamerasActionPerformed

        WindowControlBig BCG = new WindowControlBig();
        if(countAll == 0)
        {
            BCG.setVisible(true);

            countAll = 1;
        }

    }//GEN-LAST:event_allCamerasActionPerformed

    private void entourageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entourageActionPerformed

        WindowControl CG = new WindowControl();
        if(countFrame == 0)
        {
            CG.setVisible(true);

            countFrame = 1;
        }
    }//GEN-LAST:event_entourageActionPerformed

    private void runDorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runDorsActionPerformed

    }//GEN-LAST:event_runDorsActionPerformed

    private void garageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_garageActionPerformed

    }//GEN-LAST:event_garageActionPerformed

    private void freeSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freeSpaceActionPerformed

    }//GEN-LAST:event_freeSpaceActionPerformed

    private void none1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none1ActionPerformed

    }//GEN-LAST:event_none1ActionPerformed

    private void none2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none2ActionPerformed

    }//GEN-LAST:event_none2ActionPerformed

    private void none3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none3ActionPerformed

    }//GEN-LAST:event_none3ActionPerformed

    private void none4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none4ActionPerformed

    }//GEN-LAST:event_none4ActionPerformed

    private void generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalActionPerformed

        if(countSettings == 2 || countSettings == 3)
        {
            settingsPanel.removeAll();
            settingsPanel.repaint();
            settingsPanel.revalidate();

            settingsPanel.add(pnGeneral);
            settingsPanel.repaint();
            settingsPanel.revalidate();

            countMagement = 1;
        }
    }//GEN-LAST:event_generalActionPerformed

    private void cameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cameraActionPerformed

        if(countSettings == 1 || countSettings == 3)
        {
            settingsPanel.removeAll();
            settingsPanel.repaint();
            settingsPanel.revalidate();

            settingsPanel.add(pnCameras);
            settingsPanel.repaint();
            settingsPanel.revalidate();

            countMagement = 2;
        }
    }//GEN-LAST:event_cameraActionPerformed

    private void conectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectionsActionPerformed

        if(countSettings == 1 || countSettings == 2)
        {
            settingsPanel.removeAll();
            settingsPanel.repaint();
            settingsPanel.revalidate();

            settingsPanel.add(pnConnections);
            settingsPanel.repaint();
            settingsPanel.revalidate();

            countMagement = 3;
        }
    }//GEN-LAST:event_conectionsActionPerformed

    private void socialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socialButtonActionPerformed

        if(countInfo == 1)
        {
            warning.setText("");
            information.setText("");

            countInfo = 0;
        }

        if(countSocial == 0)
        {
            AC.jLabelXLeft(1024, 800, 1, 2, socialLabel);

            twitter.setVisible(true);
            twitter.setEnabled(true);

            facebook.setVisible(true);
            facebook.setEnabled(true);

            socialButton.setVisible(false);
            socialButton.setEnabled(false);

            countSocial = 1;
        }
    }//GEN-LAST:event_socialButtonActionPerformed

    private void facebookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseReleased
        // Este código é responsavel por abrir o link das do facebook
        LauchBrowser LB = new LauchBrowser();
        LB.LauchFacebook();
    }//GEN-LAST:event_facebookMouseReleased

    private void twitterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseReleased
        // Este código é responsavel por abrir o link do meu twitter
        LauchBrowser LB = new LauchBrowser();
        LB.LauchTwitter();
    }//GEN-LAST:event_twitterMouseReleased

    private void backgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseClicked

        warning.setText("");
        information.setText("");

        if(countSearch == 1)
        {
            AC.jLabelXRight(800, 1024, 1, 2, searchLabel);

            searchField.setEnabled(false);
            searchField.setVisible(false);

            searchButton.setEnabled(true);
            searchButton.setVisible(true);

            countSearch = 0;
        }

        if(countSocial == 1)
        {
            AC.jLabelXRight(800, 1024, 1, 2, socialLabel);

            twitter.setVisible(false);
            twitter.setEnabled(false);

            facebook.setVisible(false);
            facebook.setEnabled(false);

            socialButton.setVisible(true);
            socialButton.setEnabled(true);

            countSocial = 0;
        }

    }//GEN-LAST:event_backgroundMouseClicked


    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundCctv;
    private javax.swing.JLabel BackgroundConfigs;
    private javax.swing.JButton about;
    private javax.swing.JLabel about_drop;
    private javax.swing.JButton addButton;
    private javax.swing.JButton allCameras;
    private javax.swing.JLabel background;
    private javax.swing.JLabel backgroundAdd;
    private javax.swing.JLabel backgroundCameras;
    private javax.swing.JLabel backgroundConnections;
    private javax.swing.JLabel backgroundGeneral;
    private javax.swing.JLabel backgroundManager;
    private javax.swing.JLabel backgroundRemove;
    private javax.swing.JButton camera;
    private javax.swing.JTextField carsField;
    private javax.swing.JLabel carsLabel;
    private javax.swing.JButton cctv;
    private javax.swing.JButton choosePhoto;
    private javax.swing.JLabel close;
    private javax.swing.JTextField codeField;
    private javax.swing.JButton conections;
    private javax.swing.JButton configs;
    private javax.swing.JButton deleteData;
    private javax.swing.JButton developer;
    private javax.swing.JButton downCars;
    private javax.swing.JButton downCars1;
    private javax.swing.JButton downHouse;
    private javax.swing.JButton downHouse1;
    private javax.swing.JButton downMember;
    private javax.swing.JButton downMember1;
    private javax.swing.JButton downRom;
    private javax.swing.JButton downRoms1;
    private javax.swing.JButton entourage;
    private javax.swing.JRadioButton f;
    private javax.swing.JLabel facebook;
    private javax.swing.JButton findData;
    private javax.swing.JPanel firstPanel;
    public static javax.swing.JLabel frameDragg;
    private javax.swing.JButton freeSpace;
    private javax.swing.JButton garage;
    private javax.swing.JButton general;
    private javax.swing.JButton getPhoto;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton houses;
    private javax.swing.JButton howto;
    private javax.swing.JLabel imageViewer;
    public static javax.swing.JLabel information;
    private javax.swing.JList list;
    private javax.swing.JButton listButton;
    private javax.swing.JRadioButton m;
    private javax.swing.JLabel mainMenu;
    private javax.swing.JPanel managerPanel;
    private javax.swing.JTextField membersField;
    private javax.swing.JLabel membersLabel;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField nameField;
    private javax.swing.JCheckBox nao;
    private javax.swing.JButton none1;
    private javax.swing.JButton none2;
    private javax.swing.JButton none3;
    private javax.swing.JButton none4;
    private javax.swing.JTextField numField;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelFour;
    private javax.swing.JPanel panelThree;
    private javax.swing.JPanel panelTwo;
    private javax.swing.JPanel pnAdd;
    private javax.swing.JPanel pnCameras;
    private javax.swing.JPanel pnConnections;
    private javax.swing.JPanel pnGeneral;
    private javax.swing.JPanel pnLists;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnRemove;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField romsField;
    private javax.swing.JLabel romsLabel;
    private javax.swing.JButton runDors;
    private javax.swing.JButton saveData;
    private javax.swing.JScrollPane scroller;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JTextField showCars;
    private javax.swing.JTextField showCode;
    private javax.swing.JRadioButton showF;
    private javax.swing.JTextField showHouseType;
    private javax.swing.JLabel showImage;
    private javax.swing.JRadioButton showM;
    private javax.swing.JTextField showMembers;
    private javax.swing.JTextField showName;
    private javax.swing.JCheckBox showNao;
    private javax.swing.JTextField showNums;
    private javax.swing.JTextField showRoms;
    private javax.swing.JCheckBox showSim;
    private javax.swing.JCheckBox sim;
    private javax.swing.JButton socialButton;
    private javax.swing.JLabel socialLabel;
    private javax.swing.JButton software;
    private javax.swing.JLabel textCars;
    private javax.swing.JLabel textMembers;
    private javax.swing.JLabel textRoms;
    private javax.swing.JLabel twitter;
    private javax.swing.JTextField typeHouseField;
    private javax.swing.JButton upCars;
    private javax.swing.JButton upCars1;
    private javax.swing.JButton upHouse;
    private javax.swing.JButton upHouse1;
    private javax.swing.JButton upMember;
    private javax.swing.JButton upMember1;
    private javax.swing.JButton upRom;
    private javax.swing.JButton upRoms1;
    private javax.swing.JButton updateData;
    public static javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
