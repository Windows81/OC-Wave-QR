package androidx.browser.trusted.sharing;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ShareTarget {

    @Retention(RetentionPolicy.SOURCE)
    public @interface EncodingType {
    }

    public static final class FileFormField {
    }

    public static class Params {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RequestMethod {
    }
}
