package expressivo;

public class Addition implements Expression {
    private final Expression left;
    private final Expression right;

    /**
     * Constructs an Addition expression with the specified left and right sub-expressions.
     *
     * @param left  the left sub-expression
     * @param right the right sub-expression
     */
    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Returns a string representation of this addition in the format "left + right".
     *
     * @return a string representation of this addition
     */
    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }

    /**
     * Compares this addition to the specified object for equality.
     *
     * @param obj the object to compare to
     * @return true if the specified object is an Addition with equal sub-expressions, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same instance
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class
        Addition addition = (Addition) obj;
        return left.equals(addition.left) && right.equals(addition.right); // Compare sub-expressions
    }

    /**
     * Returns a hash code for this addition based on its sub-expressions.
     *
     * @return the hash code for this addition
     */
    @Override
    public int hashCode() {
        return 31 * left.hashCode() + right.hashCode(); // Combine hash codes of sub-expressions
    }
}
