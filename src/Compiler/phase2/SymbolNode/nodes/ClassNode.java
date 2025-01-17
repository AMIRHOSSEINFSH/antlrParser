package phase2.SymbolNode.nodes;

import phase2.SymbolNode.enumeration.NodeType;

import java.util.ArrayList;
import java.util.List;

public final class ClassNode implements SymbolNode {
    private String className;
    private String extendedClass = "Object";
    private boolean isAbstract = false;
    private boolean isMainClass = false;
    private SymbolNode parentNode;
    private int lineNumber;

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

    public ClassNode(String className, String extendedClass, boolean isAbstract, boolean isMainClass) {
        this.className = className;
        if (extendedClass != null)
            this.extendedClass = extendedClass;
        this.isAbstract = isAbstract;
        this.isMainClass = isMainClass;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getExtendedClass() {
        return extendedClass;
    }

    public void setExtendedClass(String extendedClass) {
        this.extendedClass = extendedClass;
    }

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public boolean isMainClass() {
        return isMainClass;
    }

    public void setMainClass(boolean mainClass) {
        isMainClass = mainClass;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("key = class_").append(className).append("| ");

        sb.append("Value = ");

        if (isMainClass)
            sb.append(className);

        sb.append("Class: ");

        sb.append("(name: ").append(className).append(") ");

        if (extendedClass != null)
            sb.append("(extends: ").append(extendedClass).append(") ");

        if (isAbstract)
            sb.append("(isAbstract: ").append(isAbstract).append(") ");

        return sb.toString();
    }

    @Override
    public NodeType getNodeType() {
        return NodeType.Class;
    }
}
