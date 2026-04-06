package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.R;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NotificationCompat {

    public static class Action {

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f19514a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f19515b;

        /* renamed from: c  reason: collision with root package name */
        public final RemoteInput[] f19516c;

        /* renamed from: d  reason: collision with root package name */
        public final RemoteInput[] f19517d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f19518e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f19519f;

        /* renamed from: g  reason: collision with root package name */
        public final int f19520g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f19521h;

        /* renamed from: i  reason: collision with root package name */
        public int f19522i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f19523j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f19524k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f19525l;

        public static final class Builder {

            /* renamed from: a  reason: collision with root package name */
            public final IconCompat f19526a;

            /* renamed from: b  reason: collision with root package name */
            public final CharSequence f19527b;

            /* renamed from: c  reason: collision with root package name */
            public final PendingIntent f19528c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f19529d;

            /* renamed from: e  reason: collision with root package name */
            public final Bundle f19530e;

            /* renamed from: f  reason: collision with root package name */
            public ArrayList f19531f;

            /* renamed from: g  reason: collision with root package name */
            public int f19532g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f19533h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f19534i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f19535j;

            public static class Api20Impl {
            }

            public static class Api23Impl {
            }

            public static class Api24Impl {
            }

            public static class Api28Impl {
            }

            public static class Api29Impl {
            }

            public static class Api31Impl {
            }

            public Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, true, 0, true, false, false);
            }

            /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.core.app.NotificationCompat.Action a() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.b()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList r3 = r0.f19531f
                    if (r3 == 0) goto L_0x0031
                    java.util.Iterator r3 = r3.iterator()
                L_0x0017:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0031
                    java.lang.Object r4 = r3.next()
                    androidx.core.app.RemoteInput r4 = (androidx.core.app.RemoteInput) r4
                    boolean r5 = r4.j()
                    if (r5 == 0) goto L_0x002d
                    r1.add(r4)
                    goto L_0x0017
                L_0x002d:
                    r2.add(r4)
                    goto L_0x0017
                L_0x0031:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003a
                    r11 = r4
                    goto L_0x0047
                L_0x003a:
                    int r3 = r1.size()
                    androidx.core.app.RemoteInput[] r3 = new androidx.core.app.RemoteInput[r3]
                    java.lang.Object[] r1 = r1.toArray(r3)
                    androidx.core.app.RemoteInput[] r1 = (androidx.core.app.RemoteInput[]) r1
                    r11 = r1
                L_0x0047:
                    boolean r1 = r2.isEmpty()
                    if (r1 == 0) goto L_0x004f
                L_0x004d:
                    r10 = r4
                    goto L_0x005d
                L_0x004f:
                    int r1 = r2.size()
                    androidx.core.app.RemoteInput[] r1 = new androidx.core.app.RemoteInput[r1]
                    java.lang.Object[] r1 = r2.toArray(r1)
                    r4 = r1
                    androidx.core.app.RemoteInput[] r4 = (androidx.core.app.RemoteInput[]) r4
                    goto L_0x004d
                L_0x005d:
                    androidx.core.app.NotificationCompat$Action r1 = new androidx.core.app.NotificationCompat$Action
                    androidx.core.graphics.drawable.IconCompat r6 = r0.f19526a
                    java.lang.CharSequence r7 = r0.f19527b
                    android.app.PendingIntent r8 = r0.f19528c
                    android.os.Bundle r9 = r0.f19530e
                    boolean r12 = r0.f19529d
                    int r13 = r0.f19532g
                    boolean r14 = r0.f19533h
                    boolean r15 = r0.f19534i
                    boolean r2 = r0.f19535j
                    r5 = r1
                    r16 = r2
                    r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Action.Builder.a():androidx.core.app.NotificationCompat$Action");
            }

            public final void b() {
                if (this.f19534i && this.f19528c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public Builder(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z2, int i2, boolean z3, boolean z4, boolean z5) {
                ArrayList arrayList;
                this.f19529d = true;
                this.f19533h = true;
                this.f19526a = iconCompat;
                this.f19527b = Builder.d(charSequence);
                this.f19528c = pendingIntent;
                this.f19530e = bundle;
                if (remoteInputArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(Arrays.asList(remoteInputArr));
                }
                this.f19531f = arrayList;
                this.f19529d = z2;
                this.f19532g = i2;
                this.f19533h = z3;
                this.f19534i = z4;
                this.f19535j = z5;
            }
        }

        public interface Extender {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public static final class WearableExtender implements Extender {

            /* renamed from: a  reason: collision with root package name */
            public int f19536a = 1;

            /* renamed from: b  reason: collision with root package name */
            public CharSequence f19537b;

            /* renamed from: c  reason: collision with root package name */
            public CharSequence f19538c;

            /* renamed from: d  reason: collision with root package name */
            public CharSequence f19539d;

            /* renamed from: a */
            public WearableExtender clone() {
                WearableExtender wearableExtender = new WearableExtender();
                wearableExtender.f19536a = this.f19536a;
                wearableExtender.f19537b = this.f19537b;
                wearableExtender.f19538c = this.f19538c;
                wearableExtender.f19539d = this.f19539d;
                return wearableExtender;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Action(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.c((Resources) null, "", i2) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f19524k;
        }

        public boolean b() {
            return this.f19518e;
        }

        public Bundle c() {
            return this.f19514a;
        }

        public IconCompat d() {
            int i2;
            if (this.f19515b == null && (i2 = this.f19522i) != 0) {
                this.f19515b = IconCompat.c((Resources) null, "", i2);
            }
            return this.f19515b;
        }

        public RemoteInput[] e() {
            return this.f19516c;
        }

        public int f() {
            return this.f19520g;
        }

        public boolean g() {
            return this.f19519f;
        }

        public CharSequence h() {
            return this.f19523j;
        }

        public boolean i() {
            return this.f19525l;
        }

        public boolean j() {
            return this.f19521h;
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false);
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z2, int i2, boolean z3, boolean z4, boolean z5) {
            this.f19519f = true;
            this.f19515b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f19522i = iconCompat.e();
            }
            this.f19523j = Builder.d(charSequence);
            this.f19524k = pendingIntent;
            this.f19514a = bundle == null ? new Bundle() : bundle;
            this.f19516c = remoteInputArr;
            this.f19517d = remoteInputArr2;
            this.f19518e = z2;
            this.f19520g = i2;
            this.f19519f = z3;
            this.f19521h = z4;
            this.f19525l = z5;
        }
    }

    public static class Api20Impl {
    }

    public static class Api23Impl {
    }

    public static class Api24Impl {
    }

    public static class Api26Impl {
    }

    public static class Api28Impl {
    }

    public static class Api29Impl {
    }

    public static class Api31Impl {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    public static class BigPictureStyle extends Style {

        /* renamed from: e  reason: collision with root package name */
        public IconCompat f19540e;

        /* renamed from: f  reason: collision with root package name */
        public IconCompat f19541f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f19542g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f19543h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f19544i;

        public static class Api23Impl {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static class Api31Impl {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z2) {
                bigPictureStyle.showBigPictureWhenCollapsed(z2);
            }
        }

        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(notificationBuilderWithBuilderAccessor.a()).setBigContentTitle(this.f19604b);
            IconCompat iconCompat = this.f19540e;
            Context context = null;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Api31Impl.a(bigContentTitle, this.f19540e.n(notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder ? ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f() : null));
                } else if (iconCompat.g() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f19540e.d());
                }
            }
            if (this.f19542g) {
                if (this.f19541f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    if (notificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder) {
                        context = ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f();
                    }
                    Api23Impl.a(bigContentTitle, this.f19541f.n(context));
                }
            }
            if (this.f19606d) {
                bigContentTitle.setSummaryText(this.f19605c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.c(bigContentTitle, this.f19544i);
                Api31Impl.b(bigContentTitle, this.f19543h);
            }
        }

        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
    }

    public static class BigTextStyle extends Style {

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f19545e;

        public void a(Bundle bundle) {
            super.a(bundle);
        }

        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.a()).setBigContentTitle(this.f19604b).bigText(this.f19545e);
            if (this.f19606d) {
                bigText.setSummaryText(this.f19605c);
            }
        }

        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public BigTextStyle h(CharSequence charSequence) {
            this.f19545e = Builder.d(charSequence);
            return this;
        }
    }

    public static final class BubbleMetadata {

        /* renamed from: a  reason: collision with root package name */
        public PendingIntent f19546a;

        /* renamed from: b  reason: collision with root package name */
        public PendingIntent f19547b;

        /* renamed from: c  reason: collision with root package name */
        public IconCompat f19548c;

        /* renamed from: d  reason: collision with root package name */
        public int f19549d;

        /* renamed from: e  reason: collision with root package name */
        public int f19550e;

        /* renamed from: f  reason: collision with root package name */
        public int f19551f;

        /* renamed from: g  reason: collision with root package name */
        public String f19552g;

        public static class Api29Impl {
            public static Notification.BubbleMetadata a(BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.f() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.e().m()).setIntent(bubbleMetadata.f()).setDeleteIntent(bubbleMetadata.b()).setAutoExpandBubble(bubbleMetadata.a()).setSuppressNotification(bubbleMetadata.h());
                if (bubbleMetadata.c() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.c());
                }
                if (bubbleMetadata.d() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.d());
                }
                return suppressNotification.build();
            }
        }

        public static class Api30Impl {
            public static Notification.BubbleMetadata a(BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = bubbleMetadata.g() != null ? new Notification.BubbleMetadata.Builder(bubbleMetadata.g()) : new Notification.BubbleMetadata.Builder(bubbleMetadata.f(), bubbleMetadata.e().m());
                builder.setDeleteIntent(bubbleMetadata.b()).setAutoExpandBubble(bubbleMetadata.a()).setSuppressNotification(bubbleMetadata.h());
                if (bubbleMetadata.c() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.c());
                }
                if (bubbleMetadata.d() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.d());
                }
                return builder.build();
            }
        }

        public static final class Builder {
        }

        public static Notification.BubbleMetadata i(BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return Api30Impl.a(bubbleMetadata);
            }
            if (i2 == 29) {
                return Api29Impl.a(bubbleMetadata);
            }
            return null;
        }

        public boolean a() {
            return (this.f19551f & 1) != 0;
        }

        public PendingIntent b() {
            return this.f19547b;
        }

        public int c() {
            return this.f19549d;
        }

        public int d() {
            return this.f19550e;
        }

        public IconCompat e() {
            return this.f19548c;
        }

        public PendingIntent f() {
            return this.f19546a;
        }

        public String g() {
            return this.f19552g;
        }

        public boolean h() {
            return (this.f19551f & 2) != 0;
        }
    }

    public static class CallStyle extends Style {

        /* renamed from: e  reason: collision with root package name */
        public int f19581e;

        /* renamed from: f  reason: collision with root package name */
        public Person f19582f;

        /* renamed from: g  reason: collision with root package name */
        public PendingIntent f19583g;

        /* renamed from: h  reason: collision with root package name */
        public PendingIntent f19584h;

        /* renamed from: i  reason: collision with root package name */
        public PendingIntent f19585i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f19586j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f19587k;

        /* renamed from: l  reason: collision with root package name */
        public Integer f19588l;

        /* renamed from: m  reason: collision with root package name */
        public IconCompat f19589m;

        /* renamed from: n  reason: collision with root package name */
        public CharSequence f19590n;

        public static class Api20Impl {
        }

        public static class Api21Impl {
            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        public static class Api23Impl {
            public static Parcelable a(Icon icon) {
                return icon;
            }

            public static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        public static class Api24Impl {
        }

        public static class Api28Impl {
            public static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            public static Parcelable b(Person person) {
                return person;
            }
        }

        public static class Api31Impl {
            public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, int i2) {
                return callStyle.setAnswerButtonColorHint(i2);
            }

            public static Notification.CallStyle e(Notification.CallStyle callStyle, int i2) {
                return callStyle.setDeclineButtonColorHint(i2);
            }

            public static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z2) {
                return callStyle.setIsVideo(z2);
            }

            public static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface CallType {
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f19581e);
            bundle.putBoolean("android.callIsVideo", this.f19586j);
            Person person = this.f19582f;
            if (person != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", Api28Impl.b(person.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", person.i());
                }
            }
            IconCompat iconCompat = this.f19589m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", Api23Impl.a(iconCompat.n(this.f19603a.f19555a)));
            }
            bundle.putCharSequence("android.verificationText", this.f19590n);
            bundle.putParcelable("android.answerIntent", this.f19583g);
            bundle.putParcelable("android.declineIntent", this.f19584h);
            bundle.putParcelable("android.hangUpIntent", this.f19585i);
            Integer num = this.f19587k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f19588l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            int i2 = Build.VERSION.SDK_INT;
            Notification.CallStyle callStyle = null;
            if (i2 >= 31) {
                int i3 = this.f19581e;
                if (i3 == 1) {
                    callStyle = Api31Impl.a(this.f19582f.h(), this.f19584h, this.f19583g);
                } else if (i3 == 2) {
                    callStyle = Api31Impl.b(this.f19582f.h(), this.f19585i);
                } else if (i3 == 3) {
                    callStyle = Api31Impl.c(this.f19582f.h(), this.f19585i, this.f19583g);
                } else if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f19581e));
                }
                if (callStyle != null) {
                    callStyle.setBuilder(notificationBuilderWithBuilderAccessor.a());
                    Integer num = this.f19587k;
                    if (num != null) {
                        Api31Impl.d(callStyle, num.intValue());
                    }
                    Integer num2 = this.f19588l;
                    if (num2 != null) {
                        Api31Impl.e(callStyle, num2.intValue());
                    }
                    Api31Impl.h(callStyle, this.f19590n);
                    IconCompat iconCompat = this.f19589m;
                    if (iconCompat != null) {
                        Api31Impl.g(callStyle, iconCompat.n(this.f19603a.f19555a));
                    }
                    Api31Impl.f(callStyle, this.f19586j);
                    return;
                }
                return;
            }
            Notification.Builder a2 = notificationBuilderWithBuilderAccessor.a();
            Person person = this.f19582f;
            a2.setContentTitle(person != null ? person.c() : null);
            Bundle bundle = this.f19603a.D;
            if (bundle != null && bundle.containsKey("android.text")) {
                callStyle = this.f19603a.D.getCharSequence("android.text");
            }
            if (callStyle == null) {
                callStyle = i();
            }
            a2.setContentText(callStyle);
            Person person2 = this.f19582f;
            if (person2 != null) {
                if (person2.a() != null) {
                    Api23Impl.b(a2, this.f19582f.a().n(this.f19603a.f19555a));
                }
                if (i2 >= 28) {
                    Api28Impl.a(a2, this.f19582f.h());
                } else {
                    Api21Impl.a(a2, this.f19582f.d());
                }
            }
            Api21Impl.b(a2, "call");
        }

        public String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList h() {
            Action m2 = m();
            Action l2 = l();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(m2);
            ArrayList<Action> arrayList2 = this.f19603a.f19556b;
            int i2 = 2;
            if (arrayList2 != null) {
                for (Action action : arrayList2) {
                    if (action.j()) {
                        arrayList.add(action);
                    } else if (!j(action) && i2 > 1) {
                        arrayList.add(action);
                        i2--;
                    }
                    if (l2 != null && i2 == 1) {
                        arrayList.add(l2);
                        i2--;
                    }
                }
            }
            if (l2 != null && i2 >= 1) {
                arrayList.add(l2);
            }
            return arrayList;
        }

        public final String i() {
            int i2 = this.f19581e;
            if (i2 == 1) {
                return this.f19603a.f19555a.getResources().getString(R.string.f19416e);
            }
            if (i2 == 2) {
                return this.f19603a.f19555a.getResources().getString(R.string.f19417f);
            }
            if (i2 != 3) {
                return null;
            }
            return this.f19603a.f19555a.getResources().getString(R.string.f19418g);
        }

        public final boolean j(Action action) {
            return action != null && action.c().getBoolean("key_action_priority");
        }

        public final Action k(int i2, int i3, Integer num, int i4, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(ContextCompat.c(this.f19603a.f19555a, i4));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f19603a.f19555a.getResources().getString(i3));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            Action a2 = new Action.Builder(IconCompat.b(this.f19603a.f19555a, i2), spannableStringBuilder, pendingIntent).a();
            a2.c().putBoolean("key_action_priority", true);
            return a2;
        }

        public final Action l() {
            int i2 = R.drawable.f19382b;
            int i3 = R.drawable.f19381a;
            PendingIntent pendingIntent = this.f19583g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z2 = this.f19586j;
            return k(z2 ? i2 : i3, z2 ? R.string.f19413b : R.string.f19412a, this.f19587k, R.color.f19379a, pendingIntent);
        }

        public final Action m() {
            int i2 = R.drawable.f19383c;
            PendingIntent pendingIntent = this.f19584h;
            if (pendingIntent == null) {
                return k(i2, R.string.f19415d, this.f19588l, R.color.f19380b, this.f19585i);
            }
            return k(i2, R.string.f19414c, this.f19588l, R.color.f19380b, pendingIntent);
        }
    }

    public static final class CarExtender implements Extender {

        public static class Api20Impl {
        }

        public static class Api29Impl {
        }

        @Deprecated
        public static class UnreadConversation {

            public static class Builder {
            }
        }
    }

    public static class DecoratedCustomViewStyle extends Style {

        public static class Api24Impl {
            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.a().setStyle(Api24Impl.a());
        }

        public String c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        public RemoteViews d(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public RemoteViews e(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public RemoteViews f(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
    }

    public interface Extender {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends Style {

        /* renamed from: e  reason: collision with root package name */
        public ArrayList f19591e;

        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(notificationBuilderWithBuilderAccessor.a()).setBigContentTitle(this.f19604b);
            if (this.f19606d) {
                bigContentTitle.setSummaryText(this.f19605c);
            }
            Iterator it = this.f19591e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        public String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public static class MessagingStyle extends Style {

        /* renamed from: e  reason: collision with root package name */
        public final List f19592e;

        /* renamed from: f  reason: collision with root package name */
        public final List f19593f;

        /* renamed from: g  reason: collision with root package name */
        public Person f19594g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f19595h;

        /* renamed from: i  reason: collision with root package name */
        public Boolean f19596i;

        public static class Api24Impl {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        public static class Api26Impl {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        public static class Api28Impl {
            public static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z2) {
                return messagingStyle.setGroupConversation(z2);
            }
        }

        public static final class Message {

            /* renamed from: a  reason: collision with root package name */
            public final CharSequence f19597a;

            /* renamed from: b  reason: collision with root package name */
            public final long f19598b;

            /* renamed from: c  reason: collision with root package name */
            public final Person f19599c;

            /* renamed from: d  reason: collision with root package name */
            public Bundle f19600d;

            /* renamed from: e  reason: collision with root package name */
            public String f19601e;

            /* renamed from: f  reason: collision with root package name */
            public Uri f19602f;

            public static class Api24Impl {
                public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j2, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j2, charSequence2);
                }

                public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            public static class Api28Impl {
                public static Parcelable a(Person person) {
                    return person;
                }

                public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j2, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j2, person);
                }
            }

            public static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bundleArr[i2] = ((Message) list.get(i2)).h();
                }
                return bundleArr;
            }

            public String b() {
                return this.f19601e;
            }

            public Uri c() {
                return this.f19602f;
            }

            public Person d() {
                return this.f19599c;
            }

            public CharSequence e() {
                return this.f19597a;
            }

            public long f() {
                return this.f19598b;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.app.Person} */
            /* JADX WARNING: type inference failed for: r3v0 */
            /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.CharSequence] */
            /* JADX WARNING: type inference failed for: r3v5 */
            /* JADX WARNING: type inference failed for: r3v6 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.app.Notification.MessagingStyle.Message g() {
                /*
                    r6 = this;
                    androidx.core.app.Person r0 = r6.d()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    r3 = 0
                    if (r1 < r2) goto L_0x001f
                    java.lang.CharSequence r1 = r6.e()
                    long r4 = r6.f()
                    if (r0 != 0) goto L_0x0016
                    goto L_0x001a
                L_0x0016:
                    android.app.Person r3 = r0.h()
                L_0x001a:
                    android.app.Notification$MessagingStyle$Message r0 = androidx.core.app.NotificationCompat.MessagingStyle.Message.Api28Impl.b(r1, r4, r3)
                    goto L_0x0032
                L_0x001f:
                    java.lang.CharSequence r1 = r6.e()
                    long r4 = r6.f()
                    if (r0 != 0) goto L_0x002a
                    goto L_0x002e
                L_0x002a:
                    java.lang.CharSequence r3 = r0.c()
                L_0x002e:
                    android.app.Notification$MessagingStyle$Message r0 = androidx.core.app.NotificationCompat.MessagingStyle.Message.Api24Impl.a(r1, r4, r3)
                L_0x0032:
                    java.lang.String r1 = r6.b()
                    if (r1 == 0) goto L_0x0043
                    java.lang.String r1 = r6.b()
                    android.net.Uri r2 = r6.c()
                    androidx.core.app.NotificationCompat.MessagingStyle.Message.Api24Impl.b(r0, r1, r2)
                L_0x0043:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.MessagingStyle.Message.g():android.app.Notification$MessagingStyle$Message");
            }

            public final Bundle h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f19597a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f19598b);
                Person person = this.f19599c;
                if (person != null) {
                    bundle.putCharSequence("sender", person.c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", Api28Impl.a(this.f19599c.h()));
                    } else {
                        bundle.putBundle("person", this.f19599c.i());
                    }
                }
                String str = this.f19601e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f19602f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f19600d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f19594g.c());
            bundle.putBundle("android.messagingStyleUser", this.f19594g.i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f19595h);
            if (this.f19595h != null && this.f19596i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f19595h);
            }
            if (!this.f19592e.isEmpty()) {
                bundle.putParcelableArray("android.messages", Message.a(this.f19592e));
            }
            if (!this.f19593f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", Message.a(this.f19593f));
            }
            Boolean bool = this.f19596i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            i(h());
            Notification.MessagingStyle a2 = Build.VERSION.SDK_INT >= 28 ? Api28Impl.a(this.f19594g.h()) : Api24Impl.b(this.f19594g.c());
            for (Message g2 : this.f19592e) {
                Api24Impl.a(a2, g2.g());
            }
            for (Message g3 : this.f19593f) {
                Api26Impl.a(a2, g3.g());
            }
            if (this.f19596i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                Api24Impl.c(a2, this.f19595h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Api28Impl.b(a2, this.f19596i.booleanValue());
            }
            a2.setBuilder(notificationBuilderWithBuilderAccessor.a());
        }

        public String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public boolean h() {
            Builder builder = this.f19603a;
            if (builder != null && builder.f19555a.getApplicationInfo().targetSdkVersion < 28 && this.f19596i == null) {
                return this.f19595h != null;
            }
            Boolean bool = this.f19596i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public MessagingStyle i(boolean z2) {
            this.f19596i = Boolean.valueOf(z2);
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ServiceNotificationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static abstract class Style {

        /* renamed from: a  reason: collision with root package name */
        public Builder f19603a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f19604b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f19605c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f19606d = false;

        public static class Api24Impl {
        }

        public void a(Bundle bundle) {
            if (this.f19606d) {
                bundle.putCharSequence("android.summaryText", this.f19605c);
            }
            CharSequence charSequence = this.f19604b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c2 = c();
            if (c2 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c2);
            }
        }

        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        public String c() {
            return null;
        }

        public RemoteViews d(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public RemoteViews e(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public RemoteViews f(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public void g(Builder builder) {
            if (this.f19603a != builder) {
                this.f19603a = builder;
                if (builder != null) {
                    builder.n(this);
                }
            }
        }
    }

    public static final class TvExtender implements Extender {
    }

    public static final class WearableExtender implements Extender {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList f19607a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public int f19608b = 1;

        /* renamed from: c  reason: collision with root package name */
        public PendingIntent f19609c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList f19610d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public Bitmap f19611e;

        /* renamed from: f  reason: collision with root package name */
        public int f19612f;

        /* renamed from: g  reason: collision with root package name */
        public int f19613g = 8388613;

        /* renamed from: h  reason: collision with root package name */
        public int f19614h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f19615i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f19616j;

        /* renamed from: k  reason: collision with root package name */
        public int f19617k = 80;

        /* renamed from: l  reason: collision with root package name */
        public int f19618l;

        /* renamed from: m  reason: collision with root package name */
        public String f19619m;

        /* renamed from: n  reason: collision with root package name */
        public String f19620n;

        public static class Api20Impl {
        }

        public static class Api23Impl {
        }

        public static class Api24Impl {
        }

        public static class Api31Impl {
        }

        /* renamed from: a */
        public WearableExtender clone() {
            WearableExtender wearableExtender = new WearableExtender();
            wearableExtender.f19607a = new ArrayList(this.f19607a);
            wearableExtender.f19608b = this.f19608b;
            wearableExtender.f19609c = this.f19609c;
            wearableExtender.f19610d = new ArrayList(this.f19610d);
            wearableExtender.f19611e = this.f19611e;
            wearableExtender.f19612f = this.f19612f;
            wearableExtender.f19613g = this.f19613g;
            wearableExtender.f19614h = this.f19614h;
            wearableExtender.f19615i = this.f19615i;
            wearableExtender.f19616j = this.f19616j;
            wearableExtender.f19617k = this.f19617k;
            wearableExtender.f19618l = this.f19618l;
            wearableExtender.f19619m = this.f19619m;
            wearableExtender.f19620n = this.f19620n;
            return wearableExtender;
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static class Builder {

        /* renamed from: A  reason: collision with root package name */
        public boolean f19553A;

        /* renamed from: B  reason: collision with root package name */
        public boolean f19554B;
        public String C;
        public Bundle D;
        public int E;
        public int F;
        public Notification G;
        public RemoteViews H;
        public RemoteViews I;
        public RemoteViews J;
        public String K;
        public int L;
        public String M;
        public LocusIdCompat N;
        public long O;
        public int P;
        public int Q;
        public boolean R;
        public BubbleMetadata S;
        public Notification T;
        public boolean U;
        public Object V;
        public ArrayList W;

        /* renamed from: a  reason: collision with root package name */
        public Context f19555a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f19556b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList f19557c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList f19558d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f19559e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f19560f;

        /* renamed from: g  reason: collision with root package name */
        public PendingIntent f19561g;

        /* renamed from: h  reason: collision with root package name */
        public PendingIntent f19562h;

        /* renamed from: i  reason: collision with root package name */
        public RemoteViews f19563i;

        /* renamed from: j  reason: collision with root package name */
        public IconCompat f19564j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f19565k;

        /* renamed from: l  reason: collision with root package name */
        public int f19566l;

        /* renamed from: m  reason: collision with root package name */
        public int f19567m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f19568n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f19569o;

        /* renamed from: p  reason: collision with root package name */
        public Style f19570p;

        /* renamed from: q  reason: collision with root package name */
        public CharSequence f19571q;

        /* renamed from: r  reason: collision with root package name */
        public CharSequence f19572r;

        /* renamed from: s  reason: collision with root package name */
        public CharSequence[] f19573s;

        /* renamed from: t  reason: collision with root package name */
        public int f19574t;

        /* renamed from: u  reason: collision with root package name */
        public int f19575u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f19576v;

        /* renamed from: w  reason: collision with root package name */
        public String f19577w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f19578x;

        /* renamed from: y  reason: collision with root package name */
        public String f19579y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f19580z;

        public static class Api21Impl {
        }

        public static class Api23Impl {
        }

        public static class Api24Impl {
        }

        public Builder(Context context, String str) {
            this.f19556b = new ArrayList();
            this.f19557c = new ArrayList();
            this.f19558d = new ArrayList();
            this.f19568n = true;
            this.f19580z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f19555a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f19567m = 0;
            this.W = new ArrayList();
            this.R = true;
        }

        public static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public Builder a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f19556b.add(new Action(i2, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new NotificationCompatBuilder(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public Builder e(boolean z2) {
            j(16, z2);
            return this;
        }

        public Builder f(String str) {
            this.K = str;
            return this;
        }

        public Builder g(PendingIntent pendingIntent) {
            this.f19561g = pendingIntent;
            return this;
        }

        public Builder h(CharSequence charSequence) {
            this.f19560f = d(charSequence);
            return this;
        }

        public Builder i(CharSequence charSequence) {
            this.f19559e = d(charSequence);
            return this;
        }

        public final void j(int i2, boolean z2) {
            if (z2) {
                Notification notification = this.T;
                notification.flags = i2 | notification.flags;
                return;
            }
            Notification notification2 = this.T;
            notification2.flags = (~i2) & notification2.flags;
        }

        public Builder k(boolean z2) {
            this.f19580z = z2;
            return this;
        }

        public Builder l(int i2) {
            this.f19567m = i2;
            return this;
        }

        public Builder m(int i2) {
            this.T.icon = i2;
            return this;
        }

        public Builder n(Style style) {
            if (this.f19570p != style) {
                this.f19570p = style;
                if (style != null) {
                    style.g(this);
                }
            }
            return this;
        }

        public Builder o(CharSequence charSequence) {
            this.T.tickerText = d(charSequence);
            return this;
        }

        public Builder p(long j2) {
            this.T.when = j2;
            return this;
        }

        public Builder(Context context) {
            this(context, (String) null);
        }
    }
}
