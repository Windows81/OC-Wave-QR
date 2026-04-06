package androidx.compose.runtime.tooling;

import kotlin.Metadata;

@Metadata
final class ParseException extends Exception {

    /* renamed from: z  reason: collision with root package name */
    public final String f15407z;

    public ParseException(String str) {
        super(str);
        this.f15407z = str;
    }

    public String getMessage() {
        return this.f15407z;
    }
}
