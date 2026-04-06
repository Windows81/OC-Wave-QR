package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    public static final Companion O = new Companion((DefaultConstructorMarker) null);
    public static final int P = 8;
    public static final Function2 Q = ViewLayer$Companion$getMatrix$1.f17912z;
    public static final ViewOutlineProvider R = new ViewLayer$Companion$OutlineProvider$1();
    public static Method S;
    public static Field T;
    public static boolean U;
    public static boolean V;

    /* renamed from: A  reason: collision with root package name */
    public final DrawChildContainer f17909A;

    /* renamed from: B  reason: collision with root package name */
    public Function2 f17910B;
    public Function0 C;
    public final OutlineResolver D = new OutlineResolver();
    public boolean E;
    public Rect F;
    public boolean G;
    public boolean H;
    public final CanvasHolder I = new CanvasHolder();
    public final LayerMatrixCache J = new LayerMatrixCache(Q);
    public long K = TransformOrigin.f16150b.a();
    public boolean L = true;
    public final long M;
    public int N;

    /* renamed from: z  reason: collision with root package name */
    public final AndroidComposeView f17911z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return ViewLayer.U;
        }

        public final boolean b() {
            return ViewLayer.V;
        }

        public final void c(boolean z2) {
            ViewLayer.V = z2;
        }

        public final void d(View view) {
            Class<String> cls = String.class;
            Class<Class> cls2 = Class.class;
            try {
                if (!a()) {
                    ViewLayer.U = true;
                    Class<View> cls3 = View.class;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.S = cls3.getDeclaredMethod("updateDisplayListIfDirty", (Class[]) null);
                        ViewLayer.T = cls3.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.S = (Method) cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{cls, new Class[0].getClass()}).invoke(cls3, new Object[]{"updateDisplayListIfDirty", new Class[0]});
                        ViewLayer.T = (Field) cls2.getDeclaredMethod("getDeclaredField", new Class[]{cls}).invoke(cls3, new Object[]{"mRecreateDisplayList"});
                    }
                    Method q2 = ViewLayer.S;
                    if (q2 != null) {
                        q2.setAccessible(true);
                    }
                    Field o2 = ViewLayer.T;
                    if (o2 != null) {
                        o2.setAccessible(true);
                    }
                }
                Field o3 = ViewLayer.T;
                if (o3 != null) {
                    o3.setBoolean(view, true);
                }
                Method q3 = ViewLayer.S;
                if (q3 != null) {
                    q3.invoke(view, (Object[]) null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class UniqueDrawingIdApi29 {

        /* renamed from: a  reason: collision with root package name */
        public static final UniqueDrawingIdApi29 f17913a = new UniqueDrawingIdApi29();

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, Function2 function2, Function0 function0) {
        super(androidComposeView.getContext());
        this.f17911z = androidComposeView;
        this.f17909A = drawChildContainer;
        this.f17910B = function2;
        this.C = function0;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.M = (long) View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline() || this.D.e()) {
            return null;
        }
        return this.D.d();
    }

    private final void setInvalidated(boolean z2) {
        if (z2 != this.G) {
            this.G = z2;
            this.f17911z.O0(this, z2);
        }
    }

    public void a(float[] fArr) {
        Matrix.m(fArr, this.J.b(this));
    }

    public void b() {
        setInvalidated(false);
        this.f17911z.Z0();
        this.f17910B = null;
        this.C = null;
        this.f17911z.X0(this);
        this.f17909A.removeViewInLayout(this);
    }

    public boolean c(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j2));
        if (this.E) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) getWidth()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.D.f(j2);
        }
        return true;
    }

    public void d(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        Function0 function0;
        int C2 = reusableGraphicsLayerScope.C() | this.N;
        if ((C2 & 4096) != 0) {
            long N1 = reusableGraphicsLayerScope.N1();
            this.K = N1;
            setPivotX(TransformOrigin.f(N1) * ((float) getWidth()));
            setPivotY(TransformOrigin.g(this.K) * ((float) getHeight()));
        }
        if ((C2 & 1) != 0) {
            setScaleX(reusableGraphicsLayerScope.o());
        }
        if ((C2 & 2) != 0) {
            setScaleY(reusableGraphicsLayerScope.Y());
        }
        if ((C2 & 4) != 0) {
            setAlpha(reusableGraphicsLayerScope.b());
        }
        if ((C2 & 8) != 0) {
            setTranslationX(reusableGraphicsLayerScope.Q());
        }
        if ((C2 & 16) != 0) {
            setTranslationY(reusableGraphicsLayerScope.K());
        }
        if ((C2 & 32) != 0) {
            setElevation(reusableGraphicsLayerScope.H());
        }
        if ((C2 & 1024) != 0) {
            setRotation(reusableGraphicsLayerScope.B());
        }
        if ((C2 & 256) != 0) {
            setRotationX(reusableGraphicsLayerScope.S());
        }
        if ((C2 & 512) != 0) {
            setRotationY(reusableGraphicsLayerScope.z());
        }
        if ((C2 & 2048) != 0) {
            setCameraDistancePx(reusableGraphicsLayerScope.O());
        }
        boolean z2 = false;
        boolean z3 = getManualClipPath() != null;
        boolean z4 = reusableGraphicsLayerScope.q() && reusableGraphicsLayerScope.I() != RectangleShapeKt.a();
        if ((C2 & 24576) != 0) {
            this.E = reusableGraphicsLayerScope.q() && reusableGraphicsLayerScope.I() == RectangleShapeKt.a();
            w();
            setClipToOutline(z4);
        }
        boolean h2 = this.D.h(reusableGraphicsLayerScope.F(), reusableGraphicsLayerScope.b(), z4, reusableGraphicsLayerScope.H(), reusableGraphicsLayerScope.c());
        if (this.D.c()) {
            x();
        }
        boolean z5 = getManualClipPath() != null;
        if (z3 != z5 || (z5 && h2)) {
            invalidate();
        }
        if (!this.H && getElevation() > 0.0f && (function0 = this.C) != null) {
            function0.invoke();
        }
        if ((C2 & 7963) != 0) {
            this.J.c();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            if ((C2 & 64) != 0) {
                ViewLayerVerificationHelper28.f17914a.a(this, ColorKt.j(reusableGraphicsLayerScope.f()));
            }
            if ((C2 & 128) != 0) {
                ViewLayerVerificationHelper28.f17914a.b(this, ColorKt.j(reusableGraphicsLayerScope.J()));
            }
        }
        if (i2 >= 31 && (131072 & C2) != 0) {
            ViewLayerVerificationHelper31.f17915a.a(this, reusableGraphicsLayerScope.G());
        }
        if ((C2 & 32768) != 0) {
            int t2 = reusableGraphicsLayerScope.t();
            CompositingStrategy.Companion companion = CompositingStrategy.f15997b;
            if (CompositingStrategy.f(t2, companion.c())) {
                setLayerType(2, (Paint) null);
            } else if (CompositingStrategy.f(t2, companion.b())) {
                setLayerType(0, (Paint) null);
                this.L = z2;
            } else {
                setLayerType(0, (Paint) null);
            }
            z2 = true;
            this.L = z2;
        }
        this.N = reusableGraphicsLayerScope.C();
    }

    public void dispatchDraw(Canvas canvas) {
        boolean z2;
        CanvasHolder canvasHolder = this.I;
        Canvas A2 = canvasHolder.a().A();
        canvasHolder.a().B(canvas);
        AndroidCanvas a2 = canvasHolder.a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            a2.o();
            this.D.a(a2);
            z2 = true;
        } else {
            z2 = false;
        }
        Function2 function2 = this.f17910B;
        if (function2 != null) {
            function2.m(a2, (Object) null);
        }
        if (z2) {
            a2.t();
        }
        canvasHolder.a().B(A2);
        setInvalidated(false);
    }

    public long e(long j2, boolean z2) {
        return z2 ? this.J.g(this, j2) : this.J.e(this, j2);
    }

    public void f(Function2 function2, Function0 function0) {
        this.f17909A.addView(this);
        this.J.h();
        this.E = false;
        this.H = false;
        this.K = TransformOrigin.f16150b.a();
        this.f17910B = function2;
        this.C = function0;
        setInvalidated(false);
    }

    public void forceLayout() {
    }

    public void g(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (i2 != getWidth() || i3 != getHeight()) {
            setPivotX(TransformOrigin.f(this.K) * ((float) i2));
            setPivotY(TransformOrigin.g(this.K) * ((float) i3));
            x();
            layout(getLeft(), getTop(), getLeft() + i2, getTop() + i3);
            w();
            this.J.c();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final DrawChildContainer getContainer() {
        return this.f17909A;
    }

    public long getLayerId() {
        return this.M;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f17911z;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.a(this.f17911z);
        }
        return -1;
    }

    /* renamed from: getUnderlyingMatrix-sQKQjiQ  reason: not valid java name */
    public float[] m5getUnderlyingMatrixsQKQjiQ() {
        return this.J.b(this);
    }

    public void h(androidx.compose.ui.graphics.Canvas canvas, GraphicsLayer graphicsLayer) {
        boolean z2 = getElevation() > 0.0f;
        this.H = z2;
        if (z2) {
            canvas.x();
        }
        this.f17909A.a(canvas, this, getDrawingTime());
        if (this.H) {
            canvas.p();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.L;
    }

    public void i(float[] fArr) {
        float[] a2 = this.J.a(this);
        if (a2 != null) {
            Matrix.m(fArr, a2);
        }
    }

    public void invalidate() {
        if (!this.G) {
            setInvalidated(true);
            super.invalidate();
            this.f17911z.invalidate();
        }
    }

    public void j(MutableRect mutableRect, boolean z2) {
        if (z2) {
            this.J.f(this, mutableRect);
        } else {
            this.J.d(this, mutableRect);
        }
    }

    public void k(long j2) {
        int k2 = IntOffset.k(j2);
        if (k2 != getLeft()) {
            offsetLeftAndRight(k2 - getLeft());
            this.J.c();
        }
        int l2 = IntOffset.l(j2);
        if (l2 != getTop()) {
            offsetTopAndBottom(l2 - getTop());
            this.J.c();
        }
    }

    public void l() {
        if (this.G && !V) {
            O.d(this);
            setInvalidated(false);
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    public final void setCameraDistancePx(float f2) {
        setCameraDistance(f2 * ((float) getResources().getDisplayMetrics().densityDpi));
    }

    public final boolean v() {
        return this.G;
    }

    public final void w() {
        Rect rect;
        if (this.E) {
            Rect rect2 = this.F;
            if (rect2 == null) {
                this.F = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.f(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.F;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void x() {
        setOutlineProvider(this.D.b() != null ? R : null);
    }
}
