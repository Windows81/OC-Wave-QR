package io.github.inflationx.viewpump.internal;

import android.content.Context;
import android.util.AttributeSet;
import io.github.inflationx.viewpump.FallbackViewCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* renamed from: io.github.inflationx.viewpump.internal.-ReflectiveFallbackViewCreator  reason: invalid class name */
public final class ReflectiveFallbackViewCreator implements FallbackViewCreator {

    /* renamed from: a  reason: collision with root package name */
    public static final Class[] f39821a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class[] f39822b;

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f39823c = new Companion((DefaultConstructorMarker) null);

    @Metadata
    /* renamed from: io.github.inflationx.viewpump.internal.-ReflectiveFallbackViewCreator$Companion */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<Context> cls = Context.class;
        f39821a = new Class[]{cls};
        f39822b = new Class[]{cls, AttributeSet.class};
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3 = f39821a;
        r3 = r2.getConstructor((java.lang.Class[]) java.util.Arrays.copyOf(r3, r3.length));
        kotlin.jvm.internal.Intrinsics.e(r3, "clazz.getConstructor(*CONSTRUCTOR_SIGNATURE_1)");
        r2 = new android.content.Context[]{r4};
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r1 = this;
            java.lang.String r2 = "name"
            kotlin.jvm.internal.Intrinsics.j(r3, r2)
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.j(r4, r2)
            java.lang.Class r2 = java.lang.Class.forName(r3)     // Catch:{ Exception -> 0x002b }
            java.lang.Class<android.view.View> r3 = android.view.View.class
            java.lang.Class r2 = r2.asSubclass(r3)     // Catch:{ Exception -> 0x002b }
            java.lang.Class[] r3 = f39822b     // Catch:{ NoSuchMethodException -> 0x002d }
            int r0 = r3.length     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.reflect.Constructor r3 = r2.getConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.String r0 = "clazz.getConstructor(*CONSTRUCTOR_SIGNATURE_2)"
            kotlin.jvm.internal.Intrinsics.e(r3, r0)     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r5}     // Catch:{ NoSuchMethodException -> 0x002d }
            goto L_0x0043
        L_0x002b:
            r2 = move-exception
            goto L_0x0053
        L_0x002d:
            java.lang.Class[] r3 = f39821a     // Catch:{ Exception -> 0x002b }
            int r5 = r3.length     // Catch:{ Exception -> 0x002b }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r5)     // Catch:{ Exception -> 0x002b }
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch:{ Exception -> 0x002b }
            java.lang.reflect.Constructor r3 = r2.getConstructor(r3)     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "clazz.getConstructor(*CONSTRUCTOR_SIGNATURE_1)"
            kotlin.jvm.internal.Intrinsics.e(r3, r2)     // Catch:{ Exception -> 0x002b }
            android.content.Context[] r2 = new android.content.Context[]{r4}     // Catch:{ Exception -> 0x002b }
        L_0x0043:
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x002b }
            int r4 = r2.length     // Catch:{ Exception -> 0x002b }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)     // Catch:{ Exception -> 0x002b }
            java.lang.Object r2 = r3.newInstance(r2)     // Catch:{ Exception -> 0x002b }
            android.view.View r2 = (android.view.View) r2     // Catch:{ Exception -> 0x002b }
            return r2
        L_0x0053:
            boolean r3 = r2 instanceof java.lang.ClassNotFoundException
            if (r3 == 0) goto L_0x005b
            r2.printStackTrace()
            goto L_0x007a
        L_0x005b:
            boolean r3 = r2 instanceof java.lang.NoSuchMethodException
            if (r3 == 0) goto L_0x0063
            r2.printStackTrace()
            goto L_0x007a
        L_0x0063:
            boolean r3 = r2 instanceof java.lang.IllegalAccessException
            if (r3 == 0) goto L_0x006b
            r2.printStackTrace()
            goto L_0x007a
        L_0x006b:
            boolean r3 = r2 instanceof java.lang.InstantiationException
            if (r3 == 0) goto L_0x0073
            r2.printStackTrace()
            goto L_0x007a
        L_0x0073:
            boolean r3 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r3 == 0) goto L_0x007c
            r2.printStackTrace()
        L_0x007a:
            r2 = 0
            return r2
        L_0x007c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.inflationx.viewpump.internal.ReflectiveFallbackViewCreator.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
