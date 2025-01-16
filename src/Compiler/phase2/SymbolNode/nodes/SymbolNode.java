package phase2.SymbolNode.nodes;

import phase2.SymbolNode.enumeration.NodeType;

import java.util.List;

public sealed interface SymbolNode permits ClassNode, ConstructorNode, LocalVarNode, LoopNode, MethodNode, ParamNode, RootNode {

    public SymbolNode getParentNode();
    public default void setParentNode(SymbolNode parentNode) {
        parentNode.addChild(this);
    }

    public void addChild(SymbolNode child);
    public List<SymbolNode> getChildren();

    public NodeType getNodeType();

}
