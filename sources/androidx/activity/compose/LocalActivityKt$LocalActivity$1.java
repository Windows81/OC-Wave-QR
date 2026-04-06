package androidx.activity.compose;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LocalActivityKt$LocalActivity$1 extends Lambda implements Function1<CompositionLocalAccessorScope, Activity> {

    /* renamed from: z  reason: collision with root package name */
    public static final LocalActivityKt$LocalActivity$1 f147z = new LocalActivityKt$LocalActivity$1();

    public LocalActivityKt$LocalActivity$1() {
        super(1);
    }

    /* renamed from: b */
    public final Activity invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        Activity activity = (Context) compositionLocalAccessorScope.H(AndroidCompositionLocals_androidKt.g());
        while (true) {
            if (!(activity instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (activity instanceof Activity) {
                break;
            } else {
                activity = ((ContextWrapper) activity).getBaseContext();
            }
        }
        return activity;
    }
}
