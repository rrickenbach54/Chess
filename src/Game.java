import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game
{
    public int [][] board = new int [8][8];
    Map<Integer,Map<Integer,String>> white = new HashMap<Integer, Map<Integer, String>>();
    Map<Integer,Map<Integer,String>> black = new HashMap<Integer, Map<Integer, String>>();
    public static void main(String[] args)
    {
        Game game = new Game();
        //Initialize teams
        game.populateTeams();

        //Place Teams
        game.placeTeams();


        //Print the board
        game.printBoard();



    }

    private void placeTeams()
    {
        for (int i = 0; i <8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if(i==0)
                {
                    if(((7*i) +j) == 0 || ((7*i) +j) == 7)
                    {
                        white.get(((7*i)+j)).put(((7*i)+j),"R");
                    }
                    if(((7*i) +j) == 1 || ((7*i) +j) == 6)
                    {
                        white.get(((7*i)+j)).put(((7*i)+j),"N");
                    }
                    if(((7*i) +j) == 2 || ((7*i) +j) == 5)
                    {
                        white.get(((7*i)+j)).put(((7*i)+j),"B");
                    }
                    if(((7*i) +j) == 3)
                    {
                        white.get(((7*i)+j)).put(((7*i)+j),"Q");
                    }
                    if(((7*i) +j) == 4)
                    {
                        white.get(((7*i)+j)).put(((7*i)+j),"K");
                    }
                }
                else
                {
                    if ((((7 * i) + j)+1) >= 8 && (((7 * i) + j)+1) <= 15)
                    {
                        white.get(((7 * i) + j)+1).put(((7 * i) + j), "P");
                    }
                    if(((7*i) +j) == 56 || ((7*i) +j) == 63)
                    {
                        black.get(((7*i)+j)).put(((7*i)+j),"R");
                    }
                    if(((7*i) +j) == 57 || ((7*i) +j) == 62)
                    {
                        black.get(((7*i)+j)).put(((7*i)+j),"N");
                    }
                    if(((7*i) +j) == 57 || ((7*i) +j) == 61)
                    {
                        black.get(((7*i)+j)).put(((7*i)+j),"B");
                    }
                    if(((7*i) +j) == 59)
                    {
                        black.get(((7*i)+j)).put(((7*i)+j),"Q");
                    }
                    if(((7*i) +j) == 60)
                    {
                        black.get(((7*i)+j)).put(((7*i)+j),"K");
                    }
                    if(((7*i) + j) >= 48 && ((7*i) + j) <= 55)
                    {
                        black.get(((7*i)+j)).put(((7*i)+j),"P");
                    }
                }
            }
        }
//
//        int counter =0;
//        for (int i = 6; i <8; i++)
//        {
//
//            for (int j = 0; j < 8; j++)
//            {
//
//            }
//            counter++;
//        }
    }

    private void populateTeams()
    {
        for (int i = 0; i < 16; i++)
        {
            Map<Integer, String> innerWhite = white.get(i);
            Map<Integer, String> innerBlack = white.get(i);
            if(innerWhite == null)
            {
                innerWhite = new HashMap<Integer, String>();
                white.put(i,innerWhite);
            }
            if(innerBlack == null)
            {
                innerBlack = new HashMap<Integer, String>();
                black.put(i,innerBlack);
            }
        }
    }

    private void printBoard()
    {
        StringBuilder display = new StringBuilder();
        for (int i = 0; i <board.length+1; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                if(i==0)
                {
                    display.append("     " + (j +1));
                }
                else
                display.append("    " + "[]");
            }
            display.append("\r\n\r\n");
            if(i==board.length)
            {
                //Do nothing
            }
            else
            {
                display.append((char) (i + 65));
            }

        }
        System.out.print(display);

    }
}
