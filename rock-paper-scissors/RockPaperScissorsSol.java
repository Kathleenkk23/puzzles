import java.io.*;  
import java.util.Scanner;  


class RockPaperScissorsSol{
    public static int calculate(String in){
        int score = 0;
        String[] input = in.split(" ");
                int opponent = -1;
                int me = -1;
                switch (input[0]){
                    case "A": //rock
                        opponent = 0;
                        break;
                    case "B": //paper
                        opponent = 1;
                        break;
                    case "C": //scissor
                        opponent = 2;
                        break;
                }
                switch (input[1]){
                    case "X": //rock
                        me = 0;
                        score += 1;
                        break;
                    case "Y": //paper
                        me = 1;
                        score += 2;
                        break;
                    case "Z": //scissor
                        me = 2;
                        score += 3;
                        break;
                }
                if(me == -1 || opponent == -1){
                    return -1;
                }
                if(me == opponent){
                    score += 3;
                }
                else if(me  == opponent-1 || me == 2 && opponent == 0){
                    score += 0;
                }else{
                    score += 6;
                }

                // System.out.println("combo of " + opponent + " " + input[0] + " and "+ me 
                // + " " + input[1] + " has score of: "+ score); 
                return score;
    }
    public static void main(String args[]){
        int sum = 0;
        try  
        {  
            FileInputStream fis=new FileInputStream("rock-paper-scissors-test-case.txt");       
            Scanner sc = new Scanner(fis);    
            while(sc.hasNextLine())  
            {  
                String line = sc.nextLine();
                int score = calculate(line);
                sum+=score;    
            }  
                sc.close();    
            }  
        catch(IOException e)  
        {  
            e.printStackTrace();  
        } 
        System.out.println(sum); 
    }
}
