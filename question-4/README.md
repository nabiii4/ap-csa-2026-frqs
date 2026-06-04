public int getPointsForRow(int targetRow){
    int total = 0;
    String firstColor = board[targetRow][0].getColor();
    boolean sameColor= true;
    for (int c=0; c<board[targetRow].length; c++){
        total += board[targetRow][col].getPoints();

        if (!board[targetRow][c].getColor().equals(firstColor)){
            sameColor = false;
        }
    }

    if(sameColor){
        return total * 2;
    }
    return total;
}
