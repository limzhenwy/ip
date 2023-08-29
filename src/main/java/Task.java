import java.io.Serializable;

/**
 * Class representing a task to be completed.
 */
class Task implements Serializable {
    /**
     * Description of the specific task.
     */
    protected String description;
    /**
     * Whether the task is completed or not.
     */
    protected boolean isDone;

    /**
     * Constructor for the Task object.
     * @param description The description of what the task is about
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Task's completion status.
     * @return An "X" if the task is completed and a blank space otherwise
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    /**
     * Mark the task as done.
     */
    public void mark() {
        this.isDone = true;
        System.out.println("Nice! I've marked this task as done:\n"
                + "[X] " + this.desc());
    }

    /**
     * Unmark a task as not done yet.
     */
    public void unmark() {
        this.isDone = false;
        System.out.println("OK, I've marked this task as not done yet:\n"
                + "[ ] " + this.desc());
    }

    /**
     * Returns the description of the task.
     * @return Description of the task in a String
     */
    public String desc() {
        return this.description;
    }
}