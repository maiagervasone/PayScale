package com.example.googlemapspractice;

import java.util.HashMap;
import java.util.Map;


public class Data {
    public static Map<String, State> states = new HashMap<String, State>();
    double[] stateTaxRates;
    double[] statTaxBrackets;

    public Data() {
        initStateData();
    }

    private void initStateData() {
        State alabama = new State("alabama",4.0, 87.1, 98.2, 68.2,
                100.2, 88.1, 89.5, 95.2, 53050);

        stateTaxRates = new double[] {0.02, 0.04, 0.05};
        statTaxBrackets = new double[] {0, 500, 3000};
        alabama.stateTaxRates = stateTaxRates;
        alabama.stateTaxBrackets = statTaxBrackets;

        states.put("alabama", alabama);

        State alaska = new State("Alaska",0.0, 125.5, 131.8, 120.0,
                138.4, 121.0, 151.7, 120.5, 70638);
        states.put("alaska", alaska);

        State arizona = new State("arizona",5.6, 108.0,101.8,	127.2,
                99.4,101.3,92.4,	98.7, 60997);

        stateTaxRates = new double[] {0.0259, 0.0334, 0.0417, 0.0450};
        statTaxBrackets = new double[] {0, 27808, 55615, 166843};
        arizona.stateTaxRates = stateTaxRates;
        arizona.stateTaxBrackets = statTaxBrackets;

        states.put("arizona", arizona);

        State arkansas = new State("arkansas",6.5, 90.7, 92.5,	78.4,
                100.1, 89.7,	84.2,	100.6, 49747);

        stateTaxRates = new double[] {0.02, 0.04, 0.055};
        statTaxBrackets = new double[] {0, 4300, 8500};
        arkansas.stateTaxRates = stateTaxRates;
        arkansas.stateTaxBrackets = statTaxBrackets;

        states.put("arkansas", arkansas);

        State california = new State("california",7.25, 138.7,	112.3,	194.0,
                122.4, 124.4,	109.7,110.0, 78937);

        stateTaxRates = new double[] {0.02, 0.04, 0.06, 0.08, 0.093, 0.103, 0.113, 0.123, 0.133};
        statTaxBrackets = new double[] {9325, 22107, 34892, 48435, 61214, 312686, 375221, 625369, 1000000};
        california.stateTaxRates = stateTaxRates;
        california.stateTaxBrackets = statTaxBrackets;

        states.put("california", california);

        State colorado = new State("colorado", 2.9, 105.2,	100.8,	115.7,
                83.9,	112.2,	97.9,	104.2, 66825);

        stateTaxRates = new double[] {0.0455};
        statTaxBrackets = new double[] {0};
        colorado.stateTaxRates = stateTaxRates;
        colorado.stateTaxBrackets = statTaxBrackets;

        states.put("colorado", colorado);

        State connecticut = new State("connecticut", 6.35, 115.4,	99.1,	121.5,
                127.3,	112.1,	108.1,	116.4, 75919);

        stateTaxRates = new double[] {0.03, 0.05, 0.055, 0.06, 0.065, 0.069,0.0699};
        statTaxBrackets = new double[] {0, 10000, 50000, 100000, 200000, 250000, 500000};
        connecticut.stateTaxRates = stateTaxRates;
        connecticut.stateTaxBrackets = statTaxBrackets;

        states.put("connecticut", connecticut);

        State delaware = new State("delaware", 0, 105.4,	106.4,	103.7,
                94.1,	117.5,	109.6,	106.8, 63458);

        stateTaxRates = new double[] {0.022, 0.039, 0.048, 0.052, 0.055, 0.066};
        statTaxBrackets = new double[] {2000, 5000, 10000, 20000, 25000, 60000};
        delaware.stateTaxRates = stateTaxRates;
        delaware.stateTaxBrackets = statTaxBrackets;

        states.put("delaware", delaware);

        State florida = new State("Florida", 6.0, 104.5,	106.4,	112.2,
                99.0,	97.7,	98.0,	100.2, 53972);
        states.put("florida", florida);

        State georgia = new State("georgia", 4.0, 88.9,	96.4,	77.7,
                90.0,	89.4,	96.5,	94.8, 59917);

        stateTaxRates = new double[] {0.01, 0.02, 0.03, 0.04, 0.05, 0.0575};
        statTaxBrackets = new double[] {0, 750, 2250, 3750, 5250, 7000};
        georgia.stateTaxRates = stateTaxRates;
        georgia.stateTaxBrackets = statTaxBrackets;

        states.put("georgia", georgia);

        State hawaii = new State("hawaii", 4.0, 186.0,	148.5,	307.0,
                134.6,	128.3,	120.3,	124.1, 59399);

        stateTaxRates = new double[] {0.014, 0.032, 0.055, 0.064, 0.068, 0.072, 0.076, 0.079, 0.0825, 0.09, 0.1, 0.11};
        statTaxBrackets = new double[] {0, 2400, 4800, 9600, 14400, 19200, 24000, 36000, 48000, 15000, 175000, 200000};
        hawaii.stateTaxRates = stateTaxRates;
        hawaii.stateTaxBrackets = statTaxBrackets;

        states.put("hawaii", hawaii);

        State idaho = new State("idaho", 6.0, 98.9,	95.6,	102.3,
                79.2,	114.8,	93.0,	100.7, 54251);

        stateTaxRates = new double[] {0.01, 0.03, 0.045, 0.06};
        statTaxBrackets = new double[] {0, 1599, 4763, 7939};
        idaho.stateTaxRates = stateTaxRates;
        idaho.stateTaxBrackets = statTaxBrackets;

        states.put("idaho", idaho);

        State illinois = new State("illinois",6.25, 91.9,	100.5,	81.7,
                94.6,	104.3,	96.0,	92.8, 69293);

        stateTaxRates = new double[] {0.0495};
        statTaxBrackets = new double[] {0};
        illinois.stateTaxRates = stateTaxRates;
        illinois.stateTaxBrackets = statTaxBrackets;

        states.put("illinois", illinois);

        State indiana = new State("indiana", 7.0, 90.2,	94.5,	76.8,
                107.6,	94.8,	97.5,	93.3, 59280);

        stateTaxRates = new double[] {0.0323};
        statTaxBrackets = new double[] {0};
        indiana.stateTaxRates = stateTaxRates;
        indiana.stateTaxBrackets = statTaxBrackets;

        states.put("indiana", indiana);

        State iowa = new State("iowa", 6.0, 88.2,	98.0,	70.6,
                95.5,	95.4,	98.9,	94.9, 54747);

        stateTaxRates = new double[] {0.0033, 0.0067, 0.0225, 0.0414, 0.0563, 0.0596, 0.0625, 0.0744, 0.0853};
        statTaxBrackets = new double[] {0, 1743, 3486, 6972, 15687, 26145, 34860, 52290, 78435};
        iowa.stateTaxRates = stateTaxRates;
        iowa.stateTaxBrackets = statTaxBrackets;

        states.put("iowa", iowa);

        State kansas = new State("kansas", 6.5, 87.3,	94.3,	72.0,
                98.7,	96.3,	101.1,	91.0, 58269);

        stateTaxRates = new double[] {0.031, 0.0525, 0.0570};
        statTaxBrackets = new double[] {0, 15000, 30000};
        kansas.stateTaxRates = stateTaxRates;
        kansas.stateTaxBrackets = statTaxBrackets;

        states.put("kansas", kansas);

        State kentucky = new State("kentucky", 6.0, 92.8,	92.5,	75.7,
                105.4,	105.9,	77.0,	105.4, 53318);

        stateTaxRates = new double[] {0.05};
        statTaxBrackets = new double[] {0};
        kentucky.stateTaxRates = stateTaxRates;
        kentucky.stateTaxBrackets = statTaxBrackets;

        states.put("kentucky", kentucky);

        State louisiana = new State("louisiana", 4.45, 93.5,	98.8,	85.2,
                88.3,	96.0,	100.4,	99.2, 54647);

        stateTaxRates = new double[] {0.0185, 0.035, 0.0425};
        statTaxBrackets = new double[] {0, 12500, 50000};
        louisiana.stateTaxRates = stateTaxRates;
        louisiana.stateTaxBrackets = statTaxBrackets;

        states.put("louisiana", louisiana);

        State maine = new State("maine", 5.5, 114.5,	103.2,	119.8,
                113.7,	111.5,	128.7,	127.4, 53998);

        stateTaxRates = new double[] {0.058, 0.0675, 0.0715};
        statTaxBrackets = new double[] {0, 23000, 54450};
        maine.stateTaxRates = stateTaxRates;
        maine.stateTaxBrackets = statTaxBrackets;

        states.put("maine", maine);

        State maryland = new State("maryland",6, 124.1,	112.2,	157.0,
                106.9,	103.0,	94.4,	112.4, 70171);

        stateTaxRates = new double[] {0.02, 0.03, 0.04, 0.0475, 0.05, 0.0525, 0.055, 0.0575};
        statTaxBrackets = new double[] {0, 1000, 2000, 3000, 100000, 125000, 150000, 250000};
        maryland.stateTaxRates = stateTaxRates;
        maryland.stateTaxBrackets = statTaxBrackets;

        states.put("maryland", maryland);

        State massachusetts = new State("massachusetts", 6.25, 149.9,	113.0,	217.3,
                121.2,	134.0,	113.8,	120.6, 79830);

        stateTaxRates = new double[] {0.05};
        statTaxBrackets = new double[] {0};
        massachusetts.stateTaxRates = stateTaxRates;
        massachusetts.stateTaxBrackets = statTaxBrackets;

        states.put("massachusetts", massachusetts);

        State michigan = new State("michigan", 6.0, 91.7,	92.3,	82.1,
                98.2,	98.5,	95.8,	96.8, 58961);

        stateTaxRates = new double[] {0.0425};
        statTaxBrackets = new double[] {0};
        michigan.stateTaxRates = stateTaxRates;
        michigan.stateTaxBrackets = statTaxBrackets;

        states.put("michigan", michigan);

        State minnesota = new State("minnesota", 6.875, 95.1,	97.4,	83.5,
                95.6,	100.8,	109.0,	102.2, 64901);

        stateTaxRates = new double[] {0.0535, 0.068, 0.0785, 0.0985};
        statTaxBrackets = new double[] {0, 28080, 92230, 171220};
        minnesota.stateTaxRates = stateTaxRates;
        minnesota.stateTaxBrackets = statTaxBrackets;

        states.put("minnesota", minnesota);

        State mississippi = new State("mississippi", 7.0, 84.5,	91.9,	68.5,
                88.5,	92.6,	99.5,	91.2, 45674);

        stateTaxRates = new double[] {0.04, 0.05};
        statTaxBrackets = new double[] {5000, 10000};
        mississippi.stateTaxRates = stateTaxRates;
        mississippi.stateTaxBrackets = statTaxBrackets;

        states.put("mississippi", mississippi);

        State missouri = new State("missouri",4.225, 90.1,	96.8,	80.4,
                94.2,	97.8,	91.2,	92.8, 57199);

        stateTaxRates = new double[] {0.015, 0.02, 0.025, 0.03, 0.035, 0.04, 0.045, 0.05, 0.054};
        statTaxBrackets = new double[] {108, 1088, 2176, 3264, 4352, 5440, 6528, 7616, 8704};
        missouri.stateTaxRates = stateTaxRates;
        missouri.stateTaxBrackets = statTaxBrackets;

        states.put("missouri", missouri);

        State montana = new State("montana", 0, 105.3,	100.8,	115.7,
                83.9,	111.2,	97.9,	104.2, 50757);

        stateTaxRates = new double[] {0.01, 0.02, 0.03, 0.04, 0.05, 0.06, 0.0675};
        statTaxBrackets = new double[] {0, 3100, 5500, 8400, 11400, 14600, 18800};
        montana.stateTaxRates = stateTaxRates;
        montana.stateTaxBrackets = statTaxBrackets;

        states.put("montana", montana);

        State nebraska = new State("nebraska", 5.5, 91.1,	96.9,	81.6,
                88.8,	102.1,	99.3,	94.2, 59932);

        stateTaxRates = new double[] {0.0246, 0.0351, 0.0501, 0.0684};
        statTaxBrackets = new double[] {0, 3440, 20590, 33180};
        nebraska.stateTaxRates = stateTaxRates;
        nebraska.stateTaxBrackets = statTaxBrackets;

        states.put("nebraska", nebraska);

        State nevada = new State("nevada", 6.85, 101.9,	104.6,	112.9,
                98.3,	112.2,	93.4,	89.0, 55002);

        states.put("nevada", nevada);

        State newHampshire = new State("New Hampshire", 0.0, 114.7,	104.6,	107.4,
                113.7,	111.5,	128.7,	127.4, 67046);
        states.put("new hampshire", newHampshire);

        State newJersey = new State("new jersey", 6.625, 114.0,	107.0,	133.5,
                106.4,	111.4,	96.5,	103.7, 74249);

        stateTaxRates = new double[] {0.014, 0.0175, 0.035, 0.05525, 0.0637, 0.0897, 0.175};
        statTaxBrackets = new double[] {0, 20000, 35000, 40000, 75000, 500000, 1000000};
        newJersey.stateTaxRates = stateTaxRates;
        newJersey.stateTaxBrackets = statTaxBrackets;

        states.put("new jersey", newJersey);

        State newMexico = new State("new mexico", 5.0, 93.8,	96.8,	87.3,
                88.4,	101.0,	103.0,	97.4, 53305);

        stateTaxRates = new double[] {0.017, 0.032, 0.047, 0.049, 0.059};
        statTaxBrackets = new double[] {0, 5500, 11000, 16000, 210000};
        newMexico.stateTaxRates = stateTaxRates;
        newMexico.stateTaxBrackets = statTaxBrackets;

        states.put("new mexico", newMexico);

        State newYork = new State("new york", 4.0, 135.7,	109.2,	194.1,
                100.6,	105.6,	103.1,	114.9, 80772);

        stateTaxRates = new double[] {0.04, 0.045, 0.0525, 0.0585, 0.0625, 0.0685, 0.0965, 0.103, 0.109};
        statTaxBrackets = new double[] {0, 8500, 11700, 13900, 80650, 215400, 1077550, 5000000, 25000000};
        newYork.stateTaxRates = stateTaxRates;
        newYork.stateTaxBrackets = statTaxBrackets;

        states.put("new york", newYork);

        State northCarolina = new State("north carolina", 4.750, 96.9,	98.4,	94.0,
                93.2,	90.4,	110.9,	99.9, 58705);

        stateTaxRates = new double[] {0.0499};
        statTaxBrackets = new double[] {0};
        northCarolina.stateTaxRates = stateTaxRates;
        northCarolina.stateTaxBrackets = statTaxBrackets;

        states.put("north carolina", northCarolina);

        State northDakota = new State("north dakota", 5.0, 97.4,	103.5,	88.2,
                104.7,	101.5,	110.5,	98.2, 60165);

        stateTaxRates = new double[] {0.011, 0.0204, 0.0227, 0.0264, 0.029};
        statTaxBrackets = new double[] {0, 40525, 98100, 204675, 445000};
        northDakota.stateTaxRates = stateTaxRates;
        northDakota.stateTaxBrackets = statTaxBrackets;

        states.put("north dakota", northDakota);

        State ohio = new State("ohio", 5.75, 89.4,	100.8,	71.1,
                92.4,	95.6,	94.4,	98.5, 59491);

        stateTaxRates = new double[] {0.02765, 0.03226, 0.03688, 0.0399};
        statTaxBrackets = new double[] {25000, 44250, 88450, 110650};
        ohio.stateTaxRates = stateTaxRates;
        ohio.stateTaxBrackets = statTaxBrackets;

        states.put("ohio", ohio);

        State oklahoma = new State("oklahoma", 4.5, 86.7,	94.7,	72.4,
                95.0,	91.4,	91.5,	92.2, 56002);

        stateTaxRates = new double[] {0.0025, 0.0075, 0.0175, 0.0275, 0.0375, 0.0475};
        statTaxBrackets = new double[] {0, 1000, 2500, 3750, 4900, 7200};
        oklahoma.stateTaxRates = stateTaxRates;
        oklahoma.stateTaxBrackets = statTaxBrackets;

        states.put("oklahoma", oklahoma);

        State oregon = new State("oregon", 0, 122.2,	106.4,	156.1,
                91.3,	125.1,	109.2,	108.0, 63536);

        stateTaxRates = new double[] {0.0475, 0.0675, 0.0875, 0.099};
        statTaxBrackets = new double[] {0, 3650, 9200, 125000};
        oregon.stateTaxRates = stateTaxRates;
        oregon.stateTaxBrackets = statTaxBrackets;

        states.put("oregon", oregon);

        State pennsylvania = new State("pennsylvania", 6.0, 98.2,	102.9,	89.4,
                104.4,	106.1,	100.1,	100.1, 65216);

        stateTaxRates = new double[] {0.0307};
        statTaxBrackets = new double[] {0};
        pennsylvania.stateTaxRates = stateTaxRates;
        pennsylvania.stateTaxBrackets = statTaxBrackets;

        states.put("pennsylvania", pennsylvania);

        State rhodeIsland = new State("rhode island", 7.0, 111.2,	96.3,	113.8,
                123.5,	110.8,	101.6,	114.3, 61755);

        stateTaxRates = new double[] {0.0375, 0.0475, 0.0599};
        statTaxBrackets = new double[] {0, 68200, 155050};
        rhodeIsland.stateTaxRates = stateTaxRates;
        rhodeIsland.stateTaxBrackets = statTaxBrackets;

        states.put("rhode island", rhodeIsland);

        State southCarolina = new State("south carolina", 6.0, 96.3,	101.4,	89.5,
                108.6,	88.0,	96.8,	98.3, 53345);

        stateTaxRates = new double[] {0, 0.03, 0.04, 0.05, 0.06, 0.07};
        statTaxBrackets = new double[] {0, 3200, 6410, 9620, 12820, 16040};
        southCarolina.stateTaxRates = stateTaxRates;
        southCarolina.stateTaxBrackets = statTaxBrackets;

        states.put("south carolina", southCarolina);

        State southDakota = new State("South Dakota", 4.5, 96.1,	100.4,	99.6,
                91.9,	89.5,	98.6,	92.6, 58870);
        states.put("south dakota", southDakota);

        State tennessee = new State("Tennessee", 7.0, 90.3,	94.4,	84.0,
                94.7,	91.2,	87.8,	93.3, 59520);
        states.put("tennessee", tennessee);

        State texas = new State("Texas", 6.25, 92.6,	91.0,	84.8,
                105.9,	91.9,	94.8,	96.8, 63881);
        states.put("texas", texas);

        State utah = new State("utah", 4.85, 102.0,	99.5,	105.0,
                92.1,	110.3,	93.5,	103.0, 58683);

        stateTaxRates = new double[] {0.0495};
        statTaxBrackets = new double[] {0};
        utah.stateTaxRates = stateTaxRates;
        utah.stateTaxBrackets = statTaxBrackets;

        states.put("utah", utah);

        State vermont = new State("vermont", 6.0, 116.4,	106.8,	129.5,
                122.0,	121.3,	109.6,	106.3, 52720);

        stateTaxRates = new double[] {0.0335, 0.066, 0.076, 0.0875};
        statTaxBrackets = new double[] {25000, 40950, 99200, 206950};
        vermont.stateTaxRates = stateTaxRates;
        vermont.stateTaxBrackets = statTaxBrackets;

        states.put("vermont", vermont);

        State virginia = new State("virginia", 4.3, 102.1,	96.3,	108.3,
                100.1,	94.1,	102.7,	101.4, 67249);

        stateTaxRates = new double[] {0.02, 0.03, 0.05, 0.0575};
        statTaxBrackets = new double[] {0, 3000, 5000, 17000};
        virginia.stateTaxRates = stateTaxRates;
        virginia.stateTaxBrackets = statTaxBrackets;

        states.put("virginia", virginia);

        State washington = new State("Washington", 6.5, 114.0,	107.0,	133.5,
                106.4,	111.4,	96.5,	103.7, 78428);
        states.put("washington", washington);

        State westVirginia = new State("west virginia", 6.0, 89.8,	96.3,	76.9,
                91.7,	104.7,	97.1,	94.0, 52066);

        stateTaxRates = new double[] {0.03, 0.04, 0.045, 0.06, 0.065};
        statTaxBrackets = new double[] {0, 10000, 25000, 40000, 60000};
        westVirginia.stateTaxRates = stateTaxRates;
        westVirginia.stateTaxBrackets = statTaxBrackets;

        states.put("west virginia", westVirginia);

        State wisconsin = new State("wisconsin", 5.0, 93.9,	97.0,	84.4,
                105.6,	95.2,	110.1,	95.3, 58961);

        stateTaxRates = new double[] {0.0354, 0.0465, 0.0530, 0.0765};
        statTaxBrackets = new double[] {0, 12760, 25520, 280950};
        wisconsin.stateTaxRates = stateTaxRates;
        wisconsin.stateTaxBrackets = statTaxBrackets;

        states.put("wisconsin", wisconsin);

        State wyoming = new State("wyoming", 4.0, 91.66,	101.4,	80.4,
                81.7,	96.4,	98.2,	98.6, 55961);

        states.put("wyoming", wyoming);
    }
}
