package com.ncr.chess;
/*
 * @ author Shubhendra
 * Pawn Interface
 * */
public interface PawnInterface {
	/**
     * @param movementType
     * @param newX
     * @param newY
     */
	  public void move(MovementType movementType, int newX, int newY);
}
