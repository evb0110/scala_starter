package hackerrank

object ReverseLL extends App {

  class SinglyLinkedListNode(var data: Int, var next: SinglyLinkedListNode = null) {
  }

  class SinglyLinkedList(var head: SinglyLinkedListNode = null, var tail: SinglyLinkedListNode = null) {
    def insertNode(nodeData: Int): Unit = {
      val node = new SinglyLinkedListNode(nodeData)

      if (this.head == null) {
        this.head = node
      } else {
        this.tail.next = node
      }

      this.tail = node
    }
  }

  def printSinglyLinkedList(head: SinglyLinkedListNode, sep: String): Unit = {
    var node = head

    while (node != null) {
      print(node.data)

      node = node.next

      if (node != null) {
        print(sep)
      }
    }
  }

  def reversePrint(head: SinglyLinkedListNode) {
    if (head.next == null) println(head.data)
    else {
      val currentHeadData = head.data
      val newHead = head.next
      reversePrint(newHead)
      println(currentHeadData)
    }
  }
}
