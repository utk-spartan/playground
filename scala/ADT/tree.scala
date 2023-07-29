package adt

sealed trait Tree

private case class Leaf(value: Any) extends Tree
private case class Branch(left: Tree, right: Tree) extends Tree

object Tree {
    def leaf(a: Any): Tree = Leaf(a)
    def branch(left: Tree, right: Tree): Tree = Branch(left, right)
    def cell(a: Tree) = a match {
        case e: Leaf => e.value
    }
    // def cell(a: Leaf) = a.value
    def left(a: Tree): Tree = a match {
        case e: Branch => e.left
    }

    def right(a: Tree): Tree = a match {
        case e: Branch => e.right
    }
    def isLeaf(a: Tree): Boolean = a match {
        case _: Leaf => true
        case _: Branch => false
    }
}

// module TreeADT (Tree, leaf, branch, cell, 
//                 left, right, isLeaf) where

// data Tree a             = Leaf a | Branch (Tree a) (Tree a)

// leaf                    :: a -> Tree a
// leaf                    = Leaf

// branch                  :: Tree a -> Tree a -> Tree a
// branch                  = Branch

// cell                    :: Tree a -> a
// cell  (Leaf a)          = a

// left, right             :: Tree a -> Tree a
// left  (Branch l r)      = l
// right (Branch l r)      = r

// isLeaf                  :: Tree a -> Bool
// isLeaf   (Leaf _)       = True
// isLeaf   _              = False