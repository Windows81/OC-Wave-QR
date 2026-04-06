package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class GroupComponent extends VNode {

    /* renamed from: b  reason: collision with root package name */
    public float[] f16469b;

    /* renamed from: c  reason: collision with root package name */
    public final List f16470c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f16471d = true;

    /* renamed from: e  reason: collision with root package name */
    public long f16472e = Color.f15975b.f();

    /* renamed from: f  reason: collision with root package name */
    public List f16473f = VectorKt.d();

    /* renamed from: g  reason: collision with root package name */
    public boolean f16474g = true;

    /* renamed from: h  reason: collision with root package name */
    public Path f16475h;

    /* renamed from: i  reason: collision with root package name */
    public Function1 f16476i;

    /* renamed from: j  reason: collision with root package name */
    public final Function1 f16477j = new GroupComponent$wrappedListener$1(this);

    /* renamed from: k  reason: collision with root package name */
    public String f16478k = "";

    /* renamed from: l  reason: collision with root package name */
    public float f16479l;

    /* renamed from: m  reason: collision with root package name */
    public float f16480m;

    /* renamed from: n  reason: collision with root package name */
    public float f16481n;

    /* renamed from: o  reason: collision with root package name */
    public float f16482o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f16483p = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    public float f16484q;

    /* renamed from: r  reason: collision with root package name */
    public float f16485r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f16486s = true;

    public GroupComponent() {
        super((DefaultConstructorMarker) null);
    }

    public final void A() {
        float[] fArr = this.f16469b;
        if (fArr == null) {
            fArr = Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f16469b = fArr;
        } else {
            Matrix.h(fArr);
        }
        Matrix.p(fArr, this.f16480m + this.f16484q, this.f16481n + this.f16485r, 0.0f, 4, (Object) null);
        Matrix.k(fArr, this.f16479l);
        Matrix.l(fArr, this.f16482o, this.f16483p, 1.0f);
        Matrix.p(fArr, -this.f16480m, -this.f16481n, 0.0f, 4, (Object) null);
    }

    public void a(DrawScope drawScope) {
        if (this.f16486s) {
            A();
            this.f16486s = false;
        }
        if (this.f16474g) {
            z();
            this.f16474g = false;
        }
        DrawContext G1 = drawScope.G1();
        long c2 = G1.c();
        G1.j().o();
        try {
            DrawTransform e2 = G1.e();
            float[] fArr = this.f16469b;
            if (fArr != null) {
                e2.a(Matrix.a(fArr).q());
            }
            Path path = this.f16475h;
            if (h() && path != null) {
                DrawTransform.f(e2, path, 0, 2, (Object) null);
            }
            List list = this.f16470c;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((VNode) list.get(i2)).a(drawScope);
            }
            G1.j().t();
            G1.f(c2);
        } catch (Throwable th) {
            G1.j().t();
            G1.f(c2);
            throw th;
        }
    }

    public Function1 b() {
        return this.f16476i;
    }

    public void d(Function1 function1) {
        this.f16476i = function1;
    }

    public final int f() {
        return this.f16470c.size();
    }

    public final long g() {
        return this.f16472e;
    }

    public final boolean h() {
        return !this.f16473f.isEmpty();
    }

    public final void i(int i2, VNode vNode) {
        if (i2 < f()) {
            this.f16470c.set(i2, vNode);
        } else {
            this.f16470c.add(vNode);
        }
        n(vNode);
        vNode.d(this.f16477j);
        c();
    }

    public final boolean j() {
        return this.f16471d;
    }

    public final void k() {
        this.f16471d = false;
        this.f16472e = Color.f15975b.f();
    }

    public final void l(Brush brush) {
        if (!this.f16471d || brush == null) {
            return;
        }
        if (brush instanceof SolidColor) {
            m(((SolidColor) brush).c());
        } else {
            k();
        }
    }

    public final void m(long j2) {
        if (this.f16471d && j2 != 16) {
            long j3 = this.f16472e;
            if (j3 == 16) {
                this.f16472e = j2;
            } else if (!VectorKt.e(j3, j2)) {
                k();
            }
        }
    }

    public final void n(VNode vNode) {
        if (vNode instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) vNode;
            l(pathComponent.e());
            l(pathComponent.g());
        } else if (vNode instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) vNode;
            if (!groupComponent.f16471d || !this.f16471d) {
                k();
            } else {
                m(groupComponent.f16472e);
            }
        }
    }

    public final void o(int i2, int i3, int i4) {
        int i5 = 0;
        if (i2 > i3) {
            while (i5 < i4) {
                this.f16470c.remove(i2);
                this.f16470c.add(i3, (VNode) this.f16470c.get(i2));
                i3++;
                i5++;
            }
        } else {
            while (i5 < i4) {
                this.f16470c.remove(i2);
                this.f16470c.add(i3 - 1, (VNode) this.f16470c.get(i2));
                i5++;
            }
        }
        c();
    }

    public final void p(int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 < this.f16470c.size()) {
                ((VNode) this.f16470c.get(i2)).d((Function1) null);
                this.f16470c.remove(i2);
            }
        }
        c();
    }

    public final void q(List list) {
        this.f16473f = list;
        this.f16474g = true;
        c();
    }

    public final void r(String str) {
        this.f16478k = str;
        c();
    }

    public final void s(float f2) {
        this.f16480m = f2;
        this.f16486s = true;
        c();
    }

    public final void t(float f2) {
        this.f16481n = f2;
        this.f16486s = true;
        c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.f16478k);
        List list = this.f16470c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append("\t");
            sb.append(((VNode) list.get(i2)).toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public final void u(float f2) {
        this.f16479l = f2;
        this.f16486s = true;
        c();
    }

    public final void v(float f2) {
        this.f16482o = f2;
        this.f16486s = true;
        c();
    }

    public final void w(float f2) {
        this.f16483p = f2;
        this.f16486s = true;
        c();
    }

    public final void x(float f2) {
        this.f16484q = f2;
        this.f16486s = true;
        c();
    }

    public final void y(float f2) {
        this.f16485r = f2;
        this.f16486s = true;
        c();
    }

    public final void z() {
        if (h()) {
            Path path = this.f16475h;
            if (path == null) {
                path = AndroidPath_androidKt.a();
                this.f16475h = path;
            }
            PathParserKt.c(this.f16473f, path);
        }
    }
}
