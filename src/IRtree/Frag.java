package IRtree;

import tree.*;
import frame.*;
public class Frag {
    public Stm body;
    public Frame frame;
    public String name;

    public Frag(Stm body, Frame frame) {
        this.body = body;
        this.frame = frame;
    }

    public Frag(Stm body, frame.Frame frame, String name) {
        this.body = body;
        this.frame = frame;
        this.name = name;
    }
}
