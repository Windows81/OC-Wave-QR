package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidAccessibilityManager implements AccessibilityManager {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f17489b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f17490c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityManager f17491a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public AndroidAccessibilityManager(Context context) {
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f17491a = (AccessibilityManager) systemService;
    }

    public long a(long j2, boolean z2, boolean z3, boolean z4) {
        if (j2 >= 2147483647L) {
            return j2;
        }
        if (z3) {
            z2 |= true;
        }
        if (z4) {
            z2 |= true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a2 = Api29Impl.f17657a.a(this.f17491a, (int) j2, z2 ? 1 : 0);
            if (a2 != Integer.MAX_VALUE) {
                return (long) a2;
            }
        } else if (!z4 || !this.f17491a.isTouchExplorationEnabled()) {
            return j2;
        }
        return Long.MAX_VALUE;
    }
}
