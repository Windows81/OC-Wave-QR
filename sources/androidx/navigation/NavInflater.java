package androidx.navigation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class NavInflater {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f22358c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f22359d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final Context f22360a;

    /* renamed from: b  reason: collision with root package name */
    public final NavigatorProvider f22361b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        Intrinsics.i(context, "context");
        Intrinsics.i(navigatorProvider, "navigatorProvider");
        this.f22360a = context;
        this.f22361b = navigatorProvider;
    }
}
