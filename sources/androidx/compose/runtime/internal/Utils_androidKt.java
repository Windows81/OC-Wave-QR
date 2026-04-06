package androidx.compose.runtime.internal;

import android.util.Log;
import kotlin.Metadata;

@Metadata
public final class Utils_androidKt {
    public static final void a(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }
}
