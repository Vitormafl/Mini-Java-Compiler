package syntaxtree;
import IRtree.ExpEncode;
import IRtree.IRVisitor;
import syntaxtree.visitor.*;

public class NewArray extends Expression {
    public Expression e;

    public NewArray(Expression ae) {
        e=ae;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }

    public ExpEncode accept(IRVisitor irVisitor) {
        return irVisitor.visit(this);
    }
}