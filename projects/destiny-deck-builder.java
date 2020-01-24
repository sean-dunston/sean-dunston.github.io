import java.util.*;
public class Deck
{
   static List<String> cards = Arrays.asList("Joel", 
   "Captain Phasma", "First Order Stormtrooper", "General Grievous", "General Veers", 
   "AT-ST", "First Order TIE Fighter", "Commanding Presence", "F-11D Rifle", "Count Dooku", "Darth Vader", "Kylo Ren", 
   "Nightsister", "Force Choke", "Immobilize", "Kylo Ren's Lightsaber", "Sith Holocron", "Infantry Grenades", 
   "Speeder Bike Scout", "Bala-Tik", "Jabba The Hutt", "Jango Fett", "Tusken Raider", "Crime Lord", "Flame Thrower", 
   "Gaffi Stick", "On The Hunt", "Admiral Ackbar", "Leia Organa", "Poe Dameron", "Rebel Trooper", "Launch Bay", "Black One", 
   "Scout", "Survival Gear", "Luke Skywalker", "Padawan", "Qui-Gon Jinn", "Rey", "Force Protection", "Jedi Robes", 
   "Luke Skywalker's Lightsaber", "One With The Force", "BB-8", "Rey's Staff", "Finn", "Han Solo", "Hired Gun", 
   "Padme Amidala", "Millennium Falcon", "Diplomatic Immunity", "DL-44 Heavy Blaster Pistol", "InfiltrateOutpost", 
   "DH-17 Blaster Pistol", "IQA-11 Blaster Rifle", "Promotion", "Force Throw", "Force Training", "Lightsaber", "Mind Probe",
   "Comlink", "Datapad", "Holdout Blaster", "Black Market", "Cunning", "Jetpack", "Thermal Detonator", "Cannon Fodder", 
   "Closing The Net", "Endless Ranks", "Occupation", "Probe", "Sweep The Area", "Tactical Mastery", "The Best Defense...",
   "Drudge Work", "Local Garrison", "Personal Escort", "Abandon All Hope", "Boundless Ambition", "Enrage", "Feel Your Anger",
   "Force Strike", "Intimidate", "Isolation", "No Mercy", "Pulling The Strings", "Emperors Favor", "Power Of The Dark Side",
   "Hidden In Shadow", "Nowhere To Run", "Ace In The Hole", "Armed To The Teeth", "Confiscation", "Fight Dirty", 
   "Go For The Kill", "He Doesn't Like You", "Lying In Wait", "Backup Muscle", "My Kind Of Scum", "Underworld Connections", 
   "Prized Possession", "Commando Raid", "Defensive Position", "Field Medic", "Hit And Run", "It's A Trap!", "Natural Talent", 
   "Rearm", "Retreat", "Strategic Planning", "Surgical Strike", "Resistance HQ", "Anticipate", "Defensive Stance",
   "Force Misdirection", "Heroism", "Noble Sacrifice", "Patience", "Return Of The Jedi", "Riposte", "Willpower", 
   "Jedi Council", "Awakening", "The Force Is Strong", "Daring Escape", "Don't Get Cocky", "Draw Attention", "Hyperspace Jump",
   "Let The Wookie Win", "Negotiate", "Scavenge", "Shoot First", "Smuggling", "Play The Odds", "Street Informants", 
   "Second Chance", "Award Ceremony", "Dug In", "Firepower", "Leadership", "Logistics", "Squad Tactics", "Supporting Fire", 
   "Deflect", "Disturbance In The Force", "Mind Trick", "The Power Of The Force", "Use The Force", "It Binds All Things", 
   "Aim", "All In", "Block", "Close Quarters Assault", "Dodge", "Flank", "Take Cover", "Disarm", "Electroshock", "Reversal", 
   "Scramble", "Unpredictable", "Infamous", "Hunker Down", "Command Center", "Echo Base", "Emperor's Throne Room", 
   "Frozen Wastes", "Imperial Armory", "Jedi Temple", "Rebel War Room", "Mos Eisley Spaceport", "Separatist Base", 
   "Starship Graveyard");
   static List<String> color = Arrays.asList("WGB0", "RVC1", "RVC2", "RVC3", "RVC4", "RVS5", "RVS6", "RVU7", "RVU8", "BVC9", 
   "BVC10", "BVC11", "BVC12", "BVU13", "BVU14", "BVU15", "BVU16", "GVU17", "GVS18", "YVC19", "YVC20", "YVC21", "YVC22", 
   "YVU23", "YVU24", "YVU25", "YVU26", "RHC27", "RHC28", "RHC29", "RHC30", "RHS31", "RHS32", "RHU33", "RHU34", "BHC35", 
   "BHC36", "BHC37", "BHC38", "BHU39", "BHU40", "BHU41", "BHU42", "GHS43", "GHU44", "YHC45", "YHC46", "YHC47", "YHC48", 
   "YHS49", "YHU50", "YHU15", "YHU52", "RNS53", "RNU54", "RNU55", "RNU56", "BNU57", "BNU58", "BNU59", "BNU60", "GNU61", 
   "GNU62", "GNU63", "YNS64", "YNU65", "YNU66", "YNU67", "RVE68", "RVE69", "RVE70", "RVE71", "RVE72", "RVE73", "RVE74", 
   "RVE75", "RVS76", "RVS77", "RVU78", "BVE79", "BVE80", "BVE81", "BVE82", "BVE83", "BVE84", "BVE85", "BVE86", "BVE87", 
   "BVS88", "BVS89", "BVU90", "GVE91", "YVE92", "YVE93", "YVE94", "YVE95", "YVE96", "YVE97", "YVE98", "YVS99", "YVS100", 
   "RVS101", "RVU102", "RHE103", "RHE104", "RHE105", "RHE106", "RHE107", "RHE108", "RHE109", "RHE110", "RHE111", "RHE112",
   "RHS113", "BHE114", "BHE115", "BHE116", "BHE117", "BHE118", "BHE119", "BHE120", "BHE121", "BHE122", "BHS123", "BHS124", 
   "BHS125", "GHE126", "YHE127", "YHE128", "YHE129", "YHE130", "YHE131", "YHE132", "YHE133", "YHE134", "YHS135", "YHS136", 
   "YHU137", "RNE138", "RNE139", "RNE140", "RNE141", "RNE142", "RNE143", "RNS144", "BNE145", "BNE146", "BNE147", "BNE148",
   "BNE149", "BNS150", "GNE151", "GNE152", "GNE153", "GNE154", "GNE155", "GNE156", "GNE157", "YNE158", "YNE159", "YNE160", 
   "YNE161", "YNE162", "YNS163", "YNU164", "GNB165", "GNB166", "GNB167", "GNB168", "GNB169", "GNB170", "GNB171", "GNB172",
   "GNB174", "GNB173");
   ArrayList<String> cardsInDeck = new ArrayList<String>();
   List<String> deck = new ArrayList<String>();
   private String character0;
   private String character1;
   private String character2;
   private String character3;
   private String name;
   private int characters = 0;
   private boolean hero = false;
   private boolean villain = false;
   private boolean red = false;
   private boolean blue = false;
   private boolean yellow = false;
   public Deck(String deckName)
   {
       name = deckName;
   }
   public Deck(String first, String deckName)
   {
       name = deckName;
       character0 = first;
       cardsInDeck.add(character0);
   }
   public Deck(String first, String second, String deckName)
   {
       name = deckName;
       character0 = first;
       character1 = second;
       cardsInDeck.add(character0);
       cardsInDeck.add(character1);
   }
   public Deck(String first, String second, String third, String deckName)
   {
       name = deckName;
       character0 = first;
       character1 = second;
       character2 = third;
       cardsInDeck.add(character0);
       cardsInDeck.add(character1);
       cardsInDeck.add(character2);
   }
   public Deck(String first, String second, String third, String fourth, String deckName)
   {
       name = deckName;
       character0 = first;
       character1 = second;
       character2 = third;
       character3 = fourth;
       cardsInDeck.add(character0);
       cardsInDeck.add(character1);
       cardsInDeck.add(character2);
       cardsInDeck.add(character3);
   }
   public boolean checkSides()
   {
       if(hero == true && villain == true)
           return true;
       return false;
   }
   public boolean isRed()
   {
       if(red)
           return true;
       return false;
   }
   public boolean isYellow()
   {
       if(yellow)
           return true;
       return false;
   }
   public boolean isBlue()
   {
       if(blue)
           return true;
       return false;
   }
   public void setSide(String character)
   {
       String code = color.get(cards.indexOf(character));
       String side = code.substring(1, 2);
       if(side.equals("H"))
           hero = true;
       if(side.equals("V"))
           villain = true;
   }
   public void setColor(String character)
   {
       String code = color.get(cards.indexOf(character));
       String side = code.substring(0, 1);
       if(side.equals("R"))
           red = true;
       if(side.equals("B"))
           blue = true;
       if(side.equals("Y"))
           yellow = true;
   }
   public static int findCard(String card)
   {
       return (cards.indexOf(card));
   }
   public void addCharacter(String card)
   {
       if (characters == 0)
           character0 = card;
       else if (characters == 1)
           character1 = card;
       else if (characters == 2)
           character2 = card;
       else if (characters == 3)
           character3 = card;
       else
           System.out.println("You man not have more than 4 characters");
       characters ++;
   }
   public void addCard(String card)
   {
       if (findCard(card) != -1)
       {
          deck.add(card);
          System.out.println("Card added to deck.");
       }   
       else
          System.out.println("Invalid card.");
   }
   public void removeCard(String card)
   {
       int pos = cardsInDeck.indexOf(card);
       if(pos != -1)
       {
           cardsInDeck.remove(card);
           System.out.println("Card Removed.");
       }
       else
           System.out.println("Card not found");
   }
   public boolean addCardName(String card)
   {
       if (findCard(card) != -1)
       {
          String code = color.get(cards.indexOf(card));
          String cardColor = code.substring(0, 1);
          String cardSide = code.substring(1, 2);
          if(((cardSide.equals("V") && villain == true) || (cardSide.equals("H") && hero == true) || cardSide.equals("N")) 
          && ((cardColor.equals("R") && red == true) || (cardColor.equals("Y") && yellow == true) || 
          (cardColor.equals("B") && blue == true) || cardColor.equals("G")))
          {
             cardsInDeck.add(card);
             System.out.println("✔");
             return true;
          }
          else
             System.out.println("✖ ✖Card needs to be of the same color and on the same side as your characters.✖ ✖");
       }   
       else
          System.out.println("✖ ✖Invalid card.✖ ✖");
       return false;
   }
   public void printDeck()
   {
       Iterator itr = cardsInDeck.iterator();
       System.out.println("Cards in " + name + ":");
       while(itr.hasNext())
          System.out.println(itr.next());
   }
   public void printCharacters()
   {
       System.out.print("Characters: " + character0);
       if (characters > 1)
           System.out.print(", " + character1);
       if (characters > 2)
           System.out.print(", " + character2);
       if (characters > 3)
           System.out.print(", " + character3); 
       System.out.println();
   }
   public static void printCards()
   {
       Iterator itr = cards.iterator();
       System.out.println("Cards:");
       while(itr.hasNext())
          System.out.println(itr.next());
   } 
   public static int menu()
   {
       Scanner scan = new Scanner(System.in);
       System.out.println("\n   Menu   ");  
       System.out.println("   ====");  
       System.out.println("0: Quit");
       System.out.println("1: Print Deck");  
       System.out.println("2: Add a card");
       System.out.println("3: Remove a card");  
       int input = scan.nextInt();
       return(input);
   }
}




import java.util.Scanner;
public class Player
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to call this deck? (No spaces)");
        String deckName = scan.next();
        String[] character = new String[4];
        System.out.println("How many characters do you have?");
        int characters = scan.nextInt();
        boolean heroAndVillan = true;
        //Deck player1 = new Deck("Default");
        while (characters > 4)
        {
            System.out.println("You may only have 4 characters.");
            System.out.println("How many charecters do you have?");
            characters = scan.nextInt();
        }
        scan.nextLine();
        Deck player1 = new Deck(deckName);
        while(heroAndVillan)
        {
            for (int i = 0; i < characters; i++)
            {
                System.out.println("Enter a character.");
                character[i] = scan.nextLine();
                while (Deck.findCard(character[i]) == -1)
                {
                    System.out.println("Invalid card, please enter a valid card.");
                    character[i] = scan.nextLine();
                }
            }
            
            for(int i = 0; i < characters; i ++)
            {
                player1.addCharacter(character[i]);
                player1.setSide(character[i]);
                player1.setColor(character[i]);
            }
            player1.printCharacters();
            if(player1.checkSides())
                System.out.println("Characters must be either all hero, or all villan.");
            else
                heroAndVillan = false;
        }
        System.out.println("Would you like to input the cards by name or number?");
        String nameOrNumber = scan.next();
        while (!(nameOrNumber.equals("name") || nameOrNumber.equals("number")))
        {
            System.out.println("enter either \"name\" or \"number\"."); 
            nameOrNumber = scan.next();
        }
        if(nameOrNumber.equals("name"))
        {
            scan.nextLine();
            for(int i = 0; i < 30; i++)
            {
                System.out.println("Enter the name of the card.");
                String cardName = scan.nextLine();
                while (!(player1.addCardName(cardName)))
                {
                    System.out.println("Enter the name of the card.");
                    cardName = scan.nextLine();
                }
            }
        }
        String card;
        boolean run = true;
        
        while(run)
        {
            int choice = Deck.menu();
            switch(choice)      
            {      
                case 0:  
                   System.out.println("Bye!");   
                   run = false;
                   break;     
                case 1:   
                   player1.printDeck();
                   break;      
                case 2:   
                   System.out.println("Input card name.");
                   card = scan.nextLine();
                   player1.addCardName(card);
                   break;
                case 3:  
                   System.out.println("Input card name.");
                   card = scan.nextLine();
                   player1.removeCard(card);
                   break;      
                default:   
                   System.out.println("Sorry, invalid choice");      
            }   
        }
    } 
}






public class Test
{
   public static void main(String[] args)
   {
       Deck.setSide("Han Solo");
   }
}
