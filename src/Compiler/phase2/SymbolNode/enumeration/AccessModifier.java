package phase2.SymbolNode.enumeration;

import java.util.Arrays;

public enum AccessModifier {
    ACCESS_MODIFIER_PUBLIC,ACCESS_MODIFIER_PRIVATE,ACCESS_MODIFIER_PROTECTED,ACCESS_MODIFIER_PACKAGE;

    public static AccessModifier getModifierBy( String mod) {
        switch (mod) {
            case "public" -> {
                return ACCESS_MODIFIER_PUBLIC;
            }
            case "private" -> {
                return ACCESS_MODIFIER_PRIVATE;
            }
            case "protected" -> {
                return ACCESS_MODIFIER_PROTECTED;
            }
            case null -> {
                return ACCESS_MODIFIER_PACKAGE;
            }
            default -> {
                return null;
            }
        }
    }

}
