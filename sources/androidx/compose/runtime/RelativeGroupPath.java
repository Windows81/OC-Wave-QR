package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class RelativeGroupPath extends SourceInformationGroupPath {

    /* renamed from: a  reason: collision with root package name */
    public final SourceInformationGroupPath f14830a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14831b;

    public RelativeGroupPath(SourceInformationGroupPath sourceInformationGroupPath, int i2) {
        super((DefaultConstructorMarker) null);
        this.f14830a = sourceInformationGroupPath;
        this.f14831b = i2;
    }
}
