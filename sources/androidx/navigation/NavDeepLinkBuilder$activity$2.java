package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class NavDeepLinkBuilder$activity$2 extends Lambda implements Function1<Context, Activity> {

    /* renamed from: z  reason: collision with root package name */
    public static final NavDeepLinkBuilder$activity$2 f22317z = new NavDeepLinkBuilder$activity$2();

    public NavDeepLinkBuilder$activity$2() {
        super(1);
    }

    /* renamed from: b */
    public final Activity invoke(Context context) {
        Intrinsics.i(context, "it");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }
}
