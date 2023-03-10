public class B86 {
    public L86 partition(L86 head, int x) {
        L86 dummy1 = new L86(0), dummy2 = new L86(0); // create two dummy nodes
        L86 curr1 = dummy1, curr2 = dummy2; // create two pointers to traverse the two partitions

        // traverse the list
        while (head != null) {
            // if the current node's value is less than x
            if (head.val < x) {
                // add the node to the first partition
                curr1.next = head;
                curr1 = head;
            } else {
                // add the node to the second partition
                curr2.next = head;
                curr2 = head;
            }
            head = head.next;
        }

        curr2.next = null; // set the end of the second partition to null
        curr1.next = dummy2.next; // link the two partitions together

        return dummy1.next; // return the head of the partitioned list
    }
}
