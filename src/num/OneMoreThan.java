package num;

public class OneMoreThan extends Num{
    Num predecessor;

    public OneMoreThan(Num predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof OneMoreThan){
            return predecessor.equals(((OneMoreThan) obj).predecessor);
        }else {
            return false;
        }
    }
}
