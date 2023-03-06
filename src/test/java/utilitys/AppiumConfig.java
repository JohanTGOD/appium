package utilitys;

public enum AppiumConfig {

    HOST("127.0.0.1"),
    PORT("4723");

    public final String value;

    AppiumConfig(String option) {
        this.value = option;
    }
}
