package org.mvel;

/**
 * @author Christopher Brock
 */
public class UnresolveablePropertyException extends RuntimeException {
    private ASTNode astNode;

    public UnresolveablePropertyException(ASTNode astNode) {
        super("unable to resolve token: " + astNode.getName());
        this.astNode = astNode;
    }

    public ASTNode getToken() {
        return astNode;
    }
}
