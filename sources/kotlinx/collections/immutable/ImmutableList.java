package kotlinx.collections.immutable;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.internal.ListImplementation;

@Metadata
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, KMappedMarker {

    @Metadata
    public static final class DefaultImpls {
        public static ImmutableList a(ImmutableList immutableList, int i2, int i3) {
            return new SubList(immutableList, i2, i3);
        }
    }

    @Metadata
    public static final class SubList<E> extends AbstractList<E> implements ImmutableList<E> {

        /* renamed from: A  reason: collision with root package name */
        public final ImmutableList f41234A;

        /* renamed from: B  reason: collision with root package name */
        public final int f41235B;
        public final int C;
        public int D;

        public SubList(ImmutableList immutableList, int i2, int i3) {
            Intrinsics.i(immutableList, "source");
            this.f41234A = immutableList;
            this.f41235B = i2;
            this.C = i3;
            ListImplementation.c(i2, i3, immutableList.size());
            this.D = i3 - i2;
        }

        public int g() {
            return this.D;
        }

        public Object get(int i2) {
            ListImplementation.a(i2, this.D);
            return this.f41234A.get(this.f41235B + i2);
        }

        /* renamed from: i */
        public ImmutableList subList(int i2, int i3) {
            ListImplementation.c(i2, i3, this.D);
            ImmutableList immutableList = this.f41234A;
            int i4 = this.f41235B;
            return new SubList(immutableList, i2 + i4, i4 + i3);
        }
    }
}
