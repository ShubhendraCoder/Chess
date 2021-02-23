package com.ncr.chess;

/*
 * @ author Shubhendra
 * */
public class ChessBoard implements ChessBoardInterface {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }
    
    /**
     * @param pawn
     * @param xCoordinate
     * @param yCoordinate
     * @param pieceColor
     */
    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        try {
          if( this.pieces[xCoordinate][yCoordinate]==null) {
            this.pieces[xCoordinate][yCoordinate]=pawn;
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pawn.setChessBoard(this);
          }else {
        	  setNullValue(pawn);
          }
          
        }catch(IndexOutOfBoundsException ex){
        	 setNullValue(pawn);
        }
          
    }
    
    /**
     * @param pawn
     */
    private void setNullValue(Pawn pawn) {
    	pawn.setXCoordinate(-1);
        pawn.setYCoordinate(-1);
    }
    
    /**
     * @param xCoordinate
     * @param yCoordinate
     * @return boolean
     */
    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
    	if(xCoordinate>-1 && yCoordinate>-1) {
            if(xCoordinate<MAX_BOARD_WIDTH+1 && yCoordinate<MAX_BOARD_HEIGHT+1) {
            	return true;
            }
    	} 
            return false;
    }
}
