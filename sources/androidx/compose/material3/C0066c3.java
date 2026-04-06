package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.c3  reason: case insensitive filesystem */
public final /* synthetic */ class C0066c3 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f11886A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f11887B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f11888z;

    public /* synthetic */ C0066c3(Painter painter, String str, Modifier modifier, long j2, int i2, int i3) {
        this.f11888z = painter;
        this.f11886A = str;
        this.f11887B = modifier;
        this.C = j2;
        this.D = i2;
        this.E = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return IconKt.h(this.f11888z, this.f11886A, this.f11887B, this.C, this.D, this.E, (Composer) obj, ((Integer) obj2).intValue());
    }
}
