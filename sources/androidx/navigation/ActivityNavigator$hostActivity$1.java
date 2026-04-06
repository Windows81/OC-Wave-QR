package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ActivityNavigator$hostActivity$1 extends Lambda implements Function1<Context, Context> {

    /* renamed from: z  reason: collision with root package name */
    public static final ActivityNavigator$hostActivity$1 f22161z = new ActivityNavigator$hostActivity$1();

    public ActivityNavigator$hostActivity$1() {
        super(1);
    }

    /* renamed from: b */
    public final Context invoke(Context context) {
        Intrinsics.i(context, "it");
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
