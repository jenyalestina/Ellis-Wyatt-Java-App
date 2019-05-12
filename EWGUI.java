import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/* This class creates and manages all aspects of the GUI.
 * There are three frames: mainframe, inputFrame, and showQuotesFrame. */

public class EWGUI {
  ArrayList<Quote> quotes = new ArrayList<Quote>();
  
  public EWGUI() {
    createMainframe();
  }
  
  /* creates the mainframe
   * which contains two buttons, "New Quote" and "Show Quotes" 
   * which respectively call createInputFrame() and createShowQuotesFrame() respectively */
  public void createMainframe() {
    JFrame mainframe = new JFrame("Ellis Wyatt Quote App");
    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // makes sure program ends when mainframe closes
    JPanel inframe = new JPanel();
    inframe.setLayout(new GridBagLayout());
    GridBagConstraints m = new GridBagConstraints();
    m.ipadx = 1;
    m.ipady = 1;
    
    JButton newQuoteButton = new JButton("New Quote"); 
    m.gridx = 0;
    m.gridy = 0;
    newQuoteButton.addActionListener(new ActionListener() {
      // anonymous inner class for the new quote ActionListener
      public void actionPerformed(ActionEvent event) {
        createInputFrame();
      }
    });
    inframe.add(newQuoteButton, m);
    
    JButton showQuotesButton = new JButton("Show Quotes");
    m.gridx = 0;
    m.gridy = 1;
    showQuotesButton.addActionListener(new ActionListener() {
      // anonymous inner class for the show quotes ActionListener
      public void actionPerformed(ActionEvent event) {
        createShowQuotesFrame();
      }
    });
    inframe.add(showQuotesButton, m);
    
    Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
    inframe.setBorder(border);
    
    mainframe.add(inframe);
    
    mainframe.setSize(300,200);
    mainframe.setVisible(true); // displays the mainframe
  }
  
  
  
  /* Creates the "Create New Quote" frame. 
   * called when the New Quote button is pressed on the mainframe
   * contains all input fields and labels
   * closes itself when the Submit button is pressed
   * */
  void createInputFrame() { 
    JTextField cName, cState, cCity, cZip, phone, email, wCity, wState, wZip, cost, deposit;
    JTextArea cAddress, wAddress, workScope;
    JLabel name, address1, city1, state1, zip1, p, e, address2, city2, state2, zip2, scope, costL, depositL;
    
    JFrame inputFrame = new JFrame("Create New Quote");
    inputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // closing this window does not exit the program
    
    JPanel clientInfo = new JPanel();
    clientInfo.setLayout(new GridBagLayout());
    GridBagConstraints g = new GridBagConstraints();
    g.ipadx = 1;
    g.ipady = 1;
    g.weightx = 0.1;
    g.weighty = 0.9;
    
    //declarations and placements of components for clientInfo panel
    name = new JLabel("Name ");
    g.gridx = 0;
    g.gridy = 0;
    g.fill = GridBagConstraints.NONE;
    clientInfo.add(name, g);
    cName = new JTextField();
    g.gridx = 1;
    g.gridy = 0;
    g.fill = GridBagConstraints.BOTH;
    clientInfo.add(cName, g);
    address1 = new JLabel("Address ");
    g.gridx = 0;
    g.gridy = 1;
    g.fill = GridBagConstraints.NONE;
    clientInfo.add(address1, g);
    cAddress = new JTextArea(3,10);
    g.gridx = 1;
    g.gridy = 1;
    g.fill = GridBagConstraints.HORIZONTAL;
    clientInfo.add(cAddress, g);
    city1 = new JLabel("City ");
    g.gridx = 0;
    g.gridy = 2;
    g.fill = GridBagConstraints.NONE;
    clientInfo.add(city1, g);
    cCity = new JTextField(100);
    g.gridx = 1;
    g.gridy = 2;
    g.fill = GridBagConstraints.HORIZONTAL;
    clientInfo.add(cCity, g);
    state1 = new JLabel("State ");
    g.gridx = 0;
    g.gridy = 3;
    g.fill = GridBagConstraints.NONE;
    clientInfo.add(state1, g);
    cState = new JTextField(100);
    g.gridx = 1;
    g.gridy = 3;
    g.fill = GridBagConstraints.HORIZONTAL;
    clientInfo.add(cState, g);
    zip1 = new JLabel("Zip ");
    g.gridx = 0;
    g.gridy = 4;
    g.fill = GridBagConstraints.NONE;
    clientInfo.add(zip1, g);
    cZip = new JTextField(100);
    g.gridx = 1;
    g.gridy = 4;
    g.fill = GridBagConstraints.HORIZONTAL;
    clientInfo.add(cZip, g);
    p = new JLabel("Phone ");
    g.gridx = 0;
    g.gridy = 5;
    g.fill = GridBagConstraints.NONE;
    clientInfo.add(p, g);
    phone = new JTextField(100);
    g.gridx = 1;
    g.gridy = 5;
    g.fill = GridBagConstraints.HORIZONTAL;
    clientInfo.add(phone, g);
    e = new JLabel("Email ");
    g.gridx = 0;
    g.gridy = 6;
    g.fill = GridBagConstraints.NONE;
    clientInfo.add(e, g);
    email = new JTextField(100);
    g.gridx = 1;
    g.gridy = 6;
    g.fill = GridBagConstraints.HORIZONTAL;
    clientInfo.add(email, g);
    
    
    JPanel workInfo = new JPanel();
    workInfo.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.weightx = 0.1;
    c.weighty = 0.9;
    
    //declarations and placements of components for workInfo panel
    address2 = new JLabel("Address ");
    c.gridx = 0;
    c.gridy = 0;
    c.fill = GridBagConstraints.NONE;
    workInfo.add(address2, c);
    wAddress = new JTextArea(3,100);
    c.gridx = 1;
    c.gridy = 0;
    c.fill = GridBagConstraints.BOTH;
    workInfo.add(wAddress, c);
    city2 = new JLabel("City ");
    c.gridx = 0;
    c.gridy = 1;
    c.fill = GridBagConstraints.NONE;
    workInfo.add(city2, c);
    wCity = new JTextField(100);
    c.gridx = 1;
    c.gridy = 1;
    c.fill = GridBagConstraints.HORIZONTAL;
    workInfo.add(wCity, c);
    state2 = new JLabel("State ");
    c.gridx = 0;
    c.gridy = 2;
    c.fill = GridBagConstraints.NONE;
    workInfo.add(state2, c);
    wState = new JTextField(20);
    c.gridx = 1;
    c.gridy = 2;
    c.fill = GridBagConstraints.HORIZONTAL;
    workInfo.add(wState, c);
    zip2 = new JLabel("Zip ");
    c.gridx = 0;
    c.gridy = 3;
    c.fill = GridBagConstraints.NONE;
    workInfo.add(zip2, c);
    wZip = new JTextField(60);
    c.gridx = 1;
    c.gridy = 3;
    c.fill = GridBagConstraints.HORIZONTAL;
    workInfo.add(wZip, c);
    scope = new JLabel("Scope of Work ");
    c.gridx = 0;
    c.gridy = 4;
    c.fill = GridBagConstraints.NONE;
    workInfo.add(scope, c);
    workScope = new JTextArea(8,100);
    c.gridx = 1;
    c.gridy = 4;
    c.fill = GridBagConstraints.BOTH;
    workInfo.add(workScope, c);
    costL = new JLabel("Est. Cost ");
    c.gridx = 0;
    c.gridy = 5;
    c.fill = GridBagConstraints.NONE;
    workInfo.add(costL, c);
    cost = new JTextField(100);
    c.gridx = 1;
    c.gridy = 5;
    c.fill = GridBagConstraints.HORIZONTAL;
    workInfo.add(cost, c);
    depositL = new JLabel("Deposit ");
    c.gridx = 0;
    c.gridy = 6;
    c.fill = GridBagConstraints.NONE;
    workInfo.add(depositL, c);
    deposit = new JTextField(100);
    c.gridx = 1;
    c.gridy = 6;
    c.fill = GridBagConstraints.HORIZONTAL;
    workInfo.add(deposit, c);
    
    JButton submitButton = new JButton("Submit");
    submitButton.addActionListener(new ActionListener() {
      // anonymous inner class for the submitButton ActionListener
      public void actionPerformed(ActionEvent event) {
        Quote q = new Quote(cName.getText(), cAddress.getText(), cCity.getText(), cState.getText(), cZip.getText(), 
                  phone.getText(), email.getText(), wAddress.getText(), wCity.getText(), wState.getText(), 
                  wZip.getText(), workScope.getText(), cost.getText(), deposit.getText());
        quotes.add(q);
        inputFrame.dispose();
      }
    });
    
    //borders for JPanels
    Border lineBorder = BorderFactory.createLineBorder(Color.black);
    TitledBorder clientBorder = BorderFactory.createTitledBorder(lineBorder, "Client Info");
    TitledBorder workBorder = BorderFactory.createTitledBorder(lineBorder, "Work Info");
    
    clientInfo.setBorder(clientBorder);
    workInfo.setBorder(workBorder);
    
    inputFrame.add(clientInfo, BorderLayout.NORTH);
    inputFrame.add(workInfo, BorderLayout.CENTER);
    inputFrame.add(submitButton, BorderLayout.SOUTH);
    inputFrame.setSize(700,500);
    inputFrame.setVisible(true);
    
  }
  
  /* This method creates the panel which lists all existing quotes.
   * It is called by the mainframe and does not close until the user closes it. */
  void createShowQuotesFrame() {
    JFrame showQuotes = new JFrame("Show Existing Quotes");
    showQuotes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //closing this window does not exit the program
    JTextArea quoteDisplay = new JTextArea();
    
    //print each quote created so far
    for(Quote quote : quotes) {
      quoteDisplay.append(quote.toString());
    }
    quoteDisplay.setEditable(false);
    showQuotes.add(quoteDisplay);
    showQuotes.setSize(700,1000);
    showQuotes.setVisible(true);
  }
  
}