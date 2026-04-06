package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
public abstract class ImmutableTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    @DoNotMock
    public static final class Builder<R, C, V> {
    }

    public static final class SerializedForm implements Serializable {
    }

    public static Table.Cell i(Object obj, Object obj2, Object obj3) {
        return Tables.c(Preconditions.r(obj, "rowKey"), Preconditions.r(obj2, "columnKey"), Preconditions.r(obj3, "value"));
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    public final Iterator g() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: h */
    public final UnmodifiableIterator a() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: j */
    public ImmutableSet z() {
        return (ImmutableSet) super.z();
    }

    public ImmutableSet k() {
        return D().keySet();
    }

    /* renamed from: l */
    public abstract ImmutableMap D();

    /* renamed from: m */
    public abstract ImmutableSet c();

    /* renamed from: n */
    public abstract ImmutableCollection d();

    public ImmutableSet p() {
        return o().keySet();
    }

    /* renamed from: q */
    public abstract ImmutableMap o();

    /* renamed from: r */
    public ImmutableCollection values() {
        return (ImmutableCollection) super.values();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
