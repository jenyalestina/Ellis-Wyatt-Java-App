public class Quote {
  
  private String name, clientAddress, clientCity, clientState, clientZip, email, phone, workAddress, workCity, 
    workState, workZip, workScope, estCost, depositDue;
  //instance variables used to give each quote a unique ID number
  private static int num;
  private int quoteNumber;
  
  //constructor: takes all variables and assigns them as appropriate
  public Quote(String n, String cAddress, String cCity, String cState, String cZip,
               String p, String e, String wAddress, String wCity, String wState, String wZip, 
               String scope, String cost, String deposit) {
    num++;
    quoteNumber = num;
    name = n;
    clientAddress = cAddress;
    clientCity = cCity;
    clientState = cState;
    clientZip = cZip;
    phone = p;
    email = e;
    workAddress = wAddress;
    workCity = wCity;
    workState = wState;
    workZip = wZip;
    workScope = scope;
    estCost = cost;
    depositDue = deposit;
  }
  
  //formatting used by showQuotes frame in EWGUI
  public String toString() {
    return "Quote # " + quoteNumber + "\t\tClient Name: " + name + "\nClient Address: " + clientAddress +
      "\nCity: " + clientCity + "\nState: " + clientState + "\t\tZip: " + clientZip + "\nPhone #: " + phone +
      "\nEmail: " + email + "\nWork Address: " + workAddress + "\nCity: "+ workCity + "\nState: " + 
      workState + "\t\tZip: " + workZip + "\nScope of Work:\n" + workScope + "\nEstimated Total Cost: " + estCost +
      "\nDeposit: " + depositDue + "\n\n";
  }
  
}