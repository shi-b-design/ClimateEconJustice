package climate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.DoubleToLongFunction;

/**
 * This class contains methods which perform various operations on a layered 
 * linked list structure that contains USA communitie's Climate and Economic information.
 * 
 * @author Navya Sharma
 */

public class ClimateEconJustice {

    private StateNode firstState;
    
    /*
    * Constructor
    * 
    * **** DO NOT EDIT *****
    */
    public ClimateEconJustice() {
        firstState = null;
    }

    /*
    * Get method to retrieve instance variable firstState
    * 
    * @return firstState
    * 
    * **** DO NOT EDIT *****
    */ 
    public StateNode getFirstState () {
        // DO NOT EDIT THIS CODE
        return firstState;
    }

    /**
     * Creates 3-layered linked structure consisting of state, county, 
     * and community objects by reading in CSV file provided.
     * 
     * @param inputFile, the file read from the Driver to be used for
     * @return void
     * 
     * **** DO NOT EDIT *****
     */
    public void createLinkedStructure ( String inputFile ) {
        
        // DO NOT EDIT THIS CODE
        StdIn.setFile(inputFile);
        StdIn.readLine();
        
        // Reads the file one line at a time
        while ( StdIn.hasNextLine() ) {
            // Reads a single line from input file
            String line = StdIn.readLine();
            // IMPLEMENT these methods
            addToStateLevel(line);
            addToCountyLevel(line);
            addToCommunityLevel(line);
        }
    }

    /*
    * Adds a state to the first level of the linked structure.
    * Do nothing if the state is already present in the structure.
    * 
    * @param inputLine a line from the input file
    */
    public void addToStateLevel ( String inputLine ) {
        
        String [] addState = inputLine.split(",");// String become array.
        String state = addState[2]; // this index is what we used for state. 
        StateNode stateNode = new StateNode();// making new node
        StateNode states = firstState; //Making pointer to check where is the firststate. Everytime you create a new Node, that node is null.
        stateNode.setName(state); // setName for new Node. 

        // if there's no node you just add Node and do not have to do anything

        
        if(firstState == null){ // If there's nothing
            firstState = stateNode; // you can just assign new node is the firststate
        }
            
        
        
        // there are nodes, you have to go through the linkedlist, go to the last, and set the new node to the last.next."While True."
        // if you get the last place, you need to break because you do not want to loop over and over. 
        else{
            while(true){
                if (stateNode.equals(states)) {
                    break;
                    
                }
                if(states.getNext() == null){ // if it's null behind, 
                    

                    states.setNext(stateNode); // assign new stateNode to behind it. 
                    break;
                }
                states = states.getNext();

            }
            //for(stateNode = firstState; stateNode !=null; stateNode=stateNode.getNext()){
                
            }

                    
                }
            


        // WRITE YOUR CODE HERE

    

    /*
    * Adds a county to a state's list of counties.
    * 
    * Access the state's list of counties' using the down pointer from the State class.
    * Do nothing if the county is already present in the structure.
    * 
    * @param inputFile a line from the input file
    */
    public void addToCountyLevel ( String inputLine ) {

        String[] addCounty = inputLine.split(",");
        String county = addCounty[1];
        String state = addCounty[2];
        // finish input file from Data 
        // make a data object with input file varaibles
        // make a communityNode object with data object as parameter
        // Go to .java to see how to make each object.


        CountyNode countyNode = new CountyNode();
        countyNode.setName(county);
        

        StateNode currentState = firstState;


        
        while(currentState != null){
            if(currentState.getName().equals(state)){ // if the pointer and the state from the string is the same 
                CountyNode currentCounty = currentState.getDown(); // you make a pointer to go down from currenst state
        
                

                // if there is a list already, put the node at the end
                if (currentCounty == null) {
                    currentState.setDown(countyNode);
                    
                    }
                    
                
                else{
                    while(true) {// to find the last node, go though the entire county list using while loop, and at the end of the loop make currentCounty = currentCounty.getNext()
                        if (countyNode.getName().equals(currentCounty.getName())){

                            break;
                         }
                        if (currentCounty.getNext() == null){
                            currentCounty.setNext(countyNode);
                            break;
     
                        }
                    currentCounty = currentCounty.getNext();
                    }
                 }
                
                // after finding state, you have 
                
            }

            
            currentState = currentState.getNext();
            }

               
            }
            
                // if there's no county 
                // to debug a code you can use either boolean a = currentState.getName().equals(state) or System.out.println(currentState.getName().equals("Connecticut"));
                // if there is a list already, put the node at the end

               
                
                // if not, then setDown(countynode)
                // currentCounty = currentState.setDown();
                //boolean countyExists = false;
                //while(currentCounty != null){ //
                    //if(currentCounty.getName().equals(countyNode.getName())){
                        //countyExists = true;
               
        
        // new node for new country
        // set the name for new county

       
        // WRITE YOUR CODE HERE

    


    /*
    * Adds a community to a county's list of communities.
    * 
    * Access the county through its state
    *      - search for the state first, 
    *      - then search for the county.
    * Use the state name and the county name from the inputLine to search.
    * 
    * Access the state's list of counties using the down pointer from the StateNode class.
    * Access the county's list of communities using the down pointer from the CountyNode class.
    * Do nothing if the community is already present in the structure.
    * 
    * @param inputFile a line from the input file
    */
    public void addToCommunityLevel ( String inputLine ) {// you first have to check the condition for state, check the condition for county, and finally check the condition for community.
        
        // finish input file from Data 
        // make a data object with input file varaibles
        // make a communityNode object with data object as parameter
        // Go to .java to see how to make each object.
        String [] addCommunity = inputLine.split(",");
        String com = addCommunity[0];
        String county = addCommunity[1];
        String state = addCommunity[2];
        String africanAmerica = addCommunity[3];
        String nativ = addCommunity[4];
        String asian = addCommunity[5];
        String white = addCommunity[8];
        String hispanic = addCommunity[9];
        String disadvantaged = addCommunity[19];
        String pmLev = addCommunity[49];
        String chanFlo = addCommunity[37];
        String poverty = addCommunity [121];

        Double prcntAfricanAmerican = Double.parseDouble(africanAmerica);
        Double prcntNative = Double.parseDouble(nativ);
        Double prcntAsian = Double.parseDouble(asian);
        Double prcntWhite = Double.parseDouble(white);
        Double prcntHispanic = Double.parseDouble(hispanic);
        Double PMlevel = Double.parseDouble(pmLev);
        Double chanceOfFlood = Double.parseDouble(chanFlo);
        Double povertyLine = Double.parseDouble(poverty);



        Data communityData = new Data( prcntAfricanAmerican, prcntNative, prcntAsian,
        prcntWhite, prcntHispanic, disadvantaged,
        PMlevel, chanceOfFlood, povertyLine);
        


        CommunityNode communityNode = new CommunityNode();
        communityNode.setName(com);
        communityNode.setInfo(communityData);
        

        

        

        StateNode currentState = firstState; // pointer for the state (first-layered)
        while(currentState != null){
            if(currentState.getName().equals(state)){
                CountyNode currentCounty = currentState.getDown();

                while(currentCounty != null){
                    if(currentCounty.getName().equals(county)){
                        CommunityNode currentCom = currentCounty.getDown();

                        

                        if(currentCom == null){
                            currentCounty.setDown(communityNode);
                        }
                        
                        else{
                            while(true){
                                if (communityNode.getName().equals(currentCom.getName())) {
                                    break;
                                }

                                if (currentCom.getNext()== null) {
                                    currentCom.setNext(communityNode);
                                    break;
                                    
                                }
                            currentCom = currentCom.getNext();
                        }
                            
                        }
                    }

                    
                    currentCounty = currentCounty.getNext();   
                    }
                    
                }


            currentState = currentState.getNext();
            
            }
            
            }
    




        // WRITE YOUR CODE HERE

    

    /**
     * Given a certain percentage and racial group inputted by user, returns
     * the number of communities that have that said percentage or more of racial group  
     * and are identified as disadvantaged
     * 
     * Percentages should be passed in as integers for this method.
     * 
     * @param userPrcntage the percentage which will be compared with the racial groups
     * @param race the race which will be returned
     * @return the amount of communities that contain the same or higher percentage of the given race
     */
    public int disadvantagedCommunities ( double userPrcntage, String race ) {

        int Count = 0;
        StateNode currentState = firstState;
        


        while (currentState != null) {
        
            CountyNode currentCounty = currentState.getDown();

            while(currentCounty!=null){
                CommunityNode currentCom = currentCounty.getDown();

                while(currentCom != null){// why datainfo is null
                    //if (userPrcntage > 0) {


                        
                        Data dataRace = currentCom.getInfo();// I want to create a place to read data // how am I supposed to read data from csv file.  // currentCome does not have infro now. How can I put the da
                        

                        if(dataRace != null) {
                            
                            double perAfricanAmerican = dataRace.getPrcntAfricanAmerican();
                            double perNative = dataRace.getPrcntNative();
                            double perWhite = dataRace.getPrcntWhite();
                            double perHispanic = dataRace.getPrcntHispanic();
                            double perAsian = dataRace.getPrcntAsian();

                            perAfricanAmerican=perAfricanAmerican*100 ;
                            perNative = perNative*100;
                            perWhite = perWhite*100;
                            perHispanic = perHispanic*100;
                            perAsian = perAsian*100;

                            if(race.equals("African American")){
                                if (perAfricanAmerican >= userPrcntage&&dataRace.getAdvantageStatus().equals("True")){
                                    Count++;

                                }
                            }
                            if(race.equals("Native American")){    
                                if (perNative>=userPrcntage && dataRace.getAdvantageStatus().equals("True")) {
                                    Count++;
                                    
                                }
                            }
                            if(race.equals("White American")){    
                                if (perWhite>=userPrcntage && dataRace.getAdvantageStatus().equals("True")) {
                                    Count++;
                                    
                                }
                            }
                            if(race.equals("Hispanic American")){    
                                if (perHispanic>=userPrcntage && dataRace.getAdvantageStatus().equals("True")) {
                                    Count++;
                            
                                }
                            }
                            if(race.equals("Asian American")){   
                                if (perAsian>=userPrcntage && dataRace.getAdvantageStatus().equals("True")) {
                                    Count++;
                                    
                                }
                            }    
                                       
                            }
                            
                        currentCom = currentCom.getNext();   
                        } 
                         
                        //while(currentCom.get)

                        //Count = Count++;
                    currentCounty = currentCounty.getNext();
                    }
                    
                  
                

                currentState = currentState.getNext();    
                }
                return Count;
            }

       
        // WRITE YOUR CODE HERE
         // replace this line
    

          /**
     * Given a certain percentage and racial group inputted by user, returns
     * the number of communities that have that said percentage or more of racial group  
     * and are identified as non disadvantaged
     * 
     * Percentages should be passed in as integers for this method.
     * 
     * @param userPrcntage the percentage which will be compared with the racial groups
     * @param race the race which will be returned
     * @return the amount of communities that contain the same or higher percentage of the given race
     */
    public int nonDisadvantagedCommunities ( double userPrcntage, String race ) {

        int Count = 0;
        StateNode currentState = firstState;
        


        while (currentState != null) {
        
            CountyNode currentCounty = currentState.getDown();

            while(currentCounty!=null){
                CommunityNode currentCom = currentCounty.getDown();

                while(currentCom != null){// why datainfo is null
                    //if (userPrcntage > 0) {


                        
                        Data dataRace = currentCom.getInfo();// I want to create a place to read data // how am I supposed to read data from csv file.  // currentCome does not have infro now. How can I put the da
                        

                        if(dataRace != null) {
                            
                            double perAfricanAmerican = dataRace.getPrcntAfricanAmerican();
                            double perNative = dataRace.getPrcntNative();
                            double perWhite = dataRace.getPrcntWhite();
                            double perHispanic = dataRace.getPrcntHispanic();
                            double perAsian = dataRace.getPrcntAsian();

                            perAfricanAmerican=perAfricanAmerican*100 ;
                            perNative = perNative*100;
                            perWhite = perWhite*100;
                            perHispanic = perHispanic*100;
                            perAsian = perAsian*100;

                            if(race.equals("African American")){
                                if (perAfricanAmerican >= userPrcntage&&dataRace.getAdvantageStatus().equals("False")){
                                    Count++;

                                }
                            }
                            if(race.equals("Native American")){    
                                if (perNative>=userPrcntage && dataRace.getAdvantageStatus().equals("False")) {
                                    Count++;
                                    
                                }
                            }
                            if(race.equals("White American")){    
                                if (perWhite>=userPrcntage && dataRace.getAdvantageStatus().equals("False")) {
                                    Count++;
                                    
                                }
                            }
                            if(race.equals("Hispanic American")){    
                                if (perHispanic>=userPrcntage && dataRace.getAdvantageStatus().equals("False")) {
                                    Count++;
                            
                                }
                            }
                            if(race.equals("Asian American")){   
                                if (perAsian>=userPrcntage && dataRace.getAdvantageStatus().equals("False")) {
                                    Count++;
                                    
                                }
                            }    
                                       
                            }
                            
                            
                            
                        currentCom = currentCom.getNext();   
                        } 
                         
                        //while(currentCom.get)

                        //Count = Count++;
                    currentCounty = currentCounty.getNext();
                    }
                    
                  
                

                currentState = currentState.getNext();    
                }
                return Count;





        //WRITE YOUR CODE HERE
         // replace this line
    }
    
    /** 
     * Returns a list of states that have a PM (particulate matter) level
     * equal to or higher than value inputted by user.
     * 
     * @param PMlevel the level of particulate matter
     * @return the States which have or exceed that level
     */ 
    public ArrayList<StateNode> statesPMLevels ( double PMlevel ) {

        ArrayList<StateNode> pmState = new ArrayList<StateNode>();

        StateNode currentState = firstState;

        while (currentState != null) {
            CountyNode currentCounty = currentState.getDown();

            while (currentCounty != null) {
                CommunityNode currentCom = currentCounty.getDown();

                while (currentCom!= null) {
                    

                    Data dataPm = currentCom.getInfo();
                    if(dataPm != null){
                        double pmLev = dataPm.getPMlevel();

                        if (pmLev >= PMlevel) {
                            if (!pmState.contains(currentState)) {
                                pmState.add(currentState);
                                
                            }
                            

                             
                             
                            
                             
                        }
                    }

                    currentCom = currentCom.getNext();
                }
            currentCounty = currentCounty.getNext();    
            }
        currentState = currentState.getNext();   
        }


        // WRITE YOUR METHOD HERE
        return pmState;// replace this line
    }

    /**
     * Given a percentage inputted by user, returns the number of communities 
     * that have a chance equal to or higher than said percentage of
     * experiencing a flood in the next 30 years.
     * 
     * @param userPercntage the percentage of interest/comparison
     * @return the amount of communities at risk of flooding
     */
    public int chanceOfFlood ( double userPercntage ) {

        int Count = 0;

        StateNode currentState = firstState;

        while (currentState != null) {
            CountyNode currentCounty =currentState.getDown();

            while (currentCounty != null) {
                CommunityNode currentCom = currentCounty.getDown();

                while (currentCom != null) {

                    Data chanceFlood = currentCom.getInfo();
                    Double numChance = chanceFlood.getChanceOfFlood();

                    if (numChance >=userPercntage) {
                        Count++;

                        
                    }
                    
                currentCom = currentCom.getNext();    
                }
            currentCounty = currentCounty.getNext();    
            }
        currentState = currentState.getNext();    
        }

        // WRITE YOUR METHOD HERE
        return Count; // replace this line
    }

    /** 
     * Given a state inputted by user, returns the communities with 
     * the 10 lowest incomes within said state.
     * 
     *  @param stateName the State to be analyzed
     *  @return the top 10 lowest income communities in the State, with no particular order
    */
    public ArrayList<CommunityNode> lowestIncomeCommunities ( String stateName ) {

        ArrayList<CommunityNode> lowComArray = new ArrayList<CommunityNode>();// list to store the communitynode. 
        ArrayList<Double> numPoverty = new ArrayList<Double>(); // make two lists to store the number for poverty

        
        StateNode currentState = firstState;

        

        while(currentState != null){// iterate through until you can find the state a user input
            if (currentState.getName().equals(stateName)) {
                
                CountyNode currentCounty = currentState.getDown();
                while (currentCounty != null) {
                    CommunityNode currentCom = currentCounty.getDown();
                    while (currentCom != null) {

                        Data lowIncomCom = currentCom.getInfo();
                        Double numberlowCom = lowIncomCom.getPercentPovertyLine();
                        
                        
                        if(lowComArray.size()<10){
                            lowComArray.add(currentCom);
                            numPoverty.add(numberlowCom);
                            

                        }

                        else{
                            Double min = Collections.min(numPoverty);
                            Integer minIndex = numPoverty.indexOf(min);

                            
                            if (min<numberlowCom) {
                                    numPoverty.set(minIndex, numberlowCom);
                                    lowComArray.set(minIndex, currentCom);
                                    
                                }
                            
                        }
                            

                        currentCom = currentCom.getNext();     
                        }


                        

                        //Data lowIncomCom = currentCom.getInfo();
                        //if(lowIncomCom != null){
                        //Double numberlowCom = lowIncomCom.getPercentPovertyLine();

                        
                        //}




                    
                    currentCounty = currentCounty.getNext(); 
                    }

                
               
                }
                currentState = currentState.getNext(); 
            }


            
        
            return lowComArray;
           }
           

    
        //WRITE YOUR METHOD HERE
         // replace this line
    }

    
