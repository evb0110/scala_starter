package hackerrank

object GetNodeValue {


  class SinglyLinkedListNode(var data: Int, var next: SinglyLinkedListNode = null) {
  }

  class SinglyLinkedList(var head: SinglyLinkedListNode = null, var tail: SinglyLinkedListNode = null) {
    def insertNode(nodeData: Int) = {
      val node = new SinglyLinkedListNode(nodeData)

      if (this.head == null) {
        this.head = node
      } else {
        this.tail.next = node
      }

      this.tail = node
    }
  }

  // Complete the getNode function below.

  /*
   * For your reference:
   *
   * SinglyLinkedListNode {
   *     data: Int
   *     next: SinglyLinkedListNode
   * }
   *
   */
  def getNode(llist: SinglyLinkedListNode, positionFromTail: Int): Int = {
    def nNext(llist: SinglyLinkedListNode, n: Int): SinglyLinkedListNode = {
      if (n == 0) llist
      else nNext(llist.next, n - 1)
    }

    def nthFromEnd(llist: SinglyLinkedListNode, n: Int): SinglyLinkedListNode = {
      if (nNext(llist, n).next == null) llist
      else nthFromEnd(llist.next, n)
    }

    nthFromEnd(llist, positionFromTail).data
  }


}
