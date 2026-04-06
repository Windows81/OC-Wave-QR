package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Collections;
import java.util.List;

@CheckReturnValue
abstract class ListFieldSchema {

    /* renamed from: a  reason: collision with root package name */
    public static final ListFieldSchema f32205a = new ListFieldSchemaFull();

    /* renamed from: b  reason: collision with root package name */
    public static final ListFieldSchema f32206b = new ListFieldSchemaLite();

    public static final class ListFieldSchemaFull extends ListFieldSchema {

        /* renamed from: c  reason: collision with root package name */
        public static final Class f32207c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public ListFieldSchemaFull() {
            super();
        }

        public static List f(Object obj, long j2) {
            return (List) UnsafeUtil.H(obj, j2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.LazyStringArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.LazyStringArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.LazyStringArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.protobuf.LazyStringList
                if (r1 == 0) goto L_0x0014
                com.google.protobuf.LazyStringArrayList r0 = new com.google.protobuf.LazyStringArrayList
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.protobuf.PrimitiveNonBoxingCollection
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.protobuf.Internal.ProtobufList
                if (r1 == 0) goto L_0x0024
                com.google.protobuf.Internal$ProtobufList r0 = (com.google.protobuf.Internal.ProtobufList) r0
                com.google.protobuf.Internal$ProtobufList r6 = r0.f(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.protobuf.UnsafeUtil.Y(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class r1 = f32207c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.protobuf.UnsafeUtil.Y(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof com.google.protobuf.UnmodifiableLazyStringList
                if (r1 == 0) goto L_0x0062
                com.google.protobuf.LazyStringArrayList r1 = new com.google.protobuf.LazyStringArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.protobuf.UnmodifiableLazyStringList r0 = (com.google.protobuf.UnmodifiableLazyStringList) r0
                r1.addAll(r0)
                com.google.protobuf.UnsafeUtil.Y(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof com.google.protobuf.PrimitiveNonBoxingCollection
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.protobuf.Internal.ProtobufList
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.protobuf.Internal$ProtobufList r1 = (com.google.protobuf.Internal.ProtobufList) r1
                boolean r2 = r1.I()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.protobuf.Internal$ProtobufList r0 = r1.f(r0)
                com.google.protobuf.UnsafeUtil.Y(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ListFieldSchema.ListFieldSchemaFull.g(java.lang.Object, long, int):java.util.List");
        }

        public void c(Object obj, long j2) {
            Object obj2;
            List list = (List) UnsafeUtil.H(obj, j2);
            if (list instanceof LazyStringList) {
                obj2 = ((LazyStringList) list).j1();
            } else if (!f32207c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof PrimitiveNonBoxingCollection) || !(list instanceof Internal.ProtobufList)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.I()) {
                        protobufList.r();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            UnsafeUtil.Y(obj, j2, obj2);
        }

        public void d(Object obj, Object obj2, long j2) {
            List f2 = f(obj2, j2);
            List g2 = g(obj, j2, f2.size());
            int size = g2.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                g2.addAll(f2);
            }
            if (size > 0) {
                f2 = g2;
            }
            UnsafeUtil.Y(obj, j2, f2);
        }

        public List e(Object obj, long j2) {
            return g(obj, j2, 10);
        }
    }

    public static final class ListFieldSchemaLite extends ListFieldSchema {
        public ListFieldSchemaLite() {
            super();
        }

        public static Internal.ProtobufList f(Object obj, long j2) {
            return (Internal.ProtobufList) UnsafeUtil.H(obj, j2);
        }

        public void c(Object obj, long j2) {
            f(obj, j2).r();
        }

        public void d(Object obj, Object obj2, long j2) {
            Internal.ProtobufList f2 = f(obj, j2);
            Internal.ProtobufList f3 = f(obj2, j2);
            int size = f2.size();
            int size2 = f3.size();
            if (size > 0 && size2 > 0) {
                if (!f2.I()) {
                    f2 = f2.f(size2 + size);
                }
                f2.addAll(f3);
            }
            if (size > 0) {
                f3 = f2;
            }
            UnsafeUtil.Y(obj, j2, f3);
        }

        public List e(Object obj, long j2) {
            Internal.ProtobufList f2 = f(obj, j2);
            if (f2.I()) {
                return f2;
            }
            int size = f2.size();
            Internal.ProtobufList f3 = f2.f(size == 0 ? 10 : size * 2);
            UnsafeUtil.Y(obj, j2, f3);
            return f3;
        }
    }

    public static ListFieldSchema a() {
        return f32205a;
    }

    public static ListFieldSchema b() {
        return f32206b;
    }

    public abstract void c(Object obj, long j2);

    public abstract void d(Object obj, Object obj2, long j2);

    public abstract List e(Object obj, long j2);

    public ListFieldSchema() {
    }
}
