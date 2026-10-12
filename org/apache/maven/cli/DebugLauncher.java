package org.apache.maven.cli;

public class DebugLauncher {
    public static void main(String[] args) {
        try {
            MavenCli cli = new MavenCli();
            CliRequest req = new CliRequest(new String[]{"-version"}, null);
            System.out.println("Calling initialize...");
            cli.initialize(req);
            System.out.println("Calling cli...");
            cli.cli(req);
            System.out.println("Calling logging...");
            cli.logging(req);
            System.out.println("Done up to logging!");
        } catch (Throwable t) {
            System.err.println("CAUGHT EXCEPTION IN DEBUG LAUNCHER:");
            t.printStackTrace();
        }
    }
}
