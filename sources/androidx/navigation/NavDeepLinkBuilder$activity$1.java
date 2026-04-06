package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDeepLinkBuilder$activity$1 extends Lambda implements Function1<Context, Context> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavDeepLinkBuilder$activity$1 f22316z = new NavDeepLinkBuilder$activity$1();

    public NavDeepLinkBuilder$activity$1() {
        super(1);
    }

    /* renamed from: b */
    public final Context invoke(Context context) {
        Intrinsics.i(context, "it");
        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }
}
