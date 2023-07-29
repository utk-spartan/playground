import adt.*

object Main {


  def main(args: Array[String]): Unit = {
    println((Tree.leaf(1)).getClass)
    // println(adt.Leaf(1))


    val makeTree = Tree.branch(Tree.leaf(1), Tree.leaf(2))

    println(Tree.cell(Tree.left(makeTree)))
    // println(Tree.cell(makeTree))
  }
}