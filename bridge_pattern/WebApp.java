public class WebApp extends Project{
    protected WebApp(CodeEditor editor) {
        super(editor);
    }

    @Override
    public void start() {
        System.out.println("Launching the Web Project...");
        editor.run();
    }

    @Override
    public void fix() {
        System.out.println("Fixing the Web Project...");
        editor.debug();
    }
}
