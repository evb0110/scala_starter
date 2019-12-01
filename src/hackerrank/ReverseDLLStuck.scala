package hackerrank

object ReverseDLLStuck {

  class DoublyLinkedListNode(var data: Int, var next: DoublyLinkedListNode = null, var prev: DoublyLinkedListNode = null) {
  }

  class DoublyLinkedList(var head: DoublyLinkedListNode = null, var tail: DoublyLinkedListNode = null) {
    def insertNode(nodeData: Int): Unit = {
      val node = new DoublyLinkedListNode(nodeData)

      if (this.head == null) {
        this.head = node
      } else {
        this.tail.next = node
        node.prev = this.tail
      }

      this.tail = node
    }
  }


  // Complete the reverse function below.

  /*
   * For your reference:
   *
   * DoublyLinkedListNode {
   *     data: Int
   *     next: DoublyLinkedListNode
   *     prev: DoublyLinkedListNode
   * }
   *
   */
  //  def reverse(llist: DoublyLinkedListNode): DoublyLinkedListNode = {
  //
  //
  //    def reverseList(h: DoublyLinkedListNode, currentList: DoublyLinkedList): Unit = {
  //      if (h.next == null) {
  //        new DoublyLinkedListNode(h.data, h.prev, h.next)
  //      }
  //      else {
  //
  //      }
  //
  //
  //    }
  //
  //
  //  }
}
