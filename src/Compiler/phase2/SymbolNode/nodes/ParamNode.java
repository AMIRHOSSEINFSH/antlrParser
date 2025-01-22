package phase2.SymbolNode.nodes;

import phase2.SymbolNode.enumeration.NodeType;

import java.util.ArrayList;
import java.util.List;

public final class ParamNode implements SymbolNode {

    private String paramName;
    private List<TypeSubNode> typeSubNode;

    private SymbolNode parentNode;

    private ArrayList<SymbolNode> children = new ArrayList<>();

    private int lineNumber;

    private String rawLine;

    @Override
    public void setRawLine(String rawLine) {
        this.rawLine = rawLine;
    }

    @Override
    public String getRawLine() {
        return rawLine;
    }

    @Override
    public String getName() {
        return paramName;
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
    public void setParentNode(SymbolNode parentNode) {
        SymbolNode.super.setParentNode(parentNode);
        this.parentNode = parentNode;
    }

    @Override
    public SymbolNode getParentNode() {
        return parentNode;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public List<TypeSubNode> getTypeList() {
        return typeSubNode;
    }

    public void setTypeList(List<TypeSubNode> typeList) {
        this.typeSubNode = typeList;
    }

    public ParamNode(String paramName, List<TypeSubNode> typeList) {
        this.paramName = paramName;
        this.typeSubNode = typeList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Key = " + "var_")
                .append(paramName)
                .append(" | ");
        sb.append("Value = ")
                .append("Parameter: ")
                .append("(name: ")
                .append(paramName)
                .append(") ");

        if (typeSubNode != null) {
            sb.append(" (parametersType: ");

            sb.append("[");
            for (int i = 0; i < typeSubNode.size(); i++) {
                var item=  typeSubNode.get(i);
                if (item.isArray())
                    sb.append("array of [")
                            .append(item).append(", index:").append(i+1).append("]");
                else sb.append(item);

                if (i != typeSubNode.size() - 1) sb.append(", ");
            }

            sb.append("])");

        }

        return sb.toString();
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.Parameter;
    }
}
