package androidx.compose.material3;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.e3  reason: case insensitive filesystem */
public final /* synthetic */ class C0086e3 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ IndicatorLineNode f12009A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Path f12010z;

    public /* synthetic */ C0086e3(Path path, IndicatorLineNode indicatorLineNode) {
        this.f12010z = path;
        this.f12009A = indicatorLineNode;
    }

    public final Object invoke(Object obj) {
        return IndicatorLineNode.t3(this.f12010z, this.f12009A, (ContentDrawScope) obj);
    }
}
