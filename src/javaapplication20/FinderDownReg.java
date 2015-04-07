/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication20;

/**
 *
 * @author Arsalan
 */

import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;

public class FinderDownReg {

    PolyASignal[] site = new PolyASignal[38];

    ArrayList<String> arraylist1 = new ArrayList<String>();
    ArrayList<Integer> arraylist2 = new ArrayList<Integer>();

    static int counter1 = 0;
    static int counter2 = 0;
    static int counter3 = 0;
    static int counter4 = 0;
    static int counter5 = 0;
    static int counter6 = 0;
    static int counter7 = 0;
    static int counter8 = 0;
    static int counter9 = 0;
    static int counter10 = 0;
    static int counter11 = 0;
    static int counter12 = 0;
    static int counter13 = 0;

    public void fileRead() throws IOException
    {

        String[] filename = {"Text1downreg.txt","Text6downreg.txt","Text8downreg.txt","Text9downreg.txt","Text10downreg.txt"
                            ,"Text11downreg.txt","Text12downreg.txt","Text13downreg.txt","Text15downreg.txt","Text18downreg.txt"
                            ,"Text19downreg.txt","Text20downreg.txt","Text21downreg.txt","Text26downreg.txt","Text27downreg.txt"
                            ,"Text28downreg.txt","Text30downreg.txt","Text31downreg.txt","Text33downreg.txt","Text35downreg.txt"
                            ,"Text42downreg.txt","Text43downreg.txt","Text44downreg.txt","Text45downreg.txt","Text49downreg.txt"
                            ,"Text51downreg.txt","Text54downreg.txt","Text55downreg.txt","Text57downreg.txt","Text60downreg.txt"
                            ,"Text63downreg.txt","Text66downreg.txt","Text71downreg.txt","Text72downreg.txt","Text74downreg.txt"
                            ,"Text75downreg.txt","Text77downreg.txt","Text88downreg.txt"};


        int start_pos = 0;
        int stop_pos = 0;

        int k = 0;

        for(int j=0;j<filename.length;j++)
        {

        File file = new File(filename[j]);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        site[k] = new PolyASignal();

        String str1 = "";
        String str2 = "";


        int counter = 0;

        while((str1 = br.readLine()) != null)
        {

            String[] token = str1.split(":");

            //String[] token2 = str1.split("\\w+:>\\w+|\\s+");
            String[] token2 = str1.split("\\|");
            if(counter == 0)
            {
                site[k].transcriptID = token2[1];
                counter++;
            }

            for(int i=0;i<token.length;i++)
            {

                if(token.length == 1)
                 {
                    str2 = str2 + token[i];
                 }

                if(token[i].equals("start"))
                {
                    start_pos = Integer.parseInt(token[i+1]);
                }

                if(token[i].equals("stop"))
                {
                    stop_pos = Integer.parseInt(token[i+1]);
                }
            }


        }

        start_pos = start_pos - 10;
        stop_pos = stop_pos + 10;

        

        String sub_str = "";

        Matcher matcher;
        Pattern pattern1 = Pattern.compile("AATAAA");
        Pattern pattern2 = Pattern.compile("ATTAAA");
        Pattern pattern3 = Pattern.compile("TATAAA");
        Pattern pattern4 = Pattern.compile("AGTAAA");
        Pattern pattern5 = Pattern.compile("AAGAAA");
        Pattern pattern6 = Pattern.compile("AATATA");
        Pattern pattern7 = Pattern.compile("AATACA");
        Pattern pattern8 = Pattern.compile("CATAAA");
        Pattern pattern9 = Pattern.compile("GATAAA");
        Pattern pattern10 = Pattern.compile("AATGAA");
        Pattern pattern11 = Pattern.compile("TTTAAA");
        Pattern pattern12 = Pattern.compile("ACTAAA");
        Pattern pattern13 = Pattern.compile("AATAGA");

        int totalscore = 0;
        sub_str = str2.substring(start_pos, stop_pos);

        matcher = pattern1.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "AATAAA(13) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 13;
            counter1++;
        }

        matcher = pattern2.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "ATTAAA(12) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 12;
            counter2++;
        }

        matcher = pattern3.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "TATAAA(11) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 11;
            counter3++;
        }

        matcher = pattern4.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "AGTAAA(10) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 10;
            counter4++;
        }

        matcher = pattern5.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "AAGAAA(9) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 9;
            counter5++;
        }

        matcher = pattern6.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "AATATA (8) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 8;
            counter6++;
        }

        matcher = pattern7.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "AATACA (7) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 7;
            counter7++;
        }

        matcher = pattern8.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "CATAAA (6) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 6;
           // site[k].score = score + 6;
            counter8++;
        }

        matcher = pattern9.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "GATAAA (5) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 5;
            //site[k].score = score + 5;
            counter9++;
        }

        matcher = pattern10.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "AATGAA (4) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 4;
            //site[k].score = score + 4;
            counter10++;
        }

        matcher = pattern11.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "TTTAAA (3) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 3;
           // site[k].score = score + 3;
            counter11++;
        }

        matcher = pattern12.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "ACTAAA (2) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 2;
            //site[k].score = score + 2;
            counter12++;
        }

        matcher = pattern13.matcher(sub_str);
        while(matcher.find())
        {
            site[k].signal = site[k].signal + "AATAGA (1) : " + (start_pos + matcher.start() +1) + "\t";
            totalscore = totalscore + 1;
            //site[k].score = score + 1;
            counter13++;
        }



        //site[k].signal = site[k].signal + "Start Position : " + start_pos + "\t" + "Stop Position : " + stop_pos;
        site[k].position = "Start Position : " + start_pos + "\t" + "Stop Position : " + stop_pos;
        site[k].score = totalscore;

        // searching for Poly (A) signal till beginning of Poly (A) site
        String sub_str1 = str2.substring(0,start_pos);
        matcher = pattern1.matcher(sub_str1);

        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AATAAA (13) : " + (matcher.start()+1) + "\t";
            //site[k].score = score + 13;
            counter1++;
        }

        matcher = pattern2.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "ATTAAA (12) : " + (matcher.start()+1) + "\t";
           // site[k].score = score + 12;
            counter2++;
        }

        matcher = pattern3.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "TATAAA (11) : " + (matcher.start() + 1) + "\t";
           // site[k].score = score + 11;
            counter3++;
        }

        matcher = pattern4.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AGTAAA (10) : " + (matcher.start() + 1) + "\t";
           // site[k].score = score + 10;
            counter4++;
        }

        matcher = pattern5.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AAGAAA (9) : " + (matcher.start() +1) + "\t";
           // site[k].score = score + 9;
            counter5++;
        }

        matcher = pattern6.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AATATA (8) : " + (matcher.start()+1) + "\t";
           // site[k].score = score + 8;
            counter6++;
        }

        matcher = pattern7.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AATACA (7) : " + (matcher.start()+1) + "\t";
            //site[k].score = score + 7;
            counter7++;
        }

        matcher = pattern8.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "CATAAA (6) : " + (matcher.start()+1) + "\t";
           // site[k].score = score + 6;
            counter8++;
        }

        matcher = pattern9.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "GATAAA (5) : " + (matcher.start()+1)  + "\t";
            //site[k].score = score + 5;
            counter9++;
        }

        matcher = pattern10.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AATGAA (4) : " + (matcher.start()+1) + "\t";
            //site[k].score = score + 4;
            counter10++;
        }

        matcher = pattern11.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "TTTAAA (3) : " + (matcher.start() + 1)  + "\t";
           // site[k].score = score + 3;
            counter11++;
        }

        matcher = pattern12.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "ACTAAA (2) : " + (matcher.start() + 1)  + "\t";
            //site[k].score = score + 2;
            counter12++;
        }

        matcher = pattern13.matcher(sub_str1);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AATAGA (1) : " + (matcher.start() +1)  + "\t";
            //site[k].score = score + 1;
            counter13++;
        }

        // searching for Poly (A) signal after end of of Poly (A) site
        String sub_str2 = str2.substring(stop_pos,(str2.length()));
        matcher = pattern1.matcher(sub_str2);

        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AATAAA (13) : " + (stop_pos + matcher.start()+1) + "\t";
            //site[k].score = score + 13;
            counter1++;
        }

        matcher = pattern2.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "ATTAAA (12) : " + (stop_pos + matcher.start()+1) + "\t";
           // site[k].score = score + 12;
            counter2++;
        }

        matcher = pattern3.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "TATAAA (11) : " + (stop_pos + matcher.start() + 1) + "\t";
           // site[k].score = score + 11;
            counter3++;
        }

        matcher = pattern4.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AGTAAA (10) : " + (stop_pos + matcher.start() + 1) + "\t";
           // site[k].score = score + 10;
            counter4++;
        }

        matcher = pattern5.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AAGAAA (9) : " + (stop_pos + matcher.start() +1) + "\t";
           // site[k].score = score + 9;
            counter5++;
        }

        matcher = pattern6.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AATATA (8) : " + (stop_pos + matcher.start()+1) + "\t";
           // site[k].score = score + 8;
            counter6++;
        }

        matcher = pattern7.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AATACA (7) : " + (stop_pos + matcher.start()+1) + "\t";
            //site[k].score = score + 7;
            counter7++;
        }

        matcher = pattern8.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "CATAAA (6) : " + (stop_pos + matcher.start()+1) + "\t";
           // site[k].score = score + 6;
            counter8++;
        }

        matcher = pattern9.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "GATAAA (5) : " + (stop_pos + matcher.start()+1)  + "\t";
            //site[k].score = score + 5;
            counter9++;
        }

        matcher = pattern10.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AATGAA (4) : " + (stop_pos + matcher.start()+1) + "\t";
            //site[k].score = score + 4;
            counter10++;
        }

        matcher = pattern11.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "TTTAAA (3) : " + (stop_pos + matcher.start() + 1)  + "\t";
           // site[k].score = score + 3;
            counter11++;
        }

        matcher = pattern12.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "ACTAAA (2) : " + (stop_pos + matcher.start() + 1)  + "\t";
            //site[k].score = score + 2;
            counter12++;
        }

        matcher = pattern13.matcher(sub_str2);
        while(matcher.find())
        {
            site[k].signal_rest = site[k].signal_rest + "AATAGA (1) : " + (stop_pos + matcher.start() +1)  + "\t";
            //site[k].score = score + 1;
            counter13++;
        }

        k++;

        }

    }

    public void bubblesort() throws IOException
    {
        int temp_score = 0;
        String temp_id = "";
        String temp_signal = "";
        String temp_signalRest = "";
        String temp_position = "";
        
        for(int i=0;i<site.length;i++)
        {
            for(int j=0;j<(site.length-1);j++)
            {
                if(site[j].score>site[j+1].score)
                {
                    temp_score = site[j].score;
                    site[j].score = site[j+1].score;
                    site[j+1].score = temp_score;

                    temp_id = site[j].transcriptID;
                    site[j].transcriptID = site[j+1].transcriptID;
                    site[j+1].transcriptID = temp_id;

                    temp_signal = site[j].signal;
                    site[j].signal = site[j+1].signal;
                    site[j+1].signal = temp_signal;

                    temp_signalRest = site[j].signal_rest;
                    site[j].signal_rest = site[j+1].signal_rest;
                    site[j+1].signal_rest = temp_signalRest;

                    temp_position = site[j].position;
                    site[j].position = site[j+1].position;
                    site[j+1].position = temp_position;


                }
            }
        }


        File file1 = new File("Alu downreg.txt");
        FileReader fr1 = new FileReader(file1);
        BufferedReader br1 = new BufferedReader(fr1);

        String str2 = "";
        br1.readLine();

        int counter;

        int count = 0;

        while((str2 = br1.readLine()) != null)
        {
            counter = 0;
            String[] token = str2.split("\\s+");

            if(token.length == 3)
            {
               // site[count].signal = site[count].signal + "\t" + "Alu start : " + token[0] + "\t" + "S/L N : " + token[1] + "\t" + "S/L T : " + token[2];

                String[] token1 = site[count].signal.split("\\D+");
                String[] token2 = token[0].split("\\*");
/*
                System.out.println(token2.length);
                for(int i=0;i<token2.length;i++)
                {
                    System.out.println(token2[i]);
                }
                System.out.println(); */
               
                if(token1.length > 1)
                {
                  //  System.out.println(token1.length);
                    for(int i=1;i<token1.length;i++)
                    {
                        if(Integer.parseInt(token1[i]) > 13)
                        {
                            
                            for(int j=0;j<token2.length;j++)
                            {
                                
                                if(Math.abs(Integer.parseInt(token2[j]) - Integer.parseInt(token1[i])) <=100 || Math.abs(Integer.parseInt(token2[j]) - Integer.parseInt(token1[i])) <=500 )
                                {
                                        if(counter == 0)
                                        {
                                            site[count].signal = site[count].signal + "\t" + "Alu Position : " + token2[j] + "\t" + "S/L N : " + token[1] + "\t" + "S/L T : " + token[2];
                                            arraylist2.add(count);
                                            arraylist1.add(site[count].signal);
                                            counter++;
                                        }
                                }
                            }

                        }
                        
                    }
               // System.out.println();

                    

                }
                

              //  String[] token1 = token[0].split("\\*");


/*
            System.out.println("*********************************************************************************");
            System.out.println("File : " + (count+1));
            System.out.println(site[count].transcriptID);
            System.out.println(site[count].signal_rest);
            System.out.println(site[count].signal);
            System.out.println("score : " + site[count].score);
            System.out.println("*********************************************************************************");
            System.out.println(); */



                count++;


                


            }
        }

        int index;

        for(int i=0;i<arraylist1.size();i++)
        {
            System.out.println("*********************************************************************************");
            index = arraylist2.get(i);
            System.out.println(site[index].transcriptID);
            System.out.println(site[index].signal_rest);
            System.out.println(arraylist1.get(i) + "\t" + site[index].position);
            System.out.println("score : " + site[index].score);
            System.out.println("*********************************************************************************");
        }

        

    }
/*
    public void print()
    {       for(int i=0;i<site.length;i++)
        {
            System.out.println("*********************************************************************************");
            System.out.println("File : " + (i+1));
            System.out.println(site[i].transcriptID);
            System.out.println(site[i].signal_rest);
            System.out.println(site[i].signal);
            System.out.println("score : " + site[i].score);
            System.out.println("*********************************************************************************");
            System.out.println();
        }
    }
*/
}
