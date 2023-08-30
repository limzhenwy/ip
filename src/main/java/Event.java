import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Special type of task that has a description, 'from' date and 'to' date.
 */
class Event extends Task {
    /**
     * Signifies the 'Event' task.
     */
    protected String type = "E";
    protected String timeline;

    /**
     * Constructor for Event class.
     * @param description Describes the event
     * @param timeline Timeline of the event
     */
    public Event(String description, String timeline) {
        super(description);
        this.timeline = timeline;
    }

    /**
     * Mark this Event task as done.
     */
    @Override
    public void mark() {
        this.isDone = true;
        System.out.println("Nice! I've marked this task as done:\n"
                + this);
    }

    /**
     * Unmark this Event task as not done yet.
     */
    @Override
    public void unmark() {
        this.isDone = false;
        System.out.println("OK, I've marked this task as not done yet:\n"
                + this);
    }

    /**
     * Description of this Event task.
     * @return String containing all the relevant information of this Event task
     */
    @Override
    public String toString() {
        return this.type + " | " + this.getStatusIcon() + " | "
                + this.description + " | " + this.timeline;
    }
}
