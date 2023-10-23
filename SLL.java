public class SLL<E> {
    private SLLNode<E> first;

    public SLLNode<E> getFirst()
    {
        return first;
    }
    public SLL(){
        this.first=null;
    }
    public void insertFirst (E o)
    {
        SLLNode<E> ins = new SLLNode<E>(o, null);
        ins.succ = first;
        first = ins;
    }
    public void insertAfter (E o, SLLNode<E> node)
    {
        if (node!= null)
        {
            SLLNode<E> ins = new SLLNode<E>(o, node.succ);
            node.succ = ins;
        }
        else {
            System.out.println("Dadeniot jazol e null");
        }
    }
    public E deleteFirst()
    {
        if (first!=null)
        {
            SLLNode<E> tmp = first;
            first = first.succ;
            return tmp.element;
        }
        else{
            System.out.println("Listata e prazna");
            return null;
        }
    }
    public E delete(SLLNode<E> node)
    {
        if (first != null)
        {
            SLLNode<E> tmp = first;
            if (first == node)
            {
                return this.deleteFirst();
            }
            while (tmp.succ != node && tmp.succ.succ != null)
                tmp = tmp.succ;
            if (tmp.succ == node)
            {
             tmp.succ = tmp.succ.succ;
             return node.element;
            }
            else
            {
                System.out.println("Elementot ne postoi vo listata");
                return null;
            }
        } else
        {
            System.out.print("Listata e prazna");
            return null;
        }
    }
    public int size()
    {
        int listSize = 0;
        SLLNode<E> tmp = first;
        while (tmp != null)
        {
            listSize++;
            tmp = tmp.succ;
        }
        return listSize;
    }
    public void insertBefore(E o, SLLNode<E> before) {

        if (first != null) {
            SLLNode<E> tmp = first;
            if(first==before) {
                this.insertFirst(o);
                return;
            }
//ako first!=before
            while (tmp.succ != before && tmp.succ!=null)
                tmp = tmp.succ;
            if (tmp.succ == before) {
                tmp.succ = new SLLNode<E>(o, before);
            } else {
                System.out.println("Elementot ne postoi vo listata");
            }
        } else {
            System.out.println("Listata e prazna");
        }
    }
    public void insertLast (E o)
    {
        if (first != null)
        {
            SLLNode<E> tmp = first;
            while (tmp.succ != null)
                tmp = tmp.succ;
            tmp.succ = new SLLNode<E>(o, null);
        }
        else {
            insertFirst(o);
        }
    }

    public SLLNode<E> find(E o)
    {
        if (first != null)
        {
            SLLNode<E> tmp = first;
            while (!tmp.element.equals(o) && tmp.succ != null)
                tmp = tmp.succ;
            if(tmp.element.equals(o))
            {
                return tmp;
            }
            else {
                System.out.println("Elementot ne postoi vo listata");
            }}
            else{
                System.out.println("Listata e prazna");
        }
            return null;
    }

    public void merge (SLL<E> in)
    {
        if (first != null)
        {
            SLLNode<E> tmp = first;
            while(tmp.succ != null)
                tmp = tmp.succ;
            tmp.succ = in.getFirst();
        }
        else {
            first = in.getFirst();
        }
    }



}
