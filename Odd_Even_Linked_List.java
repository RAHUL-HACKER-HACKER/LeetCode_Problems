
class Solution {
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null)
            return head;

        
        ListNode oddhead=head;
        ListNode evenhead=head.next;
        ListNode tempEvenhead=head.next;
        ListNode temp=head.next.next;
        int c=2;

        while(temp!=null)
        {
            c++;
            if(c%2==0)
            {
                evenhead.next=temp;
                evenhead=evenhead.next;
                temp=temp.next;
            }
            if(c%2!=0){
                oddhead.next=temp;
                oddhead=oddhead.next;
                temp=temp.next;
            }
        }
    
        oddhead.next=tempEvenhead;
        evenhead.next=null;
         
        return head;

    }
}