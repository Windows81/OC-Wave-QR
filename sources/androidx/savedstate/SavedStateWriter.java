package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata
@JvmInline
public final class SavedStateWriter {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f22829a;

    public static final void A(Bundle bundle, String str, Bundle bundle2) {
        Intrinsics.i(str, "key");
        Intrinsics.i(bundle2, "value");
        bundle.putBundle(str, bundle2);
    }

    public static final void B(Bundle bundle, String str, Size size) {
        Intrinsics.i(str, "key");
        Intrinsics.i(size, "value");
        bundle.putSize(str, size);
    }

    public static final void C(Bundle bundle, String str, SizeF sizeF) {
        Intrinsics.i(str, "key");
        Intrinsics.i(sizeF, "value");
        bundle.putSizeF(str, sizeF);
    }

    public static final void D(Bundle bundle, String str, SparseArray sparseArray) {
        Intrinsics.i(str, "key");
        Intrinsics.i(sparseArray, "value");
        bundle.putSparseParcelableArray(str, sparseArray);
    }

    public static final void E(Bundle bundle, String str, String str2) {
        Intrinsics.i(str, "key");
        Intrinsics.i(str2, "value");
        bundle.putString(str, str2);
    }

    public static final void F(Bundle bundle, String str, String[] strArr) {
        Intrinsics.i(str, "key");
        Intrinsics.i(strArr, "value");
        bundle.putStringArray(str, strArr);
    }

    public static final void G(Bundle bundle, String str, List list) {
        Intrinsics.i(str, "key");
        Intrinsics.i(list, "value");
        bundle.putStringArrayList(str, SavedStateWriterKt.a(list));
    }

    public static final void H(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        bundle.remove(str);
    }

    public static String I(Bundle bundle) {
        return "SavedStateWriter(source=" + bundle + ')';
    }

    public static Bundle a(Bundle bundle) {
        Intrinsics.i(bundle, "source");
        return bundle;
    }

    public static boolean b(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateWriter) && Intrinsics.d(bundle, ((SavedStateWriter) obj).J());
    }

    public static int c(Bundle bundle) {
        return bundle.hashCode();
    }

    public static final void d(Bundle bundle, Bundle bundle2) {
        Intrinsics.i(bundle2, "from");
        bundle.putAll(bundle2);
    }

    public static final void e(Bundle bundle, String str, IBinder iBinder) {
        Intrinsics.i(str, "key");
        Intrinsics.i(iBinder, "value");
        bundle.putBinder(str, iBinder);
    }

    public static final void f(Bundle bundle, String str, boolean z2) {
        Intrinsics.i(str, "key");
        bundle.putBoolean(str, z2);
    }

    public static final void g(Bundle bundle, String str, boolean[] zArr) {
        Intrinsics.i(str, "key");
        Intrinsics.i(zArr, "value");
        bundle.putBooleanArray(str, zArr);
    }

    public static final void h(Bundle bundle, String str, char c2) {
        Intrinsics.i(str, "key");
        bundle.putChar(str, c2);
    }

    public static final void i(Bundle bundle, String str, char[] cArr) {
        Intrinsics.i(str, "key");
        Intrinsics.i(cArr, "value");
        bundle.putCharArray(str, cArr);
    }

    public static final void j(Bundle bundle, String str, CharSequence charSequence) {
        Intrinsics.i(str, "key");
        Intrinsics.i(charSequence, "value");
        bundle.putCharSequence(str, charSequence);
    }

    public static final void k(Bundle bundle, String str, CharSequence[] charSequenceArr) {
        Intrinsics.i(str, "key");
        Intrinsics.i(charSequenceArr, "value");
        bundle.putCharSequenceArray(str, charSequenceArr);
    }

    public static final void l(Bundle bundle, String str, List list) {
        Intrinsics.i(str, "key");
        Intrinsics.i(list, "value");
        bundle.putCharSequenceArrayList(str, SavedStateWriterKt.a(list));
    }

    public static final void m(Bundle bundle, String str, double d2) {
        Intrinsics.i(str, "key");
        bundle.putDouble(str, d2);
    }

    public static final void n(Bundle bundle, String str, double[] dArr) {
        Intrinsics.i(str, "key");
        Intrinsics.i(dArr, "value");
        bundle.putDoubleArray(str, dArr);
    }

    public static final void o(Bundle bundle, String str, float f2) {
        Intrinsics.i(str, "key");
        bundle.putFloat(str, f2);
    }

    public static final void p(Bundle bundle, String str, float[] fArr) {
        Intrinsics.i(str, "key");
        Intrinsics.i(fArr, "value");
        bundle.putFloatArray(str, fArr);
    }

    public static final void q(Bundle bundle, String str, int i2) {
        Intrinsics.i(str, "key");
        bundle.putInt(str, i2);
    }

    public static final void r(Bundle bundle, String str, int[] iArr) {
        Intrinsics.i(str, "key");
        Intrinsics.i(iArr, "value");
        bundle.putIntArray(str, iArr);
    }

    public static final void s(Bundle bundle, String str, List list) {
        Intrinsics.i(str, "key");
        Intrinsics.i(list, "value");
        bundle.putIntegerArrayList(str, SavedStateWriterKt.a(list));
    }

    public static final void t(Bundle bundle, String str, Serializable serializable) {
        Intrinsics.i(str, "key");
        Intrinsics.i(serializable, "value");
        bundle.putSerializable(str, serializable);
    }

    public static final void u(Bundle bundle, String str, long j2) {
        Intrinsics.i(str, "key");
        bundle.putLong(str, j2);
    }

    public static final void v(Bundle bundle, String str, long[] jArr) {
        Intrinsics.i(str, "key");
        Intrinsics.i(jArr, "value");
        bundle.putLongArray(str, jArr);
    }

    public static final void w(Bundle bundle, String str) {
        Intrinsics.i(str, "key");
        bundle.putString(str, (String) null);
    }

    public static final void x(Bundle bundle, String str, Parcelable parcelable) {
        Intrinsics.i(str, "key");
        Intrinsics.i(parcelable, "value");
        bundle.putParcelable(str, parcelable);
    }

    public static final void y(Bundle bundle, String str, Parcelable[] parcelableArr) {
        Intrinsics.i(str, "key");
        Intrinsics.i(parcelableArr, "value");
        bundle.putParcelableArray(str, parcelableArr);
    }

    public static final void z(Bundle bundle, String str, List list) {
        Intrinsics.i(str, "key");
        Intrinsics.i(list, "value");
        bundle.putParcelableArrayList(str, SavedStateWriterKt.a(list));
    }

    public final /* synthetic */ Bundle J() {
        return this.f22829a;
    }

    public boolean equals(Object obj) {
        return b(this.f22829a, obj);
    }

    public int hashCode() {
        return c(this.f22829a);
    }

    public String toString() {
        return I(this.f22829a);
    }
}
