package androidx.compose.material3.carousel;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CarouselState implements ScrollableState {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f11926b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f11927c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static final Saver f11928d = ListSaverKt.b(new j(), new k());

    /* renamed from: a  reason: collision with root package name */
    public CarouselPagerState f11929a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public CarouselState(int i2, float f2, Function0 function0) {
        this.f11929a = new CarouselPagerState(i2, f2, function0);
    }

    public static final List j(SaverScope saverScope, CarouselState carouselState) {
        return CollectionsKt.p(Integer.valueOf(carouselState.f11929a.v()), Float.valueOf(carouselState.f11929a.w()), Integer.valueOf(carouselState.f11929a.H()));
    }

    public static final CarouselState k(List list) {
        Object obj = list.get(0);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new CarouselState(intValue, ((Float) obj2).floatValue(), new l(list));
    }

    public static final int l(List list) {
        Object obj = list.get(2);
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) obj).intValue();
    }

    public boolean a() {
        return this.f11929a.a();
    }

    public float b(float f2) {
        return this.f11929a.b(f2);
    }

    public Object e(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object e2 = this.f11929a.e(mutatePriority, function2, continuation);
        return e2 == IntrinsicsKt.f() ? e2 : Unit.f40552a;
    }

    public final CarouselPagerState m() {
        return this.f11929a;
    }
}
