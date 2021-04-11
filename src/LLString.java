public class LLString extends NewCollection {
    private final String DATA;
    private LLString next;
    private LLString previous;
    private boolean isTail;

    public LLString(String data) {
        this.DATA = data;
    }

    public void setNext(LLString nextLLString) {
        this.next = nextLLString;
    }

    public LLString getNext() {
        return this.next;
    }

    public void setPrevious(LLString previousLLString) {
        this.previous = previousLLString;
    }

    public LLString getPrevious() {
        return this.previous;
    }

    public String getData() {
        return this.DATA;
    }

    public void setTail(Boolean isTail) {
        this.isTail = isTail;
    }

    public boolean checkIfTail() {
        return this.isTail;
    }

}
