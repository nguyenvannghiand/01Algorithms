public class FloydCycleDetection {
    static class ListNote {
        int value;
        ListNote next;

        ListNote(int x) {
            value = x;
            next = null;
        }
    }

    public ListNote detectCycle(ListNote head) {
        if (head == null) {
            return null;
        }
        ListNote slow = head;
        ListNote fast = head;
        boolean isCycle = false;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // => tao thanh 1 cycle
                isCycle = true;
                break;
            }
        }
        if (isCycle) {
            fast = head;
            while (fast != null && slow != null) {
                if (fast == slow) {
                    return fast;
                }
                fast = fast.next;
                slow = slow.next;
            }
        }

        return null;
    }

    public static void main(String[] args) {

    }
}
