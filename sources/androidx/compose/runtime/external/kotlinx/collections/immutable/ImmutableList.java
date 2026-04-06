package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, KMappedMarker {

    @Metadata
    public static final class SubList<E> extends AbstractList<E> implements ImmutableList<E> {

        /* renamed from: A  reason: collision with root package name */
        public final ImmutableList f15018A;

        /* renamed from: B  reason: collision with root package name */
        public final int f15019B;
        public final int C;
        public int D;

        public SubList(ImmutableList immutableList, int i2, int i3) {
            this.f15018A = immutableList;
            this.f15019B = i2;
            this.C = i3;
            ListImplementation.c(i2, i3, immutableList.size());
            this.D = i3 - i2;
        }

        public int g() {
            return this.D;
        }

        public Object get(int i2) {
            ListImplementation.a(i2, this.D);
            return this.f15018A.get(this.f15019B + i2);
        }

        public ImmutableList subList(int i2, int i3) {
            ListImplementation.c(i2, i3, this.D);
            ImmutableList immutableList = this.f15018A;
            int i4 = this.f15019B;
            return new SubList(immutableList, i2 + i4, i4 + i3);
        }
    }

    ImmutableList subList(int i2, int i3) {
        return new SubList(this, i2, i3);
    }
}
