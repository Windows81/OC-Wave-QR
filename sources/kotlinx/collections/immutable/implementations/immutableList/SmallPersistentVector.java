package kotlinx.collections.immutable.implementations.immutableList;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlinx.collections.immutable.internal.ListImplementation;

@Metadata
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {

    /* renamed from: B  reason: collision with root package name */
    public static final Companion f41256B = new Companion((DefaultConstructorMarker) null);
    public static final SmallPersistentVector C = new SmallPersistentVector(new Object[0]);

    /* renamed from: A  reason: collision with root package name */
    public final Object[] f41257A;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SmallPersistentVector a() {
            return SmallPersistentVector.C;
        }

        public Companion() {
        }
    }

    public SmallPersistentVector(Object[] objArr) {
        Intrinsics.i(objArr, "buffer");
        this.f41257A = objArr;
        CommonFunctionsKt.a(objArr.length <= 32);
    }

    public PersistentList addAll(Collection collection) {
        Intrinsics.i(collection, "elements");
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f41257A, size() + collection.size());
            Intrinsics.h(copyOf, "copyOf(...)");
            int size = size();
            for (Object obj : collection) {
                copyOf[size] = obj;
                size++;
            }
            return new SmallPersistentVector(copyOf);
        }
        PersistentList.Builder l2 = l();
        l2.addAll(collection);
        return l2.d();
    }

    public int g() {
        return this.f41257A.length;
    }

    public Object get(int i2) {
        ListImplementation.a(i2, size());
        return this.f41257A[i2];
    }

    public int indexOf(Object obj) {
        return ArraysKt.t0(this.f41257A, obj);
    }

    public PersistentList.Builder l() {
        return new PersistentVectorBuilder(this, (Object[]) null, this.f41257A, 0);
    }

    public int lastIndexOf(Object obj) {
        return ArraysKt.I0(this.f41257A, obj);
    }

    public ListIterator listIterator(int i2) {
        ListImplementation.b(i2, size());
        return new BufferIterator(this.f41257A, i2, size());
    }
}
