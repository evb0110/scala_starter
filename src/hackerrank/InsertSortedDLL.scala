package hackerrank

object InsertSortedDLL {

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

  // Complete the sortedInsert function below.

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
  def sortedInsert(llist: DoublyLinkedListNode, data: Int): DoublyLinkedListNode = {
    val newNode = new DoublyLinkedListNode(data)

    if (llist == null) {
      newNode.next = null
      newNode.prev = null
      newNode
    } else {
      if (llist.data > data) {
        newNode.next = llist
        newNode.prev = null
        newNode
      } else {
        llist.next = sortedInsert(llist.next, data)
        llist
      }
    }
  }
}
