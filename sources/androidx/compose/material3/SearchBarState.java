package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class SearchBarState {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f10883f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Animatable f10884a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimationSpec f10885b;

    /* renamed from: c  reason: collision with root package name */
    public final AnimationSpec f10886c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f10887d;

    /* renamed from: e  reason: collision with root package name */
    public final State f10888e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final Object a(Continuation continuation) {
        Object f2 = Animatable.f(this.f10884a, Boxing.b(0.0f), this.f10886c, (Object) null, (Function1) null, continuation, 12, (Object) null);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public final Object b(Continuation continuation) {
        Object f2 = Animatable.f(this.f10884a, Boxing.b(1.0f), this.f10885b, (Object) null, (Function1) null, continuation, 12, (Object) null);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }

    public final LayoutCoordinates c() {
        return (LayoutCoordinates) this.f10887d.getValue();
    }

    public final SearchBarValue d() {
        return (SearchBarValue) this.f10888e.getValue();
    }

    public final float e() {
        return RangesKt.n(((Number) this.f10884a.m()).floatValue(), 0.0f, 1.0f);
    }

    public final SearchBarValue f() {
        return ((Number) this.f10884a.k()).floatValue() == 1.0f ? SearchBarValue.Expanded : SearchBarValue.Collapsed;
    }
}
