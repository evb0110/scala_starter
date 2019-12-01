package hackerrank

import scala.annotation.tailrec

object RemoveDuplicatesLL {

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


  // Complete the removeDuplicates function below.

  /*
   * For your reference:
   *
   * SinglyLinkedListNode {
   *     data: Int
   *     next: SinglyLinkedListNode
   * }
   *
   */
  def removeDuplicates(head: SinglyLinkedListNode): SinglyLinkedListNode = {

    @scala.annotation.tailrec
    def traverse(h: SinglyLinkedListNode): Unit = {
      if (h.next != null) {
        if (h.data == h.next.data) {
          h.next = h.next.next
          traverse(h)
        } else {
          traverse(h.next)
        }
      }
    }

    traverse(head)
    head
  }


}
