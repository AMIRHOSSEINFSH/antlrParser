package phase2.SymbolNode.nodes;

import phase2.SymbolNode.enumeration.AccessModifier;
import phase2.SymbolNode.enumeration.NodeType;

import java.util.ArrayList;
import java.util.List;

public final class MethodNode implements SymbolNode {

    private String methodName;
    private String returnType;
    private AccessModifier accessModifier;
    private boolean isAbstract = false;
    private List<TypeSubNode> typeSubNode;
    private boolean isOverried = false;

    private int lineNumber;

    private String rawLine;

    private String RawBody;

    public String getRawBody() {
        return RawBody;
    }

    public void setRawBody(String rawBody) {
        RawBody = rawBody;
    }

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
        return methodName;
    }

    @Override
    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public boolean isOverried() {
        return isOverried;
    }

    public void setOverried(boolean overried) {
        isOverried = overried;
    }

    public void setChildren(ArrayList<SymbolNode> children) {
        this.children = children;
    }

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

    public boolean isAbstract() {
        return isAbstract;
    }

    public void setAbstract(boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
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

    public MethodNode(String methodName, String returnType, AccessModifier accessModifier, List<TypeSubNode> typeSubNode,boolean isAbstract) {
        this.methodName = methodName;
        this.returnType = returnType;
        this.accessModifier = accessModifier;
        this.typeSubNode = typeSubNode;
        this.isAbstract = isAbstract;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Key = method_")
                .append(methodName)
                .append("| ")
                .append("Value = Method: ")
                .append("(name: ")
                .append(methodName)
                .append(")")
                .append(" (returnType: ")
                .append(returnType)
                .append(") ")
                .append("(accessModifier: ")
                .append(accessModifier)
                .append(") ");

        if (isAbstract)
            sb.append("(")
                    .append("isAbstract:")
                    .append(isAbstract)
                    .append(")");

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
        return NodeType.Method;
    }
}
