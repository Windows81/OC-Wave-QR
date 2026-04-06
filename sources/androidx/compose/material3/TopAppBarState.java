package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class TopAppBarState {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f11646d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final Saver f11647e = ListSaverKt.b(new i8(), new j8());

    /* renamed from: a  reason: collision with root package name */
    public float f11648a;

    /* renamed from: b  reason: collision with root package name */
    public final MutableFloatState f11649b;

    /* renamed from: c  reason: collision with root package name */
    public MutableFloatState f11650c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public TopAppBarState(float f2, float f3, float f4) {
        this.f11648a = f2;
        this.f11649b = PrimitiveSnapshotStateKt.a(f4);
        this.f11650c = PrimitiveSnapshotStateKt.a(f3);
    }

    public static final List c(SaverScope saverScope, TopAppBarState topAppBarState) {
        return CollectionsKt.p(Float.valueOf(topAppBarState.f11648a), Float.valueOf(topAppBarState.g()), Float.valueOf(topAppBarState.f()));
    }

    public static final TopAppBarState d(List list) {
        return new TopAppBarState(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
    }

    public final float e() {
        if (this.f11648a == 0.0f) {
            return 0.0f;
        }
        return g() / this.f11648a;
    }

    public final float f() {
        return this.f11649b.c();
    }

    public final float g() {
        return this.f11650c.c();
    }

    public final float h() {
        return this.f11648a;
    }

    public final float i() {
        float f2 = this.f11648a;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return ((float) 1) - (RangesKt.n(f2 - f(), this.f11648a, 0.0f) / this.f11648a);
    }

    public final void j(float f2) {
        this.f11649b.j(f2);
    }

    public final void k(float f2) {
        this.f11650c.j(RangesKt.n(f2, this.f11648a, 0.0f));
    }

    public final void l(float f2) {
        this.f11648a = f2;
    }
}
