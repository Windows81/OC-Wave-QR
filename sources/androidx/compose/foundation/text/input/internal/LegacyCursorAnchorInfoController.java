package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LegacyCursorAnchorInfoController {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f6221a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f6222b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6223c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f6224d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6225e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6226f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6227g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6228h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6229i;

    /* renamed from: j  reason: collision with root package name */
    public TextFieldValue f6230j;

    /* renamed from: k  reason: collision with root package name */
    public TextLayoutResult f6231k;

    /* renamed from: l  reason: collision with root package name */
    public OffsetMapping f6232l;

    /* renamed from: m  reason: collision with root package name */
    public Rect f6233m;

    /* renamed from: n  reason: collision with root package name */
    public Rect f6234n;

    /* renamed from: o  reason: collision with root package name */
    public final CursorAnchorInfo.Builder f6235o = new CursorAnchorInfo.Builder();

    /* renamed from: p  reason: collision with root package name */
    public final float[] f6236p = Matrix.c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    public final android.graphics.Matrix f6237q = new android.graphics.Matrix();

    public LegacyCursorAnchorInfoController(Function1 function1, InputMethodManager inputMethodManager) {
        this.f6221a = function1;
        this.f6222b = inputMethodManager;
    }

    public final void a() {
        synchronized (this.f6223c) {
            this.f6230j = null;
            this.f6232l = null;
            this.f6231k = null;
            this.f6233m = null;
            this.f6234n = null;
            Unit unit = Unit.f40552a;
        }
    }

    public final void b(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        synchronized (this.f6223c) {
            try {
                this.f6226f = z4;
                this.f6227g = z5;
                this.f6228h = z6;
                this.f6229i = z7;
                if (z2) {
                    this.f6225e = true;
                    if (this.f6230j != null) {
                        c();
                    }
                }
                this.f6224d = z3;
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f6222b.b() && this.f6230j != null && this.f6232l != null && this.f6231k != null && this.f6233m != null && this.f6234n != null) {
            Matrix.h(this.f6236p);
            this.f6221a.invoke(Matrix.a(this.f6236p));
            float[] fArr = this.f6236p;
            Rect rect = this.f6234n;
            Intrinsics.f(rect);
            Rect rect2 = this.f6234n;
            Intrinsics.f(rect2);
            Matrix.o(fArr, -rect.o(), -rect2.r(), 0.0f);
            AndroidMatrixConversions_androidKt.a(this.f6237q, this.f6236p);
            InputMethodManager inputMethodManager = this.f6222b;
            CursorAnchorInfo.Builder builder = this.f6235o;
            TextFieldValue textFieldValue = this.f6230j;
            Intrinsics.f(textFieldValue);
            OffsetMapping offsetMapping = this.f6232l;
            Intrinsics.f(offsetMapping);
            TextLayoutResult textLayoutResult = this.f6231k;
            Intrinsics.f(textLayoutResult);
            android.graphics.Matrix matrix = this.f6237q;
            Rect rect3 = this.f6233m;
            Intrinsics.f(rect3);
            Rect rect4 = this.f6234n;
            Intrinsics.f(rect4);
            inputMethodManager.d(LegacyCursorAnchorInfoBuilder_androidKt.b(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect3, rect4, this.f6226f, this.f6227g, this.f6228h, this.f6229i));
            this.f6225e = false;
        }
    }

    public final void d(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect, Rect rect2) {
        synchronized (this.f6223c) {
            try {
                this.f6230j = textFieldValue;
                this.f6232l = offsetMapping;
                this.f6231k = textLayoutResult;
                this.f6233m = rect;
                this.f6234n = rect2;
                if (!this.f6225e) {
                    if (this.f6224d) {
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
