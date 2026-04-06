package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1 extends Lambda implements Function1<View, ComposeInputMethodManager> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1 f6140z = new ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1();

    public ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1() {
        super(1);
    }

    /* renamed from: b */
    public final ComposeInputMethodManager invoke(View view) {
        return Build.VERSION.SDK_INT >= 34 ? new ComposeInputMethodManagerImplApi34(view) : new ComposeInputMethodManagerImplApi24(view);
    }
}
