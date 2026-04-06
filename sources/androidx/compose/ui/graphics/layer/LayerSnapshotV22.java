package androidx.compose.ui.graphics.layer;

import kotlin.Metadata;

@Metadata
public final class LayerSnapshotV22 implements LayerSnapshotImpl {

    /* renamed from: a  reason: collision with root package name */
    public static final LayerSnapshotV22 f16437a = new LayerSnapshotV22();

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(androidx.compose.ui.graphics.layer.GraphicsLayer r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r0 = (androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.J = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r0 = new androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.H
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.J
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r10 = r0.G
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1 r10 = (androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1) r10
            java.lang.Object r10 = r0.F
            android.media.ImageReader r10 = (android.media.ImageReader) r10
            java.lang.Object r10 = r0.E
            java.lang.AutoCloseable r10 = (java.lang.AutoCloseable) r10
            java.lang.Object r1 = r0.D
            android.os.Looper r1 = (android.os.Looper) r1
            java.lang.Object r0 = r0.C
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r0
            kotlin.ResultKt.b(r11)     // Catch:{ all -> 0x003f }
            goto L_0x00c7
        L_0x003f:
            r11 = move-exception
            goto L_0x00d6
        L_0x0042:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004a:
            kotlin.ResultKt.b(r11)
            long r5 = r10.x()
            android.os.Looper r11 = android.os.Looper.myLooper()
            if (r11 != 0) goto L_0x005b
            android.os.Looper r11 = android.os.Looper.getMainLooper()
        L_0x005b:
            r2 = 32
            long r7 = r5 >> r2
            int r2 = (int) r7
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r5 = (int) r5
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r2, r5, r3, r3)
            r0.C = r10     // Catch:{ all -> 0x00c0 }
            r0.D = r11     // Catch:{ all -> 0x00c0 }
            r0.E = r2     // Catch:{ all -> 0x00c0 }
            r0.F = r2     // Catch:{ all -> 0x00c0 }
            r0.G = r0     // Catch:{ all -> 0x00c0 }
            r0.J = r3     // Catch:{ all -> 0x00c0 }
            kotlinx.coroutines.CancellableContinuationImpl r5 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch:{ all -> 0x00c0 }
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)     // Catch:{ all -> 0x00c0 }
            r5.<init>(r6, r3)     // Catch:{ all -> 0x00c0 }
            r5.G()     // Catch:{ all -> 0x00c0 }
            androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1 r3 = new androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1     // Catch:{ all -> 0x00c0 }
            r3.<init>(r5)     // Catch:{ all -> 0x00c0 }
            android.os.Handler r11 = androidx.core.os.HandlerCompat.a(r11)     // Catch:{ all -> 0x00c0 }
            r2.setOnImageAvailableListener(r3, r11)     // Catch:{ all -> 0x00c0 }
            android.view.Surface r11 = r2.getSurface()     // Catch:{ all -> 0x00c0 }
            androidx.compose.ui.graphics.layer.SurfaceUtils r3 = androidx.compose.ui.graphics.layer.SurfaceUtils.f16448a     // Catch:{ all -> 0x00c0 }
            android.graphics.Canvas r3 = r3.b(r11)     // Catch:{ all -> 0x00c0 }
            androidx.compose.ui.graphics.Color$Companion r6 = androidx.compose.ui.graphics.Color.f15975b     // Catch:{ all -> 0x00d1 }
            long r6 = r6.a()     // Catch:{ all -> 0x00d1 }
            int r6 = androidx.compose.ui.graphics.ColorKt.j(r6)     // Catch:{ all -> 0x00d1 }
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x00d1 }
            r3.drawColor(r6, r7)     // Catch:{ all -> 0x00d1 }
            androidx.compose.ui.graphics.Canvas r6 = androidx.compose.ui.graphics.AndroidCanvas_androidKt.b(r3)     // Catch:{ all -> 0x00d1 }
            r10.h(r6, r4)     // Catch:{ all -> 0x00d1 }
            r11.unlockCanvasAndPost(r3)     // Catch:{ all -> 0x00c0 }
            java.lang.Object r11 = r5.A()     // Catch:{ all -> 0x00c0 }
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch:{ all -> 0x00c0 }
            if (r11 != r10) goto L_0x00c3
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)     // Catch:{ all -> 0x00c0 }
            goto L_0x00c3
        L_0x00c0:
            r11 = move-exception
            r10 = r2
            goto L_0x00d6
        L_0x00c3:
            if (r11 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            r10 = r2
        L_0x00c7:
            android.media.Image r11 = (android.media.Image) r11     // Catch:{ all -> 0x003f }
            android.graphics.Bitmap r11 = androidx.compose.ui.graphics.layer.LayerSnapshot_androidKt.b(r11)     // Catch:{ all -> 0x003f }
            kotlin.jdk7.AutoCloseableKt.a(r10, r4)
            return r11
        L_0x00d1:
            r10 = move-exception
            r11.unlockCanvasAndPost(r3)     // Catch:{ all -> 0x00c0 }
            throw r10     // Catch:{ all -> 0x00c0 }
        L_0x00d6:
            throw r11     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            kotlin.jdk7.AutoCloseableKt.a(r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.LayerSnapshotV22.a(androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
