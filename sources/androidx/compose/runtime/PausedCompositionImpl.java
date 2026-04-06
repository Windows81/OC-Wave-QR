package androidx.compose.runtime;

import androidx.compose.animation.core.h;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata
public final class PausedCompositionImpl implements PausedComposition {

    /* renamed from: a  reason: collision with root package name */
    public AtomicReference f14751a;

    /* renamed from: b  reason: collision with root package name */
    public final RememberEventDispatcher f14752b;

    /* renamed from: c  reason: collision with root package name */
    public final RecordingApplier f14753c;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14754a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.runtime.PausedCompositionState[] r0 = androidx.compose.runtime.PausedCompositionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.runtime.PausedCompositionState r1 = androidx.compose.runtime.PausedCompositionState.InitialPending     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.runtime.PausedCompositionState r1 = androidx.compose.runtime.PausedCompositionState.RecomposePending     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.runtime.PausedCompositionState r1 = androidx.compose.runtime.PausedCompositionState.Recomposing     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.runtime.PausedCompositionState r1 = androidx.compose.runtime.PausedCompositionState.ApplyPending     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.runtime.PausedCompositionState r1 = androidx.compose.runtime.PausedCompositionState.Applied     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.compose.runtime.PausedCompositionState r1 = androidx.compose.runtime.PausedCompositionState.Cancelled     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.compose.runtime.PausedCompositionState r1 = androidx.compose.runtime.PausedCompositionState.Invalid     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f14754a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausedCompositionImpl.WhenMappings.<clinit>():void");
        }
    }

    public final RecordingApplier a() {
        return this.f14753c;
    }

    public final RememberEventDispatcher b() {
        return this.f14752b;
    }

    public final boolean c() {
        return this.f14751a.get() == PausedCompositionState.Recomposing;
    }

    public final void d() {
        Object obj = this.f14751a.get();
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        if (obj != pausedCompositionState) {
            PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
            if (!h.a(this.f14751a, pausedCompositionState2, pausedCompositionState)) {
                PreconditionsKt.b("Unexpected state change from: " + pausedCompositionState2 + " to: " + pausedCompositionState + '.');
            }
        }
    }
}
