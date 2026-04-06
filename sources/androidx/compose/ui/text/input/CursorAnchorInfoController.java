package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@Deprecated
public final class CursorAnchorInfoController {

    /* renamed from: a  reason: collision with root package name */
    public final MatrixPositionCalculator f18782a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f18783b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f18784c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f18785d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18786e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18787f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18788g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18789h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18790i;

    /* renamed from: j  reason: collision with root package name */
    public TextFieldValue f18791j;

    /* renamed from: k  reason: collision with root package name */
    public TextLayoutResult f18792k;

    /* renamed from: l  reason: collision with root package name */
    public OffsetMapping f18793l;

    /* renamed from: m  reason: collision with root package name */
    public Function1 f18794m = CursorAnchorInfoController$textFieldToRootTransform$1.f18801z;

    /* renamed from: n  reason: collision with root package name */
    public Rect f18795n;

    /* renamed from: o  reason: collision with root package name */
    public Rect f18796o;

    /* renamed from: p  reason: collision with root package name */
    public final CursorAnchorInfo.Builder f18797p = new CursorAnchorInfo.Builder();

    /* renamed from: q  reason: collision with root package name */
    public final float[] f18798q = Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    public final android.graphics.Matrix f18799r = new android.graphics.Matrix();

    public CursorAnchorInfoController(MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager) {
        this.f18782a = matrixPositionCalculator;
        this.f18783b = inputMethodManager;
    }

    public final void a() {
        synchronized (this.f18784c) {
            this.f18791j = null;
            this.f18793l = null;
            this.f18792k = null;
            this.f18794m = CursorAnchorInfoController$invalidate$1$1.f18800z;
            this.f18795n = null;
            this.f18796o = null;
            Unit unit = Unit.f40552a;
        }
    }

    public final void b(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        synchronized (this.f18784c) {
            try {
                this.f18787f = z4;
                this.f18788g = z5;
                this.f18789h = z6;
                this.f18790i = z7;
                if (z2) {
                    this.f18786e = true;
                    if (this.f18791j != null) {
                        c();
                    }
                }
                this.f18785d = z3;
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f18783b.b()) {
            this.f18794m.invoke(Matrix.a(this.f18798q));
            this.f18782a.B(this.f18798q);
            AndroidMatrixConversions_androidKt.a(this.f18799r, this.f18798q);
            InputMethodManager inputMethodManager = this.f18783b;
            CursorAnchorInfo.Builder builder = this.f18797p;
            TextFieldValue textFieldValue = this.f18791j;
            Intrinsics.f(textFieldValue);
            OffsetMapping offsetMapping = this.f18793l;
            Intrinsics.f(offsetMapping);
            TextLayoutResult textLayoutResult = this.f18792k;
            Intrinsics.f(textLayoutResult);
            android.graphics.Matrix matrix = this.f18799r;
            Rect rect = this.f18795n;
            Intrinsics.f(rect);
            Rect rect2 = this.f18796o;
            Intrinsics.f(rect2);
            inputMethodManager.d(CursorAnchorInfoBuilder_androidKt.b(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.f18787f, this.f18788g, this.f18789h, this.f18790i));
            this.f18786e = false;
        }
    }

    public final void d(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, Rect rect, Rect rect2) {
        synchronized (this.f18784c) {
            try {
                this.f18791j = textFieldValue;
                this.f18793l = offsetMapping;
                this.f18792k = textLayoutResult;
                this.f18794m = function1;
                this.f18795n = rect;
                this.f18796o = rect2;
                if (!this.f18786e) {
                    if (this.f18785d) {
                    }
                    Unit unit = Unit.f40552a;
                }
                c();
                Unit unit2 = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
