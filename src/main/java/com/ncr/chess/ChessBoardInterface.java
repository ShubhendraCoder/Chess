package com.ncr.chess;
/*
 * @ author Shubhendra
 * ChessBoard Interface
 * */
public interface ChessBoardInterface {
	 /**
     * @param pawn
     * @param xCoordinate
     * @param yCoordinate
     * @param pieceColor
     */
    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor);
    
    /**
     * @param xCoordinate
     * @param yCoordinate
     * @return boolean
     */
    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate);
}
