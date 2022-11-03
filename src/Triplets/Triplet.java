package Triplets;

import Cell.Cell;

import java.util.LinkedList;

public interface Triplet {
    void putUpperList(LinkedList<Cell> upperList);
    void putCurrentList(LinkedList<Cell> currentList);
    void putLowerList(LinkedList<Cell> lowerList);
    LinkedList<Cell> getUpperList();
    LinkedList<Cell> getCurrentList();
    LinkedList<Cell> getLowerList();


}
