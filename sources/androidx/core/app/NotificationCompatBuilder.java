package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19621a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f19622b;

    /* renamed from: c  reason: collision with root package name */
    public final NotificationCompat.Builder f19623c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteViews f19624d;

    /* renamed from: e  reason: collision with root package name */
    public RemoteViews f19625e;

    /* renamed from: f  reason: collision with root package name */
    public final List f19626f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f19627g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    public int f19628h;

    /* renamed from: i  reason: collision with root package name */
    public RemoteViews f19629i;

    public static class Api20Impl {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Builder e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder f(Notification.Builder builder, boolean z2) {
            return builder.setGroupSummary(z2);
        }

        public static Notification.Builder g(Notification.Builder builder, boolean z2) {
            return builder.setLocalOnly(z2);
        }

        public static Notification.Builder h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class Api21Impl {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i2) {
            return builder.setColor(i2);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i2) {
            return builder.setVisibility(i2);
        }
    }

    public static class Api23Impl {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class Api24Impl {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
            return builder.setAllowGeneratedReplies(z2);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    public static class Api26Impl {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i2) {
            return builder.setBadgeIconType(i2);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z2) {
            return builder.setColorized(z2);
        }

        public static Notification.Builder d(Notification.Builder builder, int i2) {
            return builder.setGroupAlertBehavior(i2);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j2) {
            return builder.setTimeoutAfter(j2);
        }
    }

    public static class Api28Impl {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i2) {
            return builder.setSemanticAction(i2);
        }
    }

    public static class Api29Impl {
        public static Notification.Builder a(Notification.Builder builder, boolean z2) {
            return builder.setAllowSystemGeneratedContextualActions(z2);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z2) {
            return builder.setContextual(z2);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    public static class Api31Impl {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
            return builder.setAuthenticationRequired(z2);
        }

        public static Notification.Builder b(Notification.Builder builder, int i2) {
            return builder.setForegroundServiceBehavior(i2);
        }
    }

    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        int i2;
        this.f19623c = builder;
        Context context = builder.f19555a;
        this.f19621a = context;
        Notification.Builder a2 = Api26Impl.a(context, builder.K);
        this.f19622b = a2;
        Notification notification = builder.T;
        a2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.f19563i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.f19559e).setContentText(builder.f19560f).setContentInfo(builder.f19565k).setContentIntent(builder.f19561g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.f19562h, (notification.flags & 128) != 0).setNumber(builder.f19566l).setProgress(builder.f19574t, builder.f19575u, builder.f19576v);
        IconCompat iconCompat = builder.f19564j;
        Api23Impl.b(a2, iconCompat == null ? null : iconCompat.n(context));
        a2.setSubText(builder.f19571q).setUsesChronometer(builder.f19569o).setPriority(builder.f19567m);
        NotificationCompat.Style style = builder.f19570p;
        if (style instanceof NotificationCompat.CallStyle) {
            for (NotificationCompat.Action b2 : ((NotificationCompat.CallStyle) style).h()) {
                b(b2);
            }
        } else {
            Iterator it = builder.f19556b.iterator();
            while (it.hasNext()) {
                b((NotificationCompat.Action) it.next());
            }
        }
        Bundle bundle = builder.D;
        if (bundle != null) {
            this.f19627g.putAll(bundle);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.f19624d = builder.H;
        this.f19625e = builder.I;
        this.f19622b.setShowWhen(builder.f19568n);
        Api20Impl.g(this.f19622b, builder.f19580z);
        Api20Impl.e(this.f19622b, builder.f19577w);
        Api20Impl.h(this.f19622b, builder.f19579y);
        Api20Impl.f(this.f19622b, builder.f19578x);
        this.f19628h = builder.P;
        Api21Impl.b(this.f19622b, builder.C);
        Api21Impl.c(this.f19622b, builder.E);
        Api21Impl.f(this.f19622b, builder.F);
        Api21Impl.d(this.f19622b, builder.G);
        Api21Impl.e(this.f19622b, notification.sound, notification.audioAttributes);
        List<String> e2 = i3 < 28 ? e(g(builder.f19557c), builder.W) : builder.W;
        if (e2 != null && !e2.isEmpty()) {
            for (String a3 : e2) {
                Api21Impl.a(this.f19622b, a3);
            }
        }
        this.f19629i = builder.J;
        if (builder.f19558d.size() > 0) {
            Bundle bundle2 = builder.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i4 = 0; i4 < builder.f19558d.size(); i4++) {
                bundle4.putBundle(Integer.toString(i4), NotificationCompatJellybean.a((NotificationCompat.Action) builder.f19558d.get(i4)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            builder.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f19627g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i5 = Build.VERSION.SDK_INT;
        Object obj = builder.V;
        if (obj != null) {
            Api23Impl.c(this.f19622b, obj);
        }
        this.f19622b.setExtras(builder.D);
        Api24Impl.e(this.f19622b, builder.f19573s);
        RemoteViews remoteViews = builder.H;
        if (remoteViews != null) {
            Api24Impl.c(this.f19622b, remoteViews);
        }
        RemoteViews remoteViews2 = builder.I;
        if (remoteViews2 != null) {
            Api24Impl.b(this.f19622b, remoteViews2);
        }
        RemoteViews remoteViews3 = builder.J;
        if (remoteViews3 != null) {
            Api24Impl.d(this.f19622b, remoteViews3);
        }
        Api26Impl.b(this.f19622b, builder.L);
        Api26Impl.e(this.f19622b, builder.f19572r);
        Api26Impl.f(this.f19622b, builder.M);
        Api26Impl.g(this.f19622b, builder.O);
        Api26Impl.d(this.f19622b, builder.P);
        if (builder.f19554B) {
            Api26Impl.c(this.f19622b, builder.f19553A);
        }
        if (!TextUtils.isEmpty(builder.K)) {
            this.f19622b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
        }
        if (i5 >= 28) {
            Iterator it2 = builder.f19557c.iterator();
            while (it2.hasNext()) {
                Api28Impl.a(this.f19622b, ((Person) it2.next()).h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            Api29Impl.a(this.f19622b, builder.R);
            Api29Impl.b(this.f19622b, NotificationCompat.BubbleMetadata.i(builder.S));
            LocusIdCompat locusIdCompat = builder.N;
            if (locusIdCompat != null) {
                Api29Impl.d(this.f19622b, locusIdCompat.b());
            }
        }
        if (i6 >= 31 && (i2 = builder.Q) != 0) {
            Api31Impl.b(this.f19622b, i2);
        }
        if (builder.U) {
            if (this.f19623c.f19578x) {
                this.f19628h = 2;
            } else {
                this.f19628h = 1;
            }
            this.f19622b.setVibrate((long[]) null);
            this.f19622b.setSound((Uri) null);
            int i7 = notification.defaults & -4;
            notification.defaults = i7;
            this.f19622b.setDefaults(i7);
            if (TextUtils.isEmpty(this.f19623c.f19577w)) {
                Api20Impl.e(this.f19622b, "silent");
            }
            Api26Impl.d(this.f19622b, this.f19628h);
        }
    }

    public static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    public static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Person) it.next()).g());
        }
        return arrayList;
    }

    public Notification.Builder a() {
        return this.f19622b;
    }

    public final void b(NotificationCompat.Action action) {
        IconCompat d2 = action.d();
        Notification.Action.Builder a2 = Api23Impl.a(d2 != null ? d2.m() : null, action.h(), action.a());
        if (action.e() != null) {
            for (RemoteInput c2 : RemoteInput.b(action.e())) {
                Api20Impl.c(a2, c2);
            }
        }
        Bundle bundle = action.c() != null ? new Bundle(action.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", action.b());
        int i2 = Build.VERSION.SDK_INT;
        Api24Impl.a(a2, action.b());
        bundle.putInt("android.support.action.semanticAction", action.f());
        if (i2 >= 28) {
            Api28Impl.b(a2, action.f());
        }
        if (i2 >= 29) {
            Api29Impl.c(a2, action.j());
        }
        if (i2 >= 31) {
            Api31Impl.a(a2, action.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.g());
        Api20Impl.b(a2, bundle);
        Api20Impl.a(this.f19622b, Api20Impl.d(a2));
    }

    public Notification c() {
        Bundle a2;
        RemoteViews f2;
        RemoteViews d2;
        NotificationCompat.Style style = this.f19623c.f19570p;
        if (style != null) {
            style.b(this);
        }
        RemoteViews e2 = style != null ? style.e(this) : null;
        Notification d3 = d();
        if (e2 != null) {
            d3.contentView = e2;
        } else {
            RemoteViews remoteViews = this.f19623c.H;
            if (remoteViews != null) {
                d3.contentView = remoteViews;
            }
        }
        if (!(style == null || (d2 = style.d(this)) == null)) {
            d3.bigContentView = d2;
        }
        if (!(style == null || (f2 = this.f19623c.f19570p.f(this)) == null)) {
            d3.headsUpContentView = f2;
        }
        if (!(style == null || (a2 = NotificationCompat.a(d3)) == null)) {
            style.a(a2);
        }
        return d3;
    }

    public Notification d() {
        return this.f19622b.build();
    }

    public Context f() {
        return this.f19621a;
    }
}
