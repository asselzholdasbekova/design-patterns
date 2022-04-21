public class Main {
    public static void main(String[] args) {
        CodeEditor vscode = new VSCode();
        CodeEditor sublime = new Sublime();

        Project web = new WebApp(vscode);
        Project game = new Game(sublime);

        web.start();
        game.start();

    }
}
