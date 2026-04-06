package androidx.compose.ui.platform.coreshims;

import android.os.Bundle;
import android.view.ViewStructure;

public class ViewStructureCompat {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17976a;

    public static class Api23Impl {
        public static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        public static void b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        public static void c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        public static void d(ViewStructure viewStructure, int i2, int i3, int i4, int i5, int i6, int i7) {
            viewStructure.setDimens(i2, i3, i4, i5, i6, i7);
        }

        public static void e(ViewStructure viewStructure, int i2, String str, String str2, String str3) {
            viewStructure.setId(i2, str, str2, str3);
        }

        public static void f(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        public static void g(ViewStructure viewStructure, float f2, int i2, int i3, int i4) {
            viewStructure.setTextStyle(f2, i2, i3, i4);
        }
    }

    public ViewStructureCompat(ViewStructure viewStructure) {
        this.f17976a = viewStructure;
    }

    public static ViewStructureCompat i(ViewStructure viewStructure) {
        return new ViewStructureCompat(viewStructure);
    }

    public Bundle a() {
        return Api23Impl.a((ViewStructure) this.f17976a);
    }

    public void b(String str) {
        Api23Impl.b((ViewStructure) this.f17976a, str);
    }

    public void c(CharSequence charSequence) {
        Api23Impl.c((ViewStructure) this.f17976a, charSequence);
    }

    public void d(int i2, int i3, int i4, int i5, int i6, int i7) {
        Api23Impl.d((ViewStructure) this.f17976a, i2, i3, i4, i5, i6, i7);
    }

    public void e(int i2, String str, String str2, String str3) {
        Api23Impl.e((ViewStructure) this.f17976a, i2, str, str2, str3);
    }

    public void f(CharSequence charSequence) {
        Api23Impl.f((ViewStructure) this.f17976a, charSequence);
    }

    public void g(float f2, int i2, int i3, int i4) {
        Api23Impl.g((ViewStructure) this.f17976a, f2, i2, i3, i4);
    }

    public ViewStructure h() {
        return (ViewStructure) this.f17976a;
    }
}
