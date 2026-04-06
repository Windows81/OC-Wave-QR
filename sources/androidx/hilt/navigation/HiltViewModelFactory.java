package androidx.hilt.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HiltViewModelFactory {
    public static final ViewModelProvider.Factory a(Context context, ViewModelProvider.Factory factory) {
        Intrinsics.i(context, "context");
        Intrinsics.i(factory, "delegateFactory");
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                ViewModelProvider.Factory d2 = dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.d((ComponentActivity) context, factory);
                Intrinsics.h(d2, "createInternal(\n        … */ delegateFactory\n    )");
                return d2;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.h(context, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
    }
}
