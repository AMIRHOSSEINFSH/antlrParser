package phase2.SymbolNode.nodes;

import phase2.SymbolNode.enumeration.AccessModifier;
import phase2.SymbolNode.enumeration.NodeType;

import java.util.ArrayList;
import java.util.List;

public final class LocalVarNode implements SymbolNode {

    private String varName;
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

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    private AccessModifier accessModifier = null;

    @Override
    public String getName() {
        return varName;
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

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public List<TypeSubNode> getTypeList() {
        return typeSubNode;
    }

    public void setTypeList(List<TypeSubNode> typeList) {
        this.typeSubNode = typeList;
    }

    public LocalVarNode(String varName, List<TypeSubNode> typeList) {
        this.varName = varName;
        this.typeSubNode = typeList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Key = " + "var_")
                .append(varName)
                .append(" | ");
        sb.append("Value = ")
                .append("LocalVar: ")
                .append("(name: ")
                .append(varName)
                .append(") ");

        if (typeSubNode != null) {
            sb.append("(type: ");
            boolean isSingle=  typeSubNode.size() == 1;
            if (!isSingle)
                sb.append("[");
            for (int i = 0; i < typeSubNode.size(); i++) {
                var item=  typeSubNode.get(i);
                if (item.isArray())
                    sb.append("array of "+(isSingle ? "" : "["))
                            .append(item.toString().replace("[]", "")).append(isSingle? "":", index:"+i+1+"]");
                else sb.append(item);

                if (i != typeSubNode.size() - 1) sb.append(", ");
            }

            if (!isSingle)
                sb.append("]");

            sb.append(")");

        }

        return sb.toString();
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.LocalVar;
    }
}
