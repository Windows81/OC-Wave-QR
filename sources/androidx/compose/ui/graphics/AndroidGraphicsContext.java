package androidx.compose.ui.graphics;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.LayerManager;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class AndroidGraphicsContext implements GraphicsContext {

    /* renamed from: h  reason: collision with root package name */
    public static final Companion f15885h = new Companion((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static boolean f15886i = true;

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f15887a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15888b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final LayerManager f15889c = null;

    /* renamed from: d  reason: collision with root package name */
    public DrawChildContainer f15890d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15891e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15892f;

    /* renamed from: g  reason: collision with root package name */
    public final ComponentCallbacks2 f15893g = null;

    @Metadata
    /* renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$1  reason: invalid class name */
    public static final class AnonymousClass1 implements ComponentCallbacks2 {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ AndroidGraphicsContext f15894z;

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i2) {
            if (i2 >= 40 && !this.f15894z.f15892f) {
                this.f15894z.f15889c.c();
                this.f15894z.f15887a.getViewTreeObserver().addOnPreDrawListener(new AndroidGraphicsContext$1$onTrimMemory$1(this.f15894z));
                this.f15894z.f15892f = true;
            }
        }
    }

    @Metadata
    /* renamed from: androidx.compose.ui.graphics.AndroidGraphicsContext$2  reason: invalid class name */
    public static final class AnonymousClass2 implements View.OnAttachStateChangeListener {

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ AndroidGraphicsContext f15896z;

        public void onViewAttachedToWindow(View view) {
            this.f15896z.k(view.getContext());
        }

        public void onViewDetachedFromWindow(View view) {
            this.f15896z.l(view.getContext());
            this.f15896z.f15889c.c();
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class UniqueDrawingIdApi29 {

        /* renamed from: a  reason: collision with root package name */
        public static final UniqueDrawingIdApi29 f15897a = new UniqueDrawingIdApi29();

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public AndroidGraphicsContext(ViewGroup viewGroup) {
        this.f15887a = viewGroup;
    }

    public void a(GraphicsLayer graphicsLayer) {
        synchronized (this.f15888b) {
            graphicsLayer.J();
            Unit unit = Unit.f40552a;
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [androidx.compose.ui.graphics.layer.GraphicsLayerImpl] */
    /* JADX WARNING: type inference failed for: r2v8, types: [androidx.compose.ui.graphics.layer.GraphicsViewLayer] */
    /* JADX WARNING: type inference failed for: r2v9, types: [androidx.compose.ui.graphics.layer.GraphicsViewLayer] */
    /* JADX WARNING: type inference failed for: r2v10, types: [androidx.compose.ui.graphics.layer.GraphicsLayerV23] */
    /* JADX WARNING: type inference failed for: r2v11, types: [androidx.compose.ui.graphics.layer.GraphicsLayerV29] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.ui.graphics.layer.GraphicsLayer b() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f15888b
            monitor-enter(r0)
            android.view.ViewGroup r1 = r12.f15887a     // Catch:{ all -> 0x001b }
            long r10 = r12.i(r1)     // Catch:{ all -> 0x001b }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x001b }
            r2 = 29
            if (r1 < r2) goto L_0x001d
            androidx.compose.ui.graphics.layer.GraphicsLayerV29 r1 = new androidx.compose.ui.graphics.layer.GraphicsLayerV29     // Catch:{ all -> 0x001b }
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r2 = r1
            r3 = r10
            r2.<init>(r3, r5, r6, r7, r8)     // Catch:{ all -> 0x001b }
            goto L_0x0058
        L_0x001b:
            r1 = move-exception
            goto L_0x0061
        L_0x001d:
            boolean r1 = f15886i     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0046
            androidx.compose.ui.graphics.layer.GraphicsLayerV23 r1 = new androidx.compose.ui.graphics.layer.GraphicsLayerV23     // Catch:{ all -> 0x0030 }
            android.view.ViewGroup r3 = r12.f15887a     // Catch:{ all -> 0x0030 }
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r2 = r1
            r4 = r10
            r2.<init>(r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x0030 }
            goto L_0x0058
        L_0x0030:
            r1 = 0
            f15886i = r1     // Catch:{ all -> 0x001b }
            androidx.compose.ui.graphics.layer.GraphicsViewLayer r1 = new androidx.compose.ui.graphics.layer.GraphicsViewLayer     // Catch:{ all -> 0x001b }
            android.view.ViewGroup r2 = r12.f15887a     // Catch:{ all -> 0x001b }
            androidx.compose.ui.graphics.layer.view.DrawChildContainer r3 = r12.j(r2)     // Catch:{ all -> 0x001b }
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r2 = r1
            r4 = r10
            r2.<init>(r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x001b }
            goto L_0x0058
        L_0x0046:
            androidx.compose.ui.graphics.layer.GraphicsViewLayer r1 = new androidx.compose.ui.graphics.layer.GraphicsViewLayer     // Catch:{ all -> 0x001b }
            android.view.ViewGroup r2 = r12.f15887a     // Catch:{ all -> 0x001b }
            androidx.compose.ui.graphics.layer.view.DrawChildContainer r3 = r12.j(r2)     // Catch:{ all -> 0x001b }
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r2 = r1
            r4 = r10
            r2.<init>(r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x001b }
        L_0x0058:
            androidx.compose.ui.graphics.layer.GraphicsLayer r2 = new androidx.compose.ui.graphics.layer.GraphicsLayer     // Catch:{ all -> 0x001b }
            androidx.compose.ui.graphics.layer.LayerManager r3 = r12.f15889c     // Catch:{ all -> 0x001b }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x001b }
            monitor-exit(r0)
            return r2
        L_0x0061:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.AndroidGraphicsContext.b():androidx.compose.ui.graphics.layer.GraphicsLayer");
    }

    public final long i(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.a(view);
        }
        return -1;
    }

    public final DrawChildContainer j(ViewGroup viewGroup) {
        DrawChildContainer drawChildContainer = this.f15890d;
        if (drawChildContainer != null) {
            return drawChildContainer;
        }
        ViewLayerContainer viewLayerContainer = new ViewLayerContainer(viewGroup.getContext());
        viewGroup.addView(viewLayerContainer);
        this.f15890d = viewLayerContainer;
        return viewLayerContainer;
    }

    public final void k(Context context) {
        if (!this.f15891e) {
            context.getApplicationContext().registerComponentCallbacks(this.f15893g);
            this.f15891e = true;
        }
    }

    public final void l(Context context) {
        if (this.f15891e) {
            context.getApplicationContext().unregisterComponentCallbacks(this.f15893g);
            this.f15891e = false;
        }
    }
}
