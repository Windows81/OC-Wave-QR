package androidx.compose.foundation;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1  reason: invalid class name */
public final class BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Shape f2923A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f2924z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(long j2, Shape shape) {
        super(1);
        this.f2924z = j2;
        this.f2923A = shape;
    }

    public final void b(InspectorInfo inspectorInfo) {
        inspectorInfo.b("background");
        inspectorInfo.c(Color.h(this.f2924z));
        inspectorInfo.a().b("color", Color.h(this.f2924z));
        inspectorInfo.a().b("shape", this.f2923A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((InspectorInfo) obj);
        return Unit.f40552a;
    }
}
