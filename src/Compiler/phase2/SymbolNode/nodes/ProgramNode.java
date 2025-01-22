package phase2.SymbolNode.nodes;

import phase2.SymbolNode.enumeration.NodeType;

import java.util.ArrayList;
import java.util.List;

public final class ProgramNode implements SymbolNode{

    private ArrayList<SymbolNode> children = new ArrayList<>();

    private int lineNumber;

    @Override
    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public String getName() {
        return "Program";
    }

    @Override
    public void setRawLine(String rawLine) {

    }

    @Override
    public String getRawLine() {
        return "";
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
