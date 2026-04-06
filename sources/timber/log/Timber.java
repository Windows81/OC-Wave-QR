package timber.log;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public final class Timber {

    /* renamed from: a  reason: collision with root package name */
    public static final Forest f44337a = new Forest((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f44338b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static volatile Tree[] f44339c = new Tree[0];

    @Metadata
    public static class DebugTree extends Tree {

        /* renamed from: c  reason: collision with root package name */
        public static final Companion f44340c = new Companion((DefaultConstructorMarker) null);

        /* renamed from: d  reason: collision with root package name */
        public static final Pattern f44341d = Pattern.compile("(\\$\\d+)+$");

        /* renamed from: b  reason: collision with root package name */
        public final List f44342b;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        public String h() {
            String h2 = super.h();
            if (h2 != null) {
                return h2;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.h(stackTrace, "Throwable().stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!this.f44342b.contains(stackTraceElement.getClassName())) {
                    return p(stackTraceElement);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public void l(int i2, String str, String str2, Throwable th) {
            int min;
            Intrinsics.i(str2, "message");
            if (str2.length() >= 4000) {
                int length = str2.length();
                int i3 = 0;
                while (i3 < length) {
                    int i0 = StringsKt.i0(str2, 10, i3, false, 4, (Object) null);
                    if (i0 == -1) {
                        i0 = length;
                    }
                    while (true) {
                        min = Math.min(i0, i3 + 4000);
                        String substring = str2.substring(i3, min);
                        Intrinsics.h(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        if (i2 == 7) {
                            Log.wtf(str, substring);
                        } else {
                            Log.println(i2, str, substring);
                        }
                        if (min >= i0) {
                            break;
                        }
                        i3 = min;
                    }
                    i3 = min + 1;
                }
            } else if (i2 == 7) {
                Log.wtf(str, str2);
            } else {
                Log.println(i2, str, str2);
            }
        }

        public String p(StackTraceElement stackTraceElement) {
            Intrinsics.i(stackTraceElement, "element");
            String className = stackTraceElement.getClassName();
            Intrinsics.h(className, "element.className");
            String Z0 = StringsKt.Z0(className, '.', (String) null, 2, (Object) null);
            Matcher matcher = f44341d.matcher(Z0);
            if (matcher.find()) {
                Z0 = matcher.replaceAll("");
                Intrinsics.h(Z0, "m.replaceAll(\"\")");
            }
            Z0.length();
            return Z0;
        }
    }

    @Metadata
    public static final class Forest extends Tree {
        public /* synthetic */ Forest(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public void a(String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            for (Tree a2 : Timber.f44339c) {
                a2.a(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public void b(String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            for (Tree b2 : Timber.f44339c) {
                b2.b(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public void c(Throwable th) {
            for (Tree c2 : Timber.f44339c) {
                c2.c(th);
            }
        }

        public void d(Throwable th, String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            for (Tree d2 : Timber.f44339c) {
                d2.d(th, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public void i(String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            for (Tree i2 : Timber.f44339c) {
                i2.i(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public void l(int i2, String str, String str2, Throwable th) {
            Intrinsics.i(str2, "message");
            throw new AssertionError();
        }

        public void n(String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            for (Tree n2 : Timber.f44339c) {
                n2.n(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public void o(String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            for (Tree o2 : Timber.f44339c) {
                o2.o(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final Tree p(String str) {
            Intrinsics.i(str, "tag");
            Tree[] a2 = Timber.f44339c;
            int length = a2.length;
            int i2 = 0;
            while (i2 < length) {
                Tree tree = a2[i2];
                i2++;
                tree.f().set(str);
            }
            return this;
        }

        public Forest() {
        }
    }

    @Metadata
    public static abstract class Tree {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadLocal f44343a = new ThreadLocal();

        public void a(String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            m(3, (Throwable) null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void b(String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            m(6, (Throwable) null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void c(Throwable th) {
            m(6, th, (String) null, new Object[0]);
        }

        public void d(Throwable th, String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            m(6, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public String e(String str, Object[] objArr) {
            Intrinsics.i(str, "message");
            Intrinsics.i(objArr, "args");
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.h(format, "java.lang.String.format(this, *args)");
            return format;
        }

        public final /* synthetic */ ThreadLocal f() {
            return this.f44343a;
        }

        public final String g(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            Intrinsics.h(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        public /* synthetic */ String h() {
            String str = (String) this.f44343a.get();
            if (str != null) {
                this.f44343a.remove();
            }
            return str;
        }

        public void i(String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            m(4, (Throwable) null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public boolean j(int i2) {
            return true;
        }

        public boolean k(String str, int i2) {
            return j(i2);
        }

        public abstract void l(int i2, String str, String str2, Throwable th);

        public final void m(int i2, Throwable th, String str, Object... objArr) {
            String h2 = h();
            if (k(h2, i2)) {
                if (str != null && str.length() != 0) {
                    if (!(objArr.length == 0)) {
                        str = e(str, objArr);
                    }
                    if (th != null) {
                        str = str + 10 + g(th);
                    }
                } else if (th != null) {
                    str = g(th);
                } else {
                    return;
                }
                l(i2, h2, str, th);
            }
        }

        public void n(String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            m(2, (Throwable) null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void o(String str, Object... objArr) {
            Intrinsics.i(objArr, "args");
            m(5, (Throwable) null, str, Arrays.copyOf(objArr, objArr.length));
        }
    }
}
