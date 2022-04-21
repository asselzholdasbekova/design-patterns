public class Game extends Project{
    protected Game(CodeEditor editor) {
        super(editor);
    }

    @Override
    public void start() {
        System.out.println("Launching the Game...");
        editor.run();
    }

    @Override
    public void fix() {
        System.out.println("Fixing the Game...");
        editor.debug();
    }
}
