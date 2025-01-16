package phase2.SymbolNode.nodes;

import java.util.Arrays;

public class TypeSubNode {

    private String classType;
    private boolean isDefined;
    private String objectType;
    public static final String[] primitiveTypes = {"int", "long", "float", "double" , "char", "boolean"};


    public TypeSubNode(String classType, boolean isDefined, String objectType) {
        this.classType = classType;
        this.isDefined = isDefined;
        this.objectType = objectType;
    }

    public TypeSubNode(String classType, boolean isDefined) {
        this.classType = classType;
        this.isDefined = isDefined;
    }

    public String getClassType() {
        return classType;
    }

    public boolean isDefined() {
        return isDefined;
    }

    public boolean isPrimitive() {
        return Arrays.stream(primitiveTypes).anyMatch(classType::equalsIgnoreCase);
    }

    public String toString() {
        if (isPrimitive())
            return classType;
        return "classType = "+classType + ", isDefined = "+isDefined;
    }
}
