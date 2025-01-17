package phase2.SymbolNode.nodes;

import phase2.SymbolNode.enumeration.NodeType;

import java.util.ArrayList;
import java.util.List;

public final class LoopNode implements SymbolNode {


    private SymbolNode parentNode;

    private final ArrayList<SymbolNode> children = new ArrayList<>();

    private int lineNumber;

    @Override
    public String getName() {
        //todo
        return "Nested";
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public void addChild(SymbolNode child) {
        children.add(child);
    }

    @Override
    public List<SymbolNode> getChildren() {
        return children;
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.Loop;
    }

    @Override
    public void setParentNode(SymbolNode parentNode) {
        SymbolNode.super.setParentNode(parentNode);
        this.parentNode = parentNode;
    }

    @Override
    public SymbolNode getParentNode() {
        return parentNode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        children.forEach(child-> sb.append(child.toString()).append("\n"));
        return sb.toString();
    }
}
