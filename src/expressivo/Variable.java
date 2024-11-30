package expressivo;

public class Variable implements Expression {
    private final String name;

    /**
     * Constructs a variable with the given name.
     *
     * @param name the name of the variable
     */
    public Variable(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the variable (its name).
     *
     * @return the name of the variable as a string
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * Compares this variable to the specified object for equality.
     *
     * @param obj the object to compare to
     * @return true if the specified object is a Variable with the same name, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same instance
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class
        Variable variable = (Variable) obj;
        return name.equals(variable.name); // Compare names
    }

    /**
     * Returns a hash code for this variable based on its name.
     *
     * @return the hash code for this variable
     */
    @Override
    public int hashCode() {
        return name.hashCode(); // Use the hash code of the name
    }
}
