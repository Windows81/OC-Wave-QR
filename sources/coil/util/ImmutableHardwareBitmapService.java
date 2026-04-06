package coil.util;

import coil.size.Size;
import kotlin.Metadata;

@Metadata
final class ImmutableHardwareBitmapService implements HardwareBitmapService {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23758a;

    public ImmutableHardwareBitmapService(boolean z2) {
        this.f23758a = z2;
    }

    public boolean a(Size size) {
        return this.f23758a;
    }

    public boolean b() {
        return this.f23758a;
    }
}
