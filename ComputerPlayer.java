import java.util.Random;

public class ComputerPlayer extends Player {
    // create a random number generator
    // this is needed because the computer's first move is random
    Random rand = new Random();
 // --------------------------------------------

    // constructor
    public ComputerPlayer(char token) {
        super(token);
    }

 // --------------------------------------------
    // generate a Move
    @Override
    public Move generateMove(Board ticTacToeBoard) {
        // create a Move object
        Move m = new Move();

        // is the board empty?  if so, just pick a random spot
        if (ticTacToeBoard.isEmpty()) {
            // pick a random number
            int goFirst = rand.nextInt(9);

            // store value in our move
            m.setRow(goFirst/3);
            m.setCol(goFirst%3);

            return m;
        }
        // otherwise we have to pick a spot (row and col)  for our next move
        else {
            // set up a row and column variable
            int row=-1, col=-1;
            // define our token
            char myToken = getToken();

             for (int i=0;i<3;i++){
             for (int j=0;j<3;j++){
                 char s = ticTacToeBoard.getStatus(i,j);
                 if (s == ticTacToeBoard.OPEN){
                     m.setRowCol(i,j); return m;
                  }
             } // end for j
             } // end for i
        }// end else
       return null;
    }

 // --------------------------------------------

    public String toString(){
      return "is a computer";
    }

}
