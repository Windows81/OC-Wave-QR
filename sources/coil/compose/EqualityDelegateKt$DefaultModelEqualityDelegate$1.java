package coil.compose;

import android.graphics.ColorSpace;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class EqualityDelegateKt$DefaultModelEqualityDelegate$1 implements EqualityDelegate {
    public boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (!(obj instanceof ImageRequest) || !(obj2 instanceof ImageRequest)) {
            return Intrinsics.d(obj, obj2);
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        ImageRequest imageRequest2 = (ImageRequest) obj2;
        return Intrinsics.d(imageRequest.l(), imageRequest2.l()) && Intrinsics.d(imageRequest.m(), imageRequest2.m()) && Intrinsics.d(imageRequest.G(), imageRequest2.G()) && Intrinsics.d(imageRequest.B(), imageRequest2.B()) && Intrinsics.d(imageRequest.r(), imageRequest2.r()) && imageRequest.j() == imageRequest2.j() && Intrinsics.d(imageRequest.k(), imageRequest2.k()) && Intrinsics.d(imageRequest.O(), imageRequest2.O()) && Intrinsics.d(imageRequest.x(), imageRequest2.x()) && imageRequest.g() == imageRequest2.g() && imageRequest.h() == imageRequest2.h() && imageRequest.i() == imageRequest2.i() && imageRequest.I() == imageRequest2.I() && imageRequest.C() == imageRequest2.C() && imageRequest.s() == imageRequest2.s() && imageRequest.D() == imageRequest2.D() && Intrinsics.d(imageRequest.K(), imageRequest2.K()) && imageRequest.J() == imageRequest2.J() && imageRequest.H() == imageRequest2.H() && Intrinsics.d(imageRequest.E(), imageRequest2.E());
    }

    public int c(Object obj) {
        int i2 = 0;
        if (obj instanceof ImageRequest) {
            ImageRequest imageRequest = (ImageRequest) obj;
            int hashCode = ((imageRequest.l().hashCode() * 31) + imageRequest.m().hashCode()) * 31;
            MemoryCache.Key G = imageRequest.G();
            int hashCode2 = (hashCode + (G != null ? G.hashCode() : 0)) * 31;
            MemoryCache.Key B2 = imageRequest.B();
            int hashCode3 = (hashCode2 + (B2 != null ? B2.hashCode() : 0)) * 31;
            String r2 = imageRequest.r();
            int hashCode4 = (((hashCode3 + (r2 != null ? r2.hashCode() : 0)) * 31) + imageRequest.j().hashCode()) * 31;
            ColorSpace k2 = imageRequest.k();
            if (k2 != null) {
                i2 = k2.hashCode();
            }
            return ((((((((((((((((((((((((((hashCode4 + i2) * 31) + imageRequest.O().hashCode()) * 31) + imageRequest.x().hashCode()) * 31) + Boolean.hashCode(imageRequest.g())) * 31) + Boolean.hashCode(imageRequest.h())) * 31) + Boolean.hashCode(imageRequest.i())) * 31) + Boolean.hashCode(imageRequest.I())) * 31) + imageRequest.C().hashCode()) * 31) + imageRequest.s().hashCode()) * 31) + imageRequest.D().hashCode()) * 31) + imageRequest.K().hashCode()) * 31) + imageRequest.J().hashCode()) * 31) + imageRequest.H().hashCode()) * 31) + imageRequest.E().hashCode();
        } else if (obj != null) {
            return obj.hashCode();
        } else {
            return 0;
        }
    }
}
