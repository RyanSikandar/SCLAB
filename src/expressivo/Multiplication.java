package expressivo;

public class Multiplication implements Expression {
    private final Expression left;
    private final Expression right;

    /**
     * Constructs a multiplication expression with the given left and right subexpressions.
     *
     * @param left  the left operand of the multiplication
     * @param right the right operand of the multiplication
     */
    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Returns a string representation of the multiplication in the format "left * right".
     *
     * @return the string representation of the multiplication
     */
    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }

    /**
     * Compares this multiplication to the specified object for equality.
     *
     * @param obj the object to compare to
     * @return true if the specified object is a Multiplication with equal left and right expressions, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same instance
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class
        Multiplication multiplication = (Multiplication) obj;
        return left.equals(multiplication.left) && right.equals(multiplication.right); // Compare expressions
    }

    /**
     * Returns a hash code for this multiplication based on its left and right subexpressions.
     *
     * @return the hash code for this multiplication
     */
    @Override
    public int hashCode() {
        return 31 * left.hashCode() + right.hashCode(); // Combine hash codes
    }
}
