package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class PathComponent extends VNode {

    /* renamed from: b  reason: collision with root package name */
    public String f16523b = "";

    /* renamed from: c  reason: collision with root package name */
    public Brush f16524c;

    /* renamed from: d  reason: collision with root package name */
    public float f16525d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public List f16526e = VectorKt.d();

    /* renamed from: f  reason: collision with root package name */
    public int f16527f = VectorKt.a();

    /* renamed from: g  reason: collision with root package name */
    public float f16528g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f16529h;

    /* renamed from: i  reason: collision with root package name */
    public Brush f16530i;

    /* renamed from: j  reason: collision with root package name */
    public int f16531j = VectorKt.b();

    /* renamed from: k  reason: collision with root package name */
    public int f16532k = VectorKt.c();

    /* renamed from: l  reason: collision with root package name */
    public float f16533l = 4.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f16534m;

    /* renamed from: n  reason: collision with root package name */
    public float f16535n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    public float f16536o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16537p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f16538q = true;

    /* renamed from: r  reason: collision with root package name */
    public boolean f16539r;

    /* renamed from: s  reason: collision with root package name */
    public Stroke f16540s;

    /* renamed from: t  reason: collision with root package name */
    public final Path f16541t;

    /* renamed from: u  reason: collision with root package name */
    public Path f16542u;

    /* renamed from: v  reason: collision with root package name */
    public final Lazy f16543v;

    public PathComponent() {
        super((DefaultConstructorMarker) null);
        Path a2 = AndroidPath_androidKt.a();
        this.f16541t = a2;
        this.f16542u = a2;
        this.f16543v = LazyKt.a(LazyThreadSafetyMode.NONE, PathComponent$pathMeasure$2.f16544z);
    }

    public void a(DrawScope drawScope) {
        if (this.f16537p) {
            v();
        } else if (this.f16539r) {
            w();
        }
        this.f16537p = false;
        this.f16539r = false;
        Brush brush = this.f16524c;
        if (brush != null) {
            DrawScope.n1(drawScope, this.f16542u, brush, this.f16525d, (DrawStyle) null, (ColorFilter) null, 0, 56, (Object) null);
        }
        Brush brush2 = this.f16530i;
        if (brush2 != null) {
            Stroke stroke = this.f16540s;
            if (this.f16538q || stroke == null) {
                stroke = new Stroke(this.f16529h, this.f16533l, this.f16531j, this.f16532k, (PathEffect) null, 16, (DefaultConstructorMarker) null);
                this.f16540s = stroke;
                this.f16538q = false;
            }
            DrawScope.n1(drawScope, this.f16542u, brush2, this.f16528g, stroke, (ColorFilter) null, 0, 48, (Object) null);
        }
    }

    public final Brush e() {
        return this.f16524c;
    }

    public final PathMeasure f() {
        return (PathMeasure) this.f16543v.getValue();
    }

    public final Brush g() {
        return this.f16530i;
    }

    public final void h(Brush brush) {
        this.f16524c = brush;
        c();
    }

    public final void i(float f2) {
        this.f16525d = f2;
        c();
    }

    public final void j(String str) {
        this.f16523b = str;
        c();
    }

    public final void k(List list) {
        this.f16526e = list;
        this.f16537p = true;
        c();
    }

    public final void l(int i2) {
        this.f16527f = i2;
        this.f16542u.m(i2);
        c();
    }

    public final void m(Brush brush) {
        this.f16530i = brush;
        c();
    }

    public final void n(float f2) {
        this.f16528g = f2;
        c();
    }

    public final void o(int i2) {
        this.f16531j = i2;
        this.f16538q = true;
        c();
    }

    public final void p(int i2) {
        this.f16532k = i2;
        this.f16538q = true;
        c();
    }

    public final void q(float f2) {
        this.f16533l = f2;
        this.f16538q = true;
        c();
    }

    public final void r(float f2) {
        this.f16529h = f2;
        this.f16538q = true;
        c();
    }

    public final void s(float f2) {
        this.f16535n = f2;
        this.f16539r = true;
        c();
    }

    public final void t(float f2) {
        this.f16536o = f2;
        this.f16539r = true;
        c();
    }

    public String toString() {
        return this.f16541t.toString();
    }

    public final void u(float f2) {
        this.f16534m = f2;
        this.f16539r = true;
        c();
    }

    public final void v() {
        PathParserKt.c(this.f16526e, this.f16541t);
        w();
    }

    public final void w() {
        if (this.f16534m == 0.0f && this.f16535n == 1.0f) {
            this.f16542u = this.f16541t;
            return;
        }
        if (Intrinsics.d(this.f16542u, this.f16541t)) {
            this.f16542u = AndroidPath_androidKt.a();
        } else {
            int o2 = this.f16542u.o();
            this.f16542u.t();
            this.f16542u.m(o2);
        }
        f().a(this.f16541t, false);
        float b2 = f().b();
        float f2 = this.f16534m;
        float f3 = this.f16536o;
        float f4 = ((f2 + f3) % 1.0f) * b2;
        float f5 = ((this.f16535n + f3) % 1.0f) * b2;
        if (f4 > f5) {
            f().c(f4, b2, this.f16542u, true);
            f().c(0.0f, f5, this.f16542u, true);
            return;
        }
        f().c(f4, f5, this.f16542u, true);
    }
}
