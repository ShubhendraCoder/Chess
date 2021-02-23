package com.ncr.chess;
/*
 * @ author Shubhendra
 * */
public class Pawn implements PawnInterface {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }
    
    /**
    *
    * @return ChessBoard
    */
    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }
    
    /**
    *
    * @return int
    */
    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }
    
    /**
    *
    * @return int
    */
    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }
    
    /**
    *
    * @return PieceColor
    */
    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }
    
    /**
     * @param movementType
     * @param newX
     * @param newY
     */
    public void move(MovementType movementType, int newX, int newY) {
    	if(movementType==MovementType.MOVE) {
	    	switch(this.pieceColor) {
		    	case WHITE:
		    		if (this.yCoordinate+1 == newY) {	
		       		 coordinateChanges(newX,newY);
		       	    }
		    	case BLACK:
		    		if (this.yCoordinate-1 == newY) {	
		          		 coordinateChanges(newX,newY);
		          	    }
	    	}
    	}
    }
    
    /**
     * @param newX
     * @param newY
     */
    private void coordinateChanges(int newX, int newY) {
    	if(this.xCoordinate == newX ||this.xCoordinate-1 == newX ||this.xCoordinate+1 == newX ) {
				this.xCoordinate=newX;
				this.yCoordinate=newY;
			}
    }

    @Override
    public String toString() {
        return getCurrentPositionAsString();
    }

    protected String getCurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}
