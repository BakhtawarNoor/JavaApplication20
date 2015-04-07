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

public class Finder {

    PolyASignal[] site = new PolyASignal[35];

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
        String[] filename = {"Text1.txt","Text10.txt","Text3.txt","Text5.txt","Text6.txt","Text15.txt","Text16.txt","Text18.txt"
                            ,"Text11.txt","Text22.txt","Text23.txt","Text24.txt","Text25.txt","Text32.txt","Text34.txt","Text36.txt"
                            ,"Text39.txt","Text41.txt","Text42.txt","Text47.txt","Text49.txt","Text51.txt","Text53.txt","Text56.txt"
                            ,"Text57.txt","Text58.txt","Text61.txt","Text62.txt","Text64.txt","Text66.txt","Text74.txt","Text80.txt"
                            ,"Text82.txt","Text83.txt","Text84.txt"};

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

        int mid = (stop_pos - start_pos)/2;
        int cleavage_site = mid + start_pos;

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

    // arraging the transcripts on the basis of score (lowest to highest)
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

       File file1 = new File("Alu.txt");
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

                String[] token1 = site[count].signal.split("\\D+");
                String[] token2 = token[0].split("\\*");

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
                }

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

}
