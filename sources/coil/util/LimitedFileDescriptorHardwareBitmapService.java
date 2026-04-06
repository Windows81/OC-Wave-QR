package coil.util;

import coil.size.Dimension;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class LimitedFileDescriptorHardwareBitmapService implements HardwareBitmapService {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f23759b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Logger f23760a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public LimitedFileDescriptorHardwareBitmapService(Logger logger) {
        this.f23760a = logger;
    }

    public boolean a(Size size) {
        Dimension d2 = size.d();
        int i2 = Integer.MAX_VALUE;
        if ((d2 instanceof Dimension.Pixels ? ((Dimension.Pixels) d2).f23691a : Integer.MAX_VALUE) > 100) {
            Dimension c2 = size.c();
            if (c2 instanceof Dimension.Pixels) {
                i2 = ((Dimension.Pixels) c2).f23691a;
            }
            if (i2 > 100) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        return FileDescriptorCounter.f23748a.b(this.f23760a);
    }
}
