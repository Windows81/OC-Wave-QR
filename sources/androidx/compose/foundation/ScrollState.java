package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ScrollState implements ScrollableState {

    /* renamed from: i  reason: collision with root package name */
    public static final Companion f3164i = new Companion((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    public static final Saver f3165j = SaverKt.e(ScrollState$Companion$Saver$1.f3174z, ScrollState$Companion$Saver$2.f3175z);

    /* renamed from: a  reason: collision with root package name */
    public final MutableIntState f3166a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableIntState f3167b = SnapshotIntStateKt.a(0);

    /* renamed from: c  reason: collision with root package name */
    public final MutableInteractionSource f3168c = InteractionSourceKt.a();

    /* renamed from: d  reason: collision with root package name */
    public MutableIntState f3169d = SnapshotIntStateKt.a(Integer.MAX_VALUE);

    /* renamed from: e  reason: collision with root package name */
    public float f3170e;

    /* renamed from: f  reason: collision with root package name */
    public final ScrollableState f3171f = ScrollableStateKt.a(new ScrollState$scrollableState$1(this));

    /* renamed from: g  reason: collision with root package name */
    public final State f3172g = SnapshotStateKt.e(new ScrollState$canScrollForward$2(this));

    /* renamed from: h  reason: collision with root package name */
    public final State f3173h = SnapshotStateKt.e(new ScrollState$canScrollBackward$2(this));

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver a() {
            return ScrollState.f3165j;
        }

        public Companion() {
        }
    }

    public ScrollState(int i2) {
        this.f3166a = SnapshotIntStateKt.a(i2);
    }

    public boolean a() {
        return this.f3171f.a();
    }

    public float b(float f2) {
        return this.f3171f.b(f2);
    }

    public boolean d() {
        return ((Boolean) this.f3173h.getValue()).booleanValue();
    }

    public Object e(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object e2 = this.f3171f.e(mutatePriority, function2, continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public boolean f() {
        return ((Boolean) this.f3172g.getValue()).booleanValue();
    }

    public final Object k(int i2, AnimationSpec animationSpec, Continuation continuation) {
        Object a2 = ScrollExtensionsKt.a(this, (float) (i2 - n()), animationSpec, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public final MutableInteractionSource l() {
        return this.f3168c;
    }

    public final int m() {
        return this.f3169d.e();
    }

    public final int n() {
        return this.f3166a.e();
    }

    public final void o(int i2) {
        this.f3169d.k(i2);
        Snapshot.Companion companion = Snapshot.f15255e;
        Snapshot d2 = companion.d();
        Function1 g2 = d2 != null ? d2.g() : null;
        Snapshot f2 = companion.f(d2);
        try {
            if (n() > i2) {
                p(i2);
            }
            Unit unit = Unit.f40552a;
            companion.m(d2, f2, g2);
        } catch (Throwable th) {
            companion.m(d2, f2, g2);
            throw th;
        }
    }

    public final void p(int i2) {
        this.f3166a.k(i2);
    }

    public final void q(int i2) {
        this.f3167b.k(i2);
    }
}
