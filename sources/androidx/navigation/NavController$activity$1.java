package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavController$activity$1 extends Lambda implements Function1<Context, Context> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavController$activity$1 f22238z = new NavController$activity$1();

    public NavController$activity$1() {
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
