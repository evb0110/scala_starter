package hackerrank

import scala.annotation.tailrec

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
  def reverse(llist: DoublyLinkedListNode): DoublyLinkedListNode = {
    if (llist == null) llist

    @tailrec
    def helper(node1: DoublyLinkedListNode, node2: DoublyLinkedListNode): DoublyLinkedListNode = {
      val newNode1 = new DoublyLinkedListNode(node1.data, node1.prev, node1.next)
      val newNode2 = new DoublyLinkedListNode(node2.data, node2.prev, node2.next)
      if (newNode2.prev == null) newNode2
      else helper(node2, node2.next)
    }

    helper(llist, llist.next)

  }
}
