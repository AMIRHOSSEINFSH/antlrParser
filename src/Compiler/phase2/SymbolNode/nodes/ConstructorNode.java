package phase2.SymbolNode.nodes;

import phase2.SymbolNode.enumeration.AccessModifier;
import phase2.SymbolNode.enumeration.NodeType;

import java.util.ArrayList;
import java.util.List;

public final class ConstructorNode implements SymbolNode{

    private ArrayList<SymbolNode> children = new ArrayList<>();

    private int lineNumber;

    private String className;

    private boolean isOverride = false;

    private AccessModifier accessModifier = AccessModifier.ACCESS_MODIFIER_PACKAGE;

    private List<TypeSubNode> typeSubNode;

    public ConstructorNode(String className,AccessModifier accessModifier, List<TypeSubNode> typeSubNode) {
        this.className = className;
        this.accessModifier = accessModifier;
        this.typeSubNode = typeSubNode;
    }

    public void setChildren(ArrayList<SymbolNode> children) {
        this.children = children;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public boolean isOverride() {
        return isOverride;
    }

    public void setOverride(boolean override) {
        isOverride = override;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    public List<TypeSubNode> getTypeSubNode() {
        return typeSubNode;
    }

    public void setTypeSubNode(List<TypeSubNode> typeSubNode) {
        this.typeSubNode = typeSubNode;
    }


    @Override
    public String getName() {
        return className;
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
        return NodeType.Constructor;
    }

    private SymbolNode parentNode;

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
        sb.append("Key = Constructor_")
                .append(className)
                .append(" | ")
                .append("Value = Constructor: ")
                .append("(name: ")
                .append(className)
                .append(")")
                .append("(accessModifier: ")
                .append(accessModifier)
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


}
