import java.io.IOException;

public class Verify {
    public static void main(String[] args) throws IOException {
        GitWrapper git = new GitWrapper();
        // git.init();
        // git.add("trees-test/docs/hello.txt");
        // git.add("trees-test/docs/scratch.txt");
        // git.add("testfolder/hello");

        // git.commit("Claude", "please work first try");
        git.commit("Claude", "please work second try");

        // Git.regenerateIndex("e31273fab9889286afb5d086ff64ceac2a99850f");

    }
}
