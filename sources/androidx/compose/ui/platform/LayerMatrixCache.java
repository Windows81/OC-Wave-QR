package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.MatrixKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class LayerMatrixCache<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f17807a;

    /* renamed from: b  reason: collision with root package name */
    public Matrix f17808b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f17809c = androidx.compose.ui.graphics.Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public float[] f17810d = androidx.compose.ui.graphics.Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public boolean f17811e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17812f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17813g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17814h = true;

    public LayerMatrixCache(Function2 function2) {
        this.f17807a = function2;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f17810d;
        if (this.f17812f) {
            this.f17813g = InvertMatrixKt.a(b(obj), fArr);
            this.f17812f = false;
        }
        if (this.f17813g) {
            return fArr;
        }
        return null;
    }

    public final float[] b(Object obj) {
        float[] fArr = this.f17809c;
        if (!this.f17811e) {
            return fArr;
        }
        Matrix matrix = this.f17808b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f17808b = matrix;
        }
        this.f17807a.m(obj, matrix);
        AndroidMatrixConversions_androidKt.b(fArr, matrix);
        this.f17811e = false;
        this.f17814h = MatrixKt.a(fArr);
        return fArr;
    }

    public final void c() {
        this.f17811e = true;
        this.f17812f = true;
    }

    public final void d(Object obj, MutableRect mutableRect) {
        float[] b2 = b(obj);
        if (!this.f17814h) {
            androidx.compose.ui.graphics.Matrix.g(b2, mutableRect);
        }
    }

    public final long e(Object obj, long j2) {
        return !this.f17814h ? androidx.compose.ui.graphics.Matrix.f(b(obj), j2) : j2;
    }

    public final void f(Object obj, MutableRect mutableRect) {
        float[] a2 = a(obj);
        if (a2 == null) {
            mutableRect.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else if (!this.f17814h) {
            androidx.compose.ui.graphics.Matrix.g(a2, mutableRect);
        }
    }

    public final long g(Object obj, long j2) {
        float[] a2 = a(obj);
        return a2 == null ? Offset.f15855b.a() : !this.f17814h ? androidx.compose.ui.graphics.Matrix.f(a2, j2) : j2;
    }

    public final void h() {
        this.f17811e = false;
        this.f17812f = false;
        this.f17814h = true;
        this.f17813g = true;
        androidx.compose.ui.graphics.Matrix.h(this.f17809c);
        androidx.compose.ui.graphics.Matrix.h(this.f17810d);
    }
}
