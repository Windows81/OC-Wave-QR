package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RenderNodeApi23 implements DeviceRenderNode {

    /* renamed from: j  reason: collision with root package name */
    public static final Companion f17844j = new Companion((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f17845k = 8;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f17846l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f17847m = true;

    /* renamed from: a  reason: collision with root package name */
    public final AndroidComposeView f17848a;

    /* renamed from: b  reason: collision with root package name */
    public final RenderNode f17849b;

    /* renamed from: c  reason: collision with root package name */
    public int f17850c = CompositingStrategy.f15997b.a();

    /* renamed from: d  reason: collision with root package name */
    public int f17851d;

    /* renamed from: e  reason: collision with root package name */
    public int f17852e;

    /* renamed from: f  reason: collision with root package name */
    public int f17853f;

    /* renamed from: g  reason: collision with root package name */
    public int f17854g;

    /* renamed from: h  reason: collision with root package name */
    public RenderEffect f17855h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f17856i;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RenderNodeApi23(AndroidComposeView androidComposeView) {
        this.f17848a = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.f17849b = create;
        if (f17847m) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            R(create);
            f();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f17847m = false;
        }
        if (f17846l) {
            throw new NoClassDefFoundError();
        }
    }

    public void A(float f2) {
        this.f17849b.setPivotY(f2);
    }

    public void B(float f2) {
        this.f17849b.setElevation(f2);
    }

    public void C(int i2) {
        Q(E() + i2);
        N(u() + i2);
        this.f17849b.offsetTopAndBottom(i2);
    }

    public void D(Outline outline) {
        this.f17849b.setOutline(outline);
    }

    public int E() {
        return this.f17852e;
    }

    public void F(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.f17870a.c(this.f17849b, i2);
        }
    }

    public boolean G() {
        return this.f17849b.getClipToOutline();
    }

    public void H(boolean z2) {
        this.f17849b.setClipToOutline(z2);
    }

    public void I(CanvasHolder canvasHolder, Path path, Function1 function1) {
        Canvas start = this.f17849b.start(b(), a());
        Canvas A2 = canvasHolder.a().A();
        canvasHolder.a().B(start);
        AndroidCanvas a2 = canvasHolder.a();
        if (path != null) {
            a2.o();
            androidx.compose.ui.graphics.Canvas.v(a2, path, 0, 2, (Object) null);
        }
        function1.invoke(a2);
        if (path != null) {
            a2.t();
        }
        canvasHolder.a().B(A2);
        this.f17849b.end(start);
    }

    public boolean J(boolean z2) {
        return this.f17849b.setHasOverlappingRendering(z2);
    }

    public void K(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.f17870a.d(this.f17849b, i2);
        }
    }

    public void L(Matrix matrix) {
        this.f17849b.getMatrix(matrix);
    }

    public float M() {
        return this.f17849b.getElevation();
    }

    public void N(int i2) {
        this.f17854g = i2;
    }

    public void O(int i2) {
        this.f17851d = i2;
    }

    public void P(int i2) {
        this.f17853f = i2;
    }

    public void Q(int i2) {
        this.f17852e = i2;
    }

    public final void R(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.f17870a;
            renderNodeVerificationHelper28.c(renderNode, renderNodeVerificationHelper28.a(renderNode));
            renderNodeVerificationHelper28.d(renderNode, renderNodeVerificationHelper28.b(renderNode));
        }
    }

    public int a() {
        return u() - E();
    }

    public int b() {
        return s() - o();
    }

    public float c() {
        return this.f17849b.getAlpha();
    }

    public void d(float f2) {
        this.f17849b.setAlpha(f2);
    }

    public void e(float f2) {
        this.f17849b.setRotationY(f2);
    }

    public final void f() {
        RenderNodeVerificationHelper24.f17869a.a(this.f17849b);
    }

    public void g(float f2) {
        this.f17849b.setRotation(f2);
    }

    public void h(float f2) {
        this.f17849b.setTranslationY(f2);
    }

    public void i(float f2) {
        this.f17849b.setScaleY(f2);
    }

    public void j(float f2) {
        this.f17849b.setScaleX(f2);
    }

    public void k(RenderEffect renderEffect) {
        this.f17855h = renderEffect;
    }

    public void l(float f2) {
        this.f17849b.setTranslationX(f2);
    }

    public void m(float f2) {
        this.f17849b.setCameraDistance(-f2);
    }

    public void n(float f2) {
        this.f17849b.setRotationX(f2);
    }

    public int o() {
        return this.f17851d;
    }

    public boolean p() {
        return this.f17856i;
    }

    public void q() {
        f();
    }

    public boolean r() {
        return this.f17849b.isValid();
    }

    public int s() {
        return this.f17853f;
    }

    public void t(int i2) {
        O(o() + i2);
        P(s() + i2);
        this.f17849b.offsetLeftAndRight(i2);
    }

    public int u() {
        return this.f17854g;
    }

    public void v(Canvas canvas) {
        Intrinsics.g(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f17849b);
    }

    public void w(float f2) {
        this.f17849b.setPivotX(f2);
    }

    public void x(boolean z2) {
        this.f17856i = z2;
        this.f17849b.setClipToBounds(z2);
    }

    public void y(int i2) {
        CompositingStrategy.Companion companion = CompositingStrategy.f15997b;
        if (CompositingStrategy.f(i2, companion.c())) {
            this.f17849b.setLayerType(2);
            this.f17849b.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.f(i2, companion.b())) {
            this.f17849b.setLayerType(0);
            this.f17849b.setHasOverlappingRendering(false);
        } else {
            this.f17849b.setLayerType(0);
            this.f17849b.setHasOverlappingRendering(true);
        }
        this.f17850c = i2;
    }

    public boolean z(int i2, int i3, int i4, int i5) {
        O(i2);
        Q(i3);
        P(i4);
        N(i5);
        return this.f17849b.setLeftTopRightBottom(i2, i3, i4, i5);
    }
}
