package androidx.browser.browseractions;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
public class BrowserActionsIntent {

    public interface BrowserActionsFallDialogListener {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BrowserActionsItemId {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BrowserActionsUrlType {
    }

    public static final class Builder {
    }
}
