package phase2.SymbolNode.nodes;

import phase2.SymbolNode.enumeration.NodeType;

import java.util.List;

public final class EmptyNode implements SymbolNode{

    private int lineNumber;
    private SymbolNode parentNode;

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public SymbolNode getParentNode() {
        return this.parentNode;
    }

    @Override
    public void setParentNode(SymbolNode parentNode) {
        SymbolNode.super.setParentNode(parentNode);
        this.parentNode = parentNode;
    }

    @Override
    public void addChild(SymbolNode child) {

    }

    @Override
    public List<SymbolNode> getChildren() {
        return List.of();
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.Empty;
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public String getName() {
        return "NO_NAME";
    }
}
