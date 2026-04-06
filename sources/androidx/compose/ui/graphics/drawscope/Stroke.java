package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Stroke extends DrawStyle {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f16296f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f16297g = StrokeCap.f16130b.a();

    /* renamed from: h  reason: collision with root package name */
    public static final int f16298h = StrokeJoin.f16135b.b();

    /* renamed from: a  reason: collision with root package name */
    public final float f16299a;

    /* renamed from: b  reason: collision with root package name */
    public final float f16300b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16301c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16302d;

    /* renamed from: e  reason: collision with root package name */
    public final PathEffect f16303e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return Stroke.f16297g;
        }

        public Companion() {
        }
    }

    public /* synthetic */ Stroke(float f2, float f3, int i2, int i3, PathEffect pathEffect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, i2, i3, pathEffect);
    }

    public final int b() {
        return this.f16301c;
    }

    public final int c() {
        return this.f16302d;
    }

    public final float d() {
        return this.f16300b;
    }

    public final PathEffect e() {
        return this.f16303e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        return this.f16299a == stroke.f16299a && this.f16300b == stroke.f16300b && StrokeCap.g(this.f16301c, stroke.f16301c) && StrokeJoin.g(this.f16302d, stroke.f16302d) && Intrinsics.d(this.f16303e, stroke.f16303e);
    }

    public final float f() {
        return this.f16299a;
    }

    public int hashCode() {
        int hashCode = ((((((Float.hashCode(this.f16299a) * 31) + Float.hashCode(this.f16300b)) * 31) + StrokeCap.h(this.f16301c)) * 31) + StrokeJoin.h(this.f16302d)) * 31;
        PathEffect pathEffect = this.f16303e;
        return hashCode + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.f16299a + ", miter=" + this.f16300b + ", cap=" + StrokeCap.i(this.f16301c) + ", join=" + StrokeJoin.i(this.f16302d) + ", pathEffect=" + this.f16303e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Stroke(float f2, float f3, int i2, int i3, PathEffect pathEffect, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0.0f : f2, (i4 & 2) != 0 ? 4.0f : f3, (i4 & 4) != 0 ? f16297g : i2, (i4 & 8) != 0 ? f16298h : i3, (i4 & 16) != 0 ? null : pathEffect, (DefaultConstructorMarker) null);
    }

    public Stroke(float f2, float f3, int i2, int i3, PathEffect pathEffect) {
        super((DefaultConstructorMarker) null);
        this.f16299a = f2;
        this.f16300b = f3;
        this.f16301c = i2;
        this.f16302d = i3;
        this.f16303e = pathEffect;
    }
}
