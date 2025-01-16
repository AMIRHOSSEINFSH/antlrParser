package phase2.SymbolNode.nodes;

import phase2.SymbolNode.enumeration.NodeType;

import java.util.ArrayList;
import java.util.List;

public final class LocalVarNode implements SymbolNode {

    private String varName;
    private List<TypeSubNode> typeSubNode;

    private SymbolNode parentNode;

    private ArrayList<SymbolNode> children = new ArrayList<>();

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
                .append(",");

        if (typeSubNode != null) {
            sb.append("(type: ");


            if (typeSubNode.size() == 1)
                sb.append(typeSubNode.getFirst().toString());
            else {

                if (typeSubNode.stream().noneMatch(TypeSubNode::isPrimitive))
                    sb.append("array of ");

                for (int i = 0; i < typeSubNode.size(); i++) {
                    sb.append("[ ").append(typeSubNode.get(i).toString()).append(", index: ").append(i).append("], ");
                }

            }

            sb.append(" )");

        }

        return sb.toString();
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.LocalVar;
    }
}
