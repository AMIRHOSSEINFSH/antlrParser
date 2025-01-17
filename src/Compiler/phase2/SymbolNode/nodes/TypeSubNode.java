package phase2.SymbolNode.nodes;

import java.util.Arrays;

public class TypeSubNode {

    private String classType;
    private boolean classIsDefined;
    private boolean objectIsDefined;
    private String objectType;
    public static final String[] primitiveTypes = {"int", "long", "float", "double" , "char", "boolean",
            "int[]", "long[]", "float[]", "double[]" , "char[]", "boolean[]"
    };
    private boolean isArray = false;


    public boolean isObjectIsDefined() {
        return objectIsDefined;
    }

    public boolean isArray() {
        return isArray;
    }

    public void setObjectIsDefined(boolean objectIsDefined) {
        this.objectIsDefined = objectIsDefined;
    }

    public String getObjectType() {
        return objectType;
    }

    public TypeSubNode(String classType, boolean classIsDefined, String objectType, boolean objectIsDefined) {
        this(classType,classIsDefined);
        this.objectType = objectType;
        this.objectIsDefined = objectIsDefined;
    }

    public TypeSubNode(String classType, boolean classIsDefined) {
        this.classType = classType;
        this.classIsDefined = classIsDefined;
        isArray = classType.contains("[]");
    }

    public void setArray(boolean array) {
        isArray = array;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassIsDefined(boolean classIsDefined) {
        this.classIsDefined = classIsDefined;
    }

    public boolean isClassIsDefined() {
        return classIsDefined;
    }

    public boolean isPrimitive() {
        return Arrays.stream(primitiveTypes).anyMatch(classType::equalsIgnoreCase);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (isPrimitive())
            return classType;
        sb.append("classType = ").append(classType).append(", classIsDefined = ").append(classIsDefined);
                if(objectType != null)
                    sb.append(", ").append("objectType = ").append(objectType).append(", objectIsDefined = ").append(objectIsDefined);
        return sb.toString();
    }
}
