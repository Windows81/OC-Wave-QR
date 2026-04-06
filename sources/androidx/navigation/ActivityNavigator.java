package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;

@Metadata
@Navigator.Name("activity")
public class ActivityNavigator extends Navigator<Destination> {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f22156e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public final Context f22157c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f22158d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static class Destination extends NavDestination {
        public Intent L;
        public String M;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Destination(Navigator navigator) {
            super(navigator);
            Intrinsics.i(navigator, "activityNavigator");
        }

        public boolean L() {
            return false;
        }

        public final String M() {
            Intent intent = this.L;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName O() {
            Intent intent = this.L;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final String P() {
            return this.M;
        }

        public final Intent Q() {
            return this.L;
        }

        public final Destination R(String str) {
            if (this.L == null) {
                this.L = new Intent();
            }
            Intent intent = this.L;
            Intrinsics.f(intent);
            intent.setAction(str);
            return this;
        }

        public final Destination S(ComponentName componentName) {
            if (this.L == null) {
                this.L = new Intent();
            }
            Intent intent = this.L;
            Intrinsics.f(intent);
            intent.setComponent(componentName);
            return this;
        }

        public final Destination U(Uri uri) {
            if (this.L == null) {
                this.L = new Intent();
            }
            Intent intent = this.L;
            Intrinsics.f(intent);
            intent.setData(uri);
            return this;
        }

        public final Destination V(String str) {
            this.M = str;
            return this;
        }

        public final Destination W(String str) {
            if (this.L == null) {
                this.L = new Intent();
            }
            Intent intent = this.L;
            Intrinsics.f(intent);
            intent.setPackage(str);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Destination)) {
                return false;
            }
            if (super.equals(obj)) {
                Intent intent = this.L;
                if ((intent != null ? intent.filterEquals(((Destination) obj).L) : ((Destination) obj).L == null) && Intrinsics.d(this.M, ((Destination) obj).M)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.L;
            int i2 = 0;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.M;
            if (str != null) {
                i2 = str.hashCode();
            }
            return filterHashCode + i2;
        }

        public String toString() {
            ComponentName O = O();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (O != null) {
                sb.append(" class=");
                sb.append(O.getClassName());
            } else {
                String M2 = M();
                if (M2 != null) {
                    sb.append(" action=");
                    sb.append(M2);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.h(sb2, "sb.toString()");
            return sb2;
        }
    }

    @Metadata
    public static final class Extras implements Navigator.Extras {

        /* renamed from: a  reason: collision with root package name */
        public final int f22159a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityOptionsCompat f22160b;

        @Metadata
        public static final class Builder {
        }

        public final ActivityOptionsCompat a() {
            return this.f22160b;
        }

        public final int b() {
            return this.f22159a;
        }
    }

    public ActivityNavigator(Context context) {
        Object obj;
        Intrinsics.i(context, "context");
        this.f22157c = context;
        Iterator it = SequencesKt.h(context, ActivityNavigator$hostActivity$1.f22161z).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f22158d = (Activity) obj;
    }

    public boolean k() {
        Activity activity = this.f22158d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* renamed from: l */
    public Destination a() {
        return new Destination(this);
    }

    /* renamed from: m */
    public NavDestination d(Destination destination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        Intent intent;
        int intExtra;
        String str;
        Intrinsics.i(destination, "destination");
        if (destination.Q() != null) {
            Intent intent2 = new Intent(destination.Q());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String P = destination.P();
                if (!(P == null || P.length() == 0)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(P);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            Map o2 = destination.o();
                            Intrinsics.f(group);
                            NavArgument navArgument = (NavArgument) o2.get(group);
                            NavType a2 = navArgument != null ? navArgument.a() : null;
                            if (a2 == null || (str = a2.i(a2.a(bundle, group))) == null) {
                                str = Uri.encode(String.valueOf(bundle.get(group)));
                            }
                            stringBuffer.append(str);
                        } else {
                            throw new IllegalArgumentException(("Could not find " + group + " in " + bundle + " to fill data pattern " + P).toString());
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z2 = extras instanceof Extras;
            if (z2) {
                intent2.addFlags(((Extras) extras).b());
            }
            if (this.f22158d == null) {
                intent2.addFlags(268435456);
            }
            if (navOptions != null && navOptions.j()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f22158d;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.q());
            Resources resources = this.f22157c.getResources();
            if (navOptions != null) {
                int c2 = navOptions.c();
                int d2 = navOptions.d();
                if ((c2 <= 0 || !Intrinsics.d(resources.getResourceTypeName(c2), "animator")) && (d2 <= 0 || !Intrinsics.d(resources.getResourceTypeName(d2), "animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", c2);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", d2);
                } else {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(c2) + " and popExit resource " + resources.getResourceName(d2) + " when launching " + destination);
                }
            }
            if (z2) {
                ActivityOptionsCompat a3 = ((Extras) extras).a();
                if (a3 != null) {
                    ContextCompat.m(this.f22157c, intent2, a3.a());
                } else {
                    this.f22157c.startActivity(intent2);
                }
            } else {
                this.f22157c.startActivity(intent2);
            }
            if (!(navOptions == null || this.f22158d == null)) {
                int a4 = navOptions.a();
                int b2 = navOptions.b();
                if ((a4 > 0 && Intrinsics.d(resources.getResourceTypeName(a4), "animator")) || (b2 > 0 && Intrinsics.d(resources.getResourceTypeName(b2), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(a4) + " and exit resource " + resources.getResourceName(b2) + "when launching " + destination);
                } else if (a4 >= 0 || b2 >= 0) {
                    this.f22158d.overridePendingTransition(RangesKt.e(a4, 0), RangesKt.e(b2, 0));
                }
            }
            return null;
        }
        throw new IllegalStateException(("Destination " + destination.q() + " does not have an Intent set.").toString());
    }
}
