package syntaxtree;
import syntaxtree.visitor.*;

public class This extends Exp {
    public void accept(Visitor v) {
        v.visit(this);
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }
}