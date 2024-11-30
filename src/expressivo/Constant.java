package expressivo;

public class Constant implements Expression {
    private final double value;

    /**
     * Constructs a constant expression with the specified numeric value.
     *
     * @param value the numeric value of this constant
     */
    public Constant(double value) {
        this.value = value;
    }

    /**
     * Returns a string representation of this constant, showing its numeric value.
     *
     * @return the numeric value as a string
     */
    @Override
    public String toString() {
        return Double.toString(value);
    }

    /**
     * Compares this constant to the specified object for equality.
     *
     * @param obj the object to compare to
     * @return true if the specified object is a Constant with the same value, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same instance
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class
        Constant constant = (Constant) obj;
        return Double.compare(constant.value, value) == 0; // Compare values
    }

    /**
     * Returns a hash code for this constant based on its numeric value.
     *
     * @return the hash code for this constant
     */
    @Override
    public int hashCode() {
        return Double.hashCode(value); // Use Double's hashCode method
    }
}
