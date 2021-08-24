public abstract class Task {

    public String taskTitle;
    public boolean isDone;
    public String taskType;
    /**
     * Constructor
     * @param taskTitle
     */
    public Task (String taskTitle, String taskType) {
        this.taskTitle = taskTitle;
        this.isDone = false;
        this.taskType = taskType;
    }

    /**
     * Returns the title of the task in String
     * @return
     */
    public String getTaskTitle() {
        return this.taskTitle;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

    public abstract String getTime();

    /**
     * Returns the type of the task in String
     * @return
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * Sets isDone to true
     */
    public void maskAsDone() {
        this.isDone = true;
    }

}
