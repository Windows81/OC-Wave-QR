package com.google.common.collect;

import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@ElementTypesAreNonnullByDefault
public abstract class MultimapBuilder<K0, V0> {

    /* renamed from: com.google.common.collect.MultimapBuilder$1  reason: invalid class name */
    class AnonymousClass1 extends MultimapBuilderWithKeys<Object> {
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$2  reason: invalid class name */
    class AnonymousClass2 extends MultimapBuilderWithKeys<Object> {
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$3  reason: invalid class name */
    class AnonymousClass3 extends MultimapBuilderWithKeys<Object> {
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$4  reason: invalid class name */
    class AnonymousClass4 extends MultimapBuilderWithKeys<Enum<Object>> {
    }

    public static final class ArrayListSupplier<V> implements Supplier<List<V>>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final int f28431z;

        /* renamed from: a */
        public List get() {
            return new ArrayList(this.f28431z);
        }
    }

    public static final class EnumSetSupplier<V extends Enum<V>> implements Supplier<Set<V>>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Class f28432z;

        /* renamed from: a */
        public Set get() {
            return EnumSet.noneOf(this.f28432z);
        }
    }

    public static final class HashSetSupplier<V> implements Supplier<Set<V>>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final int f28433z;

        /* renamed from: a */
        public Set get() {
            return Platform.c(this.f28433z);
        }
    }

    public static final class LinkedHashSetSupplier<V> implements Supplier<Set<V>>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final int f28434z;

        /* renamed from: a */
        public Set get() {
            return Platform.d(this.f28434z);
        }
    }

    public enum LinkedListSupplier implements Supplier<List<?>> {
        INSTANCE;

        /* renamed from: f */
        public List get() {
            return new LinkedList();
        }
    }

    public static abstract class ListMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
    }

    public static abstract class MultimapBuilderWithKeys<K0> {

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$1  reason: invalid class name */
        class AnonymousClass1 extends ListMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$2  reason: invalid class name */
        class AnonymousClass2 extends ListMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$3  reason: invalid class name */
        class AnonymousClass3 extends SetMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$4  reason: invalid class name */
        class AnonymousClass4 extends SetMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$5  reason: invalid class name */
        class AnonymousClass5 extends SortedSetMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$6  reason: invalid class name */
        class AnonymousClass6 extends SetMultimapBuilder<Object, Enum<Object>> {
        }
    }

    public static abstract class SetMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
    }

    public static abstract class SortedSetMultimapBuilder<K0, V0> extends SetMultimapBuilder<K0, V0> {
    }

    public static final class TreeSetSupplier<V> implements Supplier<SortedSet<V>>, Serializable {

        /* renamed from: z  reason: collision with root package name */
        public final Comparator f28437z;

        /* renamed from: a */
        public SortedSet get() {
            return new TreeSet(this.f28437z);
        }
    }
}
