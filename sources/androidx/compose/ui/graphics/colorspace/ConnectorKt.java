package androidx.compose.ui.graphics.colorspace;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.graphics.colorspace.RenderIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ConnectorKt {

    /* renamed from: a  reason: collision with root package name */
    public static final MutableIntObjectMap f16212a;

    static {
        ColorSpaces colorSpaces = ColorSpaces.f16176a;
        int d2 = colorSpaces.G().d();
        int d3 = colorSpaces.G().d();
        RenderIntent.Companion companion = RenderIntent.f16230b;
        f16212a = IntObjectMapKt.d(d2 | (d3 << 6) | (companion.b() << 12), Connector.f16202g.c(colorSpaces.G()), colorSpaces.G().d() | (colorSpaces.D().d() << 6) | (companion.b() << 12), new Connector(colorSpaces.G(), colorSpaces.D(), companion.b(), (DefaultConstructorMarker) null), colorSpaces.D().d() | (colorSpaces.G().d() << 6) | (companion.b() << 12), new Connector(colorSpaces.D(), colorSpaces.G(), companion.b(), (DefaultConstructorMarker) null));
    }

    public static final MutableIntObjectMap a() {
        return f16212a;
    }
}
