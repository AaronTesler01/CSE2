//Homework 02
//Arithmetic in Walmart (teaching children sales tax)
//Aaron Tesler

//Class statement
public class Arithmetic{

    //Main Method statement
   public static void main(String[] args) {
    
        //Actual assignment
        //Number of pairs of socks
        int nSocks=3;
        //cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double GlassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopesCost$=3.25;
        double taxPercent=0.06;
        
        //Total cost of Socks (no Tax)
        double noTaxSockCost$= nSocks* sockCost$;
        //Conversion to int Socks
        double noTaxTemporarySocks$=noTaxSockCost$*100;
        int tempNoTaxSockCost$=(int)noTaxTemporarySocks$;
        int temporaryNoTaxSockCost$=(int)tempNoTaxSockCost$;
        double realNoTaxSockCost$= (double) temporaryNoTaxSockCost$/100;
        //Total cost of Glasses (no Tax)
        double noTaxGlassesCost$=nGlasses*GlassCost$;
        //Conversion to int Glass
        double noTaxTemporaryGlass$=noTaxGlassesCost$*100;
        int temporaryNoTaxGlassCost$= (int)noTaxTemporaryGlass$;
        int tempNoTaxGlassCost$=(int) temporaryNoTaxGlassCost$;
        double realNoTaxGlassCost$=(double)tempNoTaxGlassCost$/100;
        //Total cost of Envelopes (no Tax)
        double noTaxEnvelopesCost$=nEnvelopes*envelopesCost$;
        //Conversion to int Envelopes
        double noTaxTemporaryEnvelope$=noTaxEnvelopesCost$*100;
        int tempNoTaxEnvelopeCost$=(int)noTaxTemporaryEnvelope$;
        int temporaryNoTaxEnvelopeCost$=(int)tempNoTaxEnvelopeCost$;
        double realNoTaxEnvelopeCost$=(double)temporaryNoTaxEnvelopeCost$/100;
        
        //Sales Tax for Socks
        double sockSalesTax$=noTaxSockCost$*taxPercent;
        //Conversion to int Socks Sales Tax
        double sockSalesTaxTemporary$=sockSalesTax$*100;
        int tempSockSalesTax$=(int)sockSalesTaxTemporary$;
        double temporarySockSalesTax$= tempSockSalesTax$;
        double realSockSalesTax$= (double) temporarySockSalesTax$/100;
        //Sales Tax for Glasses
        double glassSalesTax$=realNoTaxGlassCost$*taxPercent;
        //Conversion for int
        double glassSalesTaxTemporary$=glassSalesTax$*100;
        int tempGlassSalesTax$=(int)glassSalesTaxTemporary$;
        double temporaryGlassSalesTax$=(int) tempGlassSalesTax$;
        double realGlassSalesTax$=(double)temporaryGlassSalesTax$/100;
        //Sales Tax for Envelopes
        double envelopesSalesTax$=realNoTaxEnvelopeCost$*taxPercent;
        //Conversion to int Sales Tax Envelopes
        double envelopesSalesTaxTemporary$=envelopesSalesTax$*100;
        int tempEnvelopesSalesTax$=(int)envelopesSalesTaxTemporary$;
        int temporaryEnvelopesSalesTax$=(int) tempEnvelopesSalesTax$;
        double realEnvelopesSalesTax$=(double) temporaryEnvelopesSalesTax$/100;
        //Total Sales Tax
        double totalSalesTax$=realSockSalesTax$+realGlassSalesTax$+realEnvelopesSalesTax$;
        
        //Total Cost of Socks
        double totalCostSocks$=sockSalesTax$+realNoTaxSockCost$;
        //Total Cost of Glasses
        double totalCostGlass$=realGlassSalesTax$+realNoTaxGlassCost$;
        //Total Cost of Envelopes
        double totalCostEnvelopes$=realNoTaxEnvelopeCost$+realEnvelopesSalesTax$;
        //Total Cost before Tax
        int noTaxTotalCost=realNoTaxEnvelopeCost$+realNoTaxGlassCost$+realNoTaxSockCost$;
        //Conversion to int
        double tempNoTaxTotalCost$=noTaxTotalCost*100;
        int temporaryNoTaxTotalCost$=(int) tempNoTaxTotalCost$;
        double noTaxTotalCostTemporary$=(int)temporaryNoTaxTotalCost$;
        int realNoTaxTotalCost$=noTaxTotalCostTemporary$/100;
        //Total Cost after Tax
        double totalCost$=totalCostEnvelopes$+totalCostGlass$+totalCostSocks$;
        
        
        System.out.println("You bought "+nSocks+" pairs of socks.");
        System.out.println("Each one costs $"+sockCost$+" dollars.");
        System.out.println("These socks will cost you $"+noTaxSockCost$+" before tax.");
        System.out.println("The tax on these socks are $" + realSockSalesTax$ +".");
        System.out.println("The total cost of these socks are $"+totalCostSocks$+" dollars.");
        System.out.println("You bought"+nGlasses+" drinking glasses.");
        System.out.println("Each one costs $"+GlassCost$+" dollars.");
        System.out.println("These glasses will cost you $"+realNoTaxGlassCost$+"before tax.");
        System.out.println("The tax on these glasses will cost you $"+realGlassSalesTax$+".");
        System.out.println("The total cost of these glasses are $"+totalCostGlass$+"dollars.");
        System.out.println("You bought"+nEnvelopes+"boxes of envelopes.");
        System.out.println("Each one costs $"+envelopesCost$+"dollars.");
        System.out.println("These boxes will cost you $"+noTaxEnvelopesCost$+"before tax.");
        System.out.println("The tax on these boxes are $"+realEnvelopesSalesTax$+'.');
        System.out.println("The total cost of these boxes are $"+totalCostEnvelopes$+"dollars.");
        System.out.println("Your total cost before tax is $"+noTaxTotalCost+"dollars.");
        System.out.println("Your total sales tax is $"+totalSalesTax$+"dollars.");
        System.out.println("Your final total is $"+totalCost$+"dollars.");
        System.out.println("Have a nice day!");
        
        

   }      
} 