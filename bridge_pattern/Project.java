abstract class Project {
    protected CodeEditor editor;

    protected Project(CodeEditor editor){
        this.editor = editor;
    }

    abstract public void start();
    abstract public void fix();
}
