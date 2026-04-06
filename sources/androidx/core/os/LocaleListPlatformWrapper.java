package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

final class LocaleListPlatformWrapper implements LocaleListInterface {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f19967a;

    public LocaleListPlatformWrapper(Object obj) {
        this.f19967a = (LocaleList) obj;
    }

    public String a() {
        return this.f19967a.toLanguageTags();
    }

    public Object b() {
        return this.f19967a;
    }

    public boolean equals(Object obj) {
        return this.f19967a.equals(((LocaleListInterface) obj).b());
    }

    public Locale get(int i2) {
        return this.f19967a.get(i2);
    }

    public int hashCode() {
        return this.f19967a.hashCode();
    }

    public boolean isEmpty() {
        return this.f19967a.isEmpty();
    }

    public int size() {
        return this.f19967a.size();
    }

    public String toString() {
        return this.f19967a.toString();
    }
}
