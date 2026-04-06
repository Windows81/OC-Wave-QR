package coil.size;

import kotlin.Metadata;

@Metadata
public final class SizeResolvers {
    public static final SizeResolver a(Size size) {
        return new RealSizeResolver(size);
    }
}
