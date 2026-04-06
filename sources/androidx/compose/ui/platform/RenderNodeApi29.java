package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.foundation.j;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
public final class RenderNodeApi29 implements DeviceRenderNode {

    /* renamed from: a  reason: collision with root package name */
    public final AndroidComposeView f17857a;

    /* renamed from: b  reason: collision with root package name */
    public final RenderNode f17858b = j.a("Compose");

    /* renamed from: c  reason: collision with root package name */
    public RenderEffect f17859c;

    /* renamed from: d  reason: collision with root package name */
    public int f17860d = CompositingStrategy.f15997b.a();

    public RenderNodeApi29(AndroidComposeView androidComposeView) {
        this.f17857a = androidComposeView;
    }

    public void A(float f2) {
        boolean unused = this.f17858b.setPivotY(f2);
    }

    public void B(float f2) {
        boolean unused = this.f17858b.setElevation(f2);
    }

    public void C(int i2) {
        boolean unused = this.f17858b.offsetTopAndBottom(i2);
    }

    public void D(Outline outline) {
        boolean unused = this.f17858b.setOutline(outline);
    }

    public int E() {
        return this.f17858b.getTop();
    }

    public void F(int i2) {
        boolean unused = this.f17858b.setAmbientShadowColor(i2);
    }

    public boolean G() {
        return this.f17858b.getClipToOutline();
    }

    public void H(boolean z2) {
        boolean unused = this.f17858b.setClipToOutline(z2);
    }

    public void I(CanvasHolder canvasHolder, Path path, Function1 function1) {
        RecordingCanvas a2 = this.f17858b.beginRecording();
        Canvas A2 = canvasHolder.a().A();
        canvasHolder.a().B(a2);
        AndroidCanvas a3 = canvasHolder.a();
        if (path != null) {
            a3.o();
            androidx.compose.ui.graphics.Canvas.v(a3, path, 0, 2, (Object) null);
        }
        function1.invoke(a3);
        if (path != null) {
            a3.t();
        }
        canvasHolder.a().B(A2);
        this.f17858b.endRecording();
    }

    public boolean J(boolean z2) {
        return this.f17858b.setHasOverlappingRendering(z2);
    }

    public void K(int i2) {
        boolean unused = this.f17858b.setSpotShadowColor(i2);
    }

    public void L(Matrix matrix) {
        this.f17858b.getMatrix(matrix);
    }

    public float M() {
        return this.f17858b.getElevation();
    }

    public int a() {
        return this.f17858b.getHeight();
    }

    public int b() {
        return this.f17858b.getWidth();
    }

    public float c() {
        return this.f17858b.getAlpha();
    }

    public void d(float f2) {
        boolean unused = this.f17858b.setAlpha(f2);
    }

    public void e(float f2) {
        boolean unused = this.f17858b.setRotationY(f2);
    }

    public void g(float f2) {
        boolean unused = this.f17858b.setRotationZ(f2);
    }

    public void h(float f2) {
        boolean unused = this.f17858b.setTranslationY(f2);
    }

    public void i(float f2) {
        boolean unused = this.f17858b.setScaleY(f2);
    }

    public void j(float f2) {
        boolean unused = this.f17858b.setScaleX(f2);
    }

    public void k(RenderEffect renderEffect) {
        this.f17859c = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeApi29VerificationHelper.f17861a.a(this.f17858b, renderEffect);
        }
    }

    public void l(float f2) {
        boolean unused = this.f17858b.setTranslationX(f2);
    }

    public void m(float f2) {
        boolean unused = this.f17858b.setCameraDistance(f2);
    }

    public void n(float f2) {
        boolean unused = this.f17858b.setRotationX(f2);
    }

    public int o() {
        return this.f17858b.getLeft();
    }

    public boolean p() {
        return this.f17858b.getClipToBounds();
    }

    public void q() {
        this.f17858b.discardDisplayList();
    }

    public boolean r() {
        return this.f17858b.hasDisplayList();
    }

    public int s() {
        return this.f17858b.getRight();
    }

    public void t(int i2) {
        boolean unused = this.f17858b.offsetLeftAndRight(i2);
    }

    public int u() {
        return this.f17858b.getBottom();
    }

    public void v(Canvas canvas) {
        canvas.drawRenderNode(this.f17858b);
    }

    public void w(float f2) {
        boolean unused = this.f17858b.setPivotX(f2);
    }

    public void x(boolean z2) {
        boolean unused = this.f17858b.setClipToBounds(z2);
    }

    public void y(int i2) {
        RenderNode renderNode = this.f17858b;
        CompositingStrategy.Companion companion = CompositingStrategy.f15997b;
        if (CompositingStrategy.f(i2, companion.c())) {
            boolean unused = renderNode.setUseCompositingLayer(true, (Paint) null);
            boolean unused2 = renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.f(i2, companion.b())) {
            boolean unused3 = renderNode.setUseCompositingLayer(false, (Paint) null);
            boolean unused4 = renderNode.setHasOverlappingRendering(false);
        } else {
            boolean unused5 = renderNode.setUseCompositingLayer(false, (Paint) null);
            boolean unused6 = renderNode.setHasOverlappingRendering(true);
        }
        this.f17860d = i2;
    }

    public boolean z(int i2, int i3, int i4, int i5) {
        return this.f17858b.setPosition(i2, i3, i4, i5);
    }
}
