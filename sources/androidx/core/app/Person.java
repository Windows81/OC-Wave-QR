package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

public class Person {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f19661a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f19662b;

    /* renamed from: c  reason: collision with root package name */
    public String f19663c;

    /* renamed from: d  reason: collision with root package name */
    public String f19664d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f19665e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f19666f;

    public static class Api22Impl {
    }

    public static class Api28Impl {
        public static android.app.Person a(Person person) {
            return new Person.Builder().setName(person.c()).setIcon(person.a() != null ? person.a().m() : null).setUri(person.d()).setKey(person.b()).setBot(person.e()).setImportant(person.f()).build();
        }
    }

    public static class Builder {
    }

    public IconCompat a() {
        return this.f19662b;
    }

    public String b() {
        return this.f19664d;
    }

    public CharSequence c() {
        return this.f19661a;
    }

    public String d() {
        return this.f19663c;
    }

    public boolean e() {
        return this.f19665e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        String b2 = b();
        String b3 = person.b();
        return (b2 == null && b3 == null) ? Objects.equals(Objects.toString(c()), Objects.toString(person.c())) && Objects.equals(d(), person.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(person.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(person.f())) : Objects.equals(b2, b3);
    }

    public boolean f() {
        return this.f19666f;
    }

    public String g() {
        String str = this.f19663c;
        if (str != null) {
            return str;
        }
        if (this.f19661a == null) {
            return "";
        }
        return "name:" + this.f19661a;
    }

    public android.app.Person h() {
        return Api28Impl.a(this);
    }

    public int hashCode() {
        String b2 = b();
        return b2 != null ? b2.hashCode() : Objects.hash(new Object[]{c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f())});
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f19661a);
        IconCompat iconCompat = this.f19662b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.l() : null);
        bundle.putString("uri", this.f19663c);
        bundle.putString("key", this.f19664d);
        bundle.putBoolean("isBot", this.f19665e);
        bundle.putBoolean("isImportant", this.f19666f);
        return bundle;
    }
}
