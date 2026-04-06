package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

@Metadata
public interface LazyLayoutKeyIndexMap {

    @Metadata
    public static final class Empty implements LazyLayoutKeyIndexMap {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Empty f4874a = new Empty();

        /* renamed from: a */
        public Void c(int i2) {
            return null;
        }

        public int e(Object obj) {
            return -1;
        }
    }

    Object c(int i2);

    int e(Object obj);
}
