package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1 extends Lambda implements Function1<TextureView, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AndroidEmbeddedExternalSurfaceState f2899A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f2900B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ float[] D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f2901z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$3$1(long j2, AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState, Function1 function1, boolean z2, float[] fArr) {
        super(1);
        this.f2901z = j2;
        this.f2899A = androidEmbeddedExternalSurfaceState;
        this.f2900B = function1;
        this.C = z2;
        this.D = fArr;
    }

    public final void b(TextureView textureView) {
        Matrix matrix;
        SurfaceTexture surfaceTexture;
        if (!IntSize.e(this.f2901z, IntSize.f19170b.a()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            long j2 = this.f2901z;
            surfaceTexture.setDefaultBufferSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        this.f2899A.g(this.f2901z);
        TextureView.SurfaceTextureListener surfaceTextureListener = textureView.getSurfaceTextureListener();
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = this.f2899A;
        if (surfaceTextureListener != androidEmbeddedExternalSurfaceState) {
            this.f2900B.invoke(androidEmbeddedExternalSurfaceState);
            textureView.setSurfaceTextureListener(this.f2899A);
        }
        textureView.setOpaque(this.C);
        float[] fArr = this.D;
        if (fArr != null) {
            matrix = this.f2899A.f();
            AndroidMatrixConversions_androidKt.a(matrix, fArr);
        } else {
            matrix = null;
        }
        textureView.setTransform(matrix);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextureView) obj);
        return Unit.f40552a;
    }
}
