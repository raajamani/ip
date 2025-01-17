public class Deadline extends Task {
    protected String by;

    // Deadline
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
        public String toString() {
            return "[D]" + super.toString() + " (by: " + by + ")";
    }
    
    @Override
        public String toDataString() {
            return super.toDataString() + " | " + by;
        }
}
