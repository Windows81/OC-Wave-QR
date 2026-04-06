package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class VectorComponent extends VNode {

    /* renamed from: b  reason: collision with root package name */
    public final GroupComponent f16609b;

    /* renamed from: c  reason: collision with root package name */
    public String f16610c = "";

    /* renamed from: d  reason: collision with root package name */
    public boolean f16611d = true;

    /* renamed from: e  reason: collision with root package name */
    public final DrawCache f16612e = new DrawCache();

    /* renamed from: f  reason: collision with root package name */
    public Function0 f16613f = VectorComponent$invalidateCallback$1.f16623z;

    /* renamed from: g  reason: collision with root package name */
    public final MutableState f16614g = SnapshotStateKt__SnapshotStateKt.e((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    public ColorFilter f16615h;

    /* renamed from: i  reason: collision with root package name */
    public final MutableState f16616i;

    /* renamed from: j  reason: collision with root package name */
    public long f16617j;

    /* renamed from: k  reason: collision with root package name */
    public float f16618k;

    /* renamed from: l  reason: collision with root package name */
    public float f16619l;

    /* renamed from: m  reason: collision with root package name */
    public final Function1 f16620m;

    public VectorComponent(GroupComponent groupComponent) {
        super((DefaultConstructorMarker) null);
        this.f16609b = groupComponent;
        groupComponent.d(new Function1<VNode, Unit>(this) {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ VectorComponent f16621z;

            {
                this.f16621z = r1;
            }

            public final void b(VNode vNode) {
                this.f16621z.h();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((VNode) obj);
                return Unit.f40552a;
            }
        });
        Size.Companion companion = Size.f15876b;
        this.f16616i = SnapshotStateKt__SnapshotStateKt.e(Size.c(companion.b()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f16617j = companion.a();
        this.f16618k = 1.0f;
        this.f16619l = 1.0f;
        this.f16620m = new VectorComponent$drawVectorBlock$1(this);
    }

    public void a(DrawScope drawScope) {
        i(drawScope, 1.0f, (ColorFilter) null);
    }

    public final void h() {
        this.f16611d = true;
        this.f16613f.invoke();
    }

    public final void i(DrawScope drawScope, float f2, ColorFilter colorFilter) {
        int b2 = (!this.f16609b.j() || this.f16609b.g() == 16 || !VectorKt.f(k()) || !VectorKt.f(colorFilter)) ? ImageBitmapConfig.f16021b.b() : ImageBitmapConfig.f16021b.a();
        if (this.f16611d || !Size.f(this.f16617j, drawScope.c()) || !ImageBitmapConfig.i(b2, j())) {
            this.f16615h = ImageBitmapConfig.i(b2, ImageBitmapConfig.f16021b.a()) ? ColorFilter.Companion.b(ColorFilter.f15990b, this.f16609b.g(), 0, 2, (Object) null) : null;
            this.f16618k = Float.intBitsToFloat((int) (drawScope.c() >> 32)) / Float.intBitsToFloat((int) (m() >> 32));
            this.f16619l = Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)) / Float.intBitsToFloat((int) (m() & 4294967295L));
            this.f16612e.b(b2, IntSize.c((((long) ((int) ((float) Math.ceil((double) Float.intBitsToFloat((int) (drawScope.c() & 4294967295L)))))) & 4294967295L) | (((long) ((int) ((float) Math.ceil((double) Float.intBitsToFloat((int) (drawScope.c() >> 32)))))) << 32)), drawScope, drawScope.getLayoutDirection(), this.f16620m);
            this.f16611d = false;
            this.f16617j = drawScope.c();
        }
        if (colorFilter == null) {
            colorFilter = k() != null ? k() : this.f16615h;
        }
        this.f16612e.c(drawScope, f2, colorFilter);
    }

    public final int j() {
        ImageBitmap d2 = this.f16612e.d();
        return d2 != null ? d2.d() : ImageBitmapConfig.f16021b.b();
    }

    public final ColorFilter k() {
        return (ColorFilter) this.f16614g.getValue();
    }

    public final GroupComponent l() {
        return this.f16609b;
    }

    public final long m() {
        return ((Size) this.f16616i.getValue()).m();
    }

    public final void n(ColorFilter colorFilter) {
        this.f16614g.setValue(colorFilter);
    }

    public final void o(Function0 function0) {
        this.f16613f = function0;
    }

    public final void p(String str) {
        this.f16610c = str;
    }

    public final void q(long j2) {
        this.f16616i.setValue(Size.c(j2));
    }

    public String toString() {
        String str = "Params: " + "\tname: " + this.f16610c + "\n" + "\tviewportWidth: " + Float.intBitsToFloat((int) (m() >> 32)) + "\n" + "\tviewportHeight: " + Float.intBitsToFloat((int) (m() & 4294967295L)) + "\n";
        Intrinsics.h(str, "toString(...)");
        return str;
    }
}
