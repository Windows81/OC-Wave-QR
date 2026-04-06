package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.GroupSourceInformation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
public abstract class ComposeStackTraceBuilder {

    /* renamed from: a  reason: collision with root package name */
    public final List f15389a = new ArrayList();

    public final void a(GroupSourceInformation groupSourceInformation, Object obj) {
        ComposeStackTraceFrame b2 = b(groupSourceInformation, obj);
        if (b2 != null) {
            this.f15389a.add(b2);
        }
    }

    public final ComposeStackTraceFrame b(GroupSourceInformation groupSourceInformation, Object obj) {
        ArrayList f2;
        String h2 = groupSourceInformation.h();
        SourceInformation e2 = h2 != null ? SourceInformationKt.e(h2) : null;
        if (e2 == null) {
            return null;
        }
        if (obj == null) {
            return new ComposeStackTraceFrame(e2, (Integer) null);
        }
        ArrayList f3 = groupSourceInformation.f();
        int i2 = 0;
        if (f3 != null) {
            int size = f3.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Object obj2 = f3.get(i4);
                if (Intrinsics.d(obj2, obj)) {
                    break;
                }
                GroupSourceInformation h3 = h(obj2);
                if (h3 != null && (h3.g() == -127 || (h3.g() == 0 && (obj2 instanceof Anchor) && d((Anchor) obj2) == -127))) {
                    if ((h3 != null ? h3.h() : null) == null) {
                        if (!(h3 == null || (f2 = h3.f()) == null)) {
                            int size2 = f2.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                GroupSourceInformation h4 = h(f2.get(i5));
                                if (h4 != null && e(h4)) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
                if (h3 != null && e(h3)) {
                    i3++;
                }
            }
            i2 = i3;
        }
        return new ComposeStackTraceFrame(e2, Integer.valueOf(i2));
    }

    public final boolean c(GroupSourceInformation groupSourceInformation, Object obj) {
        ArrayList f2 = groupSourceInformation.f();
        boolean z2 = false;
        if (f2 != null) {
            int size = f2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = f2.get(i2);
                if (obj2 instanceof Anchor) {
                    if (Intrinsics.d(obj2, obj)) {
                        a(groupSourceInformation, obj2);
                        return true;
                    }
                } else if (!(obj2 instanceof GroupSourceInformation)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                } else if (c((GroupSourceInformation) obj2, obj)) {
                    a(groupSourceInformation, obj2);
                    return true;
                }
            }
            return false;
        } else if (!groupSourceInformation.c()) {
            a(groupSourceInformation, (Object) null);
            return true;
        } else {
            int e2 = groupSourceInformation.e();
            int d2 = groupSourceInformation.d();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int intValue = number.intValue();
                if ((e2 <= intValue && intValue < d2) || (e2 == d2 && (obj instanceof Integer) && e2 == number.intValue())) {
                    z2 = true;
                }
                if (z2) {
                    a(groupSourceInformation, (Object) null);
                }
            }
            return z2;
        }
    }

    public abstract int d(Anchor anchor);

    public final boolean e(GroupSourceInformation groupSourceInformation) {
        String h2 = groupSourceInformation.h();
        return h2 != null && StringsKt.Q(h2, "C", false, 2, (Object) null);
    }

    public final void f(GroupSourceInformation groupSourceInformation, Object obj) {
        if (groupSourceInformation == null) {
            return;
        }
        if (obj == null) {
            a(groupSourceInformation, (Object) null);
        } else if (!c(groupSourceInformation, obj) && !groupSourceInformation.c()) {
            a(groupSourceInformation, (Object) null);
        }
    }

    public abstract GroupSourceInformation g(Anchor anchor);

    public final GroupSourceInformation h(Object obj) {
        if (obj instanceof Anchor) {
            return g((Anchor) obj);
        }
        if (obj instanceof GroupSourceInformation) {
            return (GroupSourceInformation) obj;
        }
        throw new IllegalStateException(("Unexpected child source info " + obj).toString());
    }

    public final List i() {
        return this.f15389a;
    }
}
