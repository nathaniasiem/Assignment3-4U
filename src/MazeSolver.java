/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class MazeSolver {

    public void prntMaze(char[][] maze) {
        //loop through all rows
        for (int i = 0; i < maze.length; i++) {
            //go through each position of the row
            for (int j = 0; j < maze[i].length; j++) {
                //print out current location
                System.out.print(maze[i][j]);
            }
            //move down to next line for printing
            System.out.println("");
        }
    }

    public boolean solveMaze(char[][] maze, int row, int col) {
        //am I off the map
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length) {
            return false;

        }//did I find the end
        if (maze[row][col] == 'E') {
            prntMaze(maze);
            return true;
        }
        //is this a bad spot
        if (maze[row][col] == '+' || maze[row][col] == 'W') {
            return false;
        }
        //I'm a valid location
        //mark I've been here
        maze[row][col] = '+';
        //check north
        boolean check = solveMaze(maze, row - 1, col);
        if (check) {
            return true;
        }
        //check east
        check = solveMaze(maze, row, col + 1);
        if (check) {
            return true;

        }
        //check south
        check = solveMaze(maze, row + 1, col);
        if (check) {
            return true;
        }
        //check west
        check = solveMaze(maze, row, col - 1);
        if (check) {
            return true;
        }
        //spot no good
        //unmoving
        maze[row][col] = '.';
        return false;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2D array
        //create maze that is 10x10 (LONG WAY)
        //char[][] maze = new char [10][10];

        char[][] maze = {{'W', 'W', 'W', 'W', '.', '.'},
                         {'S', '.', 'W', '.', 'W', '.'},
                         {'W', '.', 'W', '.', 'W', '.'},
                         {'W', '.', '.', '.', '.', '.'},
                         {'W', 'W', 'W', 'E', 'W', 'W'}};
        //create variable to test boundaries
        //used to print out maze
        MazeSolver test = new MazeSolver();
        test.prntMaze(maze);
        System.out.println("");
        test.solveMaze(maze, 1, 0);

    }
}
