package androidx.compose.material3.internal;

import androidx.compose.runtime.State;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

@Metadata
public final class BasicEdgeToEdgeDialog_androidKt {

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12163a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.window.SecureFlagPolicy[] r0 = androidx.compose.ui.window.SecureFlagPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.window.SecureFlagPolicy r1 = androidx.compose.ui.window.SecureFlagPolicy.SecureOff     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.window.SecureFlagPolicy r1 = androidx.compose.ui.window.SecureFlagPolicy.SecureOn     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.window.SecureFlagPolicy r1 = androidx.compose.ui.window.SecureFlagPolicy.Inherit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f12163a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Function3 a(State state) {
        return (Function3) state.getValue();
    }

    public static final Function0 b(State state) {
        return (Function0) state.getValue();
    }

    public static final boolean c(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final boolean g(SecureFlagPolicy secureFlagPolicy, boolean z2) {
        int i2 = WhenMappings.f12163a[secureFlagPolicy.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3) {
            return z2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
