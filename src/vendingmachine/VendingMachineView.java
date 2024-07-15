package vendingmachine;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
* The VendingMachineView class represents the graphical user interface (GUI) for a vending machine.
* It includes components such as buttons, labels, text fields, and panels for displaying and controlling
* the vending machine's items and interactions.
*/
public class VendingMachineView {
    private JFrame mainFrame, controlFrame, coinsFrame;
    private JLabel titleLbl, itemsLbl, sItemsLbl, insertedCoinsLbl, changeLbl;
    private JLabel item1Lbl, item2Lbl, item3Lbl, item4Lbl, item5Lbl, item6Lbl, item7Lbl, item8Lbl;
    private JLabel crustLbl, cheeseLbl, veggiesLbl, meatLbl;
    private JLabel thinCLbl, thickCLbl, gfCLbl, mozzaLbl, parmLbl, ricottaLbl, bpLbl, mushroomLbl, olivesLbl, pepperoniLbl, baconLbl, chickenLbl;
    private JLabel item1Prc, item2Prc, item3Prc, item4Prc, item5Prc, item6Prc, item7Prc, item8Prc,
                    thinCPrc, thickCPrc, gfCPrc, mozzaPrc, parmPrc, ricottaPrc, bpPrc, mushroomPrc, olivesPrc,
                    pepperoniPrc, baconPrc, chickenPrc;
    protected JTextArea displayTxtA;
    private JTextField insertedCoinsTf, changeTf, inputTf;
    private ImageIcon icon7, icon8;
    private JButton item1Btn, item2Btn, item3Btn, item4Btn, item5Btn, item6Btn, item7Btn, item8Btn;
    private JButton pizzaBtn ,thinCBtn, thickCBtn, gfCBtn, mozzaBtn, parmBtn, ricottaBtn, bpBtn, mushroomBtn, olivesBtn, pepperoniBtn, baconBtn, chickenBtn;
    private JButton oBtn, twBtn, thBtn, frBtn, fvBtn, sxBtn, svBtn, ethBtn, nnBtn, zBtn;
    private JButton oneBtn, fiveBtn, tenBtn, twentyBtn, fiftyBtn, oneHndBtn, twoHndBtn, fiveHndBtn, oneThdBtn;
    private JButton purchaseBtn, dispenseBtn, clrBtn;
    private JButton confirmBtn, exitBtn, clearBtn, backBtn;
    private JPanel mainPanel, controlPanel, coinsPanel, titlePanel, itemsPrcPanel, itemsTtlPanel, itemsBtnPanel, itemsLblPanel, pizzaPanel, specialPanel,
                    crustTtlPanel, crustPanel, crustLblPanel, cheeseTtlPanel, cheesePanel, cheeseLblPanel, veggiesTtlPanel, veggiesPanel, veggiesLblPanel,
                    meatTtlPanel, meatPanel, meatLblPanel, insertPanel, changePanel, denominationPanel, controlBtnsPanel, crustPrcPanel, cheesePrcPanel,
                    veggiesPrcPanel, meatPrcPanel, zBtnPanel, keypadControlsPanel;

    /**
     * Constructs the VendingMachineView by initializing the main frame and its components.
     * It sets up the mainPanel, controlFrame, and coinsFrame, and initializes the various GUI components.
     * The vending machine view includes buttons for items, text areas for display, and control buttons for user interactions.
     */
    public VendingMachineView() {
         // Get the screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Set up the JFrame
        mainFrame = new JFrame("Vending Machine");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1000,800);
        mainFrame.setLocation(0, 0); // Upper-left corner
        //mainFrame.setLayout(new GridLayout(9, 1)); // Increase the rows to
        mainFrame.setLayout(new BorderLayout());

        // create main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setPreferredSize(new Dimension(980, 1200));
        mainPanel.setMinimumSize(new Dimension(500, 800)); // Adjust the minimum size as needed
        mainPanel.setMaximumSize(new Dimension(980, 3000)); // Adjust the minimum size as needed

        // create main scrollpane
        JScrollPane mainScrollPane = new JScrollPane(mainPanel);
        mainScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        mainScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        mainScrollPane.setPreferredSize(new Dimension(1000, 300));

        mainFrame.add(mainScrollPane, BorderLayout.CENTER);

        // create control frame
        controlFrame = new JFrame ("Keypad");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(440,400);
        controlFrame.setLocation(screenWidth - controlFrame.getWidth(), 0); // Top-right corner
        controlFrame.setLayout(new BorderLayout());

        // create control panel
        controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));
        controlPanel.setPreferredSize(new Dimension(400, 400));
        controlPanel.setMinimumSize(new Dimension(200, 200)); // Adjust the minimum size as needed
        controlPanel.setMaximumSize(new Dimension(400, 400)); // Adjust the minimum size as needed

        controlFrame.add(controlPanel);

        // coins frame
        coinsFrame = new JFrame ("Insert Money");
        coinsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        coinsFrame.setSize(440,400);
        coinsFrame.setLocation(screenWidth - controlFrame.getWidth(), screenHeight - coinsFrame.getHeight()); // Lower-right corner
        coinsFrame.setLayout(new BorderLayout());

        // create control panel
        coinsPanel = new JPanel();
        coinsPanel.setLayout(new BoxLayout(coinsPanel, BoxLayout.Y_AXIS));
        coinsPanel.setPreferredSize(new Dimension(400, 400));
        coinsPanel.setMinimumSize(new Dimension(200, 200)); // Adjust the minimum size as needed
        coinsPanel.setMaximumSize(new Dimension(400, 400)); // Adjust the minimum size as needed

        coinsFrame.add(coinsPanel);
    
        // Create the components
        // title
        titlePanel = new JPanel(new GridLayout(1, 1)); // Panel with 1 row and 1 column
        titleLbl = new JLabel("Vending Machine");
        titleLbl.setFont(new Font("Arial", Font.BOLD, 35)); // Set the font
        titleLbl.setHorizontalAlignment(JLabel.CENTER);
        titleLbl.setPreferredSize(new Dimension(500, 50));
        titlePanel.add(titleLbl); // Add the label to the titlePanel

        // display text area
        JPanel displayPanel = new JPanel(new GridLayout(1,1));

        // create display text area
        displayTxtA = new JTextArea();
        displayTxtA.setEditable(false);
        displayTxtA.setPreferredSize(new Dimension(550, 900));
        displayTxtA.setLineWrap(true); // Enable line wrapping
        displayTxtA.setWrapStyleWord(true); // Wrap text at word boundaries

        // Create the JScrollPane and add the JTextArea to it
        JScrollPane scrollPane = new JScrollPane(displayTxtA);
        scrollPane.setPreferredSize(new Dimension(500, 150));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(600, 300));
        displayPanel.add(scrollPane);

        // Individual Items label
        itemsTtlPanel = new JPanel(new GridLayout(1, 1)); // Panel with 1 row and 1 column
        itemsLbl = new JLabel("Items");
        itemsLbl.setFont(new Font("Arial", Font.BOLD, 22));
        itemsLbl.setHorizontalAlignment(JLabel.CENTER);
        itemsLbl.setPreferredSize(new Dimension(732, 30));
        itemsLbl.setBorder(createBorder());
        itemsTtlPanel.add(itemsLbl); // Add the label to the itemsTtlPanel

        // itemsBtnPanel for item buttons
        itemsBtnPanel = new JPanel(new GridLayout(1,8));

        //ricotta cheese button
        item1Btn = new JButton();
        item1Btn.setToolTipText("Ricotta Cheese");
        item1Btn.setPreferredSize(new Dimension(122, 100));
        ImageIcon icon1 = new ImageIcon("icons/RicottaCheese.png");
        item1Btn.setIcon(icon1);
        item1Btn.setBorder(createBorder());

        // pepperoni button
        item2Btn = new JButton();
        item2Btn.setToolTipText("Pepperoni");
        ImageIcon icon2 = new ImageIcon("icons/Pepperoni.png");
        item2Btn.setIcon(icon2);
        item2Btn.setBorder(createBorder());

        // bacon button
        item3Btn = new JButton();
        item3Btn.setToolTipText("Bacon");
        ImageIcon icon3 = new ImageIcon("icons/Bacon.png");
        item3Btn.setIcon(icon3);
        item3Btn.setBorder(createBorder());

        // mozza button
        item4Btn = new JButton();
        item4Btn.setToolTipText("Mozzarella Cheese");
        item4Btn.setPreferredSize(new Dimension(122, 100));
        ImageIcon icon4 = new ImageIcon("icons/Mozza.png");
        item4Btn.setIcon(icon4);
        item4Btn.setBorder(createBorder());

        // parm button
        item5Btn = new JButton();
        item5Btn.setToolTipText("Parmesan Cheese");
        item5Btn.setPreferredSize(new Dimension(122, 100));
        ImageIcon icon5 = new ImageIcon("icons/Parm.png");
        item5Btn.setIcon(icon5);
        item5Btn.setBorder(createBorder());

        // water button
        item6Btn = new JButton();
        item6Btn.setToolTipText("Water");
        ImageIcon icon6 = new ImageIcon("icons/Water.png");
        item6Btn.setIcon(icon6);
        item6Btn.setBorder(createBorder());

        // coke button
        item7Btn = new JButton();
        item7Btn.setToolTipText("Coca-Cola");
        item7Btn.setPreferredSize(new Dimension(122, 100));
        icon7 = new ImageIcon("icons/Coke2.png");
        item7Btn.setIcon(icon7);
        item7Btn.setBorder(createBorder());

        // coffee button
        item8Btn = new JButton();
        item8Btn.setToolTipText("Coffee");
        item8Btn.setPreferredSize(new Dimension(122, 100));
        icon8 = new ImageIcon("icons/Coffee.png");
        item8Btn.setIcon(icon8);
        item8Btn.setBorder(createBorder());

        itemsBtnPanel.add(item1Btn);
        itemsBtnPanel.add(item2Btn);
        itemsBtnPanel.add(item3Btn);
        itemsBtnPanel.add(item4Btn);
        itemsBtnPanel.add(item5Btn);
        itemsBtnPanel.add(item6Btn);

        // create itemsLblPanel for items label
        itemsLblPanel = new JPanel(new GridLayout(1,8));

        // ricotta label
        item1Lbl = new JLabel("Ricotta Cheese");
        item1Lbl.setHorizontalAlignment(JLabel.CENTER);
        item1Lbl.setPreferredSize(new Dimension(122, 30));
        item1Lbl.setBorder(createBorder());

        // pepperoni label
        item2Lbl = new JLabel("Pepperoni");
        item2Lbl.setHorizontalAlignment(JLabel.CENTER);
        item2Lbl.setPreferredSize(new Dimension(122, 30));
        item2Lbl.setBorder(createBorder());

        // bacon label
        item3Lbl = new JLabel("Bacon");
        item3Lbl.setHorizontalAlignment(JLabel.CENTER);
        item3Lbl.setPreferredSize(new Dimension(122, 30));
        item3Lbl.setBorder(createBorder());

        // mozza label
        item4Lbl = new JLabel("Mozza Cheese");
        item4Lbl.setHorizontalAlignment(JLabel.CENTER);
        item4Lbl.setPreferredSize(new Dimension(122, 30));
        item4Lbl.setBorder(createBorder());

        // parm label
        item5Lbl = new JLabel("Parm Cheese");
        item5Lbl.setHorizontalAlignment(JLabel.CENTER);
        item5Lbl.setPreferredSize(new Dimension(122, 30));
        item5Lbl.setBorder(createBorder());

        // water label
        item6Lbl = new JLabel("Water");
        item6Lbl.setHorizontalAlignment(JLabel.CENTER);
        item6Lbl.setPreferredSize(new Dimension(122, 30));
        item6Lbl.setBorder(createBorder());

        // coke label
        item7Lbl = new JLabel("Coca-Cola");
        item7Lbl.setHorizontalAlignment(JLabel.CENTER);
        item7Lbl.setPreferredSize(new Dimension(122, 30));
        item7Lbl.setBorder(createBorder());

        // coffee label
        item8Lbl = new JLabel("Coffee");
        item8Lbl.setHorizontalAlignment(JLabel.CENTER);
        item8Lbl.setPreferredSize(new Dimension(122, 30));
        item8Lbl.setBorder(createBorder());

        itemsLblPanel.add(item1Lbl);
        itemsLblPanel.add(item2Lbl);
        itemsLblPanel.add(item3Lbl);
        itemsLblPanel.add(item4Lbl);
        itemsLblPanel.add(item5Lbl);
        itemsLblPanel.add(item6Lbl);

        // create itemsPrcPanel panel for item prices
        itemsPrcPanel = new JPanel(new GridLayout(1, 8));

        // ricotta price
        item1Prc = new JLabel("\u20B175.00");
        item1Prc.setHorizontalAlignment(JLabel.CENTER);
        item1Prc.setPreferredSize(new Dimension(122, 30));
        item1Prc.setBorder(createBorder());

        // pepperoni price
        item2Prc = new JLabel("\u20B1120.00");
        item2Prc.setHorizontalAlignment(JLabel.CENTER);
        item2Prc.setPreferredSize(new Dimension(122, 30));
        item2Prc.setBorder(createBorder());

        // bacon label
        item3Prc = new JLabel("\u20B1150.00");
        item3Prc.setHorizontalAlignment(JLabel.CENTER);
        item3Prc.setPreferredSize(new Dimension(122, 30));
        item3Prc.setBorder(createBorder());

        // mozza price
        item4Prc = new JLabel("\u20B1100.00");
        item4Prc.setHorizontalAlignment(JLabel.CENTER);
        item4Prc.setPreferredSize(new Dimension(122, 30));
        item4Prc.setBorder(createBorder());

        // parm price
        item5Prc = new JLabel("\u20B190.00");
        item5Prc.setHorizontalAlignment(JLabel.CENTER);
        item5Prc.setPreferredSize(new Dimension(122, 30));
        item5Prc.setBorder(createBorder());

        // water price
        item6Prc = new JLabel("\u20B130.00");
        item6Prc.setHorizontalAlignment(JLabel.CENTER);
        item6Prc.setPreferredSize(new Dimension(122, 30));
        item6Prc.setBorder(createBorder());

        // coke price
        item7Prc = new JLabel("\u20B140.00");
        item7Prc.setHorizontalAlignment(JLabel.CENTER);
        item7Prc.setPreferredSize(new Dimension(122, 30));
        item7Prc.setBorder(createBorder());

        // coffee price
        item8Prc = new JLabel("\u20B135.00");
        item8Prc.setHorizontalAlignment(JLabel.CENTER);
        item8Prc.setPreferredSize(new Dimension(122, 30));
        item8Prc.setBorder(createBorder());

        itemsPrcPanel.add(item1Prc);
        itemsPrcPanel.add(item2Prc);
        itemsPrcPanel.add(item3Prc);
        itemsPrcPanel.add(item4Prc);
        itemsPrcPanel.add(item5Prc);
        itemsPrcPanel.add(item6Prc);

        // Customize Pizza label
        specialPanel = new JPanel(new GridLayout(1, 1)); // Panel with 1 row and 1 column
        sItemsLbl = new JLabel("Customize a Pizza");
        sItemsLbl.setHorizontalAlignment(JLabel.CENTER);
        sItemsLbl.setPreferredSize(new Dimension(732, 30));
        specialPanel.add(sItemsLbl); // Add the label to the titlePanel
        sItemsLbl.setBorder(createBorder());

        // pizza panel
        pizzaPanel = new JPanel(new GridLayout(1,1));

        // pizza button
        pizzaBtn = new JButton();
        pizzaBtn.setToolTipText("Pizza");
        pizzaBtn.setPreferredSize(new Dimension(732, 150));
        ImageIcon pizzaIcon = new ImageIcon("icons/Pizza.png");
        pizzaBtn.setIcon(pizzaIcon);
        pizzaBtn.setBorder(createBorder());

        pizzaPanel.add(pizzaBtn);

        // crust title panel
        crustTtlPanel = new JPanel(new GridLayout(1,1));
        crustLbl = new JLabel("Pizza Crust");
        crustLbl.setFont(new Font("Arial", Font.BOLD, 22));
        crustLbl.setHorizontalAlignment(JLabel.CENTER);
        crustLbl.setPreferredSize(new Dimension(732, 30));
        crustTtlPanel.add(crustLbl); // Add the label to the titlePanel
        crustLbl.setBorder(createBorder());

        // crust buttons panel
        crustPanel = new JPanel(new GridLayout(1,3));

        // thin crust
        thinCBtn = new JButton();
        thinCBtn.setToolTipText("Thin Crust");
        thinCBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon crust1Icon = new ImageIcon("icons/Thin.png");
        thinCBtn.setIcon(crust1Icon);
        thinCBtn.setBorder(createBorder());

        // thick crust
        thickCBtn = new JButton();
        thickCBtn.setToolTipText("Thick Crust");
        thickCBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon crust2Icon = new ImageIcon("icons/Thick.png");
        thickCBtn.setIcon(crust2Icon);
        thickCBtn.setBorder(createBorder());

        // gluten-free crust
        gfCBtn = new JButton();
        gfCBtn.setToolTipText("Gluten-free Crust");
        gfCBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon crust3Icon = new ImageIcon("icons/GF.png");
        gfCBtn.setIcon(crust3Icon);
        gfCBtn.setBorder(createBorder());

        crustPanel.add(thinCBtn);
        crustPanel.add(thickCBtn);
        crustPanel.add(gfCBtn);

        // crust prices panel
        crustPrcPanel = new JPanel(new GridLayout(1, 3));
        thinCPrc = new JLabel("\u20B130.00");
        thinCPrc.setHorizontalAlignment(JLabel.CENTER);
        thinCPrc.setPreferredSize(new Dimension(244, 30));
        thinCPrc.setBorder(createBorder());

        // thick crust price
        thickCPrc = new JLabel("\u20B130.00");
        thickCPrc.setHorizontalAlignment(JLabel.CENTER);
        thickCPrc.setPreferredSize(new Dimension(244, 30));
        thickCPrc.setBorder(createBorder());

        // gluten-free price
        gfCPrc = new JLabel("\u20B195.00");
        gfCPrc.setHorizontalAlignment(JLabel.CENTER);
        gfCPrc.setPreferredSize(new Dimension(244, 30));
        gfCPrc.setBorder(createBorder());

        crustPrcPanel.add(thinCPrc);
        crustPrcPanel.add(thickCPrc);
        crustPrcPanel.add(gfCPrc);

        // crust lavel panel
        crustLblPanel = new JPanel(new GridLayout(1,3));

        // thin crust label
        thinCLbl = new JLabel("Thin Crust");
        thinCLbl.setHorizontalAlignment(JLabel.CENTER);
        thinCLbl.setPreferredSize(new Dimension(244, 30));
        thinCLbl.setBorder(createBorder());

        // thick crust label
        thickCLbl = new JLabel("Thick Crust");
        thickCLbl.setHorizontalAlignment(JLabel.CENTER);
        thickCLbl.setPreferredSize(new Dimension(244, 30));
        thickCLbl.setBorder(createBorder());

        // gluten-free crust label
        gfCLbl = new JLabel("Gluten-free Crust");
        gfCLbl.setHorizontalAlignment(JLabel.CENTER);
        gfCLbl.setPreferredSize(new Dimension(244, 30));
        gfCLbl.setBorder(createBorder());

        crustLblPanel.add(thinCLbl);
        crustLblPanel.add(thickCLbl);
        crustLblPanel.add(gfCLbl);

        // cheese title panel
        cheeseTtlPanel = new JPanel(new GridLayout(1, 1));

        // cheese label
        cheeseLbl = new JLabel("Cheese");
        cheeseLbl.setFont(new Font("Arial", Font.BOLD, 22));
        cheeseLbl.setHorizontalAlignment(JLabel.CENTER);
        cheeseLbl.setPreferredSize(new Dimension(732, 30));
        cheeseTtlPanel.add(cheeseLbl);
        cheeseLbl.setBorder(createBorder());

        // cheese buttons panel
        cheesePanel = new JPanel(new GridLayout(1,3));

        // mozzarella cheese button
        mozzaBtn = new JButton();
        mozzaBtn.setToolTipText("Mozzarella Cheese");
        mozzaBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon cheese1Icon = new ImageIcon("icons/Mozza2.png");
        mozzaBtn.setIcon(cheese1Icon);
        mozzaBtn.setBorder(createBorder());

        // parmesan cheese button
        parmBtn = new JButton();
        parmBtn.setToolTipText("Parmesan");
        parmBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon cheese2Icon = new ImageIcon("icons/Parm2.png");
        parmBtn.setIcon(cheese2Icon);
        parmBtn.setBorder(createBorder());

        // ricotta cheese button
        ricottaBtn = new JButton();
        ricottaBtn.setToolTipText("Ricotta Cheese");
        ricottaBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon cheese3Icon = new ImageIcon("icons/Ricotta2.png");
        ricottaBtn.setIcon(cheese3Icon);
        ricottaBtn.setBorder(createBorder());

        cheesePanel.add(mozzaBtn);
        cheesePanel.add(parmBtn);
        cheesePanel.add(ricottaBtn);

        // cheese price panel
        cheesePrcPanel = new JPanel(new GridLayout(1, 3));

        // mozza price
        mozzaPrc = new JLabel("\u20B155.00");
        mozzaPrc.setHorizontalAlignment(JLabel.CENTER);
        mozzaPrc.setPreferredSize(new Dimension(244, 30));
        mozzaPrc.setBorder(createBorder());

        // parm price
        parmPrc = new JLabel("\u20B150.00");
        parmPrc.setHorizontalAlignment(JLabel.CENTER);
        parmPrc.setPreferredSize(new Dimension(244, 30));
        parmPrc.setBorder(createBorder());

        // ricotta price
        ricottaPrc = new JLabel("\u20B150.00");
        ricottaPrc.setHorizontalAlignment(JLabel.CENTER);
        ricottaPrc.setPreferredSize(new Dimension(244, 30));
        ricottaPrc.setBorder(createBorder());

        cheesePrcPanel.add(mozzaPrc);
        cheesePrcPanel.add(parmPrc);
        cheesePrcPanel.add(ricottaPrc);

        // cheese label panel
        cheeseLblPanel = new JPanel(new GridLayout(1,3));

        // mozza label
        mozzaLbl = new JLabel("Mozzarella");
        mozzaLbl.setHorizontalAlignment(JLabel.CENTER);
        mozzaLbl.setPreferredSize(new Dimension(244, 30));
        mozzaLbl.setBorder(createBorder());

        // parmesan label
        parmLbl = new JLabel("Parmesan");
        parmLbl.setHorizontalAlignment(JLabel.CENTER);
        parmLbl.setPreferredSize(new Dimension(244, 30));
        parmLbl.setBorder(createBorder());

        // ricotta label
        ricottaLbl = new JLabel("Ricotta Cheese");
        ricottaLbl.setHorizontalAlignment(JLabel.CENTER);
        ricottaLbl.setPreferredSize(new Dimension(244, 30));
        ricottaLbl.setBorder(createBorder());

        cheeseLblPanel.add(mozzaLbl);
        cheeseLblPanel.add(parmLbl);
        cheeseLblPanel.add(ricottaLbl);

        // veggies title panel
        veggiesTtlPanel = new JPanel(new GridLayout(1, 1));

        // veggies label panel
        veggiesLbl = new JLabel("Veggies");
        veggiesLbl.setFont(new Font("Arial", Font.BOLD, 22));
        veggiesLbl.setHorizontalAlignment(JLabel.CENTER);
        veggiesLbl.setPreferredSize(new Dimension(732, 30));
        veggiesTtlPanel.add(veggiesLbl);
        veggiesLbl.setBorder(createBorder());

        // veggies button panel
        veggiesPanel = new JPanel(new GridLayout(1, 3));

        // bell peppers button
        bpBtn = new JButton();
        bpBtn.setToolTipText("Bell Peppers");
        bpBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon veggie1Icon = new ImageIcon("icons/BellPeppers.png");
        bpBtn.setIcon(veggie1Icon);
        bpBtn.setBorder(createBorder());

        // onions peppers button
        mushroomBtn = new JButton();
        mushroomBtn.setToolTipText("Mushroom");
        mushroomBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon veggie2Icon = new ImageIcon("icons/Mushroom.png");
        mushroomBtn.setIcon(veggie2Icon);
        mushroomBtn.setBorder(createBorder());

        // olives peppers button
        olivesBtn = new JButton();
        olivesBtn.setToolTipText("Olives");
        olivesBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon veggie3Icon = new ImageIcon("icons/Olives.png");
        olivesBtn.setIcon(veggie3Icon);
        olivesBtn.setBorder(createBorder());

        veggiesPanel.add(bpBtn);
        veggiesPanel.add(mushroomBtn);
        veggiesPanel.add(olivesBtn);

        // veggies prices panel
        veggiesPrcPanel = new JPanel(new GridLayout(1, 3));

        // bell peppers price
        bpPrc = new JLabel("\u20B130.00");
        bpPrc.setHorizontalAlignment(JLabel.CENTER);
        bpPrc.setPreferredSize(new Dimension(244, 30));
        bpPrc.setBorder(createBorder());

        // mushroom price
        mushroomPrc = new JLabel("\u20B160.00");
        mushroomPrc.setHorizontalAlignment(JLabel.CENTER);
        mushroomPrc.setPreferredSize(new Dimension(244, 30));
        mushroomPrc.setBorder(createBorder());

        // olives price
        olivesPrc = new JLabel("\u20B140.00");
        olivesPrc.setHorizontalAlignment(JLabel.CENTER);
        olivesPrc.setPreferredSize(new Dimension(244, 30));
        olivesPrc.setBorder(createBorder());

        veggiesPrcPanel.add(bpPrc);
        veggiesPrcPanel.add(mushroomPrc);
        veggiesPrcPanel.add(olivesPrc);

        // veggies label panel
        veggiesLblPanel = new JPanel(new GridLayout(1, 3));

        // bell peppers label
        bpLbl = new JLabel("Bell Peppers");
        bpLbl.setHorizontalAlignment(JLabel.CENTER);
        bpLbl.setPreferredSize(new Dimension(244, 30));
        bpLbl.setBorder(createBorder());

        // mushroom label
        mushroomLbl = new JLabel("Mushroom");
        mushroomLbl.setHorizontalAlignment(JLabel.CENTER);
        mushroomLbl.setPreferredSize(new Dimension(244, 30));
        mushroomLbl.setBorder(createBorder());

        // olives label
        olivesLbl = new JLabel("Olives");
        olivesLbl.setHorizontalAlignment(JLabel.CENTER);
        olivesLbl.setPreferredSize(new Dimension(244, 30));
        olivesLbl.setBorder(createBorder());

        veggiesLblPanel.add(bpLbl);
        veggiesLblPanel.add(mushroomLbl);
        veggiesLblPanel.add(olivesLbl);

        // meat title panel
        meatTtlPanel = new JPanel(new GridLayout(1, 1));

        // meat label panel
        meatLbl = new JLabel("Meat");
        meatLbl.setFont(new Font("Arial", Font.BOLD, 22));
        meatLbl.setHorizontalAlignment(JLabel.CENTER);
        meatLbl.setPreferredSize(new Dimension(732, 30));
        meatTtlPanel.add(meatLbl);
        meatLbl.setBorder(createBorder());

        // meat button button
        meatPanel = new JPanel(new GridLayout(1, 3));

        // pepperoni button
        pepperoniBtn = new JButton();
        pepperoniBtn.setToolTipText("Pepperoni");
        pepperoniBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon meat1Icon = new ImageIcon("icons/Pepperoni.png");
        pepperoniBtn.setIcon(meat1Icon);
        pepperoniBtn.setBorder(createBorder());

        // bacon button
        baconBtn = new JButton();
        baconBtn.setToolTipText("Bacon");
        baconBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon meat2Icon = new ImageIcon("icons/Bacon2.png");
        baconBtn.setIcon(meat2Icon);
        baconBtn.setBorder(createBorder());

        // chicken button
        chickenBtn = new JButton();
        chickenBtn.setToolTipText("All-Natural Chicken");
        chickenBtn.setPreferredSize(new Dimension(244, 100));
        ImageIcon meat3Icon = new ImageIcon("icons/Chicken.png");
        chickenBtn.setIcon(meat3Icon);
        chickenBtn.setBorder(createBorder());

        meatPanel.add(pepperoniBtn);
        meatPanel.add(baconBtn);
        meatPanel.add(chickenBtn);

        // meat prices panel
        meatPrcPanel = new JPanel(new GridLayout(1, 3));

        // pepperoni price
        pepperoniPrc = new JLabel("\u20B170.00");
        pepperoniPrc.setHorizontalAlignment(JLabel.CENTER);
        pepperoniPrc.setPreferredSize(new Dimension(244, 30));
        pepperoniPrc.setBorder(createBorder());

        // bacon price
        baconPrc = new JLabel("\u20B1150.00");
        baconPrc.setHorizontalAlignment(JLabel.CENTER);
        baconPrc.setPreferredSize(new Dimension(244, 30));
        baconPrc.setBorder(createBorder());
        
        // chicken price
        chickenPrc = new JLabel("\u20B150.00");
        chickenPrc.setHorizontalAlignment(JLabel.CENTER);
        chickenPrc.setPreferredSize(new Dimension(244, 30));
        chickenPrc.setBorder(createBorder());

        meatPrcPanel.add(pepperoniPrc);
        meatPrcPanel.add(baconPrc);
        meatPrcPanel.add(chickenPrc);

        // meat label panel
        meatLblPanel = new JPanel(new GridLayout(1, 3));

        // pepperoni label
        pepperoniLbl = new JLabel("Pepperoni");
        pepperoniLbl.setHorizontalAlignment(JLabel.CENTER);
        pepperoniLbl.setPreferredSize(new Dimension(244, 30));
        pepperoniLbl.setBorder(createBorder());

        // bacon label
        baconLbl = new JLabel("Bacon");
        baconLbl.setHorizontalAlignment(JLabel.CENTER);
        baconLbl.setPreferredSize(new Dimension(244, 30));
        baconLbl.setBorder(createBorder());

        //chicken label
        chickenLbl = new JLabel("All-Natural Chicken");
        chickenLbl.setHorizontalAlignment(JLabel.CENTER);
        chickenLbl.setPreferredSize(new Dimension(244, 30));
        chickenLbl.setBorder(createBorder());

        meatLblPanel.add(pepperoniLbl);
        meatLblPanel.add(baconLbl);
        meatLblPanel.add(chickenLbl);

        //input textfield
        JPanel inputPanel = new JPanel(new GridLayout(1,1));
        inputTf = new JTextField();
        inputTf.setColumns(400);
        inputTf.setEditable(false);

        inputPanel.add(inputTf);

        // choicesPanel for choices buttons
        JPanel choicesPanel = new JPanel(new GridLayout(3,3));

        // 1 button
        oBtn = new JButton("1");
        oBtn.setToolTipText("1");

        // 2 button
        twBtn = new JButton("2");
        twBtn.setToolTipText("2");

        // 3 button
        thBtn = new JButton("3");
        thBtn.setToolTipText("3");

        // 4 button
        frBtn = new JButton("4");
        frBtn.setToolTipText("4");

        // 5 button
        fvBtn = new JButton("5");
        fvBtn.setToolTipText("5");

        // 6 button
        sxBtn = new JButton("6");
        sxBtn.setToolTipText("6");

        // 7 button
        svBtn = new JButton("7");
        svBtn.setToolTipText("7");

        // 8 button
        ethBtn = new JButton("8");
        ethBtn.setToolTipText("8");

        // 9 button
        nnBtn = new JButton("9");
        nnBtn.setToolTipText("9");

        choicesPanel.add(oBtn);
        choicesPanel.add(twBtn);
        choicesPanel.add(thBtn);
        choicesPanel.add(frBtn);
        choicesPanel.add(fvBtn);
        choicesPanel.add(sxBtn);
        choicesPanel.add(svBtn);
        choicesPanel.add(ethBtn);
        choicesPanel.add(nnBtn);

        zBtnPanel = new JPanel(new GridLayout(1, 1));
        zBtn = new JButton("0");
        zBtn.setToolTipText("0");
        zBtnPanel.add(zBtn);

        // keypad panel
        keypadControlsPanel = new JPanel(new GridLayout(1,4));

        // confirm button
        confirmBtn = new JButton("Confirm");
        confirmBtn.setToolTipText("Confirm");

        //  control buttons
        // clear button
        clearBtn = new JButton("Clear");
        clearBtn.setToolTipText("Clear");

        // exit button
        exitBtn = new JButton("Exit");
        exitBtn.setToolTipText("Exit");

        // back button
        backBtn = new JButton("Back");
        backBtn.setToolTipText("Back");

        keypadControlsPanel.add(confirmBtn);
        keypadControlsPanel.add(clearBtn);
        keypadControlsPanel.add(exitBtn);
        keypadControlsPanel.add(backBtn);

        // insertPanel for inserted coins
        insertPanel = new JPanel(new GridLayout(1,2));

        // inserted coins label
        insertedCoinsLbl = new JLabel("Inserted Coins : ");
        insertedCoinsLbl.setHorizontalAlignment(JLabel.LEFT);
        insertedCoinsLbl.setPreferredSize(new Dimension(150, 30));

        // inserted coins textfield
        insertedCoinsTf = new JTextField();
        insertedCoinsTf.setEditable(false);
        insertedCoinsTf.setColumns(20);

        insertPanel.add(insertedCoinsLbl);
        insertPanel.add(insertedCoinsTf);

         //changePanel for change
        changePanel = new JPanel(new GridLayout(1,2));

        // change label
        changeLbl = new JLabel("Change : ");
        changeLbl.setHorizontalAlignment(JLabel.LEFT);
        changeLbl.setPreferredSize(new Dimension(150, 30));

        // change textfield
        changeTf = new JTextField();
        changeTf.setEditable(false);
        changeTf.setColumns(20);
        
        changePanel.add(changeLbl);
        changePanel.add(changeTf);
        
        // denomination button for denomination buttons
        denominationPanel = new JPanel(new GridLayout(1,9));

        // 1 button
        oneBtn = new JButton("1");
        oneBtn.setToolTipText("1");

        // 5 button
        fiveBtn = new JButton("5");
        fiveBtn.setToolTipText("5");

        // 10 button
        tenBtn = new JButton("10");
        tenBtn.setToolTipText("10");

        // 20 button
        twentyBtn = new JButton("20");
        twentyBtn.setToolTipText("20");

        // 50 button
        fiftyBtn = new JButton("50");
        fiftyBtn.setToolTipText("50");

        // 100 button
        oneHndBtn = new JButton("100");
        oneHndBtn.setToolTipText("100");

        // 200 button
        twoHndBtn = new JButton("200");
        twoHndBtn.setToolTipText("200");

        // 500 button
        fiveHndBtn = new JButton("500");
        fiveHndBtn.setToolTipText("500");

        // 1000 button
        oneThdBtn = new JButton("1000");
        oneThdBtn.setToolTipText("1000");

        denominationPanel.add(oneBtn);
        denominationPanel.add(fiveBtn);
        denominationPanel.add(tenBtn);
        denominationPanel.add(twentyBtn);
        denominationPanel.add(fiftyBtn);
        denominationPanel.add(oneHndBtn);
        denominationPanel.add(twoHndBtn);
        denominationPanel.add(fiveHndBtn);
        denominationPanel.add(oneThdBtn);

        // control buttons for coins
        controlBtnsPanel = new JPanel(new GridLayout(1,3));

        // purchase button
        purchaseBtn = new JButton("Purchase");
        purchaseBtn.setToolTipText("Purchase");

        // dispense8 button
        dispenseBtn = new JButton("Dispense");
        dispenseBtn.setToolTipText("Dispense");

        // clear button
        clrBtn = new JButton("Clear");
        clrBtn.setToolTipText("Clear");

        controlBtnsPanel.add(purchaseBtn);
        controlBtnsPanel.add(dispenseBtn);
        controlBtnsPanel.add(clrBtn);

        // add to mainPanel
        mainPanel.add(titlePanel);      // title "Vending Machine"
        mainPanel.add(itemsTtlPanel);   // label "Items"
        mainPanel.add(itemsBtnPanel);   // buttons of individual items
        mainPanel.add(itemsPrcPanel);   // items prices
        mainPanel.add(itemsLblPanel);   // label of items
        mainPanel.add(pizzaPanel);      // pizza button
        mainPanel.add(specialPanel);    // "Customize a Pizza"
        mainPanel.add(crustTtlPanel);   // "Select a Crust"
        mainPanel.add(crustPanel);      // crust buttons
        mainPanel.add(crustPrcPanel);   // crust prices
        mainPanel.add(crustLblPanel);   // crust labels
        mainPanel.add(cheeseTtlPanel);  // cheese title
        mainPanel.add(cheesePanel);     // cheese buttons
        mainPanel.add(cheesePrcPanel);  // cheese prices
        mainPanel.add(cheeseLblPanel);  // cheese label
        mainPanel.add(veggiesTtlPanel); // veggies title
        mainPanel.add(veggiesPanel);    // veggies buttons
        mainPanel.add(veggiesPrcPanel); // veggies prices
        mainPanel.add(veggiesLblPanel); // veggies label
        mainPanel.add(meatTtlPanel);    // meat title
        mainPanel.add(meatPanel);       // meat buttons
        mainPanel.add(meatPrcPanel);    // meat prices
        mainPanel.add(meatLblPanel);    // meat label

        // control frame
        controlPanel.add(displayPanel); // display area
        controlPanel.add(inputPanel);   // input textfield
        controlPanel.add(choicesPanel); // number buttons
        controlPanel.add(zBtnPanel);    // 0 button
        controlPanel.add(keypadControlsPanel);  // controls
        
        //coins panel
        coinsPanel.add(insertPanel);    // insert label and textfield
        coinsPanel.add(changePanel);    // change label and textfield
        coinsPanel.add(denominationPanel);  // denomination buttons
        coinsPanel.add(controlBtnsPanel); // control buttons

        // set visibility
        mainFrame.setVisible(false);
        controlFrame.setVisible(true);
        coinsFrame.setVisible(false);

        // individual items
        itemsTtlPanel.setVisible(false);
        itemsBtnPanel.setVisible(false);
        itemsPrcPanel.setVisible(false);
        itemsLblPanel.setVisible(false);

        // custom items
        specialPanel.setVisible(false);
        pizzaPanel.setVisible(false);
        crustTtlPanel.setVisible(false);
        crustPanel.setVisible(false);
        crustPrcPanel.setVisible(false);
        crustLblPanel.setVisible(false);
        cheeseTtlPanel.setVisible(false);
        cheesePanel.setVisible(false);
        cheesePrcPanel.setVisible(false);
        cheeseLblPanel.setVisible(false);
        veggiesTtlPanel.setVisible(false);
        veggiesPanel.setVisible(false);
        veggiesPrcPanel.setVisible(false);
        veggiesLblPanel.setVisible(false);
        meatTtlPanel.setVisible(false);
        meatPanel.setVisible(false);
        meatPrcPanel.setVisible(false);
        meatLblPanel.setVisible(false);
    }

    /**
     * Removes the previously added item panels from the items button, price, and label panels in the vending machine's UI.
     * This method is used to reset the items panel to its default state before updating it with new items.
     */
    public void removeAddedPanels() {
        // Remove previously added item components from the items panels
        itemsBtnPanel.remove(item7Btn);
        itemsPrcPanel.remove(item7Prc);
        itemsLblPanel.remove(item7Lbl);

        itemsBtnPanel.remove(item8Btn);
        itemsPrcPanel.remove(item8Prc);
        itemsLblPanel.remove(item8Lbl);

        // Revalidate and repaint the items panels for changes to take effect
        itemsBtnPanel.revalidate();
        itemsBtnPanel.repaint();
        itemsPrcPanel.revalidate();
        itemsPrcPanel.repaint();
        itemsLblPanel.revalidate();
        itemsLblPanel.repaint();

        // Revalidate and repaint the main frame and main panel for changes to take effect
        mainFrame.revalidate();
        mainFrame.repaint();
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    /**
     * Updates the price label for a specific item slot in the vending machine's UI.
     *
     * @param itemPrice The new price of the item for the specified slot.
     * @param slotNumber The slot number for which the price label needs to be updated.
     */
    public void updatePriceLabel(double itemPrice, int slotNumber) {
        // Convert the itemPrice to a formatted string with currency symbol
        String itemPriceStr = String.valueOf(itemPrice);
        itemPriceStr = "\u20B1" + itemPriceStr + "0";

        // Update the price label based on the slot number
        if (slotNumber == 0) {
            item1Prc.setText(itemPriceStr);
        } else if (slotNumber == 1) {
            item2Prc.setText(itemPriceStr);
        } else if (slotNumber == 3) {
            item3Prc.setText(itemPriceStr);
        } else if (slotNumber == 4) {
            item4Prc.setText(itemPriceStr);
        } else if (slotNumber == 5) {
            item5Prc.setText(itemPriceStr);
        } else if (slotNumber == 6) {
            item6Prc.setText(itemPriceStr);
        } else if (slotNumber == 7) {
            item7Prc.setText(itemPriceStr);
        } else if (slotNumber == 8) {
            item8Prc.setText(itemPriceStr);
        }

        // Revalidate and repaint the items price panel for changes to take effect
        itemsPrcPanel.revalidate();
        itemsPrcPanel.repaint();
    }


    /**
     * Retrieves the main JFrame of the vending machine.
     *
     * @return The main JFrame representing the vending machine's user interface.
     */
    public JFrame getMainFrame() {
        return mainFrame;
    }

    /**
     * Sets the visibility of the items panels in the main frame of the vending machine.
     *
     * @param isVisible If {@code true}, the items panels will be set to visible. If {@code false}, they will be hidden.
     */
    public void setItemsPanelVisible(boolean isVisible) {
        // Adjust the size and visibility of the main frame and items panels
        mainFrame.setSize(1000, 400);
        mainPanel.setPreferredSize(new Dimension(1000, 200));

        mainFrame.setVisible(isVisible);
        itemsTtlPanel.setVisible(isVisible);
        itemsBtnPanel.setVisible(isVisible);
        itemsPrcPanel.setVisible(isVisible);
        itemsLblPanel.setVisible(isVisible);

        // Revalidate and repaint the components for changes to take effect
        mainFrame.revalidate();
        mainFrame.repaint();
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    /**
     * Sets the visibility of the special panels in the main frame of the vending machine.
     *
     * @param isVisible If {@code true}, the special panels will be set to visible. If {@code false}, they will be hidden.
     */
    public void setSpecialPanelVisible(boolean isVisible) {
        // Adjust the visibility and size of the main frame, items panels, and special panels
        mainFrame.setVisible(isVisible);
        itemsTtlPanel.setVisible(isVisible);
        itemsBtnPanel.setVisible(isVisible);
        itemsPrcPanel.setVisible(isVisible);
        itemsLblPanel.setVisible(isVisible);

        mainFrame.setSize(1000, 800);
        mainPanel.setPreferredSize(new Dimension(1000, 400));
        specialPanel.setVisible(isVisible);
        pizzaPanel.setVisible(isVisible);

        // Revalidate and repaint the components for changes to take effect
        mainFrame.revalidate();
        mainFrame.repaint();
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    /**
     * Sets the visibility of the custom panels in the main frame of the vending machine.
     *
     * @param isVisible If {@code true}, the custom panels will be set to visible. If {@code false}, they will be hidden.
     */
    public void setCustomPanelVisible(boolean isVisible) {
        // Adjust the visibility of the main frame and custom panels
        mainFrame.setVisible(isVisible);

        crustTtlPanel.setVisible(isVisible);
        crustPanel.setVisible(isVisible);
        crustPrcPanel.setVisible(isVisible);
        crustLblPanel.setVisible(isVisible);

        cheeseTtlPanel.setVisible(isVisible);
        cheesePanel.setVisible(isVisible);
        cheesePrcPanel.setVisible(isVisible);
        cheeseLblPanel.setVisible(isVisible);

        veggiesTtlPanel.setVisible(isVisible);
        veggiesPanel.setVisible(isVisible);
        veggiesPrcPanel.setVisible(isVisible);
        veggiesLblPanel.setVisible(isVisible);

        meatTtlPanel.setVisible(isVisible);
        meatPanel.setVisible(isVisible);
        meatPrcPanel.setVisible(isVisible);
        meatLblPanel.setVisible(isVisible);
    }

    /**
     * Updates the items panel to display the "Coke" item.
     * This method adds the "Coke" item's components to the items panels.
     */
    public void updateCokeItem() {
        itemsBtnPanel.add(item7Btn);
        itemsPrcPanel.add(item7Prc);
        itemsLblPanel.add(item7Lbl);

        // Revalidate and repaint the components for changes to take effect
        itemsBtnPanel.revalidate();
        itemsBtnPanel.repaint();
        itemsPrcPanel.revalidate();
        itemsPrcPanel.repaint();
        itemsLblPanel.revalidate();
        itemsLblPanel.repaint();

        mainFrame.revalidate();
        mainFrame.repaint();
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    /**
     * Updates the items panel to display the "Coffee" item.
     * This method adds the "Coffee" item's components to the items panels.
     */
    public void updateCoffeeItem() {
        itemsBtnPanel.add(item8Btn);
        itemsPrcPanel.add(item8Prc);
        itemsLblPanel.add(item8Lbl);

        // Revalidate and repaint the components for changes to take effect
        itemsBtnPanel.revalidate();
        itemsBtnPanel.repaint();
        itemsPrcPanel.revalidate();
        itemsPrcPanel.repaint();
        itemsLblPanel.revalidate();
        itemsLblPanel.repaint();

        mainFrame.revalidate();
        mainFrame.repaint();
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    /**
     * Sets the visibility of the crust panels in the custom panel of the vending machine.
     *
     * @param isVisible If {@code true}, the crust panels will be set to visible. If {@code false}, they will be hidden.
     */
    public void setCrustPanelVisible(boolean isVisible) {
        crustTtlPanel.setVisible(isVisible);
        crustPanel.setVisible(isVisible);
        crustPrcPanel.setVisible(isVisible);
        crustLblPanel.setVisible(isVisible);
    }

    /**
     * Sets the visibility of the cheese panels in the custom panel of the vending machine.
     *
     * @param isVisible If {@code true}, the cheese panels will be set to visible. If {@code false}, they will be hidden.
     */
    public void setCheesePanelVisible(boolean isVisible) {
        cheeseTtlPanel.setVisible(isVisible);
        cheesePanel.setVisible(isVisible);
        cheesePrcPanel.setVisible(isVisible);
        cheeseLblPanel.setVisible(isVisible);
    }

    /**
     * Sets the visibility of the veggies panels in the custom panel of the vending machine.
     *
     * @param isVisible If {@code true}, the veggies panels will be set to visible. If {@code false}, they will be hidden.
     */
    public void setVeggiesPanelVisible(boolean isVisible) {
        veggiesTtlPanel.setVisible(isVisible);
        veggiesPanel.setVisible(isVisible);
        veggiesPrcPanel.setVisible(isVisible);
        veggiesLblPanel.setVisible(isVisible);
    }

    /**
     * Sets the visibility of the meat panels in the custom panel of the vending machine.
     *
     * @param isVisible If {@code true}, the meat panels will be set to visible. If {@code false}, they will be hidden.
     */
    public void setMeatPanelVisible(boolean isVisible) {
        meatTtlPanel.setVisible(isVisible);
        meatPanel.setVisible(isVisible);
        meatPrcPanel.setVisible(isVisible);
        meatLblPanel.setVisible(isVisible);
    }

    

    /**
     * Sets the visibility of the coinsFrame.
     *
     * @param isVisible If {@code true}, the coinsFrame will be set to visible. If {@code false}, it will be hidden.
     */
    public void setCoinsFrameVisible(boolean isVisible) {
        coinsFrame.setVisible(isVisible);
    }

    /**
     * Sets an ActionListener for the 'item1Btn' button, representing the selection of the first item.
     *
     * @param actn The ActionListener to be set for the 'item1Btn' button.
     */
    public void setItem1BtnListener(ActionListener actn) {
        item1Btn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'item2Btn' button, representing the selection of the second item.
     *
     * @param actn The ActionListener to be set for the 'item2Btn' button.
     */
    public void setItem2BtnListener(ActionListener actn) {
        item2Btn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'item3Btn' button, representing the selection of the third item.
     *
     * @param actn The ActionListener to be set for the 'item3Btn' button.
     */
    public void setItem3BtnListener(ActionListener actn) {
        item3Btn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'item4Btn' button, representing the selection of the fourth item.
     *
     * @param actn The ActionListener to be set for the 'item4Btn' button.
     */
    public void setItem4BtnListener(ActionListener actn) {
        item4Btn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'item5Btn' button, representing the selection of the fifth item.
     *
     * @param actn The ActionListener to be set for the 'item5Btn' button.
     */
    public void setItem5BtnListener(ActionListener actn) {
        item5Btn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'item6Btn' button, representing the selection of the sixth item.
     *
     * @param actn The ActionListener to be set for the 'item6Btn' button.
     */
    public void setItem6BtnListener(ActionListener actn) {
        item6Btn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'item7Btn' button, representing the selection of the seventh item.
     *
     * @param actn The ActionListener to be set for the 'item7Btn' button.
     */
    public void setItem7BtnListener(ActionListener actn) {
        item7Btn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'item8Btn' button, representing the selection of the eighth item.
     *
     * @param actn The ActionListener to be set for the 'item8Btn' button.
     */
    public void setItem8BtnListener(ActionListener actn) {
        item8Btn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'pizzaBtn' button, representing the selection of pizza.
     *
     * @param actn The ActionListener to be set for the 'pizzaBtn' button.
     */
    public void setPizzaBtnListener(ActionListener actn) {
        pizzaBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'thinCBtn' button, representing the selection of thin crust.
     *
     * @param actn The ActionListener to be set for the 'thinCBtn' button.
     */
    public void setThinCBtnListener(ActionListener actn) {
        thinCBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'thickCBtn' button, representing the selection of thick crust.
     *
     * @param actn The ActionListener to be set for the 'thickCBtn' button.
     */
    public void setsThickCBtnListener(ActionListener actn) {
        thickCBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'gfCBtn' button, representing the selection of gluten-free crust.
     *
     * @param actn The ActionListener to be set for the 'gfCBtn' button.
     */
    public void setgfCBtnListener(ActionListener actn) {
        gfCBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'mozzaBtn' button, representing the selection of mozzarella cheese.
     *
     * @param actn The ActionListener to be set for the 'mozzaBtn' button.
     */
    public void setsMozzaBtnListener(ActionListener actn) {
        mozzaBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'parmBtn' button, representing the selection of parmesan cheese.
     *
     * @param actn The ActionListener to be set for the 'parmBtn' button.
     */
    public void setParmBtnListener(ActionListener actn) {
        parmBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'ricottaBtn' button, representing the selection of ricotta cheese.
     *
     * @param actn The ActionListener to be set for the 'ricottaBtn' button.
     */
    public void setRicottaBtnListener(ActionListener actn) {
        ricottaBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'bpBtn' button, representing the selection of bell peppers as a topping.
     *
     * @param actn The ActionListener to be set for the 'bpBtn' button.
     */
    public void setBPBtnListener(ActionListener actn) {
        bpBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'mushroomBtn' button, representing the selection of mushrooms as a topping.
     *
     * @param actn The ActionListener to be set for the 'mushroomBtn' button.
     */
    public void setMushroomBtnListener(ActionListener actn) {
        mushroomBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'olivesBtn' button, representing the selection of olives as a topping.
     *
     * @param actn The ActionListener to be set for the 'olivesBtn' button.
     */
    public void setOlivesBtnListener(ActionListener actn) {
        olivesBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'pepperoniBtn' button, representing the selection of pepperoni as a topping.
     *
     * @param actn The ActionListener to be set for the 'pepperoniBtn' button.
     */
    public void setPepperroniBtnListener(ActionListener actn) {
        pepperoniBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'baconBtn' button, representing the selection of bacon as a topping.
     *
     * @param actn The ActionListener to be set for the 'baconBtn' button.
     */
    public void setBaconBtnListener(ActionListener actn) {
        baconBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'chickenBtn' button, representing the selection of chicken as a topping.
     *
     * @param actn The ActionListener to be set for the 'chickenBtn' button.
     */
    public void setChickenBtnListener(ActionListener actn) {
        chickenBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'oneBtn' button, representing the selection of one unit of currency.
     *
     * @param actn The ActionListener to be set for the 'oneBtn' button.
     */
    public void setOneBtnListener(ActionListener actn) {
        oneBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'fiveBtn' button, representing the selection of five units of currency.
     *
     * @param actn The ActionListener to be set for the 'fiveBtn' button.
     */
    public void setFiveBtnListener(ActionListener actn) {
        fiveBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'tenBtn' button, representing the selection of ten units of currency.
     *
     * @param actn The ActionListener to be set for the 'tenBtn' button.
     */
    public void setTenBtnListener(ActionListener actn) {
        tenBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'twentyBtn' button, representing the selection of twenty units of currency.
     *
     * @param actn The ActionListener to be set for the 'twentyBtn' button.
     */
    public void setTwentyBtnListener(ActionListener actn) {
        twentyBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'fiftyBtn' button, representing the selection of fifty units of currency.
     *
     * @param actn The ActionListener to be set for the 'fiftyBtn' button.
     */
    public void setFiftyBtnListener(ActionListener actn) {
        fiftyBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'oneHndBtn' button, representing the selection of one hundred units of currency.
     *
     * @param actn The ActionListener to be set for the 'oneHndBtn' button.
     */
    public void setOneHndBtnListener(ActionListener actn) {
        oneHndBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'twoHndBtn' button, representing the selection of two hundred units of currency.
     *
     * @param actn The ActionListener to be set for the 'twoHndBtn' button.
     */
    public void setTwoHndBtnListener(ActionListener actn) {
        twoHndBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'fiveHndBtn' button, representing the selection of five hundred units of currency.
     *
     * @param actn The ActionListener to be set for the 'fiveHndBtn' button.
     */
    public void setFiveHndBtnListener(ActionListener actn) {
        fiveHndBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'oneThdBtn' button, representing the selection of one thousand units of currency.
     *
     * @param actn The ActionListener to be set for the 'oneThdBtn' button.
     */
    public void setOneTndBtnListener(ActionListener actn) {
        oneThdBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'purchaseBtn' button, representing the action to purchase selected items.
     *
     * @param actn The ActionListener to be set for the 'purchaseBtn' button.
     */
    public void setPurchaseBtnListener(ActionListener actn) {
        purchaseBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'dispenseBtn' button, representing the action to dispense purchased items.
     *
     * @param actn The ActionListener to be set for the 'dispenseBtn' button.
     */
    public void setDispenseBtnListener(ActionListener actn) {
        dispenseBtn.addActionListener(actn);
    }


    /**
     * Sets an ActionListener for the 'oBtn' (one) button.
     *
     * @param actn The ActionListener to be set for the 'oBtn' button.
     */
    public void setOBtnListener(ActionListener actn) {
        oBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'twBtn' (two) button.
     *
     * @param actn The ActionListener to be set for the 'twBtn' button.
     */
    public void setTwBtnListener(ActionListener actn) {
        twBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'thBtn' (three) button.
     *
     * @param actn The ActionListener to be set for the 'thBtn' button.
     */
    public void setThBtnListener(ActionListener actn) {
        thBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'frBtn' (four) button.
     *
     * @param actn The ActionListener to be set for the 'frBtn' button.
     */
    public void setFrBtnListener(ActionListener actn) {
        frBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'fvBtn' (five) button.
     *
     * @param actn The ActionListener to be set for the 'fvBtn' button.
     */
    public void setFvBtnListener(ActionListener actn) {
        fvBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'sxBtn' (six) button.
     *
     * @param actn The ActionListener to be set for the 'sxBtn' button.
     */
    public void setSxBtnListener(ActionListener actn) {
        sxBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'svBtn' (seven) button.
     *
     * @param actn The ActionListener to be set for the 'svBtn' button.
     */
    public void setSvBtnListener(ActionListener actn) {
        svBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'ethBtn' (eight) button.
     *
     * @param actn The ActionListener to be set for the 'ethBtn' button.
     */
    public void setEthBtnListener(ActionListener actn) {
        ethBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'nnBtn' (nine) button.
     *
     * @param actn The ActionListener to be set for the 'nnBtn' button.
     */
    public void setNnBtnListener(ActionListener actn) {
        nnBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'zBtn' (zero) button.
     *
     * @param actn The ActionListener to be set for the 'zBtn' button.
     */
    public void setZBtnListener(ActionListener actn) {
        zBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'clrBtn' (insert money clear) button.
     *
     * @param actn The ActionListener to be set for the 'clrBtn' button.
     */
    public void setClrBtnListener(ActionListener actn) {
        clrBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'confirmBtn' button.
     *
     * @param actn The ActionListener to be set for the 'confirmBtn' button.
     */
    public void setConfirmBtnListener(ActionListener actn) {
        confirmBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'exitBtn' button.
     *
     * @param actn The ActionListener to be set for the 'exitBtn' button.
     */
    public void setExitBtnListener(ActionListener actn) {
        exitBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'clearBtn' (clear button in keypad) button.
     *
     * @param actn The ActionListener to be set for the 'clearBtn' button.
     */
    public void setClearBtnListener(ActionListener actn) {
        clearBtn.addActionListener(actn);
    }

    /**
     * Sets an ActionListener for the 'backBtn' button.
     *
     * @param actn The ActionListener to be set for the 'backBtn' button.
     */
    public void setBackBtnListener(ActionListener actn) {
        backBtn.addActionListener(actn);
    }

    /**
     * Creates and returns a custom border with a gray line border and empty padding.
     *
     * @return The custom border with gray line border and empty padding.
     */
    public Border createBorder() {
        Border border = BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY), // Outer border (grid lines)
                BorderFactory.createEmptyBorder(5, 5, 5, 5) // Inner border (padding)
        );
        return border;
    }


    /**
     * Retrieves the text from the inputTf (input text field).
     *
     * @return The text content of the inputTf.
     */
    public String getInputTf() {
        return inputTf.getText();
    }

    /**
     * Sets the text of the inputTf (input text field).
     *
     * @param text The text to set in the inputTf.
     */
    public void setInputTf(String text) {
        inputTf.setText(text);
    }

    /**
     * Appends the given text to the current text in the inputTf (input text field).
     *
     * @param text The text to append to the inputTf.
     */
    public void appendInputTf(String text) {
        inputTf.setText(getInputTf() + text);
    }

    /**
     * Sets the text of the insertedCoinsTf (inserted coins text field).
     *
     * @param text The text to set in the insertedCoinsTf.
     */
    public void setInsertedCoinsTf(String text) {
        insertedCoinsTf.setText(text);
    }

    /**
     * Resets the insertedCoinsTf (inserted coins text field) to an empty state.
     */
    public void resetInsertedCoinsTf() {
        insertedCoinsTf.setText("");
    }

    /**
     * Sets the text of the changeTf (change text field).
     *
     * @param text The text to set in the changeTf.
     */
    public void setChangeTf(String text) {
        changeTf.setText(text);
    }

    /**
     * Resets the changeTf (change text field) to an empty state.
     */
    public void resetChangeTf() {
        changeTf.setText("");
    }

    /**
     * Resets the inputTf (input text field) to an empty state.
     */
    public void resetFields() {
        inputTf.setText("");
    }
}
