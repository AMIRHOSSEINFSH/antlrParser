package phase2.SymbolNode.nodes;

import phase2.SymbolNode.enumeration.NodeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public final class RootNode implements SymbolNode{

    private ArrayList<SymbolNode> children = new ArrayList<>();

//    private Stack<>

    @Override
    public void addChild(SymbolNode child) {
        children.add(child);
    }

    @Override
    public List<SymbolNode> getChildren() {
        return children;
    }

    @Override
    public SymbolNode getParentNode() {
        return null;
    }

    @Override
    public void setParentNode(SymbolNode parentNode) {


    }

    @Override
    public NodeType getNodeType() {
        return null;
    }
}
